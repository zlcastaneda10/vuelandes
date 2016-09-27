package vos;

public class Vuelo {
	private int id;
	private String origen;
	private String tipoCarga;
	private String destino;
	private String horaSalida;
	private String horaLlegada;
	private int frecuencia;
	private int distanciaMillas;
	private String duracion;
	private String tipoCobertura;
	private char realizado;
	private String idAerolinea;
	
	
	public Vuelo(int id, String origen, String tipoCarga, String destino,String horaSalida,String horaLlegada, int frecuencia, int distanciaMillas,
			String duracion, String tipoCobertura, char realizado, String idAerolinea) {
		super();
		this.id = id;
		this.origen = origen;
		this.tipoCarga = tipoCarga;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.frecuencia = frecuencia;
		this.distanciaMillas = distanciaMillas;
		this.duracion = duracion;
		this.tipoCobertura = tipoCobertura;
		this.realizado = realizado;
		this.idAerolinea = idAerolinea;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getTipoCarga() {
		return tipoCarga;
	}


	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getHoraSalida() {
		return horaSalida;
	}


	public void setHorSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public String getHoraLlegada() {
		return horaLlegada;
	}


	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
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
	
	public String getIdAerolinea() {
		return idAerolinea;
	}


	public void setIdAerolinea(String idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
	
	
	
}
