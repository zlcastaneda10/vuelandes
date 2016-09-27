package vos;

public class Silla {
	private int id;
	private String clase;
	private int precio;
	private String idAvion;
	
	public Silla(int id, String clase, int precio, String idAvion) {
		super();
		this.id = id;
		this.clase = clase;
		this.precio = precio;
		this.idAvion = idAvion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
