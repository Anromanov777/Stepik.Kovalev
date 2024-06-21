package Моя_работа;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zakaz> list = new LinkedList<>();
        for (int i = 0; i < 1; i++) {
            list.add(new Zakaz());
        }
        Zakaz.put(list,new Zakaz(true));
        Zakaz.put(list,new Zakaz(true));
        Zakaz.put(list,new Zakaz(true));
        list.add(new Zakaz());
        Zakaz.put(list,new Zakaz(true));

        System.out.println(list);

    }


}
