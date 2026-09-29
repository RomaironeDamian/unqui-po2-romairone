package ar.edu.unq.po2.tp4;
import java.util.List;

public class Caja {

	public double montoTotalAPagar(List<Producto> listaACobrar) {
		/*
		double montoTotal = 0;
		for (Producto prod : listaDeProductos) {
			montoTotal = montoTotal + prod.precio();
		}*/
		double montoTotal = listaACobrar.stream()
		.mapToDouble(Producto :: precio)
		.sum();
		return montoTotal;
	} 
}
