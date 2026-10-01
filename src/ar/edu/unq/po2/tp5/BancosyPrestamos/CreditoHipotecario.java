package ar.edu.unq.po2.tp5.BancosyPrestamos;

public class CreditoHipotecario extends Credito{
	private Propiedad garantia;

	public CreditoHipotecario(Cliente c, double m, int plazo, Propiedad p) {
		super(c, m, plazo);
		this.garantia = p;
	}

	@Override
	public boolean estadoAceptacion() {
		return this.cumpleMontoDeCuota() && this.cumpleValorFiscal() && this.cumpleEdadSuficiente();
	}
	
	private boolean cumpleMontoDeCuota() {
		return this.getCliente().getSueldoMensual() < this.cantidadLimite();
	}
	
	private double cantidadLimite() {
		return this.getCliente().getSueldoMensual() * 0.5;
	}
	
	private boolean cumpleValorFiscal() {
		return this.getMonto() < garantia.getValorFiscal() * 0.7;
	}
	
	private boolean cumpleEdadSuficiente() {
		return this.getCliente().getEdad() < 65;
	}

}
