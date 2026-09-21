import ar.edu.unq.po2.tp3.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorTestCase {
	private Desarmador desarmador;
	@BeforeEach
	public void setUp() throws Exception{
		desarmador = new Desarmador();
	}
	@Test
	public void testDesarmandoNumeros() {
		ArrayList<Integer> numeros = new ArrayList<>(List.of(108, 241, 286));
		assertEquals(286, desarmador.mayorCantNumerosPares(numeros));
	}

}
