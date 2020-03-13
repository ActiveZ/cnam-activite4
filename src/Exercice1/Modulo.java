package Exercice1;

public class Modulo implements Incrementable {
    private int val, modulo;

    public Modulo(int val, int modulo) {
        this.val = val;
        this.modulo = modulo;
    }

    public int getVal() {
        return val;
    }

    @Override
    public void incrementer() {
        val += modulo;
    }
}
