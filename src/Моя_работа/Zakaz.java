package Моя_работа;

import java.util.List;

public class Zakaz {
    String[] bluda;
    boolean kovremeni;
    boolean samovivoz;
    static int id;

    public int getNumber() {
        return number;
    }

    private int number;
    Klient klient;

    public Zakaz() {
        ++id;
        number = id;
    }

    public Zakaz(boolean kovremeni) {
        ++id;
        number = id;
        this.kovremeni = kovremeni;

    }

    public boolean isKovremeni() {
        return kovremeni;
    }

    @Override
    public String toString() {
        return
                " zakaz=" + number + " " + kovremeni;
    }
}
