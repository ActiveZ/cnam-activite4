package Validation4;

public class Reparateur {
    private String nom;

    public Reparateur(String nom) {
        this.nom = nom;
    }


    public void reparerRoueAvant(Vehicule vehicule) {
        if (vehicule instanceof DeuxRoues) {
            System.out.println(nom + " a réparé la roue avant de ma " + vehicule.modele);
        } else {
            System.out.println("Désolé, " + nom + " ne répare que les deux-roues.");
        }
    }

    public void reparerRoueArriere(DeuxRoues dr) {
        if (dr instanceof DeuxRoues) {
            System.out.println(nom + " a réparé la roue arrière de ma " + dr.getModele());
        } else {
            System.out.println("Désolé, " + nom + " ne répare que les deux-roues.");
        }
    }

}
