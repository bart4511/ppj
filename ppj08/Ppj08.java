class Ppj08 {
    public static void MyMethod(int x) {
        x += 1;
        System.out.println("int = " + x);
    }

    public static void MyMethod(double x) {
        x -= 1.0;
        System.out.println("double = " + x);
    }
    public static void main(String[] args) {
        // Zadanie I
        System.out.println("\nZadanie I\n");

        // Zadanie II
        System.out.println("\nZadanie II\n");

        // Zadanie III
        System.out.println("\nZadanie III\n");

        // Zadanie IV
        System.out.println("\nZadanie IV\n");

        // Zadanie V
        System.out.println("\nZadanie V\n");

        // Zadanie VI
        System.out.println("\nZadanie VI\n");

        char[][] tab = {
            {'o', '-', '-', '-', '-', '-', '-', '-', '-', '-', },
            {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '-', },
            {'-', '-', '-', '-', '-', '-', '-', '-', 'x', '-', },
            {'-', 'x', 'x', 'x', 'x', 'x', 'x', '-', 'x', '-', },
            {'-', 'x', 'e', '-', '-', '-', '-', '-', 'x', '-', },
            {'-', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '-', },
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', }
        };
        int pozycjaX = 0 , pozycjaY = 0 ;


        // Zadanie VII
        System.out.println("\nZadanie VII\n");

        int xInt = 5;
        double xDouble = 5.0;

        MyMethod(xInt);
        MyMethod(xDouble);

        // Zadanie VIII
        System.out.println("\nZadanie VIII\n");

        // Zadanie IX
        System.out.println("\nZadanie IX\n");

        // Zadanie X
        System.out.println("\nZadanie X\n");

    }
}
