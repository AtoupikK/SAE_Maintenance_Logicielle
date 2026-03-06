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
     * /**
     *  Renvoie l'image de la texture.
     *
     *  @return la texture de l'image
     * /
     * public Texture getImage() {
     *     return this.image;
     * }
     */
    public Texture getImage() {
        return this.image;
    }

    /**
     * ```java
     * /**
     *  Définit l'image à utiliser pour l'affichage de l'application.
     *
     *  @param chemin Le chemin vers le dossier contenant l'image.
     * /
     * public void setImage(String chemin) {
     *     this.image.setImg(chemin + \
     */
    public void setImage(String chemin) {
        this.image.setImg(chemin + "/photo_small.png");
        //this.image.setTaille(400, 320);
    }
}
