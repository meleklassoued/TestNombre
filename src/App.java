import Nombre.personne;

public class App {
    public static void main(String[] args) {

        // personne P1 = new personne("melek", "lassoued");
        // personne[] tab = new personne[3];

        // for (int i = 0; i < tab.length; i++) {
        // tab[i] = new personne("malik", "lassoued");
        // tab[i].afficher();
        // }
        personne P2 = new personne("fedi", "hajri");
        personne P3 = new personne("fedi", "boden");

        boolean equals = (P2.nom == P3.nom);
        System.out.println(equals);
    }
}
