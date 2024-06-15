package Абстракция_зданий;

public class HighRiseBuilding extends Building{
    int etagi;
    boolean parcing;

    public int getEtagi() {
        return etagi;
    }

    public boolean isParcing() {
        return parcing;
    }

    @Override
    public String toString() {
        return
                "etagi=" + etagi +
                ", parcing=" + parcing +
                 super.toString();
    }
}
