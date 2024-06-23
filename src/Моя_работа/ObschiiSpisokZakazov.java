package Моя_работа;

import java.util.*;

public class ObschiiSpisokZakazov {
    private static List<Zakaz> zakazList = new LinkedList<>();

    private ObschiiSpisokZakazov() {
    }

    public static void putZakazList(Zakaz zakaz) {
        if (zakaz.isKovremeni()) {  //Если зазаказ ко времени
            if (SpisokVklPovarovNaRollah.getSize() == 0) { //Проверяем включены ли повара в работу, если нет, то заходим
                int a = zakazList.size();
                if (!zakazList.isEmpty()) {  //Проверяем не пустой ли список заказов, если не пустой заходим проверить куда вставить данный временной заказ
                    for (int i = 0; i < a; i++) {
                        if (!zakazList.get(i).kovremeni) {   //Если данное место в списке не занято временным, то вставляем сюда и выходим из метода
                            zakazList.add(i, zakaz);
                            return;
                        }
                    }
                    zakazList.add(zakaz);   //Если в списке все временные, при выходе добавим в конец этот заказ и выходим из метода
                } else zakazList.add(zakaz); //Если пустой список, то просто добавляем заказ в этот общий список
            } else if (SpisokVklPovarovNaRollah.getSize() == 1) {   //Если повар один, то кладем временной в его список
                dobavlenieVspisokPovara(SpisokVklPovarovNaRollah.getVklpovar().get(0), zakaz);
            } else {   //Если поваров больше, то выбираем повара у которого меньше заказов в списке
                Povar povar = minKolvoZakazovuPovara();
                dobavlenieVspisokPovara(povar, zakaz);
            }
        } else {
            zakazList.add(zakaz);
        }
    }   //Добавление заказа

    public static List<Zakaz> getZakazList() {
        return zakazList;
    }

    private static Povar minKolvoZakazovuPovara() { //Индекс повара у которого меньше временных заказов
        int a = 1000;
        Povar b = null;
        for (int i = 0; i < SpisokVklPovarovNaRollah.getSize(); i++) {
            if (SpisokVklPovarovNaRollah.getVklpovar().get(i).getZakazList().size() < a) {
                a = SpisokVklPovarovNaRollah.getVklpovar().get(i).getZakazList().size();
                b = SpisokVklPovarovNaRollah.getVklpovar().get(i);
            }
        }
        return b;
    }   //Возвращает повара у которого минимальное количество заказов в личном списке

    private static void dobavlenieVspisokPovara(Povar povar, Zakaz zakaz) {
        if (zakaz.isKovremeni()) {
            if (povar.getZakazList().size() <= 1) {   //Если пустой список заказов у повара, то просто добавляем
                povar.getZakazList().add(zakaz);
            } else if (povar.getZakazList().size() > 1) { //Если заказов в листе больше одного, а второй не временной,
                if (!povar.getZakazList().get(1).kovremeni) { //то сохраняем сюда
                    povar.getZakazList().add(1, zakaz);
                } else if (povar.getZakazList().get(povar.getZakazList().size() - 1).isKovremeni()) {   //Если последний заказ в списке временной, значит все временные, и вставляем заказ в конец.
                    povar.getZakazList().add(zakaz);
                } else {
                    int a = povar.getZakazList().size();    //Если второй оказывается временной, то пробегаемся по списку и находим не временной, вставляем и сразу выходим из цикла
                    for (int i = 1; i < a; i++) {
                        if (!povar.getZakazList().get(i).kovremeni) {
                            povar.getZakazList().add(i, zakaz);
                            break;
                        }
                    }
                }
            }
        }else povar.getZakazList().add(zakaz);
    }   //Добавление заказа в личный список повара

    public static void vipolnenieZakaza(Povar povar) {
        povar.getZakazList().remove(0);
        if (povar.getZakazList().size() < povar.maxZakazovVliste && !zakazList.isEmpty()) {
            dobavlenieVspisokPovara(povar, zakazList.get(0));
            zakazList.remove(0);
        }
    }

    public static void povarZkonchilRabotu(Povar povar) {
        SpisokVklPovarovNaRollah.getVklpovar().remove(povar);
        if (SpisokVklPovarovNaRollah.getVklpovar().size() == 0) {
            for (int i = 0; i < povar.getZakazList().size(); i++) {
                putZakazList(povar.getZakazList().get(i));
            }
        } else if (SpisokVklPovarovNaRollah.getVklpovar().size() == 1) {
            for (int i = 0; i < povar.getZakazList().size(); i++) {
                dobavlenieVspisokPovara(SpisokVklPovarovNaRollah.getVklpovar().get(0), povar.getZakazList().get(i));
            }
        } else for (int i = 0; i < povar.getZakazList().size(); i++) {
            Povar povar1 = minKolvoZakazovuPovara();
            dobavlenieVspisokPovara(povar1, povar.getZakazList().get(i));
        }
        povar.getZakazList().clear();
    }
}
