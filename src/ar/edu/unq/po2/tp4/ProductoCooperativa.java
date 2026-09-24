package ar.edu.unq.po2.tp4;

public class ProductoCooperativa extends Producto{
	public ProductoCooperativa(double d, int i) {
		super(d, i);
	}
	
	@Override
	public double precio() {
		return this.getPrecio() - (this.getPrecio() * 0.1);
	}
}
