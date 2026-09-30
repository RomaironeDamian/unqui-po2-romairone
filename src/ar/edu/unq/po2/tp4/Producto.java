package ar.edu.unq.po2.tp4;

public abstract class Producto implements Costo{
	private double precio;
	private int stock;
	
	public Producto(double valor , int cantidad) {
		precio = valor;
		stock = cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void actualizarStock(int cantVendidos) {
		stock = stock - cantVendidos;
	}

	public abstract double precio();
	
	public void procesar() {}
}

