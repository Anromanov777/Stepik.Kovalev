package Абстракция_зданий;

public class ShoppingCenter extends Building {
    int vmestimostMashinNastojnke;
    int square;
    int count;

    public boolean parking() {
        if (vmestimostMashinNastojnke < count) {
            count++;
            return true;
        } else return false;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return
                "vmestimostMashinNastojnke=" + vmestimostMashinNastojnke +
                ", square=" + square +
                ", count=" + count +
                super.toString();
    }
}
