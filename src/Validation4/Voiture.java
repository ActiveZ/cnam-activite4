package Validation4;

public class Voiture extends VehiculeMotorise {

    /**
     *
     * @param distance: distance parcourue en km
     */
    public void rouler(int distance) {
        if (distance * moteur.conso > moteur.carburant) {
            System.out.println("Vous n'avez pas assez de carburant pour parcourir " + distance + " km !");
        }
    }

}
