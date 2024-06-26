package Моя_работа;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Povar albert = new Povar("Альберт");
        Povar dinar = new Povar("Динар");
        SpisokVklPovarovNaRollah.addVklpovar(albert);
        SpisokVklPovarovNaRollah.addVklpovar(dinar);
        while (true) {
            switch (sc.nextInt()) {
                case 1: //Добавление невременного
                    ObschiiSpisokZakazov.putZakazList(new Zakaz());
                    System.out.println("Добавлен не временной заказ");

                    break;
                case 2: //Добавление временного
                    ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
                    System.out.println("Добавлен временной заказ");

                    break;
                case 3: //Повар выполнил заказ
                    sc.nextLine();
                    String name = sc.nextLine();
                    Povar povar = SpisokVklPovarovNaRollah.getPovar(name);
                    povar.vipolnilZakaz();
                    System.out.println("Повар " + povar.getName() + " выполнил заказ");

                    break;
                case 4: //Передал заказ
                    sc.nextLine();
                    Povar p = SpisokVklPovarovNaRollah.getPovar(sc.nextLine());
                    Povar povar1 = SpisokVklPovarovNaRollah.getPovar(sc.nextLine());
                    int a = sc.nextInt();
                    p.peredalZakaz(povar1, a);
                    System.out.println("Повар " + p.getName() + " передал заказ №" + a + " повару " + povar1.getName());

                    break;
                case 5: //Показать заказы у поваров и общий список
                    System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
                    System.out.println(ObschiiSpisokZakazov.getObschiiList());

                    break;
                case 6: //Повар закончил работу
                    sc.nextLine();
                    Povar povar2 = SpisokVklPovarovNaRollah.getPovar(sc.nextLine());
                    SpisokVklPovarovNaRollah.ZakonchilRabotu(povar2);
                    System.out.println("Повар " + povar2.getName() + " закончил работу");
                    break;
            }
        }


//            ObschiiSpisokZakazov.putZakazList(new Zakaz());
//            ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
//            ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
//            ObschiiSpisokZakazov.putZakazList(new Zakaz());
//            ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
//            dinar.vipolnilZakaz();
//            dinar.vipolnilZakaz();
//            albert.vipolnilZakaz();
//            albert.vipolnilZakaz();
//            ObschiiSpisokZakazov.putZakazList(new Zakaz());
//            SpisokVklPovarovNaRollah.ZakonchilRabotu(albert);
//            ObschiiSpisokZakazov.putZakazList(new Zakaz());
//            ObschiiSpisokZakazov.putZakazList(new Zakaz(true));
//            SpisokVklPovarovNaRollah.addVklpovar(albert);
//            dinar.peredalZakaz(albert, 9);
//            //SpisokVklPovarovNaRollah.povarZkonchilRabotu(albert);
//            System.out.println();
//            System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
//            System.out.println(ObschiiSpisokZakazov.getObschiiList());
    }
}

