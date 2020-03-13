package Validation4;

public class Parking extends Vehicule {
    int nbPlaces, dispo;

    public Parking(int nbPlaces) {
        this.nbPlaces = nbPlaces;
        this.dispo = nbPlaces;
    }

    public void garer(Vehicule vehicule) {
        if (!(vehicule instanceof DeuxRoues)) { System.out.println("Ce parking est réservé aux deux-roues !");}
        else {
            if (dispo > 0) {
                System.out.println("Bienvenue, vous pouvez vous garer, il reste " + dispo +
                        (dispo == 1 ? " place disponible" : " places disponibles"));
                dispo--;
            } else {
                System.out.println("Désolé, le parking est complet");
            }
        }
    }

    public void liberer(Vehicule vehicule) {
            System.out.println("Merci de votre visite, à bientot !");
            dispo++;
        }


    @Override
    protected void demarrer() {}

    @Override
    protected void arreter() {}
}
