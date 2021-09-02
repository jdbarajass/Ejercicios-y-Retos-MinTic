#Creadmos la base de datos
CREATE DATABASE IF NOT EXISTS base_peliculas;
# Selecionamos la base de datos que queremos programar o tambien podemos darle doble click a la base de datos
USE base_peliculas;
# Debemos siempre primero crear las tablas que no tienen relacion entre si
 #Creamos las tablas sin relacion
 
 CREATE TABLE IF NOT EXISTS peliculas(
	 id_pelicula INT NOT NULL,
	 titulo varchar(45),
	 anio DATE,
	 nacionalidad varchar(20),
	 idioma varchar(120),
	 formato ENUM('BLANCO Y NEGRO', 'COLOR'), # ENUM nos permite guardar varios valores separados por comillas simples
	 descripcion varchar(120),
	 resumen varchar(255),
	 observaciones varchar (255),
 primary key (id_pelicula) # Una llave primaria no puede ser nula y no puede repetirse en otro registro dentro de la misma tabla
 )ENGINE = INNODB; # Siemopre que vamos a trabajar con tablas, con procedimiendo de almacenado,
 #con funciones, con trasacciones, el motor con el que debe ser creada debe ser con INNODB 
 
 #Creamos la otra tabla de datos
 CREATE TABLE IF NOT EXISTS actrices(
	 id_actor INT NOT NULL,
	 nombre VARCHAR (45) NOT NULL,
	 nacionalidad VARCHAR (45),
	 nombre_personaje VARCHAR (45),
 PRIMARY KEY (id_actor) 
 )ENGINE = INNODB;
 
 #Creamos otra tabla de datos
 CREATE TABLE IF NOT EXISTS directores(
	id_director INT NOT NULL,
	nombre VARCHAR (120) NOT NULL,
	fecha_nacimiento DATE,
	pais_origen VARCHAR (120),
	PRIMARY KEY (id_director), 
	#Vamos a crear la llave foreign (foranea) Es la que va a hacer que una tabla tenga relacion con otra
	peliculas_id_pelicula INT NOT NULL,  # Campo que nos sirve para referenciar a la tabla peliculas
# Nombre del campo que se va a relacionar con la tabla pelicula
#Un director puede dirigir muchas peliculas pero una pelicula solo puede estar dirigida por un director
# Por eso se crea la llave foranea en directores
CONSTRAINT fkdirector_peliculas # Nombre con el que va a aparecer en Foreign Keys
FOREIGN KEY (peliculas_id_pelicula) # Nombre del campo al que referencia
REFERENCES peliculas(id_pelicula) # Refencia a la tabla peliculas al campo id_pelicula 
)ENGINE = INNODB; # Estamos creando un campo que nos sirve para referencia a la tabla pelicula

# Nos falta crear la tabla relacionada y como entre pelicula y director hay una relacion de muchos a muchos porque
# Una pelicula puede tener muchos actores y un actor puede trabajar en muchas peliculas 
# Entonces eso hace que se nos cree una tabla intermedia entre ambas a la cual vamos a llamar actores peliculas

CREATE TABLE IF NOT EXISTS actores_peliculas(
		peliculas_id_pelicula INT NOT NULL,
		actores_id_actor INT NOT NULL,
		#Ya que las tablas estan refenciadas el nombre del titulo lo podemos traer de la tabla pelicula
		# Vamos a empezar a crear la relacion
		PRIMARY KEY(peliculas_id_pelicula,actores_id_actor), #Llave compuesta, una llave que la compone mas de una campo y van separados por coma
	CONSTRAINT fkactor_peliculas_actor
	FOREIGN KEY (actores_id_actor)# Ademas de ser llaves primarias tambien son llaves foraneas
	REFERENCES actrices(id_actor), # Referencia a que tabla y a que campo y lleva coma al final porque vamos a empezar otro foregn key
CONSTRAINT fkactor_actor_peliculas
FOREIGN KEY (peliculas_id_pelicula)
REFERENCES peliculas(id_pelicula)
)ENGINE = INNODB;

