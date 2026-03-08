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
     * La documentation JavaDoc pour la méthode `getJoyJ1GaucheEnfoncee` est la suivante :
     *
     * ```java
     * /**
     *  Obtient la valeur booléenne qui indique si la touche de gauche est enfoncée ou non.
     *
     *  @return {@code true} si la touche de gauche est enfoncée, {@code false} sinon.
     * /
     * public boolean getJoyJ1GaucheEnfoncee() {
     *     return gauche;
     * }
     * ```
     *
     * Dans cette documentation, j'ai défini les paramètres et le retour de la méthode `getJoyJ1GaucheEnfoncee`. Le paramètre n'est pas précisé car la méthode ne prend pas d'arguments et le retour est explicite avec la description de la valeur booléenne retournée par la méthode.
     */
    public boolean getJoyJ1GaucheEnfoncee() {
        return gauche;
    }

    /**
     * La fonction `getJoyJ1GaucheTape()` est une méthode d'accès en lecture pour une variable d'instance `gaucheTape`. Cette méthode est utilisée pour vérifier si la touche de gauche a été tapée ou non et ensuite réinitialiser le statut de la touche.
     *
     * ```java
     * /**
     *  Permet de savoir si la touche de gauche a été tapée.
     *  Après la lecture, le statut de la touche est réinitialisé à `false`.
     *
     *  @return `true` si la touche de gauche a été tapée, `false` sinon.
     * /
     * public boolean getJoyJ1GaucheTape() {
     *     boolean aRetourner = gaucheTape;
     *     gaucheTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette documentation JavaDoc, le paramètre n'est pas spécifié car la méthode n'a pas besoin d'un paramètre. Elle n'affiche pas également de @throws car la méthode n'est pas susceptible d'évoluer par rapport à des exceptions potentielles.
     */
    public boolean getJoyJ1GaucheTape() {
        boolean aRetourner = gaucheTape;
        gaucheTape = false;
        return aRetourner;
    }

    /**
     * Voici une version plus complète avec des `@param` et `@return` pour la fonction `getJoyJ1DroiteEnfoncee()` :
     *
     * ```java
     * /**
     *  Obtient la valeur booléenne de la touche joystick J1 située à droite.
     *
     *  @return {boolean} - true si la touche est enfoncée (haut), false sinon.
     * /
     * public boolean getJoyJ1DroiteEnfoncee() {
     *     return droite;
     * }
     * ```
     *
     * Cette documentation décrit la fonction `getJoyJ1DroiteEnfoncee()` qui permet de connaitre l'état de la touche située à droite sur le joystick J1. La fonction ne prend pas de paramètres et renvoie un booléen : `true` si la touche est enfoncée (haut) et `false` sinon.
     */
    public boolean getJoyJ1DroiteEnfoncee() {
        return droite;
    }

    /**
     * ```java
     * /**
     *  Retourne la valeur de l'attribut \
     */
    public boolean getJoyJ1DroiteTape() {
        boolean aRetourner = droiteTape;
        droiteTape = false;
        return aRetourner;
    }

    /**
     * ```java
     * /**
     *  Cette méthode permet de déterminer si la touche haut est enfoncée ou non.
     *
     *  @return true si la touche haut est enfoncée, false sinon
     * /
     * public boolean getJoyJ1HautEnfoncee() {
     *     return haut;
     * }
     * ```
     */
    public boolean getJoyJ1HautEnfoncee() {
        return haut;
    }

    /**
     * ```java
     * /**
     *  Cette méthode permet de vérifier si la touche haute a été enfoncée.
     *  Une fois que la touche est vérifiée, la variable `hautTape` est réinitialisée à `false`.
     *
     *  @return `true` si la touche haute a été enfoncée, `false` sinon
     * /
     * public boolean getJoyJ1HautTape() {
     *     boolean aRetourner = hautTape;
     *     hautTape = false;
     *     return aRetourner;
     * }
     * ```
     */
    public boolean getJoyJ1HautTape() {
        boolean aRetourner = hautTape;
        hautTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour la méthode `getJoyJ1BasEnfoncee` est la suivante :
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
     *  Cette méthode permet de savoir si la touche J1 du joystick est en bas.
     *
     *  @return boolean - Retourne true si la touche J1 du joystick est en bas, sinon retourne false.
     * /
     * public boolean getJoyJ1BasTape() {
     *     boolean aRetourner = basTape;
     *     basTape = false;
     *     return aRetourner;
     * }
     */
    public boolean getJoyJ1BasTape() {
        boolean aRetourner = basTape;
        basTape = false;
        return aRetourner;
    }

    /**
     * Votre documentation JavaDoc est correctement écrite.
     *
     * Mais vous avez oublié d'inclure les tags `@param` et `@return`. C'est donc la documentation qui devrait être écrite :
     *
     * ```java
     * /**
     *  Cette méthode permet de savoir si la touche est enfoncée ou non.
     *
     *  @return boolean - true si la touche est enfoncée, false sinon
     * /
     * public boolean getBoutonJ2XEnfoncee() {
     *     return a;
     * }
     * ```
     *
     * Notez que `a` est une variable locale ou une variable d'instance de la classe, elle ne sert pas à dire si le bouton est enfoncé ou non, vous aurez besoin d'une variable globale ou d'une variable d'instance qui indique si le bouton est enfoncé ou non pour que cette méthode fonctionne correctement.
     */
    public boolean getBoutonJ2XEnfoncee() {
        return a;
    }

    /**
     * La documentation JavaDoc pour la méthode `getBoutonJ2XTape` est la suivante:
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour savoir si la touche est appuyée.
     *  Elle renvoie true si la touche est appuyée, et false sinon.
     *  Après avoir lu la valeur de la touche, la valeur de la touche est réinitialisée à false.
     *
     *  @return true si la touche est appuyée, false sinon
     * /
     * public boolean getBoutonJ2XTape() {
     *     boolean aRetourner = aTape;
     *     aTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette documentation, il est mentionné que la méthode renvoie un boolean (`@return`). Cependant, sans plus de contexte sur la classe ou le contexte de cette méthode, il est impossible de mentionner des paramètres (`@param`) spécifiques.
     */
    public boolean getBoutonJ2XTape() {
        boolean aRetourner = aTape;
        aTape = false;
        return aRetourner;
    }

    /**
     * Voici la documentation complète avec @param et @return :
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour déterminer si la touche J2Y est enfoncée.
     *
     *  @return true si la touche J2Y est enfoncée, sinon false.
     * /
     * public boolean getBoutonJ2YEnfoncee() {
     *     return z;
     * }
     * ```
     *
     * Cela indique que la méthode `getBoutonJ2YEnfoncee` n'accepte pas d'arguments et renvoie un booléen (true ou false).
     */
    public boolean getBoutonJ2YEnfoncee() {
        return z;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getBoutonJ2YTape()` :
     *
     * ```java
     * /**
     *  Permet de savoir si la touche est enfoncée ou non.
     *
     *  @return true si la touche est enfoncée, sinon false. Après avoir consulté la valeur, zTape est réinitialisée à false.
     * /
     * public boolean getBoutonJ2YTape() {
     *     boolean aRetourner = zTape;
     *     zTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Notez que la documentation JavaDoc n'a pas besoin de spécifier le type de retour et les paramètres, car ils sont déjà documentés dans le code source de la méthode. Cependant, pour une meilleure compréhension du code, il peut être utile de documenter explicitement le type de retour et les paramètres, comme c'est fait dans la documentation ci-dessus.
     */
    public boolean getBoutonJ2YTape() {
        boolean aRetourner = zTape;
        zTape = false;
        return aRetourner;
    }

    /**
     * Voici la documentation JavaDoc complète pour la fonction `getBoutonJ2ZEnfoncee()` :
     *
     * ```java
     * /**
     *  Récupère l'état actuel du bouton J2Z.
     *
     *  @return true si le bouton est enfoncé, sinon false.
     * /
     * public boolean getBoutonJ2ZEnfoncee() {
     *     return e;
     * }
     * ```
     *
     * Dans cette documentation, le `@return` spécifie que la fonction renvoie une valeur de type booléenne.
     */
    public boolean getBoutonJ2ZEnfoncee() {
        return e;
    }

    /**
     * La documentation JavaDoc pour la fonction donnée est la suivante :
     *
     * ```java
     * /**
     *  Cette méthode vérifie si la touche a été tapée.
     *
     *  @return true si la touche a été tapée, false sinon
     * /
     * public boolean getBoutonJ2ZTape() {
     *     boolean aRetourner = eTape;
     *     eTape = false;
     *     return aRetourner;
     * }
     * ```
     */
    public boolean getBoutonJ2ZTape() {
        boolean aRetourner = eTape;
        eTape = false;
        return aRetourner;
    }

    /**
     * Voici la documentation JavaDoc complète pour la méthode `getBoutonJ2AEnfoncee()`:
     *
     * ```java
     * /**
     *  Récupère l'état de la touche.
     *
     *  @return true si la touche est enfoncée, false sinon
     * /
     * public boolean getBoutonJ2AEnfoncee() {
     *     return q;
     * }
     * ```
     *
     * Cette documentation décrit la fonction de manière claire et précise. Elle explique que la fonction renvoie un booléen qui indique l'état de la touche. Dans cet exemple, il est précisé que si la touche est enfoncée, la fonction renvoie true, sinon elle renvoie false.
     */
    public boolean getBoutonJ2AEnfoncee() {
        return q;
    }

    /**
     * ```java
     * /**
     *  La méthode `getBoutonJ2ATape` est une méthode Java qui vérifie si la touche est enfoncée (true) ou non (false).
     *  Après avoir appelée cette méthode, la valeur de `qTape` est réinitialisée à false.
     *
     *  @return Retourne la valeur actuelle de `qTape`.
     * /
     * public boolean getBoutonJ2ATape() {
     *     boolean aRetourner = qTape;
     *     qTape = false;
     *     return aRetourner;
     * }
     * ```
     */
    public boolean getBoutonJ2ATape() {
        boolean aRetourner = qTape;
        qTape = false;
        return aRetourner;
    }

    /**
     * La fonction `getBoutonJ2BEnfoncee()` semble être une méthode de classe Java, elle semble être destinée à renvoyer une valeur booléenne (`true` ou `false`) indiquant si le bouton J2B est enfoncé ou non.
     *
     * Voici une documentation JavaDoc complète avec des balises `@param` et `@return` :
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour vérifier si le bouton J2B est enfoncé ou non.
     *
     *  @return Un booléen indiquant si le bouton J2B est enfoncé (`true`) ou non (`false`).
     * /
     * public boolean getBoutonJ2BEnfoncee() {
     *     return s;
     * }
     * ```
     *
     * Cette documentation décrit la fonction de manière claire et compréhensible, expliquant son rôle et ses résultats.
     */
    public boolean getBoutonJ2BEnfoncee() {
        return s;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getBoutonJ2BTape`:
     *
     * ```java
     * /**
     *  Retourne la valeur de l'attribut sTape et la réinitialise à false.
     *
     *  @return la valeur actuelle de sTape
     *  @see #sTape
     * /
     * public boolean getBoutonJ2BTape() {
     *     boolean aRetourner = sTape;
     *     sTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette documentation, on décrit deux choses:
     *
     * 1. La fonction permet de savoir la valeur actuelle de l'attribut `sTape` et de le réinitialiser à false. Elle retourne cette valeur.
     *
     * 2. Le `@return` tag est utilisé pour indiquer la valeur renvoyée par la méthode. Ici, c'est la valeur actuelle de `sTape`.
     */
    public boolean getBoutonJ2BTape() {
        boolean aRetourner = sTape;
        sTape = false;
        return aRetourner;
    }

    /**
     * Votre documentation JavaDoc semble correctement décrire la fonction. Elle indique que la fonction permet de savoir si la touche est enfoncée.
     *
     * ```java
     * /**
     *  Cette méthode permet de déterminer si le bouton J2C est enfoncé ou non.
     *
     *  @return Un booléen qui indique si le bouton J2C est enfoncé (true) ou non (false).
     * /
     * public boolean getBoutonJ2CEnfoncee() {
     *     return d;
     * }
     * ```
     *
     * Dans cette documentation, on précise que c'est une méthode publique qui retourne un booléen. On explique que le booléen indique si le bouton J2C est enfoncé ou non.
     */
    public boolean getBoutonJ2CEnfoncee() {
        return d;
    }

    /**
     * ```java
     * /**
     *  Cette méthode est utilisée pour récupérer la valeur de la touche 'dTape' et ensuite la réinitialiser à 'false'.
     *
     *  @return boolean - Retourne la valeur actuelle de 'dTape'. Une fois que cette valeur a été récupérée, elle est automatiquement réinitialisée à 'false'.
     * /
     * public boolean getBoutonJ2CTape() {
     *     boolean aRetourner = dTape;
     *     dTape = false;
     *     return aRetourner;
     * }
     * ```
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
     *  Retourne la valeur booleanéenne de la touche Joystick J2 Gauche enfantée.
     *
     *  @return {boolean} La valeur booleanéenne de la touche Joystick J2 Gauche enfantée.
     * /
     * public boolean getJoyJ2GaucheEnfoncee() {
     *     return k;
     * }
     * ```
     *
     * Dans cette documentation, on décrit la fonction `getJoyJ2GaucheEnfoncee` qui retourne une valeur booléenne (`boolean`). La fonction ne prend pas de paramètres en entrée (`@param`) et renvoie une valeur booléenne (`@return`).
     */
    public boolean getJoyJ2GaucheEnfoncee() {
        return k;
    }

    /**
     * ```java
     * /**
     *  Cette méthode `getJoyJ2GaucheTape` est utilisée pour vérifier si la touche est enfoncée.
     *
     *  @return Retourne un booléen qui indique si la touche est enfoncée ou non.
     * /
     * public boolean getJoyJ2GaucheTape() {
     *     boolean aRetourner = kTape;
     *     kTape = false;
     *     return aRetourner;
     * }
     * ```
     */
    public boolean getJoyJ2GaucheTape() {
        boolean aRetourner = kTape;
        kTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour votre fonction serait la suivante :
     *
     * ```java
     * /**
     *  Retourne la valeur actuelle de la variable booléenne \
     */
    public boolean getJoyJ2BasEnfoncee() {
        return l;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode que vous avez fournie :
     *
     * ```java
     * /**
     *  Récupère la valeur du booléen correspondant à la touche.
     *  Cette méthode retourne la valeur actuelle de la variable lTape et la met à false à la fin.
     *
     *  @return la valeur actuelle de la variable lTape
     * /
     * public boolean getJoyJ2BasTape() {
     *     boolean aRetourner = lTape;
     *     lTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Comme vous l'avez vu, je n'ai pas mis de `@param` car la méthode ne prend pas de paramètre. Cependant, pour une meilleure compréhension, vous pouvez éventuellement mettre `@param` lorsque la méthode prendrait des paramètres.
     */
    public boolean getJoyJ2BasTape() {
        boolean aRetourner = lTape;
        lTape = false;
        return aRetourner;
    }

    /**
     * ```java
     * /**
     *  Récupère l'état de la touche droite de la joystick.
     *
     *  @return true si la touche droite est enfoncée, sinon false.
     * /
     * public boolean getJoyJ2DroiteTape() {
     *     boolean aRetourner = mTape;
     *     mTape = false;
     *     return aRetourner;
     * }
     * ```
     */
    public boolean getJoyJ2DroiteTape() {
        boolean aRetourner = mTape;
        mTape = false;
        return aRetourner;
    }

    /**
     * Bien sûr, voici la documentation JavaDoc pour votre fonction `getJoyJ2DroiteEnfoncee()` :
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour déterminer si la touche de la joystick 2D, située à droite, est enfoncée ou non.
     *
     *  @return Un booléen indiquant si la touche de la joystick 2D, située à droite, est enfoncée (true) ou non (false).
     * /
     * public boolean getJoyJ2DroiteEnfoncee() {
     *     return m;
     * }
     * ```
     *
     * Cette documentation précise le rôle de la méthode `getJoyJ2DroiteEnfoncee()`, ce qu'elle fait et comment elle est utilisée. L'utilisateur s'attend à ce que cette méthode retourne un booléen (true ou false) indiquant l'état de la touche de la joystick 2D située à droite (enfoncée ou non).
     */
    public boolean getJoyJ2DroiteEnfoncee() {
        return m;
    }

    /**
     * /**
     *  Cette méthode est une méthode Java qui retourne une valeur booléenne (`true` ou `false`) indiquant si la touche est maintenue enfoncée ou non.
     *
     *  @return booléen (`true` si la touche est enfoncée, `false` sinon)
     * /
     * public boolean getJoyJ2HautEnfoncee() {
     *     return o;
     * }
     */
    public boolean getJoyJ2HautEnfoncee() {
        return o;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getJoyJ2HautTape` :
     *
     * ```java
     * /**
     *  Cette méthode est une fonction Java pour vérifier si la touche est enfoncée.
     *
     *  @return Retourne un booléen indiquant si la touche est enfoncée (`true`) ou non (`false`).
     * /
     * public boolean getJoyJ2HautTape() {
     *     boolean aRetourner = oTape;
     *     oTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette documentation, on décrit la fonction en utilisant des phrases courtes et claires. Le `@return` est spécifié pour indiquer le type et la signification du résultat de la fonction. Dans notre cas, on indique que la fonction renvoie un booléen indiquant si la touche est enfoncée ou non.
     */
    public boolean getJoyJ2HautTape() {
        boolean aRetourner = oTape;
        oTape = false;
        return aRetourner;
    }

    /**
     * La documentation JavaDoc pour la fonction `getBoutonJ1ATape` ressemblerait à ceci :
     *
     * ```java
     * /**
     *  Permet de savoir si le bouton J1 a été touché.
     *
     *  @return `true` si le bouton J1 a été touché, `false` sinon. Après la lecture, la valeur est remise à `false`.
     * /
     * public boolean getBoutonJ1ATape() {
     *     boolean aRetourner = fTape;
     *     fTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette documentation, nous décrivons ce que la méthode fait en résumé, ses paramètres et son résultat. Nous expliquons également comment elle fonctionne en précisant que le champ `fTape` est utilisé pour stocker l'état de l'appui sur le bouton J1. Cela permet d'avoir une trace de l'état précédent, mais que l'état actuel est remis à `false` immédiatement après la lecture.
     */
    public boolean getBoutonJ1ATape() {
        boolean aRetourner = fTape;
        fTape = false;
        return aRetourner;
    }

    /**
     * ```java
     * /**
     *  La documentation JavaDoc pour cette méthode est la suivante:
     *
     *  ```java
     *   /**
     *    Récupère l'état de la touche J1A \
     *
     *    @return true si la touche J1A est enfoncée, false sinon
     *   
     * public boolean getBoutonJ1AEnfoncee() {
     *     return f;
     * }
     * ```
     */
    public boolean getBoutonJ1AEnfoncee() {
        return f;
    }

    /**
     * La documentation JavaDoc pour la méthode `getBoutonJ1BTape` ressemblerait à ceci :
     *
     * ```java
     * /**
     *  Retourne et réinitialise le statut de la touche.
     *
     *  @return true si la touche a été pressée, false sinon
     * /
     * public boolean getBoutonJ1BTape() {
     *     boolean aRetourner = gTape;
     *     gTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette documentation, `@return` est utilisé pour indiquer ce que la méthode renvoie. Ici, elle renvoie `true` si la touche a été pressée (`gTape` était `true`) et `false` sinon.
     */
    public boolean getBoutonJ1BTape() {
        boolean aRetourner = gTape;
        gTape = false;
        return aRetourner;
    }

    /**
     * /**
     *  Obtient la valeur de la touche j1b enfoncée.
     *
     *  @return true si la touche j1b est enfoncée, false sinon
     * /
     * public boolean getBoutonJ1BEnfoncee() {
     *     return g;
     * }
     */
    public boolean getBoutonJ1BEnfoncee() {
        return g;
    }

    /**
     * La documentation JavaDoc pour la méthode `getBoutonJ1CTape()` est la suivante :
     *
     * ```java
     * /**
     *  Cette méthode permet de vérifier si la touche a été tapée ou non.
     *  Une fois que la touche a été vérifiée, le statut de la touche (hTape) est réinitialisé à false.
     *
     *  @return boolean - true si la touche a été tapée, false sinon
     * /
     * public boolean getBoutonJ1CTape() {
     *     boolean aRetourner = hTape;
     *     hTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Cette documentation décrit clairement le rôle de la méthode et comment elle est utilisée. Le `@return` indique que la méthode renvoie un booléen qui est true si la touche a été tapée et false sinon.
     */
    public boolean getBoutonJ1CTape() {
        boolean aRetourner = hTape;
        hTape = false;
        return aRetourner;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode que vous avez fournie :
     *
     * ```java
     * /**
     *  Cette méthode permet de savoir si le bouton du joueur 1 est enfoncé ou non.
     *
     *  @return Retourne un booléen indiquant si le bouton est enfoncé ou non.
     * /
     * public boolean getBoutonJ1CEnfoncee() {
     *     return h;
     * }
     * ```
     *
     * Notez que cela suppose que la variable `h` est définie et est de type `boolean`, c'est-à-dire, elle vaut soit `true`, soit `false`. Cela décrit le paramètre de sortie de la méthode. Si cela n'est pas le cas, vous devriez le spécifier explicitement dans la documentation.
     */
    public boolean getBoutonJ1CEnfoncee() {
        return h;
    }

    /**
     * Voici la documentation JavaDoc pour votre fonction :
     *
     * ```java
     * /**
     *  La documentation JavaDoc pour la fonction est la suivante :
     *
     *  ```java
     *   /**
     *    * Permet de savoir si la touche a été tappée.
     *    * Cette méthode retourne true si la touche a été tappée et false sinon.
     *    * Elle réinitialise également le statut de la touche après avoir été appelée.
     *    *
     *    * @return true si la touche a été tappée, false sinon
     *    
     * public boolean getBoutonJ1XTape()
     * {
     *     boolean aRetourner = rTape;
     *     rTape = false;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette documentation, on décrit :
     *
     * - La fonction : `getBoutonJ1XTape()` est une méthode qui permet de savoir si une touche a été tappée.
     * - Les paramètres : Il n'y a pas de paramètres dans cette fonction.
     */
    public boolean getBoutonJ1XTape() {
        boolean aRetourner = rTape;
        rTape = false;
        return aRetourner;
    }

    /**
     * Voici la documentation JavaDoc pour votre méthode `getBoutonJ1XEnfoncee` :
     *
     * ```java
     * /**
     *  Cette méthode semble obtenir la valeur d'un booléen nommé r.
     *
     *  @return boolean - La valeur actuelle de la variable booléenne r.
     * /
     * public boolean getBoutonJ1XEnfoncee() {
     *     return r;
     * }
     * ```
     *
     * Dans cette documentation, nous décrivons la tâche de la méthode `getBoutonJ1XEnfoncee` et expliquons ce qu'elle renvoie. Le paramètre `r` est un booléen qui contient une valeur booléenne. La méthode renvoie simplement cette valeur. Donc, aucun paramètre n'est présenté ici, car c'est la méthode elle-même qui renvoie la valeur de la variable `r`.
     */
    public boolean getBoutonJ1XEnfoncee() {
        return r;
    }

    /**
     * /**
     *  Cette méthode est définie pour vérifier si le bouton J1 a été tapé.
     *
     *  @return boolean - Retourne true si le bouton J1 a été tapé, sinon retourne false.
     * /
     * public boolean getBoutonJ1YTape() {
     *     boolean aRetourner = tTape;
     *     tTape = false;
     *     return aRetourner;
     * }
     */
    public boolean getBoutonJ1YTape() {
        boolean aRetourner = tTape;
        tTape = false;
        return aRetourner;
    }

    /**
     * /**
     *  Cette méthode permet de déterminer si le bouton J1Y est enfoncée ou non.
     *
     *  @return boolean - true si le bouton J1Y est enfoncé, false sinon
     *
     *  @throws Exception si t n'est pas déclaré dans la portée de cette méthode
     * /
     * public boolean getBoutonJ1YEnfoncee() {
     *     return t;
     * }
     */
    public boolean getBoutonJ1YEnfoncee() {
        return t;
    }

    /**
     * Voici la documentation JavaDoc pour votre fonction :
     *
     * ```java
     * /**
     *  Permet de savoir si le bouton J1 est zapé
     *
     *  @return true si le bouton J1 est zapé, false sinon
     * /
     * public boolean getBoutonJ1ZTape() {
     *     boolean aRetourner = yTape;
     *     yTape = false;\u003c｜begin▁of▁sentence｜\u003e;
     *     return aRetourner;
     * }
     * ```
     *
     * Dans cette fonction, `getBoutonJ1ZTape()` est une méthode qui permet de savoir si le bouton J1 a été zapé ou non. Elle renvoie un booléen : `true` si le bouton J1 est zapé, `false` sinon. Après avoir vérifié la valeur, la variable `yTape` est réinitialisée à `false` pour préparer la vérification pour la prochaine appel de la méthode.
     */
    public boolean getBoutonJ1ZTape() {
        boolean aRetourner = yTape;
        yTape = false;
        return aRetourner;
    }

    /**
     * /**
     *  La fonction `getBoutonJ1ZEnfoncee()` est une méthode Java permettant de vérifier si la touche J1 est enfoncée.
     *
     *  @return Un booléen indiquant si la touche J1 est enfoncée (true) ou non (false).
     * /
     * public boolean getBoutonJ1ZEnfoncee() {
     *     return y;
     * }
     */
    public boolean getBoutonJ1ZEnfoncee() {
        return y;
    }

    // Méthodes //
    /**
     * Voici la documentation JavaDoc complète pour la méthode `reinitialisation()` :
     *
     * ```java
     * /**
     *  Méthode permettant la reinitialisation du clavier. Reinitialisation de tous les événements.
     *
     *  Cette méthode réinitialise tous les variables booléennes du clavier. Elle est appelée lorsque le clavier doit être réinitialisé. Cela signifie que toutes les touches seront à false et les touches seront à leur état initial.
     * /
     * public void reinitialisation() {
     *     // ...
     * }
     * ```
     *
     * Dans cette documentation, il n'y a pas de paramètres (@param) et de valeur de retour (@return) car la méthode `reinitialisation()` ne prend pas de paramètres en entrée et ne renvoie pas de valeur. Elle modifie directement les variables membres du clavier, donc elle n'a pas besoin de renvoyer quoi que ce soit.
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
     * La documentation JavaDoc pour cette méthode est la suivante :
     *
     * ```java
     * /**
     *  Cette méthode est une gestionnaire d'événements pour l'événement de relâchement de touche du clavier.
     *
     *  @param key est un objet de la classe {@link java.awt.event.KeyEvent} représentant l'événement clavier.
     *
     *  @return aucun (void).
     *
     *  Cette méthode met à jour les variables booléennes qui représentent les touches du clavier.
     *  Si une touche est relâchée, la variable correspondante est mise à `false` et une variable `Tape` est mise à `true`.
     *  Cela indique que la touche a été relâchée.
     *
     *  Par exemple, si la touche F est relâchée, la variable `f` est mise à `false` et `fTape` est mise à `true`.
     *
     *  Cette méthode est liée à la méthode {@link #keyPressed(java.awt.event.KeyEvent)} via le {@link java.awt.event.KeyListener},
     *  qui permet de gérer l'appui des touches.
     *
     *  Voir la documentation de {@link java.awt.event.KeyEvent} et {@link java.awt.event.KeyListener}
     *  pour plus d'informations :
     *   {@link https://docs.oracle.\u003c｜begin▁of▁sentence｜\u003ecom/javase/7/docs/api/java/awt/event/KeyEvent.html KeyEvent}
     *   {@link https://docs.oracle.\u003c｜begin▁of▁sentence｜\u003ecom/javase/7/docs/api/java/awt/event/KeyListener.html KeyListener}
     * /
     * @Override
     * public void keyReleased(KeyEvent key) {
     *     // Code de la méthode
     * }
     * ```
     *
     * Cette documentation précise le rôle de la méthode, ses paramètres et sa valeur de retour. Elle précise également comment elle est liée à d'autres méthodes et comment elle peut être utilisée.
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
     * /**
     *  Implémente la méthode `keyTyped` - une méthode appelée automatiquement lorsqu'un événement clavier se produit.
     *  \u003cbr\u003e\u003cbr\u003e
     *  Cette méthode doit être implémentée mais est inutile dans ce moteur de jeu.
     *
     *  @param k l'objet KeyEvent contenant les détails de l'événement
     * /
     * @Override
     * public void keyTyped(KeyEvent k) {
     *     // La corps de la méthode est intentionnellement laissé vide
     * }
     */
    @Override
    public void keyTyped(KeyEvent k) {
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `keyPressed` :
     *
     * ```java
     * /**
     *  Implémente la méthode KeyPressed - méthode appelée automatiquement lors d'un événement clavier.
     *  \u003cbr/\u003e\u003cbr/\u003e
     *  Cette méthode met à jour les valeurs des attributs en fonction des interactions au clavier.
     *  Ici, si une touche est pressée, l'attribut correspondant à cette touche est mis à jour.
     *  Pour gérer le relâchement des touches, voir la méthode keyReleased(KeyEvent k).
     *
     *  @param key un événement clavier
     *  @see KeyEvent
     * /
     * @Override
     * public void keyPressed(KeyEvent key) {
     *     // Code de la méthode ici...
     * }
     * ```
     *
     * Cette documentation est basée sur la description que vous avez fournie, mais elle ne mentionne pas explicitement les paramètres d'entrée ou le type de valeur de retour de la méthode. Dans votre code, il semble que `keyPressed` ait une seule entrée de type `KeyEvent` et ne retourne pas de valeur. Dans le cas général, il n'y a pas de paramètre et le type de la valeur de retour serait `void`.
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
