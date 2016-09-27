package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Carga;
import vos.Cliente;

public class DAOTablaClientes {
	
	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexión a la base de datos
	 */
	private Connection conn;

	/**
	 * Método constructor que crea DAOVideo
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaClientes() {
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
	public ArrayList<Cliente> darCargas() throws SQLException, Exception {
		ArrayList<Cliente> Clientes = new ArrayList<Cliente>();

		String sql = "SELECT * FROM ISIS2304B271620.CARGA";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			int id = Integer.parseInt(rs.getString("ID"));
			String nombre = rs.getString("NOMBRE");
			String tipoId = rs.getString("TIPO_ID");
			int telefono = Integer.parseInt(rs.getString("TELEFONO"));
			int idUsuario = Integer.parseInt(rs.getString("ID_USUARIO"));
			String apellido = rs.getString("APELLIDO");
			ArrayList<Integer> nacionalidades = darNacionalidad(id);
			Clientes.add(new Cliente(id, nacionalidades, nombre,apellido,idUsuario, tipoId, telefono));
		}
		return Clientes;
	}
	
	public ArrayList<Integer> darNacionalidad(int idCliente) throws SQLException, Exception{
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
