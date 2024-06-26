package Моя_работа;

import java.util.*;

public class ObschiiSpisokZakazov {
    private static List<Zakaz> obschiiList = new LinkedList<>();

    private ObschiiSpisokZakazov() {
    }

    public static void putZakazList(Zakaz zakaz) {
        if (zakaz.isKovremeni()) {  //Если зазаказ ко времени
            if (SpisokVklPovarovNaRollah.getSize() == 0) { //Проверяем включены ли повара в работу, если нет, то заходим
                int a = obschiiList.size();
                if (!obschiiList.isEmpty()) {  //Проверяем не пустой ли список заказов, если не пустой заходим проверить куда вставить данный временной заказ
                    for (int i = 0; i < a; i++) {
                        if (!obschiiList.get(i).kovremeni) {   //Если данное место в списке не занято временным, то вставляем сюда и выходим из метода
                            obschiiList.add(i, zakaz);
                            return;
                        }
                    }
                    obschiiList.add(zakaz);   //Если в списке все временные, при выходе добавим в конец этот заказ и выходим из метода
                } else obschiiList.add(zakaz); //Если пустой список, то просто добавляем заказ в этот общий список
            } else if (SpisokVklPovarovNaRollah.getSize() == 1) {   //Если повар один, то кладем временной в его список
                SpisokVklPovarovNaRollah.getVklpovar().get(0).dobavlenieVspisokPovara(zakaz);
            } else {   //Если поваров больше, то выбираем повара у которого меньше заказов в списке
                Povar povar = SpisokVklPovarovNaRollah.minKolvoZakazovuPovara();
                povar.dobavlenieVspisokPovara(zakaz);
            }
        } else if (SpisokVklPovarovNaRollah.getSize() == 1 && SpisokVklPovarovNaRollah.getVklpovar().get(0).maxZakazovVliste > SpisokVklPovarovNaRollah.getVklpovar().get(0).getList().size()) {
            SpisokVklPovarovNaRollah.getVklpovar().get(0).dobavlenieVspisokPovara(zakaz);
        } else if (SpisokVklPovarovNaRollah.getSize() > 1) {   //Если поваров больше, то выбираем повара у которого меньше заказов в списке
            Povar povar = SpisokVklPovarovNaRollah.minKolvoZakazovuPovara();
            if (povar.maxZakazovVliste > povar.getList().size()) {
                povar.dobavlenieVspisokPovara(zakaz);
            }else
                obschiiList.add(zakaz);
        } else
            obschiiList.add(zakaz);
    }   //Добавление нового заказа

    public static List<Zakaz> getObschiiList() {
        return obschiiList;
    }

    public static void zapolnitSpisok(Povar povar){

    }


}
