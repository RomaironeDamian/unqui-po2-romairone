package ar.edu.unq.po2.tp4;

public abstract class Factura implements Costo{
	
	public Factura() {}
	
	public abstract double precio();
	
	/*public void registrarPago(Factura factura) {
		
	}*/
	
	public void procesar(Agencia a) {
		a.registrarPago(this);
	}
}
