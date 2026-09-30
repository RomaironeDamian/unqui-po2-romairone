package ar.edu.unq.po2.tp4;
import java.util.List;

public class Caja {
	private Agencia a;
	public Caja(Agencia ag) {
		this.a = ag;
	}

	public double montoTotalAPagar(List<Costo> listaACobrar) {
		
		double montoTotal = 0;
		for (Costo c : listaACobrar) {
			c.procesar(a);
			montoTotal = montoTotal + c.precio();
		}
		/*double montoTotal = listaACobrar.stream()
		.forEach(Producto -> producto.procesar());
		.mapToDouble(Producto :: precio)
		.sum();*/
		return montoTotal;
	} 
}
