package Моя_работа;

import java.util.LinkedList;
import java.util.List;

public class SpisokVklPovarovNaRollah {
    private static final List<Povar> vklpovar = new LinkedList<>();

    public static void addVklpovar(Povar povar) {
        if (!vklpovar.contains(povar)) {
            //добавляем заказы в список повара из общего списка при включении повара
            if (!Povar.getObschiiList().isEmpty()) {
                try {
                    for (int i = 0; i < povar.maxZakazovVliste; i++) {
                        if (Povar.getObschiiList().get(0) != null) {
                            povar.getList().add(Povar.getObschiiList().get(0));
                            Povar.getObschiiList().remove(0);
                        } else break;
                    }
                } catch (IndexOutOfBoundsException e) {
                }

            }
            vklpovar.add(povar);
        }
    }

    public static List<Povar> getVklpovar() {
        return vklpovar;
    }

    public static int getSize() {
        return vklpovar.size();
    }

    public static String ktoVkl() {
        return "" + vklpovar;
    }

    protected static Povar minKolvoZakazovuPovara() { //Индекс повара у которого меньше временных заказов
        int a = 1000;
        Povar b = null;
        for (int i = 0; i < vklpovar.size(); i++) {
            if (vklpovar.get(i).getList().size() < a && vklpovar.get(i).onJob) {
                a = vklpovar.get(i).getList().size();
                b = vklpovar.get(i);
            }
        }
        return b;
    }   //Возвращает повара у которого минимальное количество заказов в личном списке

    public static Povar getPovar(String name) {
        Povar povar = null;
        for (int i = 0; i < vklpovar.size(); i++) {
            if (vklpovar.get(i).getName().equals(name)) {
                povar = vklpovar.get(i);
            }
        }
        return povar;
    }
}
