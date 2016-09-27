package vos;

import java.util.Date;

public class Reserva {
	private int id;
	private int servicioTranspote;
	//verificar date util o sql
	private Date fecha;
	private char  ckeckIn;
	
	public Reserva(int id, int servicioTranspote, Date fecha, char ckeckIn) {
		super();
		this.id = id;
		this.servicioTranspote = servicioTranspote;
		this.fecha = fecha;
		this.ckeckIn = ckeckIn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getServicioTranspote() {
		return servicioTranspote;
	}

	public void setServicioTranspote(int servicioTranspote) {
		this.servicioTranspote = servicioTranspote;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public char getCkeckIn() {
		return ckeckIn;
	}

	public void setCkeckIn(char ckeckIn) {
		this.ckeckIn = ckeckIn;
	}
	
	
	
}
