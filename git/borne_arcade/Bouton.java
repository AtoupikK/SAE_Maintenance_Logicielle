import java.awt.Font;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import MG2D.Couleur;
import MG2D.geometrie.Point;
import MG2D.geometrie.Texture;
import MG2D.geometrie.Texte;

public class Bouton {

    private Texte texte;

    private String chemin;

    private String nom;

    private Texture texture;

    private int numeroDeJeu;

    public Bouton() {
        this.texte = null;
        this.texture = null;
        this.chemin = null;
        this.nom = null;
    }

    public Bouton(Texte texte, Texture texture, String chemin, String nom) {
        this.texte = texte;
        this.texture = texture;
        this.chemin = chemin;
        this.nom = nom;
    }

    /**
     * ```java
     * /**
     *  Cette méthode remplit le tableau de boutons d'un objet Graphique avec des boutons nouvellement créés.
     *  Elle parcourt ensuite le dossier spécifié et pour chaque fichier trouvé, elle met à jour les boutons du tableau.
     *
     *  @param path le chemin vers le dossier à parcourir pour trouver les fichiers à ajouter aux boutons
     *  @throws IOException si il y a eu une erreur d'entrée/sortie lors de la lecture du dossier
     * /
     * public static void remplirBouton(String path) throws IOException {
     *     // Votre code ici
     * }
     * ```
     */
    public static void remplirBouton() {
        for (int i = 0; i < Graphique.tableau.length; i++) {
            Graphique.tableau[i] = new Bouton();
        }
        Path yourPath = FileSystems.getDefault().getPath("projet/");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(yourPath)) {
            int i = Graphique.tableau.length - 1;
            for (Path path : directoryStream) {
                Graphique.tableau[i].setTexte(new Texte(Couleur.NOIR, path.getFileName().toString(), new Font("Calibri", Font.TYPE1_FONT, 30), new Point(310, 510)));
                Graphique.tableau[i].setTexture(new Texture("img/bouton2.png", new Point(100, 478), 400, 65));
                for (int j = 0; j < Graphique.tableau.length - (i + 1); j++) {
                    Graphique.tableau[i].getTexte().translater(0, -110);
                    Graphique.tableau[i].getTexture().translater(0, -110);
                }
                Graphique.tableau[i].setChemin("projet/" + path.getFileName().toString());
                Graphique.tableau[i].setNom(path.getFileName().toString());
                Graphique.tableau[i].setNumeroDeJeu(i);
                i--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Votre fonction `getChemin()` semble déjà correctement documentée avec JavaDoc. Cependant, comme vous l'avez demandé, je vais lui ajouter une documentation plus complète et plus détaillée.
     *
     * ```java
     * /**
     *  Retourne le chemin de l'objet.
     *
     *  @return String - le chemin de l'objet.
     * /
     * public String getChemin() {
     *     return chemin;
     * }
     * ```
     *
     * Dans cette documentation, j'ai détaillé ce que la méthode fait et le type de valeur qu'elle renvoie. Cela aide les autres développeurs à comprendre ce que la méthode fait sans avoir besoin de lire le code.
     */
    public String getChemin() {
        return chemin;
    }

    /**
     * ```java
     * /**
     *  Méthode pour définir le chemin d'accès à un fichier ou à un dossier.
     *
     *  @param chemin une chaîne de caractères représentant le nouveau chemin à définir.
     * /
     * public void setChemin(String chemin) {
     *     this.chemin = chemin;
     * }
     * ```
     */
    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    /**
     * /**
     *  Retourne le nom de l'objet.
     *
     *  @return le nom de l'objet
     * /
     * public String getNom() {
     *     return nom;
     * }
     */
    public String getNom() {
        return nom;
    }

    /**
     * La documentation JavaDoc pour la méthode `setNom` est la suivante :
     *
     * ```java
     * /**
     *  Définit le nom de l'objet.
     *
     *  @param nom Le nouveau nom à définir.
     * /
     * public void setNom(String nom) {
     *     this.nom = nom;
     * }
     * ```
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * /**
     *  Renvoie le texte de l'objet.
     *
     *  @return le texte de l'objet de type Texte
     * /
     * public Texte getTexte() {
     *     return texte;
     * }
     */
    public Texte getTexte() {
        return texte;
    }

    /**
     * La méthode `setTexte` modifie l'attribut `texte` de l'objet. Elle prend en paramètre un objet `Texte` et l'assigne à l'attribut `texte` de l'objet courant.
     *
     * Voici la documentation JavaDoc pour cette méthode :
     *
     * ```java
     * /**
     *  Méthode pour définir le texte de l'objet.
     *
     *  @param texte le nouveau texte à définir pour l'objet
     * /
     * public void setTexte(Texte texte) {
     *     this.texte = texte;
     * }
     * ```
     *
     * Comme `texte` est un objet de type `Texte`, il est nécessaire d'indiquer son type dans la documentation. Cependant, pour le moment, nous ne disposons pas de la définition de la classe `Texte`, cette information serait donc manquante.
     */
    public void setTexte(Texte texte) {
        this.texte = texte;
    }

    /**
     * La documentation JavaDoc pour la méthode `getTexture()` est déjà présente dans votre code. Vous l'avez probablement déjà écrite une fois, mais voici à nouveau le code :
     *
     * ```java
     * /**
     *  Méthode pour obtenir la texture de l'objet.
     *
     *  @return Texture - Retourne la texture de l'objet.
     * /
     * public Texture getTexture() {
     *     return texture;
     * }
     * ```
     *
     * Cette documentation décrit la méthode `getTexture()` de la classe. Elle est écrite en JavaDoc, qui est un format de documentation spécifique pour Java.
     *
     * - `/**` : C'est le commentaire de bloc JavaDoc. Il commence par `/**` et se termine par `*/`. Tout le texte entre ces deux commentaires est considéré comme la documentation de la méthode.
     * - `@return Texture - Retourne la texture de l'objet.` : C'est une annotation JavaDoc qui spécifie le type de valeur renvoyée par la méthode et une brève description. Dans ce cas, la méthode renvoie une instance de la classe `Texture` et la description indique ce qui se passe.
     */
    public Texture getTexture() {
        return texture;
    }

    /**
     * /**
     *  Méthode pour définir la texture de l'objet.
     *
     *  @param texture La nouvelle texture à appliquer à l'objet.
     * /
     * public void setTexture(Texture texture) {
     *     this.texture = texture;
     * }
     */
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    /**
     * La documentation JavaDoc pour la méthode \
     */
    public int getNumeroDeJeu() {
        return numeroDeJeu;
    }

    /**
     * /**
     *  Définit le numéro de jeu.
     *
     *  @param numeroDeJeu le nouveau numéro de jeu à définir.
     * /
     * public void setNumeroDeJeu(int numeroDeJeu) {
     *     this.numeroDeJeu = numeroDeJeu;
     * }
     */
    public void setNumeroDeJeu(int numeroDeJeu) {
        this.numeroDeJeu = numeroDeJeu;
    }
}
