package Exercice1;

public class Entier implements Incrementable {
    private int val;

    public Entier(int val) {
        this.val = val;
    }

    @Override
    public void incrementer() {
        val++;
    }

    public int getVal() {
        return val;
    }
}
