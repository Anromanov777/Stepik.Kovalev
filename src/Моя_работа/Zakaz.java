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

    public static void put(List<Zakaz> list, Zakaz z) {
        if (z.kovremeni) {
            int a = list.size();
            for (int i = 1; i < a; i++) {
                if (!list.get(i).kovremeni) {
                    list.add(i, z);
                    return;
                }
            }
            list.add(z);
        } else list.add(z);
    }

    @Override
    public String toString() {
        return
                " zakaz=" + number+" "+kovremeni;
    }
}
