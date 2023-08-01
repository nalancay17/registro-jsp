package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAOImpl implements UsuarioDAO {

	private static final String INSERT = "INSERT INTO usuario (nombre, apellido, usuario, contrasena, pais, tecnologia) VALUES (?,?,?,?,?,?)";
	private static final String EXISTS = "SELECT EXISTS(SELECT 1 FROM usuario WHERE usuario=? AND contrasena=?)";

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

	@Override
	public boolean existe(Usuario u) throws Exception {
		Conexion conexion = new Conexion();
		try {
			conexion.conectar();
			PreparedStatement st = conexion.getConexion().prepareStatement(EXISTS);
			st.setString(1, u.getUsuario());
			st.setString(2, u.getContrasena());
			ResultSet rs = st.executeQuery();
			rs.next();
			return rs.getBoolean(1);
		} catch (Exception e) {
			throw e;
		} finally {
			conexion.desconectar();
		}
	}

}
