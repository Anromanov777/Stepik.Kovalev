package Абстракция_зданий;

public class Library extends Building {
    private int kolvoMest;
    private int kolvoKnig;
    private int klvoPosetiteley;

    public boolean vmestimost() {
        return klvoPosetiteley < kolvoMest;
    }

    public boolean razmerBiblioteki() {
        return kolvoKnig > 5000;
    }

    @Override
    public String toString() {
        return   "kolvoMest=" + kolvoMest +
                ", kolvoKnig=" + kolvoKnig +
                ", klvoPosetiteley=" + klvoPosetiteley +
                super.toString();
    }
}
