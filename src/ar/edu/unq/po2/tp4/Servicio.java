package ar.edu.unq.po2.tp4;

public class Servicio extends Factura{
	private int costoXUnidad;
	private int cantConsumida;
	
	public Servicio(int costoXU , int cantConsum) {
		super();
		this.costoXUnidad = costoXU;
		cantConsumida = cantConsum;
	}
	
	@Override
	public double precio() {
		return cantConsumida * costoXUnidad;
	}
}
