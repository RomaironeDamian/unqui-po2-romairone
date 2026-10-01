package ar.edu.unq.po2.tp5.BancosyPrestamos;

public abstract class Credito {
	private Cliente cliente;
	private double monto;
	private int plazoMeses;
	
	public Credito(Cliente c, double m, int plazo) {
		this.cliente = c;
		this.monto = m;
		this.plazoMeses = plazo;
	}
	
	abstract public boolean estadoAceptacion();
	
	public double getMonto() {
		return monto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public int getPlazoMeses() {
		return plazoMeses;
	}

}
