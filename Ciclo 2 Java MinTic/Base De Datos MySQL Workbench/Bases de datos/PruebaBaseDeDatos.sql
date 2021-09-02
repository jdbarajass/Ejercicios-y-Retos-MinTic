#SELECT count(platillos.id), categoria.nombre FROM platillos INNER JOIN categoria ON platillos.categoriaID = categoria.id group by categoria.nombre
# INNER JOIN relaciona una tabla con otra // GROUP BY especificamos a donde nos referimos
# count(platillos.id) // espeficicamos la columna pero tambien la tabla porque entonces no sabra a cual id apuntar
# COUNT funcion de agregacion 
#SELECT DISTINCT precio FROM platillos... order by precio desc; le puedo agregar esta parte de codigo para que me arroje los valores de forma descendiente o ascendente
#// ignora los duplicados y solo nos arroja los valores sin datos repetidos

#SELECT * FROM platillos WHERE precio BETWEEN 100 AND 200; # Selecciona todos los platillos donde el precio este entre 100 y 200
#SELECT # select es igual a mostrar
#SELECT * FROM platillos WHERE nombre LIKE 'Cafe%' # va a buscar la palabra que tenga cafe al principio y no le importa lo demas 
#// si coloco el % el principio buscara todas la palabras que terminen en cafe y no le importa lo que tenga al principio
# LIKE buscar un nombre especifico y con %Cafe% // lo que hago es buscar una palabra que contenga la palabra cafe

#SELECT * FROM reservaciones WHERE CONCAT(nombre, '', apellido) LIKE '%Ana Preciado%' 
#Unir 2 columnas con un like (aplicar like a 2 columnas)  para concatenar 2 String y buscar digamos tengo 
#nombre y apellido en columnas separadas la idea es unirlas y buscar ese nombre 
# SELECT CONCAT(nombre, '', apellido) AS 'Nombre Completo', hora, fecha , cantidadeMesa FROM reservaciones WHERE CONCAT(nombre, '', apellido) LIKE '%Ana Preciado%' 
# Lo que hace esta parte de codigo es unirme los Strings con el CONCAT en cambio del * y el AS es que le
# pone un noombre al titulo del String unido y puede colocar los otros campos de Ana Preciado
#SELECT * FROM reservaciones WHERE cantidadMesa IN (2,3) # Me deja ver solo las reversaciones para meses que estan para 2 o 3
##SELECT * FROM reservaciones WHERE fecha = '2019-07-02' AND cantidadMesa IN (2,3) # Para la fecha puesta me deja ver las reservaciones que hay para 2 y 3 personas
#IN me permite revisar multiples condiciones multiples WHERE

