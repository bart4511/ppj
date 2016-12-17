
public class Ppj05 {

	public static void main(String[] args) {
		// Zadanie I
		System.out.println("Zadanie I\n");
		boolean czyPada = true;
		boolean czySwieciSlonce = true;

		if(czyPada) {
			if(czySwieciSlonce)
				System.out.println("Tecza");
			else
				System.out.println("Plucha");
		} else {
			if(czySwieciSlonce)
				System.out.println("Slonecznie");
			else
				System.out.println("Pochmurno");
		}

		// Zadanie II
		System.out.println("\nZadanie II\n");
		int zmienna;
		if(czyPada)
			zmienna = 5;
		else
			zmienna = 8;

		// Zadanie III
		System.out.println("\nZadanie III\n");
		char znak = 'B';
		System.out.print("Wartosc znaku to: ");
		if(znak <= 9) {
			System.out.println(znak);
		} else if (znak == 'A' || znak == 'a') {
			System.out.println(10);
		} else if (znak == 'B' || znak == 'b') {
			System.out.println(11);
		} else if (znak == 'C' || znak == 'c') {
			System.out.println(12);
		} else if (znak == 'D' || znak == 'd') {
			System.out.println(13);
		} else if (znak == 'E' || znak == 'e') {
			System.out.println(14);
		} else if (znak == 'F' || znak == 'f') {
			System.out.println(15);
		}

		// Zadanie IV
		System.out.println("\nZadanie IV\n");
		for(int i = 0; i <= 100; i++) {
			if(i == 0)
				continue;
			if(i % 2 == 0)
				System.out.print(i + ", ");
		}

		// Zadanie V
		System.out.println("\nZadanie V\n");
		{
			int s = 0;
			// for(int i = 1; i <= 10; i++)
			//  	s = s + i;
			int i = 1;
			while(i <= 10) {
				s += i;
				i++;
			}
		}

		// Zadanie VI
		System.out.println("\nZadanie VI\n");
		{
			for(double i = 0; i < 10; i++) {
				System.out.println(1/Math.pow(2.0, i));
			}
		}

		// Zadanie VII
		System.out.println("\nZadanie VII\n");
		int licznik = 0;
		int liczba = 2;
		while(licznik != 10) {
			int x = 2;
			while(liczba % x != 0) {
				x += 1;
			}
			if(liczba == x) {
				System.out.println(liczba + " - liczba pierwsza");
				licznik += 1;
			}
			liczba += 1;
		}
	}
}
