package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.AvionCarga;
import vos.AvionPasajeros;
import vos.Silla;

public class DAOTablaAvionPasajeros {
	
	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexión a la base de datos
	 */
	private Connection conn;

	/**
	 * Método constructor que crea DAOVideo
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaAvionPasajeros() {
		recursos = new ArrayList<Object>();
	}

	/**
	 * Método que cierra todos los recursos que estan enel arreglo de recursos
	 * <b>post: </b> Todos los recurso del arreglo de recursos han sido cerrados
	 */
	public void cerrarRecursos() {
		for(Object ob : recursos){
			if(ob instanceof PreparedStatement)
				try {
					((PreparedStatement) ob).close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
		}
	}

	/**
	 * Método que inicializa la connection del DAO a la base de datos con la conexión que entra como parámetro.
	 * @param con  - connection a la base de datos
	 */
	public void setConn(Connection con){
		this.conn = con;
	}


	/**
	 * Método que, usando la conexión a la base de datos, saca todos los videos de la base de datos
	 * <b>SQL Statement:</b> SELECT * FROM VIDEOS;
	 * @return Arraylist con los videos de la base de datos.
	 * @throws SQLException - Cualquier error que la base de datos arroje.
	 * @throws Exception - Cualquier error que no corresponda a la base de datos
	 */
	public ArrayList<AvionPasajeros> darAvionesPasajeros() throws SQLException, Exception {
		ArrayList<AvionPasajeros> avionesPasajeros = new ArrayList<AvionPasajeros>();

		String sql = "SELECT * FROM ISIS2304B271620.AVIONES_PASAJEROS";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			String numeroSerie = rs.getString("NUMERO_SERIE");
			String marca = rs.getString("MARCA");
			String modelo = rs.getString("MODELO");
			int añoFabricacion = Integer.parseInt(rs.getString("AÑO_FABRICACION"));
			//capacidad de sillas?
			String aerolinea = rs.getString("AEROLINEA");
			ArrayList<Silla> listaSillas = darSillasAvion(numeroSerie);
			avionesPasajeros.add(new AvionPasajeros(numeroSerie, marca, modelo, añoFabricacion, aerolinea, listaSillas));
		}
		return avionesPasajeros;
	}
	
	public ArrayList<Silla> darSillasAvion(String numSerieAvion) throws SQLException, Exception
	{
		ArrayList<Silla> sillas = new ArrayList<Silla>();
		String sql = "SELECT * FROM ISIS2304B271620.SILLAS WHERE ID_AVION_PASAJEROS = '" + numSerieAvion + "'";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			int id = Integer.parseInt(rs.getString("ID"));
			String clase = rs.getString("CLASE");
			int precio = Integer.parseInt(rs.getString("PRECIO"));
			
			sillas.add(new Silla(id, clase, precio));
		}
		return sillas;
	}

}
