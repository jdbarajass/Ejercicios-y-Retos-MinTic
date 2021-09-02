//EL CALIFICADOR GENERARÃ? ERROR SI USTED NO IMPLEMENTA TODOS LOS MÃ‰TODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;

public class Condominio {

    //Inserte acÃ¡ los atributos
    private ArrayList<Inmueble> inmuebles = new ArrayList<>(); // Guarda la lista de las casas ya arrendadas 

    //Inserte acÃ¡ el mÃ©todo constructor
    public Condominio() {
        this.inmuebles = new ArrayList<>(); // puede o no puede usar el this
    }

    //Inserte acÃ¡ los SETTERS Y GETTERS
    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
    public void agregarInmueble(Inmueble i) { //Es el inmueble por agregar a la lista inmuebles
        //Agrega el inmueble recibido como parámetro a la lista inmuebles si este NO está en la lista (Dos inmuebles son 
        //diferentes si sus ID son diferentes)
        int verificar = 0;
        for (int j = 0; j < inmuebles.size(); j++) {
            if (inmuebles.get(j).getnCasa().equals(i.getnCasa())) { // Deberia ser que no sean iguales
                // (Dos inmuebles son diferentes si sus ID son diferentes)
                verificar += 1;
            }
        }
        if (verificar == 0) { // Si no encontro en la lista el parametro i lo agrega a la lista inmuebles
            inmuebles.add(i);
        }
    }

    public void eliminarInmueble(String ID) { //Número del inmueble a eliminar de la lista inmuebles
        // Elimina el inmueble con nCasa igual al recibido por parámetro (ID)
        if (!inmuebles.isEmpty()) {
            for (int j = 0; j < inmuebles.size(); j++) { // Pongo menor o igual a inmuebles porque ese es el numero de inmuebles que hay
                // por lo tanto el numero de inmuebles que se podra cobrar un arriendo mensual
                if (inmuebles.get(j).getnCasa().equals(ID)) {
                    inmuebles.remove(j);//ó tambien se puede inmuebles.remove(inmuebles.get(j).getnCasa());                    
                    break;
                }
            }
        }
    }

    public double calcularArriendoMensualCondominio() { //Retorna la suma de los arriendos mensuales de todas las casas que 
        double sumaArriendos = 0;
        for (int k = 0; k < inmuebles.size(); k++) {
            sumaArriendos = sumaArriendos + inmuebles.get(k).getCostoMensual(); // 
        }
        return sumaArriendos;                                                      //hay en inmuebles
    }

    public double promedioCostoInmueble() { // Retorna el promedio del costo de arriendo de todos los inmuebles
        double sumaArriendos = 0;
        for (int k = 0; k < inmuebles.size(); k++) {
            sumaArriendos = sumaArriendos + inmuebles.get(k).getCostoMensual(); // 
        }
        return sumaArriendos / inmuebles.size();
    }

    public double desviacionEstandarCostoInmueble() { //Retorna la desviación estándar del costo de arriendo de todos los inmuebles
        //Donde 𝑛 es el número de muestras a considerar en el cálculo (Número de inmuebles que hay en el ArrayList), 𝑥𝑖 
        //es el costo de cada inmueble y 𝜇 es el promedio del costo del conjunto de inmuebles que hay en el ArrayList.
        // n = Número de inmuebles que hay en el ArrayList = inmuebles.size()
        // 𝑥𝑖 = es el costo de cada inmueble
        // 𝜇 = promedio del costo del conjunto de inmuebles que hay en el ArrayList
        double sumatoria = 0;
        for (int s = 1; s <= inmuebles.size(); s++) { // La ecuacion en la parte de la sumatoria dice que debemos empezar en 1
            double xi = inmuebles.get(s - 1).getCostoMensual();// ponemos s-1 porque los arrays empiezan en cero y no en 1
            double u = promedioCostoInmueble();
            sumatoria = sumatoria + Math.pow(xi - u, 2);
        }
        return Math.pow(sumatoria / inmuebles.size(), 1 / 2f); // * (Math.pow(sumatoria, 2f))
    }
}