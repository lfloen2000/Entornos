import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ejercicio2Test {

	@Test
	void testPrimos() {
		int[] resultado = ejercicio2.primos(15);
		int[] esperado = {7, 11, 13};
		assertEquals(esperado, resultado);

	}

	@Test
	void testMenormayor() {
		int resultado = ejercicio2.menormayor(5, 3, 9);
		int esperado[] = {9 , 3};
		assertEquals(esperado, resultado);
	}

}
