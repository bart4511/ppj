public class Ppj06 {
   	public static void main(String[] args) {
        // Zadanie I
        System.out.println("\nZadanie I\n");
        int[] tab1 = new int[10];
        for(int i = 0; i < 10; i++) {
            double tmp = Math.random();
            if(tmp >= 0.5)
                tab1[i] = 1;
            else
                tab1[i] = 0;
            System.out.print(tab1[i] + " ");
        }
        System.out.println();

        // Zadanie II
        System.out.println("\nZadanie II\n");
        int ileZer = 0, ileJedynek = 0;
        for(int i = 0; i < tab1.length; i++) {
            if(tab1[i] == 0)
                ileZer++;
            else
                ileJedynek++;
        }
        System.out.println("Ilosc 0 = " + ileZer);
        System.out.println("Ilosc 1 = " + ileJedynek);

        // Zadanie III
        System.out.println("\nZadanie III\n");
        int dlugoscTablicy = (int)(Math.random() * 100);
        int[] dlugaTablica = new int[dlugoscTablicy];

        System.out.println("Dlugosc tablicy to " + dlugaTablica.length);

        // Zadanie IV
        System.out.println("\nZadanie IV\n");
        double[] tab2 = new double[10];
        for(int i = 0; i < tab2.length; i++) {
            tab2[i] = Math.random() * 100;
            System.out.println("tab2[" + i + "] = " + tab2[i]);
        }
        System.out.println("\nParzyste indeksy:");
        for(int i = 0; i < tab2.length; i++) {
            if(i % 2 == 0) {
                System.out.println("tab2[" + i + "] = " + tab2[i]);
            }
        }
        System.out.println("\nNieparzyste liczby calkowite:");
        for(int i = 0; i < tab2.length; i++) {
            if((int)(tab2[i]) % 2 != 0) {
                System.out.println("tab2[" + i + "] = " + (int)(tab2[i]));
            }
        }

        // Zadanie V
        System.out.println("\nZadanie V\n");
        {
            int tablica[] = {1, 0, 0, 0, 2, 0, 0, 0, 3};
            int[][] tablica1 = new int[3][3];
            int[][] tablica2 = new int[3][3];
            int[][] tablica3 = new int[3][3];
            int[][] tablicaTmp1 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
            };
            int[][] tablicaTmp2 = {
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0}
            };

            // Wypisanie pierwszej tablicy
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    tablica1[i][j] = tablica[(i*3)+j];
                    System.out.print(tablica1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            // Tworzenie drugiej tablicy
            for(int i = tablica2.length - 1; i >= 0; i--) {
                for(int j = 0; j < tablica2[i].length; j++) {
                    int suma = 0;
                    for(int k = 0; k < tablica2[i].length; k++) {
                        suma += tablica1[i][k] * tablicaTmp1[k][j];
                    }
                    tablica2[i][j] = suma;
                    System.out.print(tablica2[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            // Tworzenie trzeciej tablicy
            for(int i = tablica3.length - 1; i >= 0; i--) {
                for(int j = 0; j < tablica3[i].length; j++) {
                    int suma = 0;
                    for(int k = 0; k < tablica3[i].length; k++) {
                        suma += tablica1[i][k] * tablicaTmp2[k][j];
                    }
                    tablica3[i][j] = suma;
                    System.out.print(tablica3[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        // Zadanie VI
        System.out.println("\nZadanie VI\n");
        {
            System.out.println("Komenda nic nie wypisze bez inicjalizacji");
            // int tab[];
            // System.out.println(tab);
        }

        // Zadanie VII
        System.out.println("\nZadanie VII\n");
        {
            int tab[] = {789, 678, 567};
            for(int i = 0; i < tab.length; i++) {
                for (int j = i; j < tab.length; j++)
                    System.out.print(tab[i] - tab[j] + " ");
                System.out.println();
            }
        }

        // Zadanie VIII
        System.out.println("\nZadanie VIII\n");
        {
	        int[][] tab = {
	        		{1, 0, 0},
	        		{0, 1, 0},
	        		{0, 0, 1}
	        };
	        boolean czyDiagonalna = true;
	        for(int i = 0; i < tab.length; i++) {
	        	for(int j = 0; j < tab[i].length; j++) {
	        		if(i != j) {
	        			if(tab[i][j] != 0) czyDiagonalna = false;
	        		}
	        	}
	        }
	        if(czyDiagonalna) {
	        	System.out.println("Tablica jest diagonalna");
	        } else {
	        	System.out.println("Tablica nie jest diagonalna");
	        }
        }


        // Zadanie IX
        System.out.println("\nZadanie IX\n");
        {
        	int[][] tab = new int[5][5];
        	for(int i = 0; i < tab.length; i++) {
	        	for(int j = 0; j < tab[i].length; j++) {
        			tab[i][j] = (int)(Math.random() * 100);
        			System.out.print("\t" + tab[i][j]);
	        	}
	        	System.out.println();
	        }
        	System.out.println();
        	// Pierwsza przekatna
        	boolean czyJestPara = false;
        	for(int i = 0; i < tab.length; i++) {
        		int tmp = tab[i][i];
        		for(int j = i + 1; j < 5; j++) {
        			if(tmp == tab[j][j]) czyJestPara = true;
        		}
        	}
        	System.out.println("Pierwsza przekatna:");
        	if(czyJestPara)
        		System.out.println("Na przekatnej sa dwie takie same wartosci.");
        	else
        		System.out.println("Wszystkie liczby sa rozne");

        	// Druga przekatna
        	for(int i = 0; i < tab.length - 1; i++) {
        		int tmp = tab[i][tab.length - 1 - i];
        		for(int j = i + 1; j < tab[i].length; j++) {
        			if(tmp == tab[j][4 - j]) czyJestPara = true;
        		}
        	}
        	System.out.println("\nDruga przekatna:");
        	if(czyJestPara)
        		System.out.println("Na przekatnej sa dwie takie same wartosci.");
        	else
        		System.out.println("Wszystkie liczby sa rozne");

        	// Zadanie X
	        System.out.println("\nZadanie X\n");

	        int sumaWiersz = 0;
	        int sumaKolumna = 0;
	        boolean czySaRowneSumy = false;

	        for(int i = 0; i < tab.length; i++) {
	        	for(int j = 0; j < tab[i].length; j++) {
	        		sumaWiersz += tab[i][j];
	        		sumaKolumna += tab[j][i];
	        	}
	        	if(sumaWiersz == sumaKolumna) czySaRowneSumy = true;
	        }

	        if(czySaRowneSumy)
	        	System.out.println("Istnieje kolumna o tej samej sumie co wiersz");

        }
    }
}
