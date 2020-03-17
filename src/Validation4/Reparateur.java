package Validation4;

public class Reparateur {
    private String nom;

    public Reparateur(String nom) {
        this.nom = nom;
    }

    public void reparerRoueAvant(DeuxRoues dr) {
        System.out.println(nom + " a réparé la roue avant de ma " + dr.getModele());
    }

    public void reparerRoueArriere(DeuxRoues dr) {
        System.out.println(nom + " a réparé la roue arrière de ma " + dr.getModele());
    }
}
