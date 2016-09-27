package vos;

public abstract class Avion {
	private String numSerie;
	private String marca;
	private String modelo;
	private int fabricacion;
	private String aerolinea;
	
	public Avion(String numSerie, String marca, String modelo, int fabricacion, String aerolinea) {
		super();
		this.numSerie = numSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.fabricacion = fabricacion;
		this.aerolinea = aerolinea;
	}

	public String getnumSerie() {
		return numSerie;
	}

	public void setIdAvion(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public int getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}
	
	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	
	
}
