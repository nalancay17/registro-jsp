package modelo;

import java.sql.PreparedStatement;

public class UsuarioDAOImpl implements UsuarioDAO {

	private static final String INSERT = "INSERT INTO usuario (nombre, apellido, usuario, contrasena, pais, tecnologia) VALUES (?,?,?,?,?)";

	@Override
	public void registrar(Usuario u) throws Exception {
		Conexion conexion = new Conexion();
		try {
			conexion.conectar();
			PreparedStatement st = conexion.getConexion().prepareStatement(INSERT);
			st.setString(1, u.getNombre());
			st.setString(2, u.getApellido());
			st.setString(3, u.getUsuario());
			st.setString(4, u.getContrasena());
			st.setString(5, u.getPais());
			st.setString(6, u.getTecnologia());
			st.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			conexion.desconectar();
		}
	}

}
