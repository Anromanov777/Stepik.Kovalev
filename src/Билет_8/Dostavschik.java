package Билет_8;

public class Dostavschik extends Employ implements Rabota{
    String nomerAvto;

    public Dostavschik(String name, boolean isMedkniga, int age, String specialnost, String nomerAvto) {
        super(name, isMedkniga, age, specialnost);
        this.nomerAvto = nomerAvto;
    }

    @Override
    public void izgotovlenie() {
        System.out.println("Доставщик доставляет заказ");
    }
}
