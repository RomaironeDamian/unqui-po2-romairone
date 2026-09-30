package ar.edu.unq.po2.tp4;

import java.util.List;

public interface Costo {
	public static List<Costo> costos = null;
	public void procesar();
	
	public double precio();
	
	private void agregarCosto(Costo c) {
		costos.add(c);
	}
}
