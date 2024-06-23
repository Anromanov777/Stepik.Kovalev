package Моя_работа;

import java.util.LinkedList;
import java.util.List;

public class SpisokVklPovarovNaRollah {
    private static final List<Povar> vklpovar = new LinkedList<>();


    public static void addVklpovar(Povar povar) {
        if (!vklpovar.contains(povar)) {
            //добавляем заказы в список повара из общего списка при включении повара
            if (!ObschiiSpisokZakazov.getZakazList().isEmpty()) {
                try {
                    for (int i = 0; i < povar.maxZakazovVliste; i++) {
                        if (ObschiiSpisokZakazov.getZakazList().get(0) != null) {
                            povar.getZakazList().add(ObschiiSpisokZakazov.getZakazList().get(0));
                            ObschiiSpisokZakazov.getZakazList().remove(0);
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
}
