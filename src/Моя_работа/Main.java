package Моя_работа;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            ObschiiSpisokZakazov.putZakazList(new Zakaz());
//        }

        Povar albert = new Povar("Альберт");
        Povar dinar = new Povar("Динар");
        SpisokVklPovarovNaRollah.addVklpovar(albert);

        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        System.out.println();
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getZakazList());



    }


}
