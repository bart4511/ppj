public class Ppj03 {
	public static void main(String[] args) {

		// Zadanie I
		System.out.println("\nZadanie I");
		long a = 150L;
		float b = 50.456F;
		System.out.println("long x = " + a);
		System.out.println("float y = " + b);


		// Zadanie II
		System.out.println("\nZadanie II");
		char x1 = 2;
		int x2 = 8;
		char x3 = (char)(x1 + x2);
		System.out.println((int)x1 + " + " + x2 + " = " + (int)x3);

		int x4 = x1 + x2;
		System.out.println((int)x1 + " + " + x2 + " = " + x4);

		float x5 = 45.64F;
		double x6 = 56.86;
		float x7 = x5 + (float)x6;
		System.out.println(x5 + " + " + x6 + " = " + x7);

		byte x8 = 3;
		int x9 = 2;
		byte x10 = (byte)(x8 + x9);
		System.out.println(x8 + " + " + x9 + " = " + x10);


		// Zadanie III
		System.out.println("\nZadanie III");
		boolean czyPada = true;
		System.out.println(czyPada ? "Pada" : "Nie pada");


		// Zadanie IV
		System.out.println("\nZadanie IV");
		int wrt = (int)((Math.random() * 8) -3);
		System.out.println(wrt);
		System.out.println((wrt >= 0) ? ((wrt > 1) ? "A" : "ABC") : "B");


		// Zadanie V
		System.out.println("\nZadanie V");
		byte x = 5;
		byte y = 10;
//		byte z1 = x + y;
//		short z2 = x + y;
		int z3 = x + y;
		long z4 = x + y;
		float z5 = x + y;
		double z6 = x + y;
	}
}
