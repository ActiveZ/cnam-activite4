package Validation4;

public class Reperateur implements DeuxRoues {

    @Override
    public void changerPneuAvant() {
        System.out.println("Le réparateur a réparé la roue avant !");
    }

    @Override
    public void changerPneuArriere() {
        System.out.println("Le réparateur a réparé la roue arrière !");
    }

    public void reparerRoueAvant() {
        changerPneuAvant();
    }

    public void reparerRoueArriere() {
        changerPneuArriere();
    }
}
