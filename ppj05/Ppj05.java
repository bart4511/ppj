
public class Ppj05 {

	public static void main(String[] args) {
		// Zadanie I
		System.out.println("Zadanie I\n");
		{
			for(int i = 0; i <= 100; i++) {
				if(i % 2 == 0) {
					System.out.print(i + ",");
				}
			}
		}
		System.out.println();

		// Zadanie II
		System.out.println("\nZadanie II\n");
		{
			int s = 0;
//			for(int i = 1; i <= 10; i++) {
//				s = s + i;
//			}
			int i = 1;
			while(i <= 10) {
				s = s + i;
				i++;
				System.out.println(i + ".\t" + s);
			}
		}
		// Zadanie III
		System.out.println("\nZadanie III\n");
		{
			double suma = 0;
			for(int i = 0; i < 10; i++) {
				suma += (1 / (Math.pow(2, i)));
				System.out.println((i + 1) + ".\t" + suma);
			}
		}


		// Zadanie IV
		System.out.println("\nZadanie IV\n");
		{
			for(int i = 1; i <= 10; i++) {
				for(int j = 1; j <= 10; j++) {
					System.out.print("\t" + i * j);
				}
				System.out.println();
			}
		}

		// Zadanie V
		System.out.println("\nZadanie V\n");
		{
			int i = 0;
			int liczba = 0;
			String liczbyPierwsze = "1 ";
			for (i = 0; i < 100; i++) {
				int ileDzielnikow = 0;
				for (liczba = i; liczba >= 1; liczba--) {
					if (i % liczba == 0) {
						ileDzielnikow += 1;
					}
				}
				if (ileDzielnikow == 2) {
					liczbyPierwsze = liczbyPierwsze + i + " ";
				}
			}
			System.out.println("Liczby pierwsze to:");
			System.out.println(liczbyPierwsze);

		}

		// Zadanie VI
		System.out.println("\nZadanie VI\n");
		{
			int ileSpacji = 0;
			int ileGwiazdek = 9;
			int kierunek = -2;

			for (int i = 0; i < 9; i++) {
				String wiersz = "";
				for(int j = 0; j < ileSpacji; j++) {
					wiersz += " ";
				}
				for(int k = 0; k < ileGwiazdek; k++) {
					wiersz += "*";
				}
				for(int l = 0; l < ileSpacji; l++) {
					wiersz += " ";
				}

				System.out.println(wiersz);

				ileGwiazdek += kierunek;
				ileSpacji -= (kierunek/2);
				if(ileGwiazdek == 1) kierunek = -kierunek;

			}
			//
		}

	}

}
