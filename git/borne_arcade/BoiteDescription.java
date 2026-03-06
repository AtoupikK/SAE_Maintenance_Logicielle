import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.File;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.InputStreamReader;
import MG2D.geometrie.Texture;
import MG2D.Couleur;
import MG2D.geometrie.Point;
import MG2D.geometrie.Rectangle;
import MG2D.geometrie.Texte;
import java.io.IOException;

public class BoiteDescription extends Boite {

    private Texte[] message;

    private boolean stop;

    private int nombreLigne;

    private Texture joystick;

    private Texture[] bouton;

    private Texte tJoystick;

    private Texte[] tBouton;

    private String[] texteBouton;

    private Texte highscore;

    private Texte[] listeHighScore;

    /*HACKED BY BENDAL*/
    private Font font1 = null;

    private Font font2 = null;

    private Font font3 = null;

    private Font font4 = null;

    /**
     * ************
     */
    BoiteDescription(Rectangle rectangle) {
        super(rectangle);
        /*HACKED BY BENDAL*/
        try {
            Font font = null;
            Font fontTexte = null;
            File in = new File("fonts/PrStart.ttf");
            font = font.createFont(Font.TRUETYPE_FONT, in);
            in = new File("fonts/Volter__28Goldfish_29.ttf");
            fontTexte = fontTexte.createFont(Font.TRUETYPE_FONT, in);
            font1 = fontTexte.deriveFont(15.0f);
            font2 = fontTexte.deriveFont(20.0f);
            font3 = font.deriveFont(25.0f);
            font4 = font.deriveFont(14.0f);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        /**
         * ************
         */
        bouton = new Texture[6];
        tBouton = new Texte[6];
        texteBouton = new String[7];
        //declaration des texture bouton + joystick
        this.joystick = new Texture("img/joystick2.png", new Point(740, 100), 40, 40);
        for (int i = 0; i < 3; i++) {
            this.bouton[i] = new Texture("img/ibouton2.png", new Point(890 + 130 * i, 130), 40, 40);
        }
        for (int i = 3; i < 6; i++) {
            this.bouton[i] = new Texture("img/ibouton2.png", new Point(890 + 130 * (i - 3), 50), 40, 40);
        }
        //declaration des textes bouton + joystick
        this.tJoystick = new Texte(Couleur.NOIR, "...", font1, new Point(760, 80));
        for (int i = 0; i < 3; i++) {
            this.tBouton[i] = new Texte(Couleur.NOIR, "...", font1, new Point(910 + 130 * i, 120));
        }
        for (int i = 3; i < 6; i++) {
            this.tBouton[i] = new Texte(Couleur.NOIR, "...", font1, new Point(910 + 130 * (i - 3), 40));
        }
        stop = false;
        message = new Texte[10];
        for (int i = 0; i < message.length; i++) {
            message[i] = new Texte(Couleur.NOIR, "", font2, new Point(960, 590));
            message[i].translater(0, -i * 30);
        }
        nombreLigne = 0;
        highscore = new Texte(Couleur.NOIR, "HIGHSCORE", font3, new Point(960, 335));
        listeHighScore = new Texte[10];
        for (int i = 0; i < 5; i++) {
            listeHighScore[i] = new Texte(Couleur.NOIR, "", font4, new Point(820, 310));
            listeHighScore[i].translater(0, -i * 25);
        }
        for (int i = 5; i < 10; i++) {
            listeHighScore[i] = new Texte(Couleur.NOIR, "", font4, new Point(1100, 310));
            listeHighScore[i].translater(0, -(i - 5) * 25);
        }
        /*
	//declaration des textes bouton + joystick
	this.tJoystick = new Texte(Couleur .NOIR, "...", new Font("Calibri", Font.TYPE1_FONT, 15), new Point(760, 80));
	for(int i = 0 ; i < 3 ; i++){
	    this.tBouton[i] = new Texte(Couleur .NOIR, "...", new Font("Calibri", Font.TYPE1_FONT, 15), new Point(910+130*i, 120));
	}
	for(int i = 3 ; i < 6 ; i++){
	    this.tBouton[i] = new Texte(Couleur .NOIR, "...", new Font("Calibri", Font.TYPE1_FONT, 15), new Point(910+130*(i-3), 40));
	}
	stop = false;
	message = new Texte[10];
	for(int i = 0 ; i < message.length ; i++){
	    message[i] = new Texte(Couleur .NOIR, "", new Font("Calibri", Font.TYPE1_FONT, 20), new Point(960, 590));
	    message[i].translater(0, -i*30);

	}
	nombreLigne = 0;

	highscore = new Texte(Couleur.NOIR, "HIGHSCORE", new Font("Calibri", Font.TYPE1_FONT, 25), new Point(960, 335));
	listeHighScore = new Texte[10];
	for(int i=0;i<5;i++){
	    listeHighScore[i] = new Texte(Couleur.NOIR, "", new Font("Calibri", Font.TYPE1_FONT, 17), new Point(820,310));
	    listeHighScore[i].translater(0,-i*25);
	}
	for(int i=5;i<10;i++){
	    listeHighScore[i] = new Texte(Couleur.NOIR, "", new Font("Calibri", Font.TYPE1_FONT, 17), new Point(1100,310));
	    listeHighScore[i].translater(0,-(i-5)*25);
	}*/
    }

    /**
     * /**
     *  Lit un fichier texte spécifié par le chemin fourni et traite chaque ligne de celui-ci.
     *
     *  @param path Le chemin vers le fichier texte à lire.
     *
     *  @throws Exception Si une erreur se produit lors de la lecture du fichier ou de l'exécution de la logique métier.
     * /
     * public void lireFichier(String path) {
     *     // Logique métier ici...
     * }
     */
    public void lireFichier(String path) {
        //System.out.println(path);
        String fichier = path + "/description.txt";
        //lecture du fichier texte
        try {
            InputStream ips = new FileInputStream(fichier);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while (/*(ligne=br.readLine())!=null &&*/
            stop == false) {
                ligne = br.readLine();
                //System.out.println(ligne);
                if (ligne != null) {
                    //changer message
                    message[nombreLigne].setTexte(ligne);
                    setMessage(ligne, nombreLigne);
                } else {
                    //changer message
                    message[nombreLigne].setTexte("");
                    setMessage("", nombreLigne);
                }
                nombreLigne++;
                if (nombreLigne >= 10) {
                    stop = true;
                    nombreLigne = 0;
                }
            }
            stop = false;
            br.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    /**
     * ```java
     * /**
     *  Méthode pour lire les high scores à partir d'un fichier spécifié.
     *
     *  @param path le chemin du dossier contenant le fichier highscore.
     *
     *  @throws IOException si le fichier n'existe pas ou s'il y a un problème lors de sa lecture.
     * /
     * public void lireHighScore(String path) throws IOException {
     *     for (int i = 0; i \u003c 10; i++) {
     *         if (i == 0)
     *             listeHighScore[i].setTexte(\
     */
    public void lireHighScore(String path) {
        for (int i = 0; i < 10; i++) {
            if (i == 0)
                listeHighScore[i].setTexte("1er - ");
            else
                listeHighScore[i].setTexte((i + 1) + "eme - ");
        }
        String fichier = path + "/highscore";
        File f = new File(fichier);
        if (!f.exists()) {
            for (int i = 0; i < 10; i++) listeHighScore[i].setTexte("/");
        } else {
            ArrayList<LigneHighScore> liste = HighScore.lireFichier(fichier);
            for (int i = 0; i < liste.size(); i++) {
                if (i == 0)
                    listeHighScore[i].setTexte("1er : " + liste.get(i).getNom() + " - " + liste.get(i).getScore());
                else
                    listeHighScore[i].setTexte((i + 1) + "eme : " + liste.get(i).getNom() + " -  " + liste.get(i).getScore());
            }
        }
    }

    /**
     * ```java
     * /**
     *  Cette méthode lit le fichier texte spécifié et l'utilise pour définir le texte des boutons de la manette.
     *
     *  @param path Chemin vers le fichier texte contenant les informations des boutons de la manette.
     *  @throws IOException Si une erreur d'entrée-sortie survient pendant la lecture du fichier.
     * /
     * public void lireBouton(String path) throws IOException {
     *     // Chemin vers le fichier texte contenant les informations des boutons de la manette.
     *     String fichier = path + \
     */
    public void lireBouton(String path) {
        //System.out.println(path);
        String fichier = path + "/bouton.txt";
        //lecture du fichier texte
        try {
            InputStream ips = new FileInputStream(fichier);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            ligne = br.readLine();
            if (ligne == null) {
                System.err.println("le fichier bouton est vide!");
            } else {
                texteBouton = ligne.split(":");
                //changer le texte des boutons
                settJoystick(texteBouton[0]);
                for (int i = 0; i < 6; i++) {
                    settBouton(texteBouton[i + 1], i);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        ;
    }

    /**
     * /**
     *  Cette méthode renvoie le message stocké dans l'objet.
     *
     *  @return Le message stocké dans l'objet de type Texte[]
     * /
     * public Texte[] getMessage() {
     *     return message;
     * }
     */
    public Texte[] getMessage() {
        return message;
    }

    /**
     * ```java
     * /**
     *  Définit le texte du message à l'index spécifié.
     *
     *  @param message Le nouveau texte à définir.
     *  @param a L'index de la position du message à modifier.
     * /
     * public void setMessage(String message, int a) {
     *     this.message[a].setTexte(message);
     * }
     * ```
     */
    public void setMessage(String message, int a) {
        this.message[a].setTexte(message);
    }

    /**
     * ```java
     * /**
     *  Cette méthode est utilisée pour obtenir le tableau de Texture associé à l'attribut \
     */
    public Texture[] getBouton() {
        return this.bouton;
    }

    /**
     * ```
     * /**
     *  Cette méthode renvoie l'objet joystick.
     *
     *  @return Texture - l'objet joystick
     * /
     * public Texture getJoystick() {
     *     return this.joystick;
     * }
     * ```
     */
    public Texture getJoystick() {
        return this.joystick;
    }

    /**
     * Voici la documentation JavaDoc de la méthode `gettBouton`:
     *
     * ```java
     * /**
     *  Récupère le tableau de tBouton.
     *
     *  @return le tableau de Texte tBouton
     * /
     * public Texte[] gettBouton() {
     *     return this.tBouton;
     * }
     * ```
     *
     * Dans cette documentation, le mot-clé `@return` est utilisé pour indiquer le type de valeur renvoyée par la méthode. Dans ce cas, la méthode renvoie un tableau de type `Texte[]`.
     */
    public Texte[] gettBouton() {
        return this.tBouton;
    }

    /**
     * ```java
     * /**
     *  Cette méthode est utilisée pour obtenir la valeur de l'attribut privé tJoystick.
     *
     *  @return Retourne la valeur de l'attribut tJoystick.
     * /
     * public Texte gettJoystick() {
     *     return this.tJoystick;
     * }
     * ```
     */
    public Texte gettJoystick() {
        return this.tJoystick;
    }

    /**
     * ```java
     * /**
     *  Récupère la meilleure récompense.
     *
     *  @return highscore - la meilleure récompense.
     * /
     * public Texte getHighscore() {
     *     return this.highscore;
     * }
     * ```
     */
    public Texte getHighscore() {
        return this.highscore;
    }

    /**
     * /**
     *  Méthode pour obtenir la liste des scores hautes.
     *
     *  @return Texte[] - La liste des scores hautes
     * /
     * public Texte[] getListeHighScore() {
     *     return this.listeHighScore;
     * }
     */
    public Texte[] getListeHighScore() {
        return this.listeHighScore;
    }

    /**
     * ```java
     * /**
     *  Méthode pour définir le texte de l'objet tJoystick.
     *
     *  @param s Le nouveau texte à définir sur l'objet tJoystick.
     * /
     * public void setTJoystick(String s) {
     *     this.tJoystick.setTexte(s);
     * }
     * ```
     */
    public void settJoystick(String s) {
        this.tJoystick.setTexte(s);
    }

    /**
     * Voici la documentation JavaDoc pour la méthode \
     */
    public void settBouton(String s, int a) {
        this.tBouton[a].setTexte(s);
    }
    /*public Texte getMessage() {
      return message;
      }
    */
}
