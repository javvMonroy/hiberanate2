package mx.edu.uacm.primerproyectohibernate.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//Entity and Id anotations are not optional
@Entity
public class Usuario {
	@Id
	private int idUsuario;
	
	private String nombreUsuario;
	
	private String mensajeUsuario;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}
	
	

}
