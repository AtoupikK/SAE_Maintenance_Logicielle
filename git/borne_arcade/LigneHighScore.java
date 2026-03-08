class LigneHighScore {

    private String nom;

    private int score;

    public LigneHighScore() {
        nom = "AAA";
        score = 0;
    }

    public LigneHighScore(String nnom, int sscore) {
        if (nnom.length() > 3)
            nnom = "AAA";
        else
            nom = new String(nnom);
        if (sscore < 0)
            score = 0;
        else
            score = sscore;
    }

    public LigneHighScore(LigneHighScore l) {
        nom = new String(l.nom);
        score = l.score;
    }

    public LigneHighScore(String str) {
        String[] tab = str.split("-");
        if (tab.length != 2) {
            nom = "AAA";
            score = 0;
        } else {
            nom = new String(tab[0]);
            score = Integer.parseInt(tab[1]);
        }
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getScore()`:
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour obtenir le score de l'objet.
     *
     *  @return le score de l'objet courant de type int.
     * /
     * public int getScore() {
     *     return score;
     * }
     * ```
     */
    public int getScore() {
        return score;
    }

    /**
     * Voici la documentation JavaDoc pour la méthode `getNom()`:
     *
     * ```java
     * /**
     *  Cette méthode est utilisée pour obtenir le nom de l'objet.
     *
     *  @return String - le nom de l'objet
     * /
     * public String getNom() {
     *     return nom;
     * }
     * ```
     *
     * Dans cette documentation, on décrit brièvement le but de la méthode, son entrée et son sortie. Dans le cas de la méthode `getNom()`, elle ne prend pas de paramètres et renvoie une chaîne de caractères qui est le nom de l'objet.
     */
    public String getNom() {
        return nom;
    }

    /**
     * ```java
     * /**
     *  Méthode pour créer une représentation en chaîne de l'objet.
     *
     *  @return une chaîne de caractères représentant l'objet. Le format de la chaîne est \
     */
    public String toString() {
        return nom + "-" + score;
    }
}
