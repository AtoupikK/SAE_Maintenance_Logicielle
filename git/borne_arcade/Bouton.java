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
     * /**
     *  Cette méthode remplit le tableau de boutons d'un objet Graphique avec des boutons nouvellement créés.
     *  Elle parcourt ensuite le dossier spécifié et pour chaque fichier trouvé, elle met à jour les boutons du tableau.
     *
     *  @throws IOException si il y a eu une erreur d'entrée/sortie lors de la lecture du dossier
     * /
     * public static void remplirBouton() {
     *     // Votre code ici
     * }
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
     * Voici la documentation JavaDoc pour la méthode `getChemin()`:
     *
     * ```java
     * /**
     *  Cette méthode renvoie le chemin de l'objet.
     *
     *  @return String - le chemin de l'objet
     * /
     * public String getChemin() {
     *     return chemin;
     * }
     * ```
     *
Z     */
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
     *  @return le texte de l'objet
     * /
     * public Texte getTexte() {
     *     return texte;
     * }
     */
    public Texte getTexte() {
        return texte;
    }

    /**
     * /**
     *  Méthode pour définir le texte de l'objet.
     *
     *  @param texte le nouveau texte à définir pour l'objet
     * /
     * public void setTexte(Texte texte) {
     *     this.texte = texte;
     * }
     */
    public void setTexte(Texte texte) {
        this.texte = texte;
    }

    /**
     * /**
     *  Méthode pour obtenir la texture de l'objet.
     *
     *  @return Texture - Retourne la texture de l'objet.
     * /
     * public Texture getTexture() {
     *     return texture;
     * }
     */
    public Texture getTexture() {
        return texture;
    }

    /**
     * ```java
     * /**
     *  Méthode pour définir la texture de l'objet.
     *
     *  @param texture La nouvelle texture à appliquer à l'objet.
     * /
     * public void setTexture(Texture texture) {
     *     this.texture = texture;
     * }
     * ```
     */
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    /**
     * /**
     *  Cette méthode renvoie le numéro de jeu.
     *
     *  @return le numéro de jeu sous forme d'entier
     * /
     * public int getNumeroDeJeu() {
     *     return numeroDeJeu;
     * }
     */
    public int getNumeroDeJeu() {
        return numeroDeJeu;
    }

    /**
     * ```java
     * /**
     *  Définit le numéro de jeu.
     *
     *  @param numeroDeJeu le nouveau numéro de jeu à définir.
     * /
     * public void setNumeroDeJeu(int numeroDeJeu) {
     *     this.numeroDeJeu = numeroDeJeu;
     * }
     * ```
     */
    public void setNumeroDeJeu(int numeroDeJeu) {
        this.numeroDeJeu = numeroDeJeu;
    }
}
