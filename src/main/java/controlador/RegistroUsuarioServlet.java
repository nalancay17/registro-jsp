package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import modelo.UsuarioDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroUsuarioServlet")
public class RegistroUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Usuario u = obtenerUsuario(request);

		PrintWriter out = response.getWriter();
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

		try {
			usuarioDAO.registrar(u);
			out.println("Registrado con éxito");
		} catch (Exception e) {
			response.sendError(500);
		}

	}

	private Usuario obtenerUsuario(HttpServletRequest request) {
		Usuario u = new Usuario();
		u.setNombre(request.getParameter("nombre"));
		u.setApellido(request.getParameter("apellido"));
		u.setUsuario(request.getParameter("usuario"));
		u.setContrasena(request.getParameter("contrasena"));
		u.setPais(request.getParameter("pais"));
		u.setTecnologia(request.getParameter("tecnologia"));
		return u;
	}
}
