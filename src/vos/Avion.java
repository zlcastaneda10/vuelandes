package vos;

public abstract class Avion {
	private int idAvion;
	private String marca;
	private String modelo;
	private String numSerie;
	private int fabricacion;
	
	public Avion(int idAvion, String marca, String modelo, String numSerie, int fabricacion) {
		super();
		this.idAvion = idAvion;
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.fabricacion = fabricacion;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
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
	
	
	
	
}
