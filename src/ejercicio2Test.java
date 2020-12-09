import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ejercicio2Test {

	@Test
	void testPrimos() {
		boolean resultado = ejercicio2.primos(50);
		boolean esperado = true;
		assertEquals(esperado, resultado);

	}

	@Test
	void testMenormayor() {
		int resultado = ejercicio2.menormayor(5, 3, 9);
	}

}
