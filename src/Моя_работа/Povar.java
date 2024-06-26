package Моя_работа;

import java.util.LinkedList;
import java.util.List;

public class Povar {
    String name;
    int maxZakazovVliste = 2;   //Количество заказов в личном листе повара. По умолчанию два.
    private List<Zakaz> list;

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

    public void dobavlenieVspisokPovara(Zakaz zakaz) {
        if (zakaz.isKovremeni()) {
            if (list.size() <= 1) {   //Если пустой список заказов у повара, то просто добавляем
                list.add(zakaz);
            } else if (list.size() > 1) { //Если заказов в листе больше одного, а второй не временной,
                if (!list.get(1).kovremeni) { //то сохраняем сюда
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
            }
        } else list.add(zakaz);
    }   //Добавление заказа в личный список повара

    public void vipolnilZakaz() {
        if (!list.isEmpty()) {
            list.remove(0);
            if (list.size() < maxZakazovVliste && !ObschiiSpisokZakazov.getObschiiList().isEmpty()) {
                dobavlenieVspisokPovara(ObschiiSpisokZakazov.getObschiiList().get(0));
                ObschiiSpisokZakazov.getObschiiList().remove(0);
            }
        } else System.out.println("Попытка выполнить заказ у повара " + name + " при пустом списке");
    }

    public void peredalZakaz(Povar povar, int number) {
        Zakaz zakaz = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumber() == number) {
                zakaz = list.get(i);
            }
        }
        if (zakaz != null) {
            povar.dobavlenieVspisokPovara(zakaz);
            list.remove(zakaz);
        } else
            System.out.println("Вы пытаетесь передать заказ, которого нет в списке");

        for (int i = 0; i < maxZakazovVliste; i++) {    //Наполняем личный список повара заказами из общего списка
            if (list.size() < maxZakazovVliste && ObschiiSpisokZakazov.getObschiiList().size() > 0) {
                dobavlenieVspisokPovara(ObschiiSpisokZakazov.getObschiiList().get(0));
                ObschiiSpisokZakazov.getObschiiList().remove(0);
            }
        }

    }

    @Override
    public String toString() {
        return "Повар:" + name + ", заказы у повара:" + list;
    }
}
