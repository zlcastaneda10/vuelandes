package vos;

public class Silla {
	private int id;
	private String clase;
	private int precio;
	
	public Silla(int id, String clase, int precio) {
		super();
		this.id = id;
		this.clase = clase;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
