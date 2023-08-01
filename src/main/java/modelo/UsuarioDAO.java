package modelo;

public interface UsuarioDAO {

	public void registrar(Usuario u) throws Exception;

	public boolean existe(Usuario u) throws Exception;
}
