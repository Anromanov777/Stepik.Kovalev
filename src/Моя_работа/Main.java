package Моя_работа;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ObschiiSpisokZakazov.putZakazList(new Zakaz());
        }

        Povar albert = new Povar("Альберт");
        Povar dinar = new Povar("Динар");
        SpisokVklPovarovNaRollah.addVklpovar(albert);

        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        System.out.println();
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getZakazList());
        ObschiiSpisokZakazov.vipolnenieZakaza(albert);
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        SpisokVklPovarovNaRollah.addVklpovar(dinar);
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.vipolnenieZakaza(albert);
        ObschiiSpisokZakazov.vipolnenieZakaza(albert);
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.vipolnenieZakaza(albert);
        ObschiiSpisokZakazov.vipolnenieZakaza(albert);
        ObschiiSpisokZakazov.vipolnenieZakaza(albert);
        System.out.println();
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getZakazList());
        ObschiiSpisokZakazov.povarZkonchilRabotu(dinar);
        ObschiiSpisokZakazov.povarZkonchilRabotu(albert);
        SpisokVklPovarovNaRollah.addVklpovar(albert);
        SpisokVklPovarovNaRollah.addVklpovar(dinar);
        System.out.println();
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getZakazList());


    }


}
