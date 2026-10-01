package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class ClienteEMail {
	
	private IServidor servidor;
	private String nombreUsuario;
	private String passusuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(IServidor servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	/*
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	*/
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo); // esto deberia ser un add del correo a borrados
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
		//posible solucion : que el servidor se encargue de preguntar por los datos, y no que el email los envie.
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
		// el correo se instancia en el email?? le pide al servidor que lo envie?? problemas de responsabilidad
	}

}
