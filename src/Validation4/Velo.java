package Validation4;

public class Velo extends Vehicule implements DeuxRoues {

    @Override
    protected void demarrer() {}

    @Override
    protected void arreter() {}


    @Override
    public void changerPneuAvant() {
        System.out.println("J'ai changé le pneu avant de mon vélo");
    }

    @Override
    public void changerPneuArriere() {
        System.out.println("J'ai changé le pneu arrière de mon vélo");
    }

    @Override
    public void seGarer() {

    }
}
