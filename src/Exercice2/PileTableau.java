package Exercice2;

public class PileTableau implements Pile {

    private Object[] tableau;
    private int nbelem;

    /**
     * @param size
     */
    public PileTableau(int size) {
        // création d'une pile d'au plus size éléments
        tableau = new Object[size];
        // au départ, il n'y a pas d'éléments dedans
        nbelem = 0;
    }

    @Override
    public void empiler(Object o) {
        // s'il reste de la place
        if (nbelem<tableau.length) {
            // on met l'élément sur le dessus de la ppile
            tableau[nbelem-1]=o;
            // on augmente le nombre d'éléments
            nbelem++;
        }
    }

    @Override
    public Object depiler() {
        Object o = null;
        // s'il y a des éléments dans la pile
        if (nbelem>0) {
            // on prend celui qui est sur le dessus
            o = tableau[nbelem-1];
            // on l'efface dans le tableau
            tableau[nbelem-1]=null;
            // on décrémente
            nbelem--;
        }
        // on retourne l'élément
        return o;
    }

    @Override
    public boolean estVide() {
        return (nbelem==0);
    }

    @Override
    public int taille() {
        return (nbelem);
    }
}
