package vos;

public class Aeropuerto {
	private int aeropuerto;
	private int capacidad;
	private String tipoVuelos;
	private String nombre;
	private String codigo;
	private int idCiudad;
	
	public Aeropuerto(int aeropuerto, int capacidad, String tipoVuelos, String nombre, String codigo, int idCiudad) {
		super();
		this.aeropuerto = aeropuerto;
		this.capacidad = capacidad;
		this.tipoVuelos = tipoVuelos;
		this.nombre = nombre;
		this.codigo = codigo;
		this.idCiudad = idCiudad;
	}

	public int getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(int aeropuerto) {
		this.aeropuerto = aeropuerto;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	
	
	
	

}
