package Exercice2;

public interface Pile {

    // ajoute un objet sur la pile
    public void empiler(Object o);
    // enlève l'objet sur le dessus de la pile et le retourne
    public Object depiler();
    // retourne vrai si la pile est vide
    public boolean estVide();
    // retourne le nombre d'objets dans la pile
    public int taille();
    }
