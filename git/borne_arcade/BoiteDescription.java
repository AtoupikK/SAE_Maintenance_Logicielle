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
     * Voici la documentation JavaDoc pour votre méthode `lireFichier`:
     *
     * ```java
     * /**
     *  Lit un fichier texte spécifié par le chemin fourni et traite chaque ligne de celui-ci.
     *
     *  @param path Le chemin vers le fichier texte à lire.
     *
     *  @throws IOException Si une erreur se produit lors de la lecture du fichier ou de l'exécution de la logique métier.
     * /
     * public void lireFichier(String path) throws IOException {
     *     // Logique métier ici...
     * }
     * ```
     *
     * Notez que j'ai changé le type de l'exception pour `IOException`. Cela est plus précis et plus commune dans le contexte de la lecture de fichiers. De plus, la gestion de l'exception `Exception` à l'intérieur de votre méthode peut être considérée comme une faute de programmation plus faible, car elle peut gérer tous les types d'exceptions, contrairement à l'écrire `throws Exception` qui peut causer un problème de sécurité en cas de mauvaise utilisation.
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
     * La documentation JavaDoc pour la méthode `readHighScore` est la suivante :
     *
     * ```java
     * /**
     *  Méthode pour lire les high scores à partir d'un fichier spécifié.
     *
     *  @param path le chemin du dossier contenant le fichier highscore.
     *  @throws IOException si le fichier n'existe pas ou s'il y a un problème lors de sa lecture.
     * /
     * public void readHighScore(String path) throws IOException {
     *     // le reste de votre code ici
     * }
     * ```
     *
     * Notez que je n'ai pas inclué les `@param` et `@return` car la méthode n'a pas de résultat à renvoyer. Si cette méthode modifie des objets ou des variables d'état, vous devriez ajouter des `@param` pour expliquer les entrées et `@return` pour expliquer le résultat de la méthode.
     */
    public void readHighScore(String path) {
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
     * Voici la documentation JavaDoc pour la méthode `lireBouton` :
     *
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
     * Votre code JavaDoc est déjà bien documenté. Cependant, en JavaDoc, il semble que vous vouliez documenter une méthode appelée `getMessage` qui retourne un tableau de `Texte`. Voici comment vous pouvez le faire:
     *
     * ```java
     * /**
     *  Cette méthode retourne le message stocké dans l'objet de type Texte[].
     *
     *  @return Le message stocké dans l'objet de type Texte[]
     * /
     * public Texte[] getMessage() {
     *     return message;
     * }
     * ```
     *
     * Dans cette documentation, `@return` est utilisé pour expliquer le résultat de la méthode. Il décrit ce que la méthode renvoie. Ici, la méthode `getMessage` renvoie un tableau de `Texte`, donc le `@return` dit que c'est un tableau de `Texte` qui est renvoyé par la méthode.
     */
    public Texte[] getMessage() {
        return message;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `setMessage` :
     *
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
     *
     * Dans cette documentation, le paramètre `message` est le nouveau texte à définir, et le paramètre `a` est l'index de la position du message à modifier. La méthode `setMessage` modifie le texte du message à l'index `a` à l'aide de la méthode `setTexte` de la classe `message[a]`.
     */
    public void setMessage(String message, int a) {
        this.message[a].setTexte(message);
    }

    /**
     * ```java
     * /**
     *  Cette méthode est utilisée pour obtenir le tableau de Texture associé à l'attribut 'bouton'.
     *
     *  @return Texture[] Renvoie le tableau de Texture 'bouton'.
     * /
     * public Texture[] getBouton() {
     *     return this.bouton;
     * }
     * ```
     */
    public Texture[] getBouton() {
        return this.bouton;
    }

    /**
     * /**
     *  Cette méthode renvoie l'objet joystick.
     *
     *  @return Texture - l'objet joystick
     * /
     * public Texture getJoystick() {
     *     return this.joystick;
     * }
     */
    public Texture getJoystick() {
        return this.joystick;
    }

    /**
     * Désolé, mais il semble que toute la question est déjà répondue. La réponse donnée est la documentation JavaDoc pour la méthode `gettBouton()` et elle comprend déjà les informations nécessaires pour `@return`.
     */
    public Texte[] gettBouton() {
        return this.tBouton;
    }

    /**
     * Voici une documentation JavaDoc pour votre méthode `gettJoystick()`:
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour obtenir la valeur de l'attribut privé tJoystick.
     *
     *  @return Retourne la valeur de l'attribut tJoystick de type Texte.
     * /
     * public Texte gettJoystick() {
     *     return this.tJoystick;
     * }
     * ```
     *
     * Cette documentation décrit la fonctionnalité de la méthode `gettJoystick()` : elle permet d'obtenir la valeur de l'attribut privé `tJoystick`.
     *
     * Comme la méthode n'a pas de paramètres, il n'y a pas de @param dans la documentation.
     *
     * Le @return indique que la méthode renverra la valeur de `tJoystick`, de type `Texte`.
     */
    public Texte gettJoystick() {
        return this.tJoystick;
    }

    /**
     * /**
     *  Récupère la meilleure récompense.
     *
     *  @return highscore - la meilleure récompense.
     * /
     * public Texte getHighscore() {
     *     return this.highscore;
     * }
     */
    public Texte getHighscore() {
        return this.highscore;
    }

    /**
     * La documentation JavaDoc pour la méthode `getListeHighScore` est la suivante :
     *
     * ```java
     * /**
     *  Méthode pour obtenir la liste des scores hautes.
     *
     *  @return Texte[] - La liste des scores hautes
     * /
     * public Texte[] getListeHighScore() {
     *     return this.listeHighScore;
     * }
     * ```
     *
     * Cette documentation décrit la méthode `getListeHighScore()` qui est utilisée pour obtenir la liste des scores hautes. Cette méthode ne prend pas de paramètre et retourne un tableau de `Texte`.
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
     * La documentation JavaDoc pour la méthode serait la suivante :
     *
     * ```java
     * /**
     *  Définit le texte d'un bouton spécifique par son indice.
     *
     *  @param s Le texte à définir.
     *  @param a L'indice du bouton à modifier.
     * /
     * public void setTBouton(String s, int a) {
     *     this.tBouton[a].setTexte(s);
     * }
     * ```
     *
     * Cela signifie que la méthode `setTBouton` prend deux paramètres :
     * 1. Un `String s` qui représente le texte à définir.
     * 2. Un `int a` qui représente l'indice du bouton à modifier.
     *
     * La méthode n'affichera rien de spécifique à l'écran ou dans le flux de sortie standard, étant donné que la méthode `setTexte` d'un objet `TBouton` est appelée. Cette méthode doit être définie dans la classe `TBouton` pour fonctionner correctement.
     */
    public void settBouton(String s, int a) {
        this.tBouton[a].setTexte(s);
    }
    /*public Texte getMessage() {
      return message;
      }
    */
}
