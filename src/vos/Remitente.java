package vos;

import java.util.ArrayList;

public class Remitente extends Cliente {

	private int idRemitente;
	
	public Remitente(Long idCliente, ArrayList<Integer> idNacionalidad, String nombre, String apellido, int idUsuario,
			String tipoIdentificacion, int telefono, int idRemitente) {
		super(idCliente, idNacionalidad, nombre, apellido, idUsuario, tipoIdentificacion, telefono);
		this.idRemitente = idRemitente;
	}

	public int getIdRemitente() {
		return idRemitente;
	}

	public void setIdRemitente(int idRemitente) {
		this.idRemitente = idRemitente;
	}

}
