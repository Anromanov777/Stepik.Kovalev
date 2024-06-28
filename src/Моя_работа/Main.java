package Моя_работа;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Povar albert = new Povar("Альберт");
//        Povar dinar = new Povar("Динар");
//        SpisokVklPovarovNaRollah.addVklpovar(albert);
//        SpisokVklPovarovNaRollah.addVklpovar(dinar);
        while (true) {
            switch (sc.nextInt()) {
                case 1: //Добавление невременного
                    Povar.putZakazList(new Zakaz());
                    System.out.println("Добавлен не временной заказ");

                    break;
                case 2: //Добавление временного
                    Povar.putZakazList(new Zakaz(true));
                    System.out.println("Добавлен временной заказ");

                    break;
                case 3: //Повар выполнил заказ
                    if (SpisokVklPovarovNaRollah.getVklpovar().size() == 1) {
                        Povar povar = SpisokVklPovarovNaRollah.getVklpovar().get(0);
                        System.out.println(povar.vipolnilZakaz() ? "Повар " + povar.getName() + " выполнил заказ" : "Список заказов повара пустой");

                    } else {
                        sc.nextLine();
                        String name = sc.nextLine();
                        Povar povar = SpisokVklPovarovNaRollah.getPovar(name);
                        System.out.println(povar.vipolnilZakaz() ? "Повар " + povar.getName() + " выполнил заказ" : "Список заказов повара пустой");
                    }
                    break;

                case 4: //Повар закончил работу
                    sc.nextLine();
                    Povar povar2 = SpisokVklPovarovNaRollah.getPovar(sc.nextLine());
                    povar2.zakonchilRabotu();
                    System.out.println("Повар " + povar2.getName() + " закончил работу");
                    break;

                case 5: //Показать заказы у поваров и общий список
                    System.out.println(SpisokVklPovarovNaRollah.ktoVkl() + " Поваров работает:" + SpisokVklPovarovNaRollah.getSize());
                    System.out.println(Povar.getObschiiList());
                    break;

                case 10:    //Добавление повара в работу
                    sc.nextLine();
                    SpisokVklPovarovNaRollah.addVklpovar(new Povar(sc.nextLine()));
                    break;

                default:
                    System.out.println("Неверный индекс!");
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

