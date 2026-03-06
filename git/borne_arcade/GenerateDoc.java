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
        Path dir = Paths.get("../borne_arcade");
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.java");
        for (Path file : stream) {
            System.out.println("Processing " + file);
            CompilationUnit cu = StaticJavaParser.parse(file);
            cu.findAll(MethodDeclaration.class).forEach(method -> {
                try {
                    String code = method.toString();
                    String prompt = "Écrit une documentation professionnelle pour cette fonction.\n" + " Inclus un @param et un @return qund c'est nécessaire.\n" + "Ne renvoie que la documentation JavaDoc.\n\n" + code;
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
        String json = "{" + "\"model\":\"deepseek-coder:6.7b\"," + "\"prompt\":\"" + prompt.replace("\"", "\\\"").replace("\n", "\\n") + "\"," + "\"stream\":false" + "}";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:11434/api/generate")).POST(HttpRequest.BodyPublishers.ofString(json)).header("Content-Type", "application/json").build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        int start = body.indexOf("\"response\":\"") + 12;
        int end = body.indexOf("\"", start);
        String result = body.substring(start, end);
        return result.replace("\\n", "\n");
    }
}
