package Абстракция_зданий;


public class PoliceDepartment extends Building implements SocialHouse {
    int zadergannie;
    String nameShefa;

    public String getNameShefa() {
        return nameShefa;
    }

    public boolean estlizadergannie() {
        return zadergannie > 0;
    }

    @Override
    public String toString() {
        return
                "zadergannie=" + zadergannie +
                ", nameShefa='" + nameShefa + '\'' +
                super.toString();
    }

    @Override
    public boolean fire() {
        return false;
    }

    @Override
    public void kolvoBetona() {
        System.out.println("На строительство здания потрачено мало бетона");
    }
}
