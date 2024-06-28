package Билет_8;

public class Povar extends Employ implements Rabota{
    int razriad;

    public Povar(String name, boolean isMedkniga, int age, String specialnost, int razriad) {
        super(name, isMedkniga, age, specialnost);
        this.razriad = razriad;
    }

    @Override
    public void izgotovlenie() {
        System.out.println("Повар готовит заказ");
    }
}
