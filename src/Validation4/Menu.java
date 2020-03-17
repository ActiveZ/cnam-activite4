package Validation4;

public class Menu {
    // création parking 5 places
    private Parking parking = new Parking("Parc gratuit",5);

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


    public void jouer() { //todo: a développer
    voiture1.demarrer();
    voiture1.rouler(1000);
    voiture1.remplirReservoir(20);
    voiture1.rouler(1000);

    voiture1.arreter();

    moto1.changerPneuArriere();
    velo2.changerPneuArriere();
    reparateur.reparerRoueArriere(moto1);

    moto1.seGarer(parking);
    velo2.seGarer(parking);
    voiture2.seGarer(parking);
    moto1.liberer(parking);
    velo1.seGarer(parking);

    }
}
