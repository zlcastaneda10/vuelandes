package vos;

public class AvionCarga extends Avion{
	
	
	private int idCarga;
	private double costoPorUnidad;
	private double capacidadCarga;


	public AvionCarga(String numSerie, String marca, String modelo, int fabricacion,
			double costoPorUnidad, double capacidadCarga, String aerolinea) {
		super(numSerie, marca, modelo, fabricacion,aerolinea);
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
