package Exercice2;

import java.util.ArrayList;

public class PileArrayList implements Pile {

    private ArrayList liste;

    public PileArrayList() {
        // création d'une liste
        liste = new ArrayList();
    }

    @Override
    public void empiler(Object o) {
        // ajout dans la liste (à la fin par défaut)
        liste.add(o);
    }

    @Override
    public Object depiler() {
        Object o = null;
        if (!estVide()) {
            // on prend le dernier élément
            o = liste.get(liste.size()-1);
            // on le supprime
            liste.remove(liste.size()-1);
        }
        // retourne l'objet
        return o;
    }

    @Override
    public boolean estVide() {
        return (liste.isEmpty());
    }

    @Override
    public int taille() {
        return (liste.size());
    }

}
