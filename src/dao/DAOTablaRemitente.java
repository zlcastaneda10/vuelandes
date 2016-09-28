package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Remitente;
import vos.Viajero;

public class DAOTablaRemitente {
	
	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexión a la base de datos
	 */
	private Connection conn;

	/**
	 * Método constructor que crea DAOVideo
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaRemitente() {
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
	public ArrayList<Remitente> darRemitentes() throws SQLException, Exception {
		ArrayList<Remitente> remitentes = new ArrayList<Remitente>();

		String sql = "SELECT * FROM ISIS2304B271620.REMITENTE";
		String sql2 = "SELECT * FROM ISIS2304B271620.CLIENTE";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();
		
		PreparedStatement prepStmt2 = conn.prepareStatement(sql2);
		recursos.add(prepStmt2);
		ResultSet rs2 = prepStmt2.executeQuery();

		while (rs2.next() && rs.next()) {
			Long idCliente = Long.parseLong(rs2.getString("ID"));
			String nombre = rs2.getString("NOMBRE");
			String tipoId = rs2.getString("TIPO_ID");
			String telefono = rs2.getString("TELEFONO");
			int idUsuario = Integer.parseInt(rs2.getString("ID_USUARIO"));
			String apellido = rs2.getString("APELLIDO");
			int idRemitente = Integer.parseInt(rs.getString("ID"));
			ArrayList<Integer> nacionalidades = darNacionalidad(idCliente);
			remitentes.add(new Remitente(idCliente, nacionalidades, nombre, apellido, idUsuario, tipoId, telefono, idRemitente));
		}
		return remitentes;
	}
	
	public ArrayList<Integer> darNacionalidad(Long idCliente) throws SQLException, Exception{
		ArrayList<Integer> Nacionalidades = new ArrayList<Integer>();

		String sql = "SELECT * FROM ISIS2304B271620.NACIONALIDAD WHERE ID_CLIENTE = "+ idCliente;

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			int idPais = Integer.parseInt(rs.getString("ID_PAIS"));
			
			Nacionalidades.add(idPais);
		}
		return Nacionalidades;
	}

}
