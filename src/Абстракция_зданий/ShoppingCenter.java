package Абстракция_зданий;

public class ShoppingCenter extends Building implements SocialHouse{
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

    @Override
    public boolean fire() {
        return true;
    }

    @Override
    public void kolvoBetona() {
        System.out.println("Потрачено много бетона");
    }
}
