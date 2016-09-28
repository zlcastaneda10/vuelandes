package vos;

import java.util.ArrayList;

public class Viajero extends Cliente{

	private int millas;
	private char frecuente;
	private int idViajero;
	
	public Viajero(int idViajero, ArrayList<Integer> idNacionalidad, String nombre, String apellido, int idUsuario,
			String tipoIdentificacion, String telefono, int millas, char frecuente, Long idCliente) {
		super(idCliente, idNacionalidad, nombre, apellido, idUsuario, tipoIdentificacion, telefono);
		this.millas = millas;
		this.frecuente = frecuente;
		this.idViajero = idViajero;
	}

	public int getMillas() {
		return millas;
	}

	public void setMillas(int millas) {
		this.millas = millas;
	}

	public char getFrecuente() {
		return frecuente;
	}

	public void setFrecuente(char frecuente) {
		this.frecuente = frecuente;
	}

	public int getIdViajero() {
		return idViajero;
	}

	public void setIdViajero(int idViajero) {
		this.idViajero = idViajero;
	}
	
	

}
