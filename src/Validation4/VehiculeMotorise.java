package Validation4;

import java.util.Scanner;

public abstract class VehiculeMotorise extends Vehicule {
    //Scanner sc = new Scanner(System.in);
    Moteur moteur = new Moteur();

    protected void demarrer() {
        moteur.demarrerM();
    }

    protected void arreter(){
        moteur.arreterM();
    }

    /**
     *
     * @param nbLitres: Nombre de litres de carburant ajoutés dans le réservoir
     */
    protected void remplirReservoir(int nbLitres) {
        moteur.setCarburant(nbLitres);
//        System.out.print("Nombre de litres de carburant ajoutés dans le réservoir: ");
//        moteur.setCarburant(sc.nextInt());
    }
}
