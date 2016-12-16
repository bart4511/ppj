
public class Ppj09 {

	public static void rysujKwadrat(int x, boolean czyX) {
		char znak = 'o';
		if(czyX) {
			znak = 'x';
		}

		for(int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" " + znak);
				if(znak == 'x') znak = 'o';
				else znak = 'x';
			}
			System.out.println();
			if(znak == 'x') znak = 'o';
			else znak = 'x';
		}
	}

	public static char[][] generateCharTable(int rows, int columns) {
		char[][] charTable = new char[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				charTable[i][j] = (char)((int)(Math.random()*12) + 'a');
			}
		}

		return charTable;
	}

	public static void findWord(char[][] charTable) {
		int counter = 0;
		for (int i = 0; i < charTable.length; i++) {
			for (int j = 0; j < charTable[i].length - 2; j++) {
				if (charTable[i][j] == 'a') {
					if (charTable[i][j + 1] == 'l') {
						if (charTable[i][j + 2] == 'a')
							counter++;
					}
				}
			}
		}
		System.out.println("Ala znaleziona " + counter + " razy.");
	}

	public static boolean isDiagonal(int[][] tab) {
		if(tab.length != tab[0].length) return false;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i != j && tab[i][j] != 0) return false;
			}
		}

		return true;
	}

	public static int[][] losujPary(int liczbaPar) {
		int[][] tablicaPar = new int[liczbaPar][2];
		for (int i = 0; i < tablicaPar.length; i++) {
			for (int j = 0; j < tablicaPar[i].length; j++) {
				tablicaPar[i][j] = (int)(Math.random() * 100);
			}
		}
		return tablicaPar;
	}

	public static int euklides(int x, int y) {
		while(x != y) {
			if(x < y) y -= x;
			else x -= y;
		}
		return x;
	}

	public static void policzDzielniki(int[][] tablica) {
		for(int i = 0; i < tablica.length; i++) {
			int tmp = euklides(tablica[i][0], tablica[i][1]);
			System.out.println("\t" + tablica[i][0] + "\t" + tablica [i][1] + " \tdzielnik: " + tmp);
		}
	}

	public static void main(String[] args) {
		// Zadanie I
		System.out.println("\nZadanie I\n");
		rysujKwadrat(6, true);

		// Zadanie II
		System.out.println("\nZadanie II\n");
		char[][] myCharTable = generateCharTable(100,100);
		findWord(myCharTable);

		// Zadanie III
		System.out.println("\nZadanie III\n");
		int[][] intTable = new int[12][12];
		for (int i = 0; i < intTable.length; i++) {
			for (int j = 0; j < intTable[i].length; j++) {
				intTable[i][j] = (int)(Math.random() * 2);
			}
		}
		if(isDiagonal(intTable)) {
			System.out.println("Jest diagonalna");
		} else {
			System.out.println("Nie jest diagonalna");
		}

		// Zadanie IV
		System.out.println("\nZadanie IV\n");
		int[][] paryLiczb = losujPary(10);
		policzDzielniki(paryLiczb);



	}

}
