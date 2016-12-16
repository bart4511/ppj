
public class Ppj07 {

	public static void main(String[] args) {
		// Zadanie I
		System.out.println("\nZadanie I\n");
		{
			String[] slowa = {
					"Ala", "kota", "ma", "ma", "a", "kot", "Ale"
			};
			System.out.println(
					slowa[0] + " " +
					slowa[2] + " " +
					slowa[1] + " " +
					slowa[4] + " " +
					slowa[5] + " " +
					slowa[3] + " " +
					slowa[6]
					);
		}

		// Zadanie II
		System.out.println("\nZadanie II\n");
		{
			char[] tab = "Ala ma kota".toUpperCase().toCharArray();
			int suma = 0;
			for(int i = 0; i < tab.length; i++) {
				if (tab[i] == 'A')
					suma++;
			}
			System.out.println("Litera \"A\" wystepuje " + suma + " razy.");
		}

		// Zadanie III
		System.out.println("\nZadanie III\n");
		{
			// Generowanie tablicy
			int[] tab = new int[20];
			for(int i = 0; i < tab.length - 1; i++) {
				tab[i] = (int)(Math.random() * 10);
			}

			// Wypisanie tablicy
			for(int k = 0; k < tab.length; k++) {
				System.out.print(tab[k] + ",");
			}
			System.out.println();

			// Losowanie indeksu tablicy
			int indeks = (int)(Math.random() * 20);
			System.out.println(indeks);

			// Przesuwanie element�w tablicy
			for(int j = 19; j > indeks; j--) {
				tab[j] = tab[j - 1];
			}
			tab[indeks] = -1;

			// Wypisanie tablicy
			for(int k = 0; k < tab.length; k++) {
				System.out.print(tab[k] + ",");
			}
		}

		// Zadanie IV
		System.out.println("\nZadanie IV\n");
		{
			int ilePowtorzen = 0;
			// Generowanie tablicy
			int[] tab = new int[10];
			for(int i = 0; i < tab.length - 1; i++) {
				tab[i] = (int)(Math.random() * 2);
			}

			// Wypisanie tablicy
			for(int k = 0; k < tab.length; k++) {
				System.out.print(tab[k] + ",");
			}
			System.out.println();

			// Poszukiwanie ciagu 101
			for(int i = 0; i < tab.length - 2; i++) {
				if (tab[i] == 1) {
					if (tab[i + 1] == 0) {
						if (tab[i + 2] == 1)
							ilePowtorzen++;
					}
				}
			}

			System.out.println("Ciag 101 powtorzyl sie " + ilePowtorzen + " razy.");
		}

		// Zadanie V
		System.out.println("\nZadanie V\n");
		{
			char[] tab = "Ala ma kota".toCharArray();
			// Oryginalny wyraz
			System.out.println("Oryginalne zdanie:");
			for(int i = 0; i < tab.length; i++) {
				System.out.print(tab[i]);
			}
			System.out.println();

			// Szyfrowanie
			System.out.println("Zaszyfrowane:");
			for(int i = 0; i < tab.length; i++) {
				tab[i] += i;
				System.out.print(tab[i]);
			}
			System.out.println();

			// Deszyfrowanie
			System.out.println("Odszyfrowane:");
			for(int i = 0; i < tab.length; i++) {
				tab[i] -= i;
				System.out.print(tab[i]);
			}
			System.out.println();
		}

		// Zadanie VI
		System.out.println("\nZadanie VI\n");
		{
			int[] tab1 = new int[(int)(Math.random() * 20)];
			int[] tab2 = new int[(int)(Math.random() * 20)];
			int[] tab3 = new int[(int)(Math.random() * 20)];
			int[][] tablica = {tab1, tab2, tab3};

			System.out.println("1 tablica posiada " + tab1.length + " elementow.");
			System.out.println("2 tablica posiada " + tab2.length + " elementow.");
			System.out.println("3 tablica posiada " + tab3.length + " elementow.");

			// Wypelnienie tablic losowymi wartosciami
			for(int i = 0; i < tablica.length; i++) {
				for(int j = 0; j < tablica[i].length; j++) {
					tablica[i][j] = (int)(Math.random() * 20);
				}
			}

			// Wypisanie zawartosci tablic
			System.out.println("***");
			for(int i = 0; i < tablica.length; i++) {
				System.out.println(i+1 + " tablica:");
				for(int j = 0; j < tablica[i].length; j++) {
					System.out.print(tablica[i][j] + ",");
				}
				System.out.println();
			}

		}

	}

}
