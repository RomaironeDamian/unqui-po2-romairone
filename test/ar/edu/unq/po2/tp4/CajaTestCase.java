package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class CajaTestCase {
	private Caja caja;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Producto producto4;
	private Producto producto5;
	List<Producto> productos1;
	List<Producto> productos2;
	List<Producto> productos3;
	
	
	@BeforeEach
	public void setUp() throws Exception{
		caja = new Caja();
		producto1 = new ProductoTradicional(50,10);
		producto2 = new ProductoTradicional(14,7);
		producto3 = new ProductoCooperativa(30,5);
		producto4 = new ProductoCooperativa(20,50);
		producto5 = new ProductoCooperativa(40,4);
		productos1 = new ArrayList<>(List.of(producto1, producto2, producto3, producto4, producto5));
		productos2 = new ArrayList<>(List.of(producto1, producto2));
		productos3 = new ArrayList<>(List.of(producto3, producto4, producto5));
	}
	
	@Test
	void testPrecioDeUnProducto() {
		assertEquals(50, producto1.precio());
	}
	
	@Test
	void testCajaProductosTradicionales() {
		assertEquals(64 , caja.montoTotalAPagar(productos2));
	}
	
	@Test
	void testCajaProductosCooperativas() {
		assertEquals(81 , caja.montoTotalAPagar(productos3));
	}
	
	@Test
	void testCajaProductosAmbos() {
		assertEquals(145 , caja.montoTotalAPagar(productos1));
	}
}
