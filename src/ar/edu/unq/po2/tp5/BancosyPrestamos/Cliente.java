package ar.edu.unq.po2.tp5.BancosyPrestamos;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private double sueldoNetoMensual;
	//private double billetera;
	//private double deuda;
	
	public double sueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public double getSueldoMensual() {
		return sueldoNetoMensual;
	}
	
}
