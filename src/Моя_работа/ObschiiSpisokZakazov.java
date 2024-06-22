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
                            zakazList.add(zakaz);
                            return;
                        }
                    }
                    zakazList.add(zakaz);   //Если в списке все временные, при выходе добавим в конец этот заказ и выходим из метода
                } else zakazList.add(zakaz); //Если пустой список, то просто добавляем заказ в этот общий список
            } else if (SpisokVklPovarovNaRollah.getSize() == 1) {   //Если повар один
                dobavlenieVspisokPovara(0, zakaz);
            } else {   //Если поваров больше, то выбираем повара у которого меньше заказов в списке
                int indexPovara = minKolvoZakazovuPovara();
                dobavlenieVspisokPovara(indexPovara, zakaz);
            }
        } else {
            zakazList.add(zakaz);
        }
    }

    public static List<Zakaz> getZakazList() {
        return zakazList;
    }

    private static int minKolvoZakazovuPovara() { //Индекс повара у которого меньше временных заказов
        int a = 1000;
        int b = -1;
        for (int i = 0; i < SpisokVklPovarovNaRollah.getSize(); i++) {
            if (SpisokVklPovarovNaRollah.getVklpovar().get(i).getZakazList().size() < a) {
                a = SpisokVklPovarovNaRollah.getVklpovar().get(i).getZakazList().size();
                b = i;
            }
        }
        return b;
    }   //Возвращает индекс включенного повара у которого минимальное количество заказов в личном списке

    private static void dobavlenieVspisokPovara(int indexPovara, Zakaz zakaz) {
        if (SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().isEmpty()) {   //Если пустой список заказов у повара, то просто добавляем
            SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().add(zakaz);
        } else if (SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().size() > 1) { //Если заказов в листе больше одного, а второй не временной,
            if (!SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().get(1).kovremeni) { //то сохраняем сюда
                SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().add(1, zakaz);
            } else {
                int a = SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().size();    //Если второй оказывается временной, то пробегаемся по списку и находим последний не временной
                for (int i = 1; i < a; i++) {
                    if (!SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().get(i).kovremeni) {
                        SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().add(i, zakaz);
                    }
                }
            }
        } else
            SpisokVklPovarovNaRollah.getVklpovar().get(indexPovara).getZakazList().add(zakaz); //Если все временные, то добавляем в конец списка
    }   //Добавление в список повара временного заказа
}
