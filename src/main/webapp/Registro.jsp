<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="controlador.RegistroUsuarioServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de usuarios JSP</title>
</head>
<body>

	<h1>Registro usuario JSP</h1>

	<form action="RegistroUsuarioServlet" method="post" accept-charset="UTF-8">

		<table width="35%" border="0">
			<tr>
				<td width="13%"><label for="nombre">Nombre: </label></td>
				<td width="87%"><input type="text" name="nombre" id="nombre"></td>
			</tr>
			<tr>
				<td width="13%"><label for="apellido">Apellido: </label></td>
				<td width="87%"><input type="text" name="apellido"
					id="apellido"></td>
			</tr>
			<tr>
				<td width="13%"><label for="usuario">Usuario: </label></td>
				<td width="87%"><input type="text" name="usuario" id="usuario"></td>
			</tr>
			<tr>
				<td width="13%"><label for="contrasena">Contraseña: </label></td>
				<td width="87%"><input type="password" name="contrasena" id="contrasena"></td>
			</tr>
			<tr>
				<td><label for="pais">Pais</label></td>
				<td><select name="pais" id="pais">

						<option>Mexico</option>
						<option>Colombia</option>
						<option>Chile</option>
						<option>Peru</option>
						<option>Argentina</option>
						<option>España</option>

				</select></td>
			</tr>
			<tr>
				<td>Tecnologias</td>
				<td><label> <input type="radio" name="tecnologia"
						value="Java" id="tenologia_0"> Java
				</label> <br> <label> <input type="radio" name="tecnologia"
						value="PHP" id="tenologia_1"> PHP
				</label> <br> <label> <input type="radio" name="tecnologia"
						value="JavaScript" id="tenologia_2"> JavaScript
				</label></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type=submit name="button"
					id="button" value="Enviar"></td>
			</tr>

			<p>
				<br>
			</p>
		</table>

	</form>

</body>
</html>