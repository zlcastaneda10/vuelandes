package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Usuario;
import vos.Vuelo;

public class DAOTablaVuelos {

	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexión a la base de datos
	 */
	private Connection conn;

	/**
	 * Método constructor que crea DAOVideo
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaVuelos() {
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
	public ArrayList<Vuelo> darVuelos() throws SQLException, Exception {
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

		String sql = "SELECT * FROM ISIS2304B271620.SERVICIOS_TRANSPORTE";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			int id = Integer.parseInt(rs.getString("ID"));
			String aeropuertoOrigen = rs.getString("AEROPUERTO_ORIGEN");
			String tipoCarga = rs.getString("TIPO_CARGA");
			String aeropuertoDestino = rs.getString("AEROPUERTO_DESTINO");
			String horaSalida = rs.getString("HORA_SALIDA");
			String horaLlegada = rs.getString("HORA_LLEGADA");
			int frecuencia =Integer.parseInt(rs.getString("FRECUENCIA"));
			int distancia = Integer.parseInt(rs.getString("DISTANCIA_MILLAS"));
			String duracion = rs.getString("DURACION");
			String tipoCobertura = rs.getString("TIPO_COBERTURA");
			char realizado = rs.getString("REALIZADO").charAt(0);
			String idAerolinea = rs.getString("ID_AEROLINEA");
			vuelos.add(new Vuelo(id, aeropuertoOrigen, tipoCarga, aeropuertoDestino, horaSalida, horaLlegada, frecuencia, distancia, duracion, tipoCobertura, realizado, idAerolinea));
		}
		return vuelos;
	}
}
