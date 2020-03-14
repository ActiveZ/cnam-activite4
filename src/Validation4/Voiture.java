package Validation4;

public class Voiture extends VehiculeMotorise {
    public Voiture(String modele) {
        this.modele = modele;
    }

    /**
     *
     * @param distance: distance parcourue en km
     */
    public void rouler(int distance) {
        moteur.utiliserM(distance);
    }
}
