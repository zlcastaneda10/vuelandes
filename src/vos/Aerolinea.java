package vos;

public class Aerolinea {
	
	private String IATA;
	private String nombre;
	private String codigo;
	private int paisRadicacion;
	
	
	public Aerolinea(String iATA, String nombre, String codigo, int paisRadicacion) {
		super();
		IATA = iATA;
		this.nombre = nombre;
		this.codigo = codigo;
		this.paisRadicacion = paisRadicacion;
	}


	public String getIATA() {
		return IATA;
	}


	public void setIATA(String iATA) {
		IATA = iATA;
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


	public int getPaisRadicacion() {
		return paisRadicacion;
	}


	public void setPaisRadicacion(int paisRadicacion) {
		this.paisRadicacion = paisRadicacion;
	}
	
	
	
}
