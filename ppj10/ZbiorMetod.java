public class ZbiorMetod {
    void ustalWartosc(int x) {
        System.out.println("int = " + x);
        x++;
        System.out.println("int po zmianie = " + x);
    }

    void ustalWartosc(float x) {
        System.out.println("float = " + x);
        x++;
        System.out.println("float po zmianie = " + x);
    }

    void ustalWartosc(Liczba x) {
        System.out.print("Liczba = ");
        x.wyswietlWartosc();
        x.przypiszWartosc(++x.x);
        System.out.print("Liczba po zmianie = ");
        x.wyswietlWartosc();
    }
}
