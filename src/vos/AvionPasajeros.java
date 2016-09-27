package vos;

import java.util.ArrayList;

public class AvionPasajeros extends Avion
{
	ArrayList<Silla> listaSillas;

	public AvionPasajeros(String numSerie, String marca, String modelo, int fabricacion,String aerolinea, ArrayList<Silla> listaSillas) {
		super(numSerie, marca, modelo, fabricacion, aerolinea);
		this.listaSillas = listaSillas;
	}

	public ArrayList<Silla> getListaSillas() {
		return listaSillas;
	}

	public void setListaSillas(ArrayList<Silla> listaSillas) {
		this.listaSillas = listaSillas;
	}
	
	
}
