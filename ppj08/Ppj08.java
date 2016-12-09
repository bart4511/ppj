class Ppj08 {
    public static void MyMethod(int x) {
        x += 1;
        System.out.println("int = " + x);
    }

    public static void MyMethod(double x) {
        x -= 1.0;
        System.out.println("double = " + x);
    }

    public static void CzyPalindrom(char[] tab) {
        boolean czyPalindrom = true;
        for(int i = 0; i < tab.length / 2; i++) {
            if(tab[i] != tab[tab.length - 1 - i]) {
                czyPalindrom = false;
            }
        }
        if(czyPalindrom) {
            System.out.println("Tablica jest palindromem.");
        } else {
            System.out.println("Tablica nie jest palindromem.");
        }
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
        char[] palindrom = {1, 5, 7, 4, 23, 23, 4, 7, 5, 1};//new char[];
        char[] niePalindrom = {4, 6, 8, 3, 6, 6, 4};//new char[];

        CzyPalindrom(palindrom);
        CzyPalindrom(niePalindrom);

        // Zadanie IX
        System.out.println("\nZadanie IX\n");

        // Zadanie X
        System.out.println("\nZadanie X\n");

    }
}
