
public class ejercicio2 {

	public static void main(String[] args) {
		primos(50);
		menormayor(1, 2, 3);

	}

	public static boolean primos(int longitud) {

		for (int i = 2; i < longitud; i++) {
			boolean Primo = true;
			for (int j = 2; j < i; j++)
				if (i % j == 0 && i != j)
					Primo = false;

			if (Primo)
				System.out.println("el numero " + i + " es primo");
		}
		return true;
	}

	public static void menormayor(int num1, int num2, int num3) {

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("El mayor es " + num1);
		} else {
			if (num2 >= num3) {
				System.out.println("El mayor es " + num2);
			} else {
				System.out.println("El mayor es " + num3);
			}
		}

		if (num1 <= num2 && num1 <= num3) {
			System.out.println("El menor es " + num1);
		} else {
			if (num2 <= num3) {
				System.out.println("El menor es " + num2);
			} else {
				System.out.println("El menor es " + num3);
			}
		}
	}

}
