import MG2D.*;
import MG2D.geometrie.*;

class TestHighScore {

    /**
     * ```java
     * /**
     *  Demande à l'utilisateur de s'enregistrer pour un high score.
     *
     *  @param fenetre           la fenêtre où la demande d'enregistrement apparaîtra
     *  @param clavier           le clavier qui gère les entrées de l'utilisateur
     *  @param imageDuJoueur     l'image du joueur qui sera affichée avec le nom à enregistrer
     *  @param tempsPourFinir    le temps estimé pour finir le niveau
     *  @param cheminFichierHighScore le chemin vers le fichier où enregistrer le high score
     * /
     * public static void demanderEnregistrerNom(Fenetre fenetre, ClavierBorneArcade clavier, Texture imageDuJoueur, int tempsPourFinir, String cheminFichierHighScore) {
     *     // votre code ici
     * }
     * ```
     */
    public static void main(String[] args) {
        Fenetre f = new Fenetre("test", 1280, 1024);
        ClavierBorneArcade clavier = new ClavierBorneArcade();
        f.addKeyListener(clavier);
        HighScore.demanderEnregistrerNom(f, clavier, new Texture("img/shoot.png", new Point(0, 0)), 40000, "./fichierTestHighScore/text5.hig");
    }
}
