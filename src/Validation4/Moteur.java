package Validation4;

public class Moteur {
    protected double carburant = 50; //niveau de carburant en litres
    protected double conso = 0.05; // 5 litres/100km

    public void setCarburant(double carburant) {
        this.carburant += carburant;
    }

    public void demarrerM() {
        if (carburant > 0.5) {
            carburant -= 0.2;
            System.out.println("Le moteur démarre. Litres de carburant disponibles: " + carburant);
        }
        else {System.out.println("Démarrage impossible: pas assez de carburant !");}
    }

    public void utiliserM(int nbKm) {
        if (nbKm * conso > carburant) {
            System.out.println("Il n'y a pas assez de carburant pour parcourir " + nbKm + " km !");
        }
        else {
            System.out.println("Le moteur tourne pendant " + nbKm + " km et a consommé " + conso*nbKm + " litres de carburant");
            carburant -= nbKm * conso;
        }
    }

    public void arreterM() {
        System.out.printf("Le moteur s'arrête. Litres de carburant restants:  %.1f %n", carburant);
    }
}
