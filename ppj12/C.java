package ppj12;

public class C {
    static String c1;
    int c2;
    int c3;

    public C(String string, int c2, int c3) {
        this.c1 = string;
        this.c2 = c2;
        this.c3 = c3;
    }

    void display() {
        System.out.println("String = " + c1);
        System.out.println("Pierwszy int = " + c2);
        System.out.println("Drugi int = " + c3);
        System.out.println();
    }
}
