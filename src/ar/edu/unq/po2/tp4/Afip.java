package ar.edu.unq.po2.tp4;

public class Afip implements Agencia{
	private boolean avisada = false;
	
	@Override
	public void registrarPago(Factura fac) {
		this.avisada = true;
	}
	
	public boolean estadoPagado() {
		return this.avisada;
	}
}
