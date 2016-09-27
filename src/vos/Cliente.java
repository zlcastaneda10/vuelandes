package vos;

public class Cliente {
	

	private int id;
	private  int idNacionalidad;
	private String nombre;
	private String tipoIdentificacion;
	private int identificacion;
	private String telefono;
	
	public Cliente(int id, int idNacionalidad, String nombre, String tipoIdentificacion, int identificacion,
			String telefono) {
		super();
		this.id = id;
		this.idNacionalidad = idNacionalidad;
		this.nombre = nombre;
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdNacionalidad() {
		return idNacionalidad;
	}

	public void setIdNacionalidad(int idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
