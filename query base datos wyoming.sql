SELECT * FROM Profesor

INSERT INTO Profesor (idProfesor, nombre, apellido, RFC)
VALUES (1, 'Juan', 'Pérez', 'JUPR850101');

-- Modificar la tabla profesor para que el campo RFC sea alfanumérico y tenga una longitud de 13 caracteres
ALTER TABLE `wyomingsuap`.`profesor`
MODIFY COLUMN `RFC` VARCHAR(13) DEFAULT NULL;

SELECT * FROM Administrador

INSERT INTO Administrador (idAdministrador, nombreAdministrador, Contrasena)
VALUES ('1', 'Rodriguez Hernandez', '123456');

SELECT * FROM Unidad_De_Aprendizaje

ALTER TABLE `wyomingsuap`.`unidad_de_aprendizaje`
MODIFY COLUMN `horaClase` INT DEFAULT NULL,
MODIFY COLUMN `horaTaller` INT DEFAULT NULL,
MODIFY COLUMN `horasLaboratorio` INT DEFAULT NULL;

INSERT INTO Unidad_De_Aprendizaje (idUnidadAprendizaje, nombreDeLaUnidadAprendisaje, horaClase, horaTaller, horasLaboratorio)
VALUES ('1', 'Matemáticas', '2', '3', '1');