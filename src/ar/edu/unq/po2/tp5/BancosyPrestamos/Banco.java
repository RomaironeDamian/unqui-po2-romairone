package ar.edu.unq.po2.tp5.BancosyPrestamos;

import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private List<Credito> creditos;
	
	public void agregarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void registrarCredito(Credito c) {
		this.creditos.add(c);
	}
	
	public double montoADesembolsar() {
		double montoTotal = creditos.stream()
				.filter(c -> c.estadoAceptacion())
				.mapToDouble(Credito :: getMonto)
				.sum();
		return montoTotal;
	}
}
