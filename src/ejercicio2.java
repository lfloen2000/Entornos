
public class ejercicio2 {

	public static void main(String[] args) {
		primos(15);
	//	cortar(primos(50));
	//	menormayor(1, 2, 3);

	}

	public static int[] primos(int longitud) {
		int i = 0;
		int primo[] = new int[longitud];
		
			
			for (int j = 2; j < primo.length; j++)
				if (esprimo(j)) {
					primo[i] = j;
					i++;
				}
					

			for (int j = 0; j < primo.length; j++) {
				System.out.println("el numero " + primo[j] + " es primo");
			}
				
			
			
		
		primo = cortar(primo);
		for (int j = 0; j < primo.length; j++) {
			System.out.println("el numero " + primo[j] + " es primo");
		}
		return primo;
	}
	
	public static int[] cortar(int[] primos) {
		
		int contar = 0;
		for (int i = primos.length - 1; i > 0; i--) {
			if(primos[i] == 0) {
				contar++;
			}else{
				break;
			}
		}
		
		int[] nuevo = new int[primos.length - contar];
		for (int i = 0; i < nuevo.length; i++) {
			nuevo[i] = primos[i];
		}
		
		int[] cortado = new int[3];
		cortado[0] = nuevo[nuevo.length - 3];
		cortado[1] = nuevo[nuevo.length - 2];
		cortado[2] = nuevo[nuevo.length - 1];
		return cortado;
		
	}

	public static int menormayor(int num1, int num2, int num3) {
		
		int mayor;
		int menor;
		
		if (num1 >= num2 && num1 >= num3) {
			mayor=num1;
			System.out.println("El mayor es " + num1);
		} else {
			if (num2 >= num3) {
				mayor=num2;
				System.out.println("El mayor es " + num2);
			} else {
				mayor=num3;
				System.out.println("El mayor es " + num3);
			}
		}

		if (num1 <= num2 && num1 <= num3) {
			menor=num1;
			System.out.println("El menor es " + num1);
		} else {
			if (num2 <= num3) {
				menor=num2;
				System.out.println("El menor es " + num2);
			} else {
				menor=num3;
				System.out.println("El menor es " + num3);
			}
		}
		return mayor + menor;
		
	}
	
	public static boolean esprimo(int num) {
		for(int i = 0; i <= num / 2; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

}
