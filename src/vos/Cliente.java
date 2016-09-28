package vos;

import java.util.ArrayList;

public class Cliente {
	

	private Long id;
	private  ArrayList<Integer> idNacionalidad;
	private String nombre;
	private String apellido;
	private String tipoIdentificacion;
	private int idUsuario;
	private int telefono;
	
	public Cliente(Long id, ArrayList<Integer> idNacionalidad, String nombre, String apellido,int idUsuario, String tipoIdentificacion, 
			int telefono) {
		super();
		this.id = id;
		this.idNacionalidad = idNacionalidad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = idUsuario;
		this.tipoIdentificacion = tipoIdentificacion;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Integer> getIdNacionalidad() {
		return idNacionalidad;
	}

	public void setIdNacionalidad(ArrayList<Integer> idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
