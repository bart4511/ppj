package ppj12;

public class Ppj12 {
    public static void main(String[] args) {
        // Zadanie I
        System.out.println("\nZadanie I\n");
        A a = new A();
        System.out.println("Przed zmianami:");
        System.out.println("a.a1 = " + a.a1);
        System.out.println("a.a2 = " + a.a2);
        // Nie można przypisać wartości do zmiennej finalnej
        //a.a1 = 5;
        a.a2 = 6;
        System.out.println("\nPo zmianach:");
        System.out.println("a.a1 = " + a.a1);
        System.out.println("a.a2 = " + a.a2);

        // Zadanie II
        System.out.println("\nZadanie II\n");
        B b = new B();
        System.out.println("Adres obiektu typu B: " + b);

        // Zadanie III
        System.out.println("\nZadanie III\n");
        C c1 = new C("napis 1", 1, 11);
        C c2 = new C("napis 2", 2, 12);
        C c3 = new C("napis 3", 3, 13);
        c1.display();
        c2.display();
        c3.display();

        // Zadanie IV
        System.out.println("\nZadanie IV\n");
        String string = "Ala ma kota";
        String[] podzielonyString;
        System.out.println("3. znak = " + string.charAt(2));
        System.out.println("5. znak = " + string.charAt(4));

        System.out.println("Znak 'k' znajduje sie na "
                           + string.indexOf('k')
                           + " indeksie.");
        System.out.println("\n\"Ala ma kota\" podzielony na wyrazy: ");
        podzielonyString = string.split(" ");
        for(String wyraz : podzielonyString) {
            System.out.println(wyraz);
        }

        // Zadanie V
        System.out.println("\nZadanie V\n");
        KulaW kula = new KulaW("hello");

        // Zadanie VI
        System.out.println("\nZadanie VI\n");

    }
}
