package ar.edu.unq.po2.tp4;

public class Impuesto extends Factura{
	private double precio;
	
	public Impuesto(double costo) {
		super();
		this.precio = costo;
	}
	
	@Override
	public double precio() {
		return precio;
	}
}
