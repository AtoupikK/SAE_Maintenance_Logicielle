import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.File;
import java.io.FileInputStream;

public class Analyseur {

    public static void main(String[] args) {
        File projet = new File(".");

        parcourirFichiers(projet);
    }

    private static void parcourirFichiers(File dossier) {
        for (File fichier : dossier.listFiles()) {
            if (fichier.isDirectory()) {
                parcourirFichiers(fichier);
            } else if (fichier.getName().endsWith(".java")) {
                analyserFichier(fichier);
            }
        }
    }

    private static void analyserFichier(File fichier) {
        try (FileInputStream in = new FileInputStream(fichier)) {
            CompilationUnit cu = StaticJavaParser.parse(in);

            cu.findAll(ClassOrInterfaceDeclaration.class).forEach(c -> {
                System.out.println("Classe : " + c.getName());

                c.getMethods().forEach(m -> {
                    System.out.println("  Méthode : " + m.getDeclarationAsString());
                });
            });

        } catch (Exception e) {
            System.out.println("Erreur pour le fichier : " + fichier.getPath());
            e.printStackTrace();
        }
    }
}