package Моя_работа;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            ObschiiSpisokZakazov.putZakazList(new Zakaz());
//        }

        Povar albert = new Povar("Альберт");
        Povar dinar = new Povar("Динар");
        SpisokVklPovarovNaRollah.addVklpovar(albert);
        SpisokVklPovarovNaRollah.addVklpovar(dinar);

        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        dinar.vipolnilZakaz();
        dinar.vipolnilZakaz();
        albert.vipolnilZakaz();
        albert.vipolnilZakaz();
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        SpisokVklPovarovNaRollah.ZakonchilRabotu(albert);
        ObschiiSpisokZakazov.putZakazList(new Zakaz());
        ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
        SpisokVklPovarovNaRollah.addVklpovar(albert);
        dinar.peredalZakaz(albert,9);
        //SpisokVklPovarovNaRollah.povarZkonchilRabotu(albert);
        System.out.println();
        System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
        System.out.println(ObschiiSpisokZakazov.getObschiiList());
    }


}
