import java.io.IOException;
import MG2D.geometrie.Texture;
import MG2D.Couleur;
import MG2D.geometrie.Point;
import MG2D.geometrie.Triangle;
import MG2D.Clavier;

public class Pointeur {

    private int value;

    private Texture triangleGauche;

    private Texture triangleDroite;

    private Texture rectangleCentre;

    public Pointeur() {
        this.triangleGauche = new Texture("img/star.png", new Point(30, 492), 40, 40);
        // this.triangleDroite = new Triangle(Couleur .ROUGE, new Point(550, 560), new Point(520, 510), new Point(550, 460), true);
        this.triangleDroite = new Texture("img/star.png", new Point(530, 492), 40, 40);
        this.rectangleCentre = new Texture("img/select2.png", new Point(80, 460), 440, 100);
        this.value = Graphique.tableau.length - 1;
    }

    /**
     * /**
     *  Méthode pour lancer le jeu en utilisant un ClavierBorneArcade.
     *
     *  @param clavier Le ClavierBorneArcade qui contrôle l'action de lancer le jeu.
     *  @return Aucune (void).
     * /
     * public void lancerJeu(ClavierBorneArcade clavier) {
     *     // Vérifie si le bouton J1 (touche f) est enfoncé.
     *     if (clavier.getBoutonJ1ATape()) {
     *         // Affiche un message dans la console indiquant que la touche f est enfoncée.
     *         System.out.println(\
     */
    public void lancerJeu(ClavierBorneArcade clavier) {
        if (clavier.getBoutonJ1ATape()) {
            System.out.println("Touche f enfoncée.");
            System.out.println("../borne_arcade/" + Graphique.tableau[getValue()].getNom() + ".sh");
            try {
                Graphique.stopMusiqueFond();
                Process process = Runtime.getRuntime().exec("../borne_arcade/" + Graphique.tableau[getValue()].getNom() + ".sh");
                //ajouté afin d'attendre la fin de l'exécution du jeu pour reprendre le contrôle sur le menu
                process.waitFor();
                Graphique.lectureMusiqueFond();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (Exception e) {
                //on catche toutes les exceptions, nécessaire pour le waitFor()
                e.printStackTrace();
            }
            //System.out.println("le process sur "+Graphique.tableau[getValue()].getChemin()+" est bien lancé");
        }
    }

    /**
     * /**
     *  Récupère la valeur de l'objet.
     *
     *  @return la valeur de l'objet
     * /
     * public int getValue() {
     *     return value;
     * }
     */
    public int getValue() {
        return value;
    }

    /**
     * /**
     *  Définit la valeur de l'objet.
     *
     *  @param value - Nouvelle valeur à définir
     * /
     * public void setValue(int value) {
     *     this.value = value;
     * }
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Votre fonction `getTriangleGauche()` est une méthode Java qui renvoie un objet `Texture` représentant le triangle gauche.
     *
     * @return Texture - Renvoie l'objet Texture représentant le triangle gauche.
     */
    public Texture getTriangleGauche() {
        return triangleGauche;
    }

    /**
     * La documentation JavaDoc pour la méthode `setTriangleGauche` est la suivante:
     *
     * ```java
     * /**
     *  Définit la texture qui sera utilisée pour le triangle gauche.
     *
     *  @param triangleGauche La nouvelle texture à utiliser pour le triangle gauche.
     * /
     * public void setTriangleGauche(Texture triangleGauche) {
     *     this.triangleGauche = triangleGauche;
     * }
     * ```
     *
     * La documentation décrit brièvement le but de la méthode, comment elle est utilisée et les paramètres qu'elle attend. Elle est utilisée par les outils de génération de documentation Java pour générer automatiquement la documentation de l'API.
     */
    public void setTriangleGauche(Texture triangleGauche) {
        this.triangleGauche = triangleGauche;
    }

    /**
     * Voici la documentation JavaDoc pour votre méthode :
     *
     * ```java
     * /**
     *  Méthode permettant d'obtenir l'objet Texture représentant le triangle de droite.
     *
     *  @return le triangle de droite représenté par l'objet Texture.
     * /
     * public Texture getTriangleDroite() {
     *     return triangleDroite;
     * }
     * ```
     *
     * Dans cette documentation, nous expliquons ce que la méthode fait et ce qu'elle renvoie. Le type de la valeur renvoyée est un `Texture`, donc nous indiquons cela avec `@return`.
     */
    public Texture getTriangleDroite() {
        return triangleDroite;
    }

    /**
     * /**
     *  Méthode permettant de définir la texture du triangle à droite.
     *
     *  @param triangleDroite La nouvelle texture à appliquer au triangle à droite.
     * /
     * public void setTriangleDroite(Texture triangleDroite) {
     *     this.triangleDroite = triangleDroite;
     * }
     */
    public void setTriangleDroite(Texture triangleDroite) {
        this.triangleDroite = triangleDroite;
    }

    /**
     * /**
     *  Méthode pour obtenir le centre du rectangle.
     *
     *  @return Texture - centre du rectangle
     * /
     * public Texture getRectangleCentre() {
     *     return rectangleCentre;
     * }
     */
    public Texture getRectangleCentre() {
        return rectangleCentre;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `setRectangleCentre`:
     *
     * ```java
     * /**
     *  Méthode pour définir le centre du rectangle.
     *
     *  @param rectangleCentre Nouveau centre du rectangle. La nouvelle texture sera assignée à l'attribut rectangleCentre.
     * /
     * public void setRectangleCentre(Texture rectangleCentre) {
     *     this.rectangleCentre = rectangleCentre;
     * }
     * ```
     *
     * Dans cette documentation, `@param` est utilisé pour décrire le paramètre de la méthode (`rectangleCentre`). Le `@return` n'est pas nécessaire ici car la méthode est void, elle ne renvoie pas de valeur.
     */
    public void setRectangleCentre(Texture rectangleCentre) {
        this.rectangleCentre = rectangleCentre;
    }
}
