import MG2D.geometrie.Rectangle;

public abstract class Boite {

    private Rectangle rectangle;

    Boite(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    /**
     * /**
     *  Retourne le rectangle associé à l'objet.
     *
     *  @return rectangle Le rectangle associé à l'objet.
     * /
     * public Rectangle getRectangle() {
     *     return rectangle;
     * }
     */
    public Rectangle getRectangle() {
        return rectangle;
    }

    /**
     * ```java
     * /**
     *  Méthode pour définir le rectangle.
     *
     *  @param rectangle Le nouveau rectangle à définir.
     * /
     * public void setRectangle(Rectangle rectangle) {
     *     this.rectangle = rectangle;
     * }
     * ```
     */
    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
