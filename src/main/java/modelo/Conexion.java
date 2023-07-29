package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private Connection conexion;
	private final String URL = "jdbc:mysql://localhost:3306/registro-jsp";
	private final String USER = "root";
	private final String PASSWORD = "root";

	public void conectar() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			throw e;
		}
	}

	public void desconectar() throws SQLException {
		if (conexion != null && !conexion.isClosed())
			conexion.close();
	}

	public Connection getConexion() {
		return this.conexion;
	}
}
