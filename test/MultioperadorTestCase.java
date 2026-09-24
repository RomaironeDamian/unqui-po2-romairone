import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTestCase {
	ArrayList<Integer> numeros = new ArrayList<>(List.of(10, 5, 3, 2, 0, 7));
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception{
		multioperador = new Multioperador();
	}
	@Test
	void testMultioperadorSuma() {
		assertEquals(27, multioperador.sumaDeArrays(numeros));
	}
	@Test
	void testMultioperadorResta() {
		assertEquals(-7, multioperador.restaDeArrays(numeros));
	}
	@Test
	void testMultioperadorMul() {
		assertEquals(0, multioperador.mulDeArrays(numeros));
	}

}
