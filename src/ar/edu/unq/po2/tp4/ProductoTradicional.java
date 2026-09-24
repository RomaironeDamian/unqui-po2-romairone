package ar.edu.unq.po2.tp4;

public class ProductoTradicional extends Producto {
	public ProductoTradicional(double d, int i) {
		super(d, i);
	}
	
	public double precio() {
		return this.getPrecio();
	}
}
