package Nombre;

public class Nombre {
    private int Num;

    public Nombre(int n) {
        Num = n;
    }

    private int inc() {
        return Num = Num + 1;
    }

    private int dec() {
        return Num = Num - 1;
    }

    public void afficher() {
        System.out.println("la valeur inc est " + inc() + " et la valeur dec est" + dec());
    }

}
