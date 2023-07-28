DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
	nombre VARCHAR(20),
    apellido VARCHAR(20),
    usuario VARCHAR(20),
    contrasena VARCHAR(20),
    pais VARCHAR(20),
    tecnologia VARCHAR(20),
    PRIMARY KEY (id, nombre, apellido, usuario, contrasena, pais)
);