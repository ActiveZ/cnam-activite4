package Validation4;

public class Parking {
    int nbPlaces2Roues, dispo;

    public Parking(int nbPlaces2Roues) {
        this.nbPlaces2Roues = nbPlaces2Roues;
        this.dispo = nbPlaces2Roues;
    }

    public void garer(Vehicule vehicule) {
        if (vehicule instanceof DeuxRoues) {
            if (dispo > 0) {
                System.out.println("Bienvenue " + vehicule.modele + ", vous pouvez vous garer, il reste " + dispo +
                        (dispo == 1 ? " place disponible" : " places disponibles") + " dans la zone 2 roues");
                dispo--;
            } else {
                System.out.println("Désolé " + vehicule.modele + ", le parking 2 roues est complet");
            }
        } else {
            System.out.println(vehicule.modele + " se gare");}
    }

    public void liberer(Vehicule vehicule) {
            System.out.println("Merci de votre visite, " + vehicule.modele + ".  A bientôt !");
            dispo++;
        }

//
//    @Override
//    protected void demarrer() {}
//
//    @Override
//    protected void arreter() {}
}
