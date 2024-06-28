package Билет_8;

public abstract class Employ {
    String name;
    boolean isMedkniga;
    int age;
    String specialnost;

    public Employ(String name, boolean isMedkniga, int age, String specialnost) {
        this.name = name;
        this.isMedkniga = isMedkniga;
        this.age = age;
        this.specialnost = specialnost;
    }
}
