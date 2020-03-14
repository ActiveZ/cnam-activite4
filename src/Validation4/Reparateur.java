package Validation4;

public class Reparateur implements DeuxRoues {
    private String nom;

    public Reparateur(String nom) {
        this.nom = nom;
    }

    @Override
    public void changerPneuAvant() { System.out.println(nom + " a réparé la roue avant !");}

    @Override
    public void changerPneuArriere() { System.out.println(nom + " a réparé la roue arrière !");}

    public void reparerRoueAvant() {
        changerPneuAvant();
    }

    public void reparerRoueArriere() {
        changerPneuArriere();
    }
}
