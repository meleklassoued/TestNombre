package Nombre;

public class personne {
    public String nom;
    public String prenom;
    public int code = 1;

    public personne(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;

    }

    public int getcode() {
        return this.code;
    }

    public void setcode(personne P) {
        this.code = P.getcode() + 1;

    }

    public String getNom() {
        return this.nom;
    }

    public void afficher() {
        System.out.println("lenom est" + this.nom + "et le prenom est " + this.prenom + "et le code est " + this.code);
    }

}
