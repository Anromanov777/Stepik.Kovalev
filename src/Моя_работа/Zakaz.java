package Моя_работа;

import java.util.List;

public class Zakaz {
    String[] bluda;
    boolean kovremeni;
    boolean samovivoz;
    static int id;
    int number;
    Klient klient;

    public Zakaz() {
        ++id;
        number = id;
    }

    public Zakaz(boolean kovremeni) {
        ++id;
        number=id;
        this.kovremeni = kovremeni;

    }

    public boolean isKovremeni() {
        return kovremeni;
    }

//    public static void put(Zakaz z) {
//        if (z.kovremeni) {
//            int a = ObschiiSpisokZakazov.getZakazList().size();
//            for (int i = 1; i < a; i++) {
//                if (!ObschiiSpisokZakazov.getZakazList().get(i).kovremeni) {
//                    ObschiiSpisokZakazov.getZakazList().add(i, z);
//                    return;
//                }
//            }
//            ObschiiSpisokZakazov.getZakazList().add(z);
//        } else ObschiiSpisokZakazov.getZakazList().add(z);
//    }

    @Override
    public String toString() {
        return
                " zakaz=" + number+" "+kovremeni;
    }
}
