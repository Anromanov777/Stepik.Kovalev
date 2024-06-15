package Абстракция_зданий;

public class HighRiseBuilding extends Building implements LivingHouse {
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

    @Override
    public void poschitatPeople() {
        System.out.println(etagi * 4 * 4);
    }

    @Override
    public boolean avariinost(int age) {
        return false;
    }
}
