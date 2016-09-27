package vos;

import java.util.ArrayList;

public class AvionPasajeros {
	ArrayList<Silla> listaSillas;

	public AvionPasajeros(ArrayList<Silla> listaSillas) {
		super();
		this.listaSillas = listaSillas;
	}

	public ArrayList<Silla> getListaSillas() {
		return listaSillas;
	}

	public void setListaSillas(ArrayList<Silla> listaSillas) {
		this.listaSillas = listaSillas;
	}
	
	
}
