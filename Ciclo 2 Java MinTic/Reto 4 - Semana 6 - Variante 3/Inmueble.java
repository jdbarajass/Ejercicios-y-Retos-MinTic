//EL CALIFICADOR GENERARÃ? ERROR SI USTED NO IMPLEMENTA TODOS LOS MÃ‰TODOS ESPECIFICADOS EN EL ENUNCIADO
public class Inmueble {

    //Inserte acÃ¡ los atributos
    private String nCasa;//Guarda el número de la casa
    private String IDArrendador; //Guarda el documento de identidad del arrendador
    private double costoMensual; //Guarda el costo mensual de la casa
    private int cantidadMesesArrendado;//Guarda la cantidad de meses que lleva arrendada la casa

    //Inserte acÃ¡ el mÃ©todo constructor
    public Inmueble(String nCasa, String IDArrendador, double costoMensual, int cantidadMesesArrendado) {
        this.nCasa = nCasa;
        this.IDArrendador = IDArrendador;
        this.costoMensual = costoMensual;
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }

    //Inserte acÃ¡ los SETTERS Y GETTERS
    public String getnCasa() {
        return nCasa;
    }

    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }

    public String getIDArrendador() {
        return IDArrendador;
    }

    public void setIDArrendador(String IDArrendador) {
        this.IDArrendador = IDArrendador;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public int getCantidadMesesArrendado() {
        return cantidadMesesArrendado;
    }

    public void setCantidadMesesArrendado(int cantidadMesesArrendado) {
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }
}
