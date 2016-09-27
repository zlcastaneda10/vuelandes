package vos;

public class Vuelo {
	private int id;
	private Aeropuerto origen;
	private String tipoCarga;
	private Aeropuerto destino;
	private int frecuencia;
	private int distanciaMillas;
	private String duracion;
	private String tipoCobertura;
	private char realizado;
	
	
	public Vuelo(int id, Aeropuerto origen, String tipoCarga, Aeropuerto destino, int frecuencia, int distanciaMillas,
			String duracion, String tipoCobertura, char realizado) {
		super();
		this.id = id;
		this.origen = origen;
		this.tipoCarga = tipoCarga;
		this.destino = destino;
		this.frecuencia = frecuencia;
		this.distanciaMillas = distanciaMillas;
		this.duracion = duracion;
		this.tipoCobertura = tipoCobertura;
		this.realizado = realizado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Aeropuerto getOrigen() {
		return origen;
	}


	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}


	public String getTipoCarga() {
		return tipoCarga;
	}


	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}


	public Aeropuerto getDestino() {
		return destino;
	}


	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}


	public int getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}


	public int getDistanciaMillas() {
		return distanciaMillas;
	}


	public void setDistanciaMillas(int distanciaMillas) {
		this.distanciaMillas = distanciaMillas;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public String getTipoCobertura() {
		return tipoCobertura;
	}


	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}


	public char getRealizado() {
		return realizado;
	}


	public void setRealizado(char realizado) {
		this.realizado = realizado;
	}
	
	
	
	
}
