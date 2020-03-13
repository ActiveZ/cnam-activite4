package Validation4;

public class Moto extends VehiculeMotorise implements DeuxRoues {
    /**
     *
     * @param distance: distance parcourue en km
     */
    public void rouler(int distance) {
        if (distance * moteur.conso > moteur.carburant) {
            System.out.println("Vous n'avez pas assez de carburant pour parcourir " + distance + " km !");
        }
    }


    @Override
    public void changerPneuAvant() {
        System.out.println("J'ai changé le pneu avant de ma moto");
    }

    @Override
    public void changerPneuArriere() {
        System.out.println("J'ai changé le pneu arrière de ma moto");
    }
}
