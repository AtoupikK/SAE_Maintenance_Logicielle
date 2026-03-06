import MG2D.*;
import MG2D.geometrie.*;
import MG2D.Couleur;
import java.io.File;
import java.awt.Font;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

class HighScore {

    /**
     * ```java
     * /**
     *  Renvoie le caractère suivant dans l'ordre alphabétique.
     *
     *  @param c le caractère actuel.
     *  @return le caractère suivant dans l'ordre alphabétique, '.' si le caractère est 'Z',
     *           ' ' si le caractère est ' ', sinon le caractère lui-même.
     * /
     * public static char suivant(char c) {
     *     if  (c \u003e= 'A'  \u0026\u0026 c \u003c 'Z')
     *         return (char) (c + 1);
     *     if  (c == 'Z')
     *         return '.';
     *     if  (c == '.')
     *         return ' ';
     *     return 'A';
     * }
     * ```
     */
    public static char suivant(char c) {
        if (c >= 'A' && c < 'Z')
            return (char) (c + 1);
        if (c == 'Z')
            return '.';
        if (c == '.')
            return ' ';
        return 'A';
    }

    /**
     * Voici la documentation JavaDoc de votre fonction :
     *
     * ```java
     * /**
     *  Cette méthode prend en paramètre un caractère et renvoie le caractère précédent dans l'alphabet.
     *  Si le caractère est 'A', elle renvoie un espace vide.
     *  Si le caractère est vide, elle renvoie un point.
     *  Pour tous les autres caractères, elle renvoie le caractère 'Z'.
     *
     *  @param c le caractère à traiter
     *  @return le caractère précédent dans l'ordre alphabétique
     * /
     * public static char precedent(char c) {
     *     if (c \u003e 'A' \u0026\u0026 c \u003c= 'Z')
     *         return (char) (c - 1);
     *     if (c == 'A')
     *         return ' ';
     *     if (c == ' ')
     *         return '.';
     *     return 'Z';
     * }
     * ```
     *
     * Cette documentation décrit clairement le rôle de la méthode et ses paramètres. Elle définit aussi ce que la méthode renvoie.
     */
    public static char precedent(char c) {
        if (c > 'A' && c <= 'Z')
            return (char) (c - 1);
        if (c == 'A')
            return ' ';
        if (c == ' ')
            return '.';
        return 'Z';
    }

    /**
     * ```java
     * /**
     *  Demande l'enregistrement du nom d'un joueur dans le fichier de high scores.
     *
     *  @param f Fenetre active.
     *  @param clavier Clavier de la borne arcade.
     *  @param t Texture à ajouter à la fenêtre.
     *  @param s Score du joueur.
     *  @param fichierHighScore Chemin vers le fichier de high scores.
     * /
     * public static void demanderEnregistrerNom(Fenetre f, ClavierBorneArcade clavier, Texture t, int s, String fichierHighScore) {
     *     // ...
     * }
     * ```
     */
    public static void demanderEnregistrerNom(Fenetre f, ClavierBorneArcade clavier, Texture t, int s, String fichierHighScore) {
        ArrayList<LigneHighScore> list = lireFichier(fichierHighScore);
        for (LigneHighScore l : list) System.out.println(l);
        int position = 0;
        boolean fin = false;
        while (!fin) {
            if (position == list.size())
                fin = true;
            else if (s <= list.get(position).getScore())
                position++;
            else {
                fin = true;
            }
        }
        //System.out.println("position : "+position);
        if (position >= 10)
            System.exit(0);
        String score = s + "";
        char[] cprec = { ' ', ' ', ' ' };
        char[] c = { 'A', ' ', ' ', '#' };
        char[] csuiv = { ' ', ' ', ' ' };
        int indexSelec = 0;
        Font font;
        font = null;
        try {
            File in = new File("/home/pi/git/borne_arcade/fonts/PrStart.ttf");
            font = font.createFont(Font.TRUETYPE_FONT, in);
            font = font.deriveFont(40.0f);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        Texte highscore = new Texte(Couleur.NOIR, "H  I  G  H  S  C  O  R  E", font, new Point(640, 950));
        Texte scoreAtteint = new Texte(Couleur.NOIR, score, font, new Point(420, 400));
        Texte enterYourName = new Texte(Couleur.NOIR, "E n t e r   Y o u r   n a m e", font, new Point(640, 800));
        Texte posNum = new Texte(Couleur.NOIR, (position + 1) + "eme", font, new Point(120, 400));
        if (position == 0)
            posNum.setTexte("1er");
        Texte posNumPrec = new Texte(Couleur.NOIR, "", font, new Point(120, 580));
        Texte posNumSuiv = new Texte(Couleur.NOIR, "", font, new Point(120, 170));
        Texte[] caracteres = new Texte[4];
        caracteres[0] = new Texte(Couleur.NOIR, c[0] + "", font, new Point(690, 400));
        caracteres[1] = new Texte(Couleur.NOIR, c[1] + "", font, new Point(840, 400));
        caracteres[2] = new Texte(Couleur.NOIR, c[2] + "", font, new Point(990, 400));
        caracteres[3] = new Texte(Couleur.NOIR, c[3] + "", font, new Point(1140, 400));
        Texte[] caracteresPrec = new Texte[3];
        caracteresPrec[0] = new Texte(Couleur.NOIR, cprec[0] + "", font, new Point(690, 580));
        caracteresPrec[1] = new Texte(Couleur.NOIR, cprec[1] + "", font, new Point(840, 580));
        caracteresPrec[2] = new Texte(Couleur.NOIR, cprec[2] + "", font, new Point(990, 580));
        Texte scorePrec = new Texte(Couleur.NOIR, "", font, new Point(420, 580));
        Texte[] caracteresSuiv = new Texte[3];
        caracteresSuiv[0] = new Texte(Couleur.NOIR, csuiv[0] + "", font, new Point(690, 170));
        caracteresSuiv[1] = new Texte(Couleur.NOIR, csuiv[1] + "", font, new Point(840, 170));
        caracteresSuiv[2] = new Texte(Couleur.NOIR, csuiv[2] + "", font, new Point(990, 170));
        Texte scoreSuiv = new Texte(Couleur.NOIR, "", font, new Point(420, 170));
        Rectangle rect1 = new Rectangle(Couleur.NOIR, new Point(650, 350), new Point(720, 480), false);
        Rectangle rect2 = new Rectangle(Couleur.NOIR, new Point(800, 350), new Point(870, 480), false);
        Rectangle rect3 = new Rectangle(Couleur.NOIR, new Point(950, 350), new Point(1020, 480), false);
        Rectangle rect4 = new Rectangle(Couleur.NOIR, new Point(1100, 350), new Point(1170, 480), false);
        Triangle select = new Triangle(Couleur.NOIR, new Point(690, 340), new Point(670, 300), new Point(710, 300), true);
        Texture blancTrans = new Texture("img/blancTransparent.png", new Point(0, 0));
        if (t != null)
            f.ajouter(t);
        f.ajouter(blancTrans);
        f.ajouter(highscore);
        f.ajouter(scoreAtteint);
        f.ajouter(scorePrec);
        f.ajouter(scoreSuiv);
        f.ajouter(enterYourName);
        f.ajouter(caracteres[0]);
        f.ajouter(caracteres[1]);
        f.ajouter(caracteres[2]);
        f.ajouter(caracteres[3]);
        f.ajouter(caracteresPrec[0]);
        f.ajouter(caracteresPrec[1]);
        f.ajouter(caracteresPrec[2]);
        f.ajouter(caracteresSuiv[0]);
        f.ajouter(caracteresSuiv[1]);
        f.ajouter(caracteresSuiv[2]);
        f.ajouter(posNum);
        f.ajouter(posNumPrec);
        f.ajouter(posNumSuiv);
        f.ajouter(rect1);
        f.ajouter(rect2);
        f.ajouter(rect3);
        f.ajouter(rect4);
        f.ajouter(select);
        if (position != 0) {
            //System.out.println("ajout du record precedent");
            caracteresPrec[0].setTexte(list.get(position - 1).getNom().charAt(0) + "");
            caracteresPrec[1].setTexte(list.get(position - 1).getNom().charAt(1) + "");
            caracteresPrec[2].setTexte(list.get(position - 1).getNom().charAt(2) + "");
            scorePrec.setTexte(list.get(position - 1).getScore() + "");
            if (position == 1)
                posNumPrec.setTexte("1er");
            else
                posNumPrec.setTexte(position + "eme");
        }
        if (position != list.size()) {
            //System.out.println("ajout du record suivant");
            caracteresSuiv[0].setTexte(list.get(position).getNom().charAt(0) + "");
            caracteresSuiv[1].setTexte(list.get(position).getNom().charAt(1) + "");
            caracteresSuiv[2].setTexte(list.get(position).getNom().charAt(2) + "");
            scoreSuiv.setTexte(list.get(position).getScore() + "");
            posNumSuiv.setTexte((position + 2) + "eme");
        }
        fin = false;
        while (!fin) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            if (clavier.getJoyJ1DroiteTape()) {
                if (indexSelec < 3) {
                    indexSelec++;
                    select.translater(150, 0);
                }
            }
            if (clavier.getJoyJ1GaucheTape()) {
                if (indexSelec > 0) {
                    indexSelec--;
                    select.translater(-150, 0);
                }
            }
            if (clavier.getJoyJ1HautTape()) {
                if (indexSelec != 3) {
                    c[indexSelec] = suivant(c[indexSelec]);
                    caracteres[indexSelec].setTexte(c[indexSelec] + "");
                }
            }
            if (clavier.getJoyJ1BasTape()) {
                if (indexSelec != 3) {
                    c[indexSelec] = precedent(c[indexSelec]);
                    caracteres[indexSelec].setTexte(c[indexSelec] + "");
                }
            }
            if (clavier.getBoutonJ1ATape() && indexSelec == 3)
                fin = true;
            f.rafraichir();
        }
        enregistrerFichier(fichierHighScore, list, "" + c[0] + c[1] + c[2], s);
        System.exit(0);
    }

    /**
     * ```java
     * /**
     *  Lit un fichier et stocke chaque ligne sous forme de LigneHighScore dans une ArrayList.
     *
     *  @param fichier Chemin du fichier à lire.
     *  @return Une ArrayList contenant les lignes du fichier sous forme de LigneHighScore.
     *  @throws FileNotFoundException Si le fichier n'est pas trouvé.
     *  @throws IOException Si une erreur d'entrée/sortie survient lors de la lecture du fichier.
     * /
     * public static ArrayList\u003cLigneHighScore\u003e lireFichier(String fichier) throws FileNotFoundException, IOException {
     *     ArrayList\u003cLigneHighScore\u003e l = new ArrayList\u003cLigneHighScore\u003e();
     *     BufferedReader reader = new BufferedReader(new FileReader(fichier));
     *     String currentLine;
     *     while ((currentLine = reader.readLine()) != null) {
     *         l.add(new LigneHighScore(currentLine));
     *     }
     *     reader.close();
     *     return l;
     * }
     * ```
     */
    public static ArrayList<LigneHighScore> lireFichier(String fichier) {
        ArrayList<LigneHighScore> l = new ArrayList<LigneHighScore>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichier));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                l.add(new LigneHighScore(currentLine));
            }
            reader.close();
        } catch (Exception e) {
        }
        return l;
    }

    /**
     * ```java
     * /**
     *  Enregistre un nouveau high score dans le fichier spécifié.
     *
     *  @param fichier Le chemin vers le fichier high score.
     *  @param list    La liste des high scores actuelles.
     *  @param nom     Le nom du joueur.
     *  @param score   Le score du joueur.
     * /
     * public static void enregistrerFichier(String fichier, ArrayList\u003cLigneHighScore\u003e list, String nom, int score) {
     *     // Code omitted for brevity
     * }
     * ```
     *
     * Cette fonction `enregistrerFichier` est utilisée pour enregistrer un nouveau high score dans un fichier high score. Elle prend quatre paramètres : le chemin vers le fichier high score (`fichier`), la liste des high scores actuelles (`list`), le nom du joueur (`nom`) et le score du joueur (`score`).
     *
     * Le code de la fonction a été laissé pour simplification de la documentation. Elle contient une logique pour ajouter le nouveau score dans la bonne position dans la liste, la limiter à 10 high scores, et la sauvegarder dans le fichier spécifié.
     *
     * La fonction n'a pas de valeur de retour spécifiée (`@return`), car la fonction est vide (`void`).
     */
    public static void enregistrerFichier(String fichier, ArrayList<LigneHighScore> list, String nom, int score) {
        int position = 0;
        boolean fin = false;
        while (!fin) {
            if (position == list.size())
                fin = true;
            else if (score <= list.get(position).getScore())
                position++;
            else {
                fin = true;
            }
        }
        list.add(position, new LigneHighScore(nom, score));
        while (list.size() > 10) list.remove(list.size() - 1);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fichier));
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i).toString());
                if (i != (list.size() - 1))
                    writer.write("\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }
}
