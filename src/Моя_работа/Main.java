package Моя_работа;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ObschiiSpisokZakazov.putZakazList(new Zakaz());
        }
        SpisokVklPovarovNaRollah.addVklpovar(new Povar("Альберт"));
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getZakazList());
        SpisokVklPovarovNaRollah.addVklpovar(new Povar("Динар"));
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getZakazList());
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getZakazList());
        System.out.println("Размер листа заказов у повара:"+SpisokVklPovarovNaRollah.getVklpovar().get(0).getZakazList().size());


    }


}
