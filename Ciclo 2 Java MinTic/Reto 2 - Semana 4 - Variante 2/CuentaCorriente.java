
public class CuentaCorriente extends CuentaBanco {

    //Inserte acÃ¡ los atributos
    //Inserte acÃ¡ el mÃ©todo constructor
    //Inserte acÃ¡ los SETTERS Y GETTERS
    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
//    public CuentaCorriente(String numeroCuenta, String nombrePropietario, double saldo) {
//        super(numeroCuenta, nombrePropietario, saldo);
//    }
    //Inserte acÃ¡ los atributos
    double cuotaManejo; // Es la cantidad acordada que debe de pagar el usuario cada mes por el uyso de la cuenta

    //Inserte acÃ¡ el mÃ©todo constructor
    public CuentaCorriente(String numeroCuenta, String nombrePropietario, double saldo, double cuotaManejo) {
        super(numeroCuenta, nombrePropietario, saldo);
        this.cuotaManejo = cuotaManejo;
    }
    //Inserte acÃ¡ los SETTERS Y GETTERS

    public double getCuotaManejo() {
        return cuotaManejo;
    }

    public void setCuotaManejo(double cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }

    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
    public void cobrarCuotaManejo() { // Resta al saldo el valor de la cuota de manejo
        setSaldo(getSaldo() - this.cuotaManejo);
    }
}
