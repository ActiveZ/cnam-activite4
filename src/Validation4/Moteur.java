package Validation4;

public class Moteur {
    protected int carburant = 100; //niveau de carburant en litres
    protected double conso = 10; // litre/100km

//    public int getCarburant() {
//        return carburant;
//    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public void demarrerM() {
        if (carburant > 0.5) {
            carburant -= 0.2;
            System.out.println("Le moteur démarre. Litres de carburant disponibles: " + carburant);
        }
        else {System.out.println("Démarrage impossible: pas assez de carburant !");}
    }

    public void utiliserM(int nbKm) {
        System.out.println("Le moteur tourne pendant " + nbKm + " km et consomme " + conso + " litres au 100 km");
        carburant -= nbKm*conso;
    }

    public void arreterM() {
        System.out.println("Le moteur s'arrete. Litres de carburant disponibles: " + carburant);
    }
}
