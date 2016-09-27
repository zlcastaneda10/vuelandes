package vos;

public class Aeropuerto {
	private String id;
	private int capacidad;
	private String tipoVuelos;
	private String nombre;
	private int idCiudad;
	
	public Aeropuerto(String id, int capacidad, String tipoVuelos, String nombre, int idCiudad) {
		super();
		this.id = id;
		this.capacidad = capacidad;
		this.tipoVuelos = tipoVuelos;
		this.nombre = nombre;
		this.idCiudad = idCiudad;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipoVuelos() {
		return tipoVuelos;
	}

	public void setTipoVuelos(String tipoVuelos) {
		this.tipoVuelos = tipoVuelos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	
	
	
	

}
