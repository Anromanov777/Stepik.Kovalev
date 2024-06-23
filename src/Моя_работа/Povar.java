package Моя_работа;

import java.util.LinkedList;
import java.util.List;

public class Povar {
    String name;
    int maxZakazovVliste = 2;   //Количество заказов в личном листе повара. По умолчанию два.
    private List<Zakaz> zakazList;

    public Povar(String name) {
        this.name = name;
    }

    public List<Zakaz> getZakazList() {
        if (zakazList == null) {
            zakazList = new LinkedList<>();
        }
        return zakazList;
    }

    @Override
    public String toString() {
        return "Повар:" + name + " заказы у повара:" + zakazList;
    }
}
