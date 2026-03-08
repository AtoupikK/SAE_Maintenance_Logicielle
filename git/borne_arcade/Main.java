public class Main {

    /**
     * ```java
     * /**
     *  La méthode principale de l'application.
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
     *
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
