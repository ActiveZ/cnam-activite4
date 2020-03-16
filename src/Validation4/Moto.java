package Validation4;

public class Moto extends VehiculeMotorise implements DeuxRoues {
    public Moto(String modele) {
        this.modele = modele;
    }

    /**
     *
     * @param distance: distance parcourue en km
     */
    public void rouler(int distance) {
        moteur.utiliserM(distance);
    }


    @Override
    public void changerPneuAvant() {
        System.out.println("J'ai changé le pneu avant de ma " + modele);
    }

    @Override
    public void changerPneuArriere() {
        System.out.println("J'ai changé le pneu arrière de ma " + modele);
    }


    public void seGarer(Parking parking) {
        parking.garer(this);
    }

}
