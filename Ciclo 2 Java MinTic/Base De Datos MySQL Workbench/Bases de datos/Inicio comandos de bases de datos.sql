CREATE DATABASE PrimeraBaseDeDatos;
use PrimeraBaseDeDatos; #// lo que se coloque de aqui para abajo se guarda en la base de datos tutorial, ponemos en memoria la base de datos tutorial
CREATE TABLE Alumnos( #// nuestra tabla se llamara alumno
IdAlumno int primary key not null, #// tendra una columna llamada IdAlumno de tipo entero llave primaria, y no aceptara valores nulos 
Nombre varchar (25) not null, #// la siguente columna es Nombres varachar (45) quiere decir que la longitud es de 45, el not null es para que no reciba valores nulos
Apellido Varchar (25) not null,
Edad int not null, #// tipo de dato entero
Direccion_Residencia varchar (50) #// longitud maxima de caracteres es de 50 
);
INSERT INTO ALumnos (IdAlumno,Nombre,Apellido,Edad,Direccion_Residencia) VALUES ('3011','Jesús','Barajas','27','Carrera 47A # 75 - 48 Sur');
INSERT INTO ALumnos (IdAlumno,Nombre,Apellido,Edad,Direccion_Residencia) VALUES ('2023','José','Barajas','17','Carrera 47A # 75 - 48 Sur');

SELECT * FROM Alumnos; #// Deja ver todo el contenido en la tabla alumnos pero tambien contenido especifico
SELECT Edad FROM Alumnos; #// Deja solo ver las edades de la tabla alumnos

DESCRIBE Alumnos; #// Deja ver todo el contenido de la tabla alumnos pero no lo que tiene dentro
#DELETE FROM Alumnos WHERE Nombre = 'Jesús'; # Bora registros

UPDATE Alumnos #Lo que hace es que si tengo un registro con su valor lo puedo cambiar o actualizar con estas lineas de codigo
SET Apellido = 'Sotelo'
WHERE IdAlumno ='2023';

#UPDATE Alumnos
#SET Edad = '2';
#WHERE IdAlumno ='2023';

ALTER TABLE Alumnos ADD email varchar(30); #// Agrega campos o columnas
ALTER TABLE Alumnos DROP COLUMN email;
