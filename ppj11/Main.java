package com.company;

public class Main {

    public static void main(String[] args) {
        // Zadanie I
        System.out.println("\nZadanie I\n");
        Kwadrat kwadrat = new Kwadrat(5);
        kwadrat.show();

        // Zadanie II
        System.out.println("\nZadanie II\n");
        Walec walec = new Walec(2, 5);
        walec.show();

        // Zadanie III
        System.out.println("\nZadanie III\n");
        Walec walec2 = kwadrat.przygotujWalec();
        walec2.show();

        // Zadanie IV
        System.out.println("\nZadanie IV\n");
        Wyraz wyraz = new Wyraz();
        wyraz.dodajZnak('a');
        wyraz.dodajZnak('b');
        wyraz.dodajZnak('c');

        System.out.println("Wyraz = " + wyraz.toString());
        System.out.println("Jego dlugosc = " + wyraz.length());

        // Zadanie V
        System.out.println("\nZadanie V\n");
        Wyraz2 wyraz1 = new Wyraz2("Ala");

        Wyraz2 wyraz2 = new Wyraz2("ma");
        wyraz1.setNastepnyWyraz(wyraz2);

        Wyraz2 wyraz3 = new Wyraz2("kota");
        wyraz2.setNastepnyWyraz(wyraz3);

        Wyraz2 wyraz4 = new Wyraz2("a");
        wyraz3.setNastepnyWyraz(wyraz4);

        Wyraz2 wyraz5 = new Wyraz2("kot");
        wyraz4.setNastepnyWyraz(wyraz5);

        Wyraz2 wyraz6 = new Wyraz2("ma");
        wyraz5.setNastepnyWyraz(wyraz6);

        Wyraz2 wyraz7 = new Wyraz2("Ale");
        wyraz6.setNastepnyWyraz(wyraz7);

        wyraz1.show();

    }
}
