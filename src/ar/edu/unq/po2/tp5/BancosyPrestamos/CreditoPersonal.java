package ar.edu.unq.po2.tp5.BancosyPrestamos;

public class CreditoPersonal extends Credito{
	
	public CreditoPersonal(Cliente c, double m, int plazo) {
		super(c, m, plazo);
	}

	@Override
	public boolean estadoAceptacion() {
		return this.ingresosAnualesSuficientes() && this.cumpleMontoDeCuota();
	}
	
	private boolean ingresosAnualesSuficientes() {
		return this.getCliente().sueldoNetoAnual()>= 15000;
	}
	
	private boolean cumpleMontoDeCuota() {
		return this.getCliente().getSueldoMensual() < this.cantidadLimite();
	}
	
	private double cantidadLimite() {
		return this.getCliente().getSueldoMensual() * 0.7;
	}

}
