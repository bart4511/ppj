import java.util.Random;

public class Ppj04 {
	public static void main(String[] args) {

		// Zadanie III
		System.out.println("\nZadanie III");
		int color3 = 1651300;
		int maska = 255;

		int red = color3 & maska;
		int green = (color3 >> 8) & maska;
		int blue = (color3 >> 16) & maska;

		System.out.println(red + ", " + green + ", " + blue);

		// Zadanie IV
		System.out.println("\nZadanie IV");
		int x1 = (int) ((Math.random() * 27) - 16);
		System.out.println("x1 = " + x1);
		String wynik4 = "";
		if (((x1 > -15) && (x1 < -10)) || ((x1 > -5) && (x1 < 0)) || ((x1 > 5) && (x1 < 10))) {
			wynik4 += ("A");
		}

		if ((x1 < -13) || ((x1 > -8) && (x1 < -3))) {
			wynik4 += ("B");
		}
		if (x1 > (-5)) {
			wynik4 += ("C");
		}

		System.out.println("wynik4 = " + wynik4);

		// Zadanie VI
		System.out.println("\nZadanie VI");
		int truskawkowy = 1;
		int malinowy = 2;
		int brzoskwiniowy = 3;
		int agrestowy = 4;
		int sloik = (int) (Math.random() * 5);

		switch (sloik) {
		case 1:
			System.out.println("Dzem truskawkowy");
			break;
		case 2:
			System.out.println("Dzem malinowy");
			break;
		case 3:
			System.out.println("Dzem brzoskwiniowy");
			break;
		case 4:
			System.out.println("Dzem agrestowy");
			break;
		default:
			System.out.println("Dzem bez smaku");
		}

		// Dzemy wielosmakowe
		System.out.println("\nDzemy wielosmakowe");
		Random random = new Random();
		int smak = random.nextInt(16);
		System.out.println(Integer.toBinaryString(smak));
		int smakTruskawkowy = 0x1000;
		int smakMalinowy = 0x0100;
		int smakBrzoskwiniowy = 0x0010;
		int smakAgrestowy = 0x0001;
		String smakDzemu = "";
		// if(smak & smakTruskawkowy) {
		// 	smakDzemu += " truskawkowy";
		// }

		// Zadanie VII
		System.out.println("\nZadanie VII");
		byte a7 = 40, b7 = 50;
		byte suma7 = (byte) (a7 + b7);
		System.out.println(suma7);
		;

		// Zadanie VIII
		System.out.println("\nZadanie VIII");
		int x8 = 4;
		long y8 = x8 * 4 - x8++;
		if (y8 < 10)
			System.out.println("za malo");
		else
			System.out.println("w sam raz");

		// Zadanie IX
		System.out.println("\nZadanie IX");
		boolean x9 = true, z9 = true;
		int y9 = 20;
		x9 = (y9 != 10) ^ (z9 = false);
		System.out.println(x9 + ", " + y9 + ", " + z9);

	}

}
