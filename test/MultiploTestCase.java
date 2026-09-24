import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multiplo;

class MultiploTestCase {
	private Multiplo multiplo;
	@BeforeEach
	public void setUp() throws Exception{
		multiplo = new Multiplo();
	}
	@Test
	void testMultiploMayorEntre2() {
		assertEquals(999 , multiplo.multiploComunMasGrande(9,3));
	}
}
