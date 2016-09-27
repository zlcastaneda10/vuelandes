package vos;

public class AvionCarga extends Avion{
	
	
	private int idCarga;
	private double costoPorUnidad;
	private double capacidadCarga;


	public AvionCarga(int idAvion, String marca, String modelo, String numSerie, int fabricacion, int idCarga,
			double costoPorUnidad, double capacidadCarga) {
		super(idAvion, marca, modelo, numSerie, fabricacion);
		this.idCarga = idCarga;
		this.costoPorUnidad = costoPorUnidad;
		this.capacidadCarga = capacidadCarga;
	}


	public int getIdCarga() {
		return idCarga;
	}


	public void setIdCarga(int idCarga) {
		this.idCarga = idCarga;
	}


	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}


	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}


	public double getCapacidadCarga() {
		return capacidadCarga;
	}


	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	
	
}
