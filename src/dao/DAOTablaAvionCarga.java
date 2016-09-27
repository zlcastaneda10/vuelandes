package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Aeropuerto;
import vos.AvionCarga;

public class DAOTablaAvionCarga {

	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexión a la base de datos
	 */
	private Connection conn;

	/**
	 * Método constructor que crea DAOVideo
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaAvionCarga() {
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
	public ArrayList<AvionCarga> darAvionesCarga() throws SQLException, Exception {
		ArrayList<AvionCarga> AvionesCarga = new ArrayList<AvionCarga>();

		String sql = "SELECT * FROM ISIS2304B271620.AVIONES_CARGA";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			String numeroSerie = rs.getString("NUMERO_SERIE");
			String marca = rs.getString("MARCA");
			String modelo = rs.getString("MODELO");
			int añoFabricacion = Integer.parseInt(rs.getString("AÑO_FABRICACION"));
			int capacidadCarga = Integer.parseInt(rs.getString("CAPACIDAD_CARGA"));
			String aerolinea = rs.getString("AEROLINEA");
			Double costoPorUnidad = Double.parseDouble(rs.getString("COSTO_UNIDAD"));
			AvionesCarga.add(new AvionCarga(numeroSerie, marca, modelo, añoFabricacion,  costoPorUnidad, capacidadCarga, aerolinea));
		}
		return AvionesCarga;
	}
}
