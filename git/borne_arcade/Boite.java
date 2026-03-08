import MG2D.geometrie.Rectangle;

public abstract class Boite {

    private Rectangle rectangle;

    Boite(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    /**
     * Vous avez déjà fourni une documentation JavaDoc pour la méthode `getRectangle()`. Cependant, elle n'est pas optimale. Voici une documentation plus complète et plus appropriée :
     *
     * ```java
     * /**
     *  Retourne le rectangle associé à l'objet.
     *
     *  @return rectangle Le rectangle associé à l'objet.
     * /
     * public Rectangle getRectangle() {
     *     return rectangle;
     * }
     * ```
     *
     * Cette documentation est détaillée et spécifique. Elle précise que la méthode `getRectangle()` retourne le `rectangle` associé à l'objet. Cela aide les autres développeurs à comprendre ce que la méthode fait et ce qu'elle retourne.
     */
    public Rectangle getRectangle() {
        return rectangle;
    }

    /**
     * La documentation JavaDoc pour la méthode `setRectangle` est la suivante :
     *
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
     *
     * Dans cette documentation, on décrit la méthode `setRectangle`. Elle prend en paramètre un objet de type `Rectangle` et l'utilise pour définir l'attribut `rectangle` de l'objet appelant.
     *
     * Note : Étant donné que le code d'origine est une partie d'un commentaire JavaDoc, la documentation précédée n'est pas correcte, il faudrait la représenter comme suit :
     *
     * ```java
     * /**
     *  Méthode pour définir le rectangle.
     *
     *  @param rectangle Le nouveau rectangle à définir.
     * /
     * public void setRectangle(Rectangle rectangle) {
     *     this.rectangle = rectangle;\u003c｜begin▁of▁sentence｜\u003e;
     * }
     * ```
     */
    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
