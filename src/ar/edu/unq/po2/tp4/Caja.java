package ar.edu.unq.po2.tp4;
import java.util.List;

public class Caja {

	public double montoTotalAPagar(List<Producto> listaDeProductos) {
		double montoTotal = 0;
		for (Producto prod : listaDeProductos) {
			montoTotal = montoTotal + prod.precio();
		}
		return montoTotal;
	} 
}
