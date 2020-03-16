package Validation4;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    //public void initialisation() {
        // création parking 5 places
        //System.out.print("Nombre de places dans le parking: ");
        private Parking parking = new Parking(5);

        // création de 2 voitures
        private Voiture voiture1 = new Voiture("Limousine");
        private Voiture voiture2 = new Voiture("Simca1000");

        // création de 2 motos
        private Moto moto1 = new Moto("Honda");
        private Moto moto2 = new Moto("Harley-Davidson");

        // création de 2 vélos
        private Velo velo1 = new Velo("Bicloo");
        private Velo velo2 = new Velo("VTT");

        // création du réparateur
        private Reparateur reparateur = new Reparateur("Mario");
    //}

    public void jouer() {
    voiture1.demarrer();
    voiture1.rouler(1000);
    voiture1.remplirReservoir(20);
    voiture1.rouler(1000);

    voiture1.arreter();

    moto1.changerPneuArriere();
    reparateur.reparerRoueArriere(moto1);
    parking.garer(moto2);
    parking.garer(moto1);
    parking.garer(voiture1);

    }
}
