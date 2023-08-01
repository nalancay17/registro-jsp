<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="controlador.LoginUsuarioServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login de usuarios JSP</title>
</head>
<body>

	<h1>Login usuario JSP</h1>

	<form action="LoginUsuarioServlet" method="post" accept-charset="UTF-8">

		<table width="35%" border="0">
			<tr>
				<td width="13%"><label for="usuario">Usuario: </label></td>
				<td width="87%"><input type="text" name="usuario" id="usuario"></td>
			</tr>
			<tr>
				<td width="13%"><label for="contrasena">Contraseña: </label></td>
				<td width="87%"><input type="password" name="contrasena" id="contrasena"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type=submit name="button"
					id="button" value="Login"></td>
			</tr>
		</table>
		<p>
			<br>
		</p>

	</form>

</body>
</html>