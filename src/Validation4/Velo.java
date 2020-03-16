package Validation4;

public class Velo extends Vehicule implements DeuxRoues {

    public Velo(String modele) {
        this.modele = modele;
    }

    @Override
    protected void demarrer() {
        System.out.println("Je pédale sur mon " + modele);
    }

    @Override
    protected void arreter() {
        System.out.println("Mon " + modele + " s'arrête");
    }


    @Override
    public void changerPneuAvant() {
        System.out.println("J'ai changé le pneu avant de mon " + modele);
    }

    @Override
    public void changerPneuArriere() {
        System.out.println("J'ai changé le pneu arrière de mon " + modele);
    }

    @Override
    public void seGarer() {}
}
