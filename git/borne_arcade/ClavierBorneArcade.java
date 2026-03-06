import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Cette classe implémente les méthodes de KeyListener permettant la gestion du clavier.
 * <br /><br />
 * Elle permet de gérer le clavier dans des applications développées pour la borne d'arcade de l'IUT.<br />
 *
 * Les joysticks sont nommés joyJ1 et joyJ2. joyJ1Haut la touche envoyée lorsque le joystick 1 est poussé vers le haut, joyJ1Bas, joyJ1Gauche, joyJ1Droite lorsqu'il est poussé, respectivement, vers le bas, la gauche et la droite.<br />
 *
 * Les boutons sont nommés boutonJ1 et boutonJ2. Il y a 6 boutons possibles pour chaque joueur. Ils sont notés A, B et C pour les boutons du bas et X, Y et Z pour les boutons du haut. Ils sont donc notés boutonJ1A, boutonJ1B, boutonJ1C, boutonJ1X, boutonJ1Y et boutonJ1Z.<br />
 *
 * Pour chacune des directions des joysticks ou des boutons, deux méthodes seront présentes : une méthode pour savoir si la direction ou le bouton est pressé ou une autre méthode pour savoir s'il a été pressé.
 *
 * Elle fonctionne sur le principe de booléen que l'on change quand on appuie ou relâche les touches.
 */
public class ClavierBorneArcade implements KeyListener {

    // Attributs //
    private boolean gauche;

    private boolean gaucheTape;

    private boolean droite;

    private boolean droiteTape;

    private boolean haut;

    private boolean hautTape;

    private boolean bas;

    private boolean basTape;

    private boolean a;

    private boolean aTape;

    private boolean z;

    private boolean zTape;

    private boolean e;

    private boolean eTape;

    private boolean q;

    private boolean qTape;

    private boolean s;

    private boolean sTape;

    private boolean d;

    private boolean dTape;

    private boolean b;

    private boolean bTape;

    private boolean k;

    private boolean kTape;

    private boolean l;

    private boolean lTape;

    private boolean m;

    private boolean mTape;

    private boolean o;

    private boolean oTape;

    private boolean f;

    private boolean fTape;

    private boolean g;

    private boolean gTape;

    private boolean h;

    private boolean hTape;

    private boolean r;

    private boolean rTape;

    private boolean t;

    private boolean tTape;

    private boolean y;

    private boolean yTape;

    // Constructeur //
    /**
     * Crée un clavier et initialise tous les attributs à faux pour touches relâchés.
     */
    public ClavierBorneArcade() {
        gauche = gaucheTape = droite = droiteTape = false;
        haut = hautTape = bas = basTape = false;
        a = d = e = k = l = m = o = q = s = z = false;
        aTape = dTape = eTape = kTape = lTape = mTape = oTape = qTape = sTape = zTape = false;
        f = g = h = r = t = y = false;
        fTape = gTape = hTape = rTape = tTape = yTape = false;
    }

    // Accesseurs //
    // Getter //
    /**
     * Voici la documentation JavaDoc pour la méthode `getJoyJ1GaucheEnfoncee`:
     *
     * ```java
     * /**
     *  Obtient la valeur booléenne qui indique si la touche \
     */
    public boolean getJoyJ1GaucheEnfoncee() {
        return gauche;
    }

    /**
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getJoyJ1GaucheTape() {
        boolean aRetourner = gaucheTape;
        gaucheTape = false;
        return aRetourner;
    }

    /**
     * La fonction `getJoyJ1DroiteEnfoncee()` semble déjà avoir une documentation JavaDoc, mais elle est très basique. Voici une version plus complète avec des `@param` et `@return` :
     *
     * ```java
     * /**
     *  Obtient la valeur booléenne de la touche \
     */
    public boolean getJoyJ1DroiteEnfoncee() {
        return droite;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode indiquée :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getJoyJ1DroiteTape() {
        boolean aRetourner = droiteTape;
        droiteTape = false;
        return aRetourner;
    }

    /**
     * Vous avei déjà une très bonne documentation JavaDoc. Cependant, pour la fonction `getJoyJ1HautEnfoncee()`, vous n'avez pas mentionné les paramètres attendus et la valeur de retour n'est pas expliquée.
     *
     * Voici la documentation améliorée:
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getJoyJ1HautEnfoncee() {
        return haut;
    }

    /**
     * Voici la documentation JavaDoc pour votre méthode `getJoyJ1HautTape()` :
     *
     * ```java
     * /**
     *  Vérifie si la touche \
     */
    public boolean getJoyJ1HautTape() {
        boolean aRetourner = hautTape;
        hautTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc est une spécification de la syntaxe JavaDoc utilisée pour documenter le code source de manière uniforme. Dans votre cas, la documentation est assez claire, mais pour plus de détail, voici la documentation à la demande de la fonction :
     *
     * ```java
     * /**
     *  Obtient la valeur booléenne indiquant si la touche \
     */
    public boolean getJoyJ1BasEnfoncee() {
        return bas;
    }

    /**
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getJoyJ1BasTape() {
        boolean aRetourner = basTape;
        basTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour votre fonction `getBoutonJ2XEnfoncee()` est la suivante :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ2XEnfoncee() {
        return a;
    }

    /**
     * La documentation JavaDoc pour la méthode `getBoutonJ2XTape` est la suivante:
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ2XTape() {
        boolean aRetourner = aTape;
        aTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc que vous avez fournie est correctement écrite pour la fonction que vous avez fournie. Cependant, il manque le @param pour indiquer que la fonction attend une entrée et le @return pour indiquer le type de valeur que la fonction renvoie.
     *
     * Voici une version plus complète de votre documentation :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ2YEnfoncee() {
        return z;
    }

    /**
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ2YTape() {
        boolean aRetourner = zTape;
        zTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour la fonction getBoutonJ2ZEnfoncee() est la suivante :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ2ZEnfoncee() {
        return e;
    }

    /**
     * La documentation JavaDoc pour la fonction donnée est la suivante :
     *
     * ```java
     * /**
     *  Permet de vérifier si la touche \
     */
    public boolean getBoutonJ2ZTape() {
        boolean aRetourner = eTape;
        eTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour la fonction donnée est la suivante:
     *
     * ```java
     * /**
     *  Récupère l'état de la touche \
     */
    public boolean getBoutonJ2AEnfoncee() {
        return q;
    }

    /**
     * La fonction `getBoutonJ2ATape` est une méthode Java qui vérifie si la touche \
     */
    public boolean getBoutonJ2ATape() {
        boolean aRetourner = qTape;
        qTape = false;
        return aRetourner;
    }

    /**
     * Votre fonction JavaDoc est assez propre, mais pour une meilleure compréhension, je vous laisse ajouter les balises @param et @return.
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour vérifier si la touche \
     */
    public boolean getBoutonJ2BEnfoncee() {
        return s;
    }

    /**
     * La documentation JavaDoc pour la fonction `getBoutonJ2BTape` est la suivante:
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ2BTape() {
        boolean aRetourner = sTape;
        sTape = false;
        return aRetourner;
    }

    /**
     * Votre documentation JavaDoc semble correctement décrire la fonction. Elle indique que la fonction permet de savoir si la touche \
     */
    public boolean getBoutonJ2CEnfoncee() {
        return d;
    }

    /**
     * C'est déjà beaucoup, mais voici une version plus détaillée, avec un `@param` pour `dTape` et un `@return` pour `getBoutonJ2CTape()` :
     *
     * ```java
     * /**
     *  Retourne la valeur de la touche \
     */
    public boolean getBoutonJ2CTape() {
        boolean aRetourner = dTape;
        dTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour la méthode `getJoyJ2GaucheEnfoncee` est la suivante:
     *
     * ```java
     * /**
     *  Retourne la valeur booleanéenne de la touche \
     */
    public boolean getJoyJ2GaucheEnfoncee() {
        return k;
    }

    /**
     * La fonction `getJoyJ2GaucheTape` est censée vérifier si la touche \
     */
    public boolean getJoyJ2GaucheTape() {
        boolean aRetourner = kTape;
        kTape = false;
        return aRetourner;
    }

    /**
     * La fonction que vous avez fournie est une méthode getter pour une variable booléenne \
     */
    public boolean getJoyJ2BasEnfoncee() {
        return l;
    }

    /**
     * /**
     *  Récupère la valeur du booléen correspondant à la touche \
     */
    public boolean getJoyJ2BasTape() {
        boolean aRetourner = lTape;
        lTape = false;
        return aRetourner;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getJoyJ2DroiteTape` :
     *
     * ```java
     * /**
     *  Permet de vérifier si la touche \
     */
    public boolean getJoyJ2DroiteTape() {
        boolean aRetourner = mTape;
        mTape = false;
        return aRetourner;
    }

    /**
     * Votre documentation JavaDoc semble correctement documenter la fonction `getJoyJ2DroiteEnfoncee()` qui semble indiquer qu'elle permet de savoir si la touche \
     */
    public boolean getJoyJ2DroiteEnfoncee() {
        return m;
    }

    /**
     * La fonction ci-dessus est une méthode Java qui retourne une valeur booléenne (`true` ou `false`) qui indique si la touche \
     */
    public boolean getJoyJ2HautEnfoncee() {
        return o;
    }

    /**
     * Cette fonction est une méthode Java pour vérifier si la touche \
     */
    public boolean getJoyJ2HautTape() {
        boolean aRetourner = oTape;
        oTape = false;
        return aRetourner;
    }

    /**
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ1ATape() {
        boolean aRetourner = fTape;
        fTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour cette fonction est la suivante :
     *
     * ```java
     * /**
     *  Récupère l'état de la touche \
     */
    public boolean getBoutonJ1AEnfoncee() {
        return f;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getBoutonJ1BTape` :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ1BTape() {
        boolean aRetourner = gTape;
        gTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour la méthode `getBoutonJ1BEnfoncee()` est la suivante :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ1BEnfoncee() {
        return g;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getBoutonJ1CTape()` :
     *
     * ```java
     * /**
     *  Permet de vérifier si la touche \
     */
    public boolean getBoutonJ1CTape() {
        boolean aRetourner = hTape;
        hTape = false;
        return aRetourner;
    }

    /**
     * /**
     *  Cette méthode permet de savoir si la touche \
     */
    public boolean getBoutonJ1CEnfoncee() {
        return h;
    }

    /**
     * La documentation JavaDoc pour la fonction est la suivante :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ1XTape() {
        boolean aRetourner = rTape;
        rTape = false;
        return aRetourner;
    }

    /**
     * Il semble que la fonction vous renvoie la valeur d'une variable booléenne nommée \
     */
    public boolean getBoutonJ1XEnfoncee() {
        return r;
    }

    /**
     * La fonction `getBoutonJ1YTape` est définie pour vérifier si la touche \
     */
    public boolean getBoutonJ1YTape() {
        boolean aRetourner = tTape;
        tTape = false;
        return aRetourner;
    }

    /**
     * La documentation que vous avez fournie est correcte pour la fonction `getBoutonJ1YEnfoncee`. Elle présente une description claire et concise de la fonction, ses préconditions et ses résultats attendus.
     *
     * Cependant, comme vous n'avez pas déclaré la variable `t` dans votre code, je ne peux pas vous indiquer si c'est une bonne pratique ou non. Si `t` est une variable de type booléenne indiquant si la touche \
     */
    public boolean getBoutonJ1YEnfoncee() {
        return t;
    }

    /**
     * Voici la documentation JavaDoc pour votre fonction :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche \
     */
    public boolean getBoutonJ1ZTape() {
        boolean aRetourner = yTape;
        yTape = false;
        return aRetourner;
    }

    /**
     * La fonction `getBoutonJ1ZEnfoncee()` est une méthode Java permettant de vérifier si la touche \
     */
    public boolean getBoutonJ1ZEnfoncee() {
        return y;
    }

    // Méthodes //
    /**
     * La documentation JavaDoc pour la méthode `reinitialisation()` ressemble à ceci:
     *
     * ```java
     * /**
     *  Méthode permettant la reinitialisation du clavier. Reinitialisation de tous les événements.
     *
     *  Cette méthode réinitialise tous les variables booléennes du clavier. Elle est appelée lorsque le clavier doit être \
     */
    public void reinitialisation() {
        gauche = gaucheTape = droite = droiteTape = false;
        haut = hautTape = bas = basTape = false;
        a = d = e = k = l = m = o = q = s = z = false;
        aTape = dTape = eTape = kTape = lTape = mTape = oTape = qTape = sTape = zTape = false;
        f = g = h = r = t = y = false;
        fTape = gTape = hTape = rTape = tTape = yTape = false;
    }

    /**
     * Cette fonction est la méthode `keyReleased` d'un `KeyListener` en Java. Cette méthode est appelée automatiquement lors d'un événement de relâchement de touche du clavier.
     *
     * @param key est un objet `KeyEvent` représentant l'événement clavier.
     *
     * @return aucun (`void`).
     *
     * Cette méthode met à jour les variables booléennes qui gèrent les touches du clavier. Si une touche est relâchée, la variable correspondante est mise à `false` et une variable `Tape` est mise à `true`. Cela indique que la touche a été relâchée.
     *
     * Par exemple, si la touche F est relâchée, la variable `f` est mise à `false` et `fTape` est mise à `true`.
     *
     * Cette méthode est liée à la méthode `keyPressed` via le `KeyListener`, qui permet de gérer l'appui des touches.
     *
     * Voir la documentation de `KeyEvent` et `KeyListener` pour plus d'informations :
     *  {@link https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html KeyEvent}
     *  {@link https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyListener.html KeyListener}
     */
    @Override
    public void keyReleased(KeyEvent key) {
        switch(key.getKeyCode()) {
            case KeyEvent.VK_F:
                f = false;
                fTape = true;
                break;
            case KeyEvent.VK_G:
                g = false;
                gTape = true;
                break;
            case KeyEvent.VK_H:
                h = false;
                hTape = true;
                break;
            case KeyEvent.VK_R:
                r = false;
                rTape = true;
                break;
            case KeyEvent.VK_T:
                t = false;
                tTape = true;
                break;
            case KeyEvent.VK_Y:
                y = false;
                yTape = true;
                break;
            case KeyEvent.VK_LEFT:
                gauche = false;
                gaucheTape = true;
                break;
            case KeyEvent.VK_RIGHT:
                droite = false;
                droiteTape = true;
                break;
            case KeyEvent.VK_UP:
                haut = false;
                hautTape = true;
                break;
            case KeyEvent.VK_DOWN:
                bas = false;
                basTape = true;
                break;
            case KeyEvent.VK_A:
                a = false;
                aTape = true;
                break;
            case KeyEvent.VK_D:
                d = false;
                dTape = true;
                break;
            case KeyEvent.VK_E:
                e = false;
                eTape = true;
                break;
            case KeyEvent.VK_K:
                k = false;
                kTape = true;
                break;
            case KeyEvent.VK_L:
                l = false;
                lTape = true;
                break;
            case KeyEvent.VK_M:
                m = false;
                mTape = true;
                break;
            case KeyEvent.VK_O:
                o = false;
                oTape = true;
                break;
            case KeyEvent.VK_Q:
                q = false;
                qTape = true;
                break;
            case KeyEvent.VK_S:
                s = false;
                sTape = true;
                break;
            case KeyEvent.VK_Z:
                z = false;
                zTape = true;
                break;
        }
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `keyTyped`:
     *
     * ```java
     * /**
     *  Implements the KeyTyped method - a method automatically called when a keyboard event occurs.
     *  \u003cbr\u003e\u003cbr\u003e
     *  This method should be implemented but is unnecessary in this engine.
     *
     *  @param k the KeyEvent object containing the event details
     * /
     * @Override
     * public void keyTyped(KeyEvent k) {
     *     // The method body is intentionally left blank
     * }
     * ```
     *
     * Dans cette documentation, on spécifie que cette méthode `keyTyped` est une méthode qui est surchargée pour gérer les événements clavier. Cependant, cette méthode est inutile dans ce moteur de jeu car elle n'est pas utilisée.
     *
     * La méthode attend un objet `KeyEvent` en paramètre, qui contient les détails de l'événement. Cependant, comme cette méthode est inutile dans ce contexte, son implémentation est inutile aussi.
     */
    @Override
    public void keyTyped(KeyEvent k) {
    }

    /**
     * /**
     *  Implémente la méthode KeyPressed - méthode appelée automatiquement lors d'un événement clavier.
     *  \u003cbr /\u003e\u003cbr /\u003e
     *  Cette méthode met à jour les valeurs des attributs en fonction des interactions au clavier.\u003cbr /\u003e
     *  Ici, si une touche est pressée, l'attribut correspondant à cette touche est mis à jour.\u003cbr /\u003e
     *  Pour gérer le relâchement des touches, voir la méthode keyReleased(KeyEvent k).
     *
     *  @param key un événement clavier
     *  @see \u003ca href=\
     */
    @Override
    public void keyPressed(KeyEvent key) {
        switch(key.getKeyCode()) {
            case KeyEvent.VK_F:
                f = true;
                break;
            case KeyEvent.VK_G:
                g = true;
                break;
            case KeyEvent.VK_H:
                h = true;
                break;
            case KeyEvent.VK_R:
                r = true;
                break;
            case KeyEvent.VK_T:
                t = true;
                break;
            case KeyEvent.VK_Y:
                y = true;
                break;
            case KeyEvent.VK_LEFT:
                gauche = true;
                break;
            case KeyEvent.VK_RIGHT:
                droite = true;
                break;
            case KeyEvent.VK_UP:
                haut = true;
                break;
            case KeyEvent.VK_DOWN:
                bas = true;
                break;
            case KeyEvent.VK_A:
                a = true;
                break;
            case KeyEvent.VK_D:
                d = true;
                break;
            case KeyEvent.VK_E:
                e = true;
                break;
            case KeyEvent.VK_K:
                k = true;
                break;
            case KeyEvent.VK_L:
                l = true;
                break;
            case KeyEvent.VK_M:
                m = true;
                break;
            case KeyEvent.VK_O:
                o = true;
                break;
            case KeyEvent.VK_Q:
                q = true;
                break;
            case KeyEvent.VK_S:
                s = true;
                break;
            case KeyEvent.VK_Z:
                z = true;
                break;
        }
    }
}
