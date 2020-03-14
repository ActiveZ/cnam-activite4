package Validation4;

public abstract class VehiculeMotorise extends Vehicule {
    Moteur moteur = new Moteur();

    protected void demarrer() {
        System.out.println("Ma " + modele + " veut partir...");
        moteur.demarrerM();
    }

    protected void arreter(){
        System.out.println("Ma " + modele + " veut s'arrêter...");
        moteur.arreterM();
    }

    /**
     *
     * @param nbLitres: Nombre de litres de carburant ajoutés dans le réservoir
     */
    protected void remplirReservoir(int nbLitres) {
        moteur.setCarburant(nbLitres);
        System.out.println("J'ai ajouté " + nbLitres + " litres de carburant dans le réservoir de ma " + modele);
    }
}
