package Абстракция_зданий;

public class PoliceDepartment extends Building {
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
}
