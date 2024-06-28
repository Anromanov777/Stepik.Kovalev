package Билет_8;

import java.util.ArrayList;
import java.util.List;

public class Operator extends Employ implements Rabota {
    boolean komp;
    private static final List<Operator> operatorList = new ArrayList<>();

    public static List<Operator> getOperatorList() {
        return operatorList;
    }



    public Operator(String name, boolean isMedkniga, int age, String specialnost, boolean komp) {
        super(name, isMedkniga, age, specialnost);
        this.komp = komp;
        operatorList.add(this);
    }

    @Override
    public void izgotovlenie() {
        System.out.println("Оператор принимает заказ");
    }
}
