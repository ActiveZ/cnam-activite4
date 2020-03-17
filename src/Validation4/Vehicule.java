package Validation4;

public abstract class Vehicule {

    protected String modele;
    private boolean estGare;

    public String getModele(){
        return modele;
    }

    public void seGarer(Parking parking) {
        if (!estGare) {
            parking.garer(this);
            estGare = !estGare;
        }
    }

    public void liberer(Parking parking) {
        if (estGare) {
            parking.liberer(this);
            estGare=!estGare;
        }
    }

    protected abstract void demarrer();

    protected abstract void arreter();
}
