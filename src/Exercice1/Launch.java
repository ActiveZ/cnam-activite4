package Exercice1;

public class Launch {

    public static void main(String[] args) {
        Entier entier = new Entier(5);
        System.out.println("Entier avant: " + entier.getVal());
        entier.incrementer();
        System.out.println("Entier après: " + entier.getVal());

        Modulo modulo = new Modulo(5,8);
        System.out.println("Modulo avant: " + modulo.getVal());
        modulo.incrementer();
        System.out.println("Modulo après: " + modulo.getVal());
    }
}
