package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InterfazTestCase {
	private Caja caja;
	private Producto producto1;
	private Producto producto2;
	private Factura factura1;
	private Factura factura2;
	private Afip afip;
	List<Costo> costos1;
	List<Costo> costos2;
	
	@BeforeEach
	public void setUp() throws Exception{
		afip = new Afip();
		caja = new Caja(afip);
		producto1 = new ProductoTradicional(50,10);
		producto2 = new ProductoCooperativa(20,7);
		factura1 = new Servicio(30,5);
		factura2 = new Impuesto(50);
		costos1 = new ArrayList<>(List.of(producto2, factura1));
		costos2 = new ArrayList<>(List.of(producto1, producto2, factura2));
	}

	@Test
	void testCostos1() {
		assertEquals(168, caja.montoTotalAPagar(costos1));
		assertTrue(afip.estadoPagado());
	}
	
	@Test
	void testCostos2() {
		assertEquals(118, caja.montoTotalAPagar(costos2));
		assertTrue(afip.estadoPagado());
	}

}
