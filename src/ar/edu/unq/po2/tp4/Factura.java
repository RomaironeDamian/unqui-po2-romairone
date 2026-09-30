package ar.edu.unq.po2.tp4;

public abstract class Factura implements Costo, Agencia{
	
	public Factura() {}
	
	public abstract double precio();
	
	public void registrarPago(Factura factura) {
		Agencia.cantFacturas.add(this);
	}
	
	public void procesar() {
		this.registrarPago(this);
	}
}
