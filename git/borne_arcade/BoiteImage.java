import MG2D.geometrie.Point;
import MG2D.geometrie.Rectangle;
import MG2D.geometrie.Texture;

public class BoiteImage extends Boite {

    Texture image;

    BoiteImage(Rectangle rectangle, String image) {
        super(rectangle);
        this.image = new Texture(image + "/photo_small.png", new Point(760, 648));
    }

    /**
     * Il semble que vous ayez déjà une documentation JavaDoc pour la méthode getImage(). Bien que cela soit utile, elle n'est pas très détaillée. Voici une version plus détaillée avec des @param et @return pour la méthode getImage() :
     *
     * ```java
     * /**
     *  Renvoie l'image de la texture.
     *
     *  @return la texture de l'image
     * /
     * public Texture getImage() {
     *     return this.image;
     * }
     * ```
     *
     * Cette documentation décrit simplement que la méthode getImage() renvoie l'objet Texture stocké dans l'attribut \
     */
    public Texture getImage() {
        return this.image;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `setImage(String chemin)`:
     *
     * ```java
     * /**
     *  Définit l'image à utiliser pour l'affichage de l'application.
     *
     *  @param chemin Le chemin vers le dossier contenant l'image. Le nom de fichier de l'image est ajouté automatiquement (\
     */
    public void setImage(String chemin) {
        this.image.setImg(chemin + "/photo_small.png");
        //this.image.setTaille(400, 320);
    }
}
