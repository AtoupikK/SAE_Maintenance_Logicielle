public class Main {

    /**
     * La documentation JavaDoc pour la méthode main de votre programme peut être comme suit :
     *
     * ```java
     * /**
     *  Méthode principale de l'application.
     *
     *  La méthode s'exécute en boucle infinie tant que le programme est en cours d'exécution.
     *  Elle appelle régulièrement la méthode {@link Graphique#selectionJeu()} de l'objet Graphique.
     *
     *  @param args Arguments de la ligne de commande (non utilisés ici)
     *  @throws Exception Si une exception non gérée se produit lors de l'exécution du programme
     * /
     * public static void main(String[] args) throws Exception {
     *     Graphique g = new Graphique();
     *     while (true) {
     *         Thread.sleep(250); // Pause de 250 millisecondes
     *         g.selectionJeu();
     *     }
     * }
     * ```
     *
     * Cependant, il semble que vous voulez écrire une documentation pour la méthode `selectionJeu()` de la classe `Graphique`. Dans ce cas, voici un exemple de documentation pour cette méthode :
     *
     * ```java
     * /**
     *  Méthode permettant de sélectionner le jeu en cours.
     *
     *  Cette méthode est responsable de l'affichage du jeu en cours sur l'interface utilisateur.
     *
     *  @throws Exception Si une exception non gérée se produit lors de l'affichage du jeu
     * /
     * public void selectionJeu() throws Exception {
     *     // Code de la méthode ici
     * }
     * ```
     *
     * Veuillez noter que JavaDoc suppose que vous avez déjà une compréhension de ce que la méthode fait et comment elle est utilisée. Il n'est pas possible de générer automatiquement la documentation à partir du code source.
     */
    public static void main(String[] args) {
        Graphique g = new Graphique();
        while (true) {
            try {
                // Thread.sleep(250);
            } catch (Exception e) {
            }
            ;
            g.selectionJeu();
        }
    }
}
