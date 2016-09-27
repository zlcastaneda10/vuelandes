package vos;

public class Carga {
	private int id;
	private int volumen;
	private int peso;
	private int idReseva;
	
	public Carga(int id, int volumen, int peso, int idReseva) {
		super();
		this.id = id;
		this.volumen = volumen;
		this.peso = peso;
		this.idReseva = idReseva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getIdReseva() {
		return idReseva;
	}

	public void setIdReseva(int idReseva) {
		this.idReseva = idReseva;
	}
	
	
	
}
