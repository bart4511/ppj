import java.util.Arrays;

class Ppj08 {
    public static void fillTable(int[][] table, int range) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = (int) (Math.random() * range);
			}
		}
	}

	public static void fillTable(double[] table, int range) {
		for (int i = 0; i < table.length; i++) {
			table[i] = Math.random() * range;
		}
	}

	public static void printTable(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void printTable(double[] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.printf("%4.1f", table[i]);
		}
		System.out.println();
	}

	public static void printTable(char[] table) {
		for (char i : table) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static boolean czyDwaZnaki(char[] table) {
//		boolean czyDwie = false;
		for (int i = 0; i < table.length; i++) {
			int count = 0;
			for (int j = i + 1; j < table.length; j++) {
				if (table[i] == table[j])
					count++;
			}
			if (count >= 2)
				return true;
//			else
//				czyDwie = false;
		}

		return false;
	}

	public static boolean czyDwieLitery(char[] table) {
//		boolean czyDwie = false;
		for (int i = 0; i < table.length; i++) {
			int count = 0;
			for (int j = i + 1; j < table.length; j++) {
				if (Character.compare(table[i], table[j]) == 0)
					count++;
//				System.out.println(count);
			}
			if (count >= 2)
				return true;
//			else
//				czyDwie = false;
		}

		return false;
	}

    public static void myMethod(int x) {
        x += 1;
        System.out.println("int = " + x);
    }

    public static void myMethod(double x) {
        x -= 1.0;
        System.out.println("double = " + x);
    }

    public static void czyPalindrom(char[] tab) {
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

    public static int fibonacci(int x) {
        if(x == 0) {
            return 0;
        } else if(x == 1) {
            return 1;
        } else if(x == 2) {
            return 1;
        } else {
            return fibonacci(x - 2) + fibonacci(x - 1);
        }
    }

    public static void permute(char[] tab) {
        Arrays.sort(tab);

    }

    public static void main(String[] args) {
        // Zadanie I
		System.out.println("\nZadanie I\n");
		{
			int[][] tab = new int[8][8];
			boolean Diag1 = false;
			boolean Diag2 = false;
			int countDiag1 = 0;
			int countDiag2 = 0;
			fillTable(tab, 10);
			printTable(tab);
			for (int i = 0; i < tab.length; i++) {
				for (int j = i + 1; j < tab.length; j++) {
					if (tab[i][i] == tab[j][j])
						countDiag1++;
					if (tab[7 - i][i] == tab[7 - j][j])
						countDiag2++;
				}
				if (countDiag1 >= 3)
					Diag1 = true;
				if (countDiag2 >= 3)
					Diag2 = true;
				countDiag1 = 0;
				countDiag2 = 0;
			}
			if (Diag1)
				System.out.println("Glowna przekatna posiada co najmniej 3 takie same liczby");
			if (Diag2)
				System.out.println("Przeciwprzekatna posiada co najmniej 3 takie same liczby");
		}

		// Zadanie II
		System.out.println("\nZadanie II\n");
		{
			double[] tab1 = new double[3];
			double[] tab2 = new double[3];
			double[] tab3 = new double[3];
			fillTable(tab1, 5);
			fillTable(tab2, 5);
			printTable(tab1);
			printTable(tab2);

			for (int i = 0; i < tab1.length; i++) {
				tab3[i] = tab1[i] + tab2[2 - i];
			}
			printTable(tab3);
		}

		// Zadanie III
		System.out.println("\nZadanie III\n");
		{
			char[][] tab = {
					{ 'S', 'a', 'm', 's', 'u', 'n', 'g' },
					{ 'N', 'o', 'k', 'i', 'a' },
					{ 'A', 'p', 'p', 'l', 'e' },
					{ 'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y' },
					{ 'A', 'l', 'c', 'a', 't', 'e', 'l' },
					{ 'S', 'o', 'n', 'y' },
					{ 'J', 'o', 'l', 'l', 'a' } };

//			System.out.println(tab.length);
			for(int i = 0; i < tab.length; i++) {
//				printTable(tab[i]);
				if(czyDwieLitery(tab[i])) {
					System.out.println(" zawiera dwie takie same litery");
				}
//				sumaZnakow(tab[i]);
//				czyZawieraI(tab[i]);
//				czyDwaZnaki(tab[i]);
			}
		}

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

        myMethod(xInt);
        myMethod(xDouble);

        // Zadanie VIII
        System.out.println("\nZadanie VIII\n");
        char[] palindrom = {1, 5, 7, 4, 23, 23, 4, 7, 5, 1};//new char[];
        char[] niePalindrom = {4, 6, 8, 3, 6, 6, 4};//new char[];

        czyPalindrom(palindrom);
        czyPalindrom(niePalindrom);

        // Zadanie IX
        System.out.println("\nZadanie IX\n");

        System.out.println("fibonacci(0) = " + fibonacci(0));
        System.out.println("fibonacci(2) = " + fibonacci(2));
        System.out.println("fibonacci(8) = " + fibonacci(8));
        System.out.println("fibonacci(12) = " + fibonacci(12));
        System.out.println("fibonacci(15) = " + fibonacci(15));
        System.out.println("fibonacci(19) = " + fibonacci(19));

        // Zadanie X
        System.out.println("\nZadanie X\n");
        int[] tablica = {
            3, 6, 8, 23, 4
        };



    }
}
