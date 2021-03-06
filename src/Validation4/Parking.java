package Validation4;

public class Parking {
    private int nbPlaces2Roues, dispo;
    private String nomParking;

    public Parking(String nomParking, int nbPlaces2Roues) {
        this.nomParking = nomParking;
        this.nbPlaces2Roues = nbPlaces2Roues;
        this.dispo = nbPlaces2Roues;
    }

    public void garer(Vehicule vehicule) {
        if (vehicule instanceof DeuxRoues) {
            if (dispo > 0) {
                System.out.println("Bienvenue à " + nomParking + ", " + vehicule.modele + ", vous pouvez vous garer, il y a " + dispo +
                        (dispo == 1 ? " place disponible" : " places disponibles") + " dans la zone 2 roues");
                dispo--;
            } else {
                System.out.println("Désolé " + vehicule.modele + ", le parking 2 roues est complet");
            }
        } else {
            System.out.println(vehicule.modele + " se gare à " + nomParking);}
    }

    public void liberer(Vehicule vehicule) {
            System.out.println(nomParking + " vous remercie de votre visite, " + vehicule.modele + ".  A bientôt !");
            dispo++;
        }
}
