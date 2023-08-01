package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import modelo.UsuarioDAO;
import modelo.UsuarioDAOImpl;


@WebServlet("/LoginUsuarioServlet")
public class LoginUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Usuario u = obtenerUsuario(request);

		PrintWriter out = response.getWriter();
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

		try {
			String mensaje;
			if (usuarioDAO.existe(u))
				mensaje = "El usuario está registrado en el sistema";
			else
				mensaje = "No hay usuarios con estos datos";
			out.println(mensaje);
		} catch (Exception e) {
			response.sendError(500);
		}
	}

	private Usuario obtenerUsuario(HttpServletRequest request) {
		Usuario u = new Usuario();
		u.setUsuario(request.getParameter("usuario"));
		u.setContrasena(request.getParameter("contrasena"));
		return u;
	}

}
