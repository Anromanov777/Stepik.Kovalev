package Моя_работа;

import java.util.LinkedList;
import java.util.List;

public class Povar {
    String name;
    int maxZakazovVliste = 2;   //Количество заказов в личном листе повара. По умолчанию два.
    boolean onJob = true;
    private List<Zakaz> list;   //Личный список заказов
    private static final List<Zakaz> obschiiList = new LinkedList<>();

    public Povar(String name) {
        this.name = name;
    }

    public List<Zakaz> getList() {
        if (list == null) {
            list = new LinkedList<>();
        }
        return list;
    }

    public String getName() {
        return name;
    }

    public static List<Zakaz> getObschiiList() {
        return obschiiList;
    }

    public static void putZakazList(Zakaz zakaz) {
        Povar povar = SpisokVklPovarovNaRollah.minKolvoZakazovuPovara();
        if (zakaz.isKovremeni()) {  //Если зазаказ ко времени
            if (povar == null) { //Проверяем включены ли повара в работу, если нет, то заходим
                int a = obschiiList.size();
                if (!obschiiList.isEmpty()) {  //Проверяем не пустой ли список заказов, если не пустой заходим проверить куда вставить данный временной заказ
                    for (int i = 0; i < a; i++) {
                        if (!obschiiList.get(i).kovremeni) {   //Если данное место в списке не занято временным, то вставляем сюда и выходим из метода
                            obschiiList.add(i, zakaz);
                            return;
                        }
                    }
                } else obschiiList.add(zakaz); //Если пустой список, то просто добавляем заказ в этот общий список
            } else povar.dobavlenieVspisokPovara(zakaz);

        } else if (povar == null) {
            obschiiList.add(zakaz);
        } else if (povar.maxZakazovVliste > povar.list.size()) {
            povar.dobavlenieVspisokPovara(zakaz);
        } else obschiiList.add(zakaz);

    }   //Добавление нового заказа

    public void dobavlenieVspisokPovara(Zakaz zakaz) {
        if (zakaz.isKovremeni()) {
            if (list.size() <= 1) {   //Если в списке один или ноль заказов, то просто добавляем заказ
                list.add(zakaz);
            } else if (!list.get(1).kovremeni) { //Если второй заказ не ко времени, то добавляем временной вторым
                list.add(1, zakaz);
            } else if (list.get(list.size() - 1).isKovremeni()) {   //Если последний заказ в списке временной, значит все временные, и вставляем заказ в конец.
                list.add(zakaz);
            } else {
                int a = list.size();    //Если второй оказывается временной, то пробегаемся по списку и находим не временной, вставляем и сразу выходим из цикла
                for (int i = 1; i < a; i++) {
                    if (!list.get(i).kovremeni) {
                        list.add(i, zakaz);
                        break;
                    }
                }
            }

        } else list.add(zakaz);
    }   //Добавление заказа в личный список повара

    public boolean vipolnilZakaz() {
        if (list.isEmpty()) return false;
        list.remove(0);
        if (list.size() < maxZakazovVliste && onJob && !obschiiList.isEmpty()) {
            dobavlenieVspisokPovara(obschiiList.get(0));
            obschiiList.remove(0);
        }
        if (!onJob) this.zakonchilRabotu();
        return true;
    }

    public void zakonchilRabotu() {
        onJob = false;
        if (list.isEmpty()) SpisokVklPovarovNaRollah.getVklpovar().remove(this);
    }

    @Override
    public String toString() {
        return "Заказы у " + name + "а:" + list;
    }
}
