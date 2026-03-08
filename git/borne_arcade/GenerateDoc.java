import com.github.javaparser.*;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.*;

public class GenerateDoc {

    /**
     * ```java
     * /**
     *  Processes all Java files in a directory and generates professional documentation for each method.
     *
     *  @param args Command line arguments (unused)
     *  @throws Exception If an error occurs while processing the files
     * /
     * public static void main(String[] args) throws Exception {
     *     // ...
     * }
     * ```
     */
    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("No files to process.");
            return;
        }

        for (String filename : args) {

            Path file = Paths.get(filename);

            if (!Files.exists(file)) {
                continue;
            }

            System.out.println("Processing " + file);

            CompilationUnit cu = StaticJavaParser.parse(file);

            cu.findAll(MethodDeclaration.class).forEach(method -> {

                try {

                    // Ignore les méthodes déjà documentées
                    //if (method.getJavadoc().isPresent()) {
                    //    return;
                    //}

                    String code = method.toString();

                    String prompt =
                        "Écris une documentation JavaDoc professionnelle pour cette méthode.\n" +
                        "Inclue @param et @return si nécessaire.\n" +
                        "Ne renvoie que la JavaDoc.\n\n" +
                        code;

                    String doc = askOllama(prompt);

                    method.setJavadocComment(doc);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            });

            Files.writeString(file, cu.toString());
        }

        System.out.println("Documentation generated.");
    }

    /**
     * nvalid character 'm' after object key:value pair
     */
    public static String askOllama(String prompt) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        String json =
            "{"
            + "\"model\":\"deepseek-coder:6.7b\","
            + "\"prompt\":\"" + prompt.replace("\"","\\\"").replace("\n","\\n") + "\","
            + "\"stream\":false"
            + "}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:11434/api/generate"))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .header("Content-Type","application/json")
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();

        int start = body.indexOf("\"response\":\"") + 12;
        int end = body.indexOf("\"", start);

        if (start < 12 || end < 0) {
            return "Documentation generation failed.";
        }

        String result = body.substring(start, end);

        return result.replace("\\n","\n");
    }
}