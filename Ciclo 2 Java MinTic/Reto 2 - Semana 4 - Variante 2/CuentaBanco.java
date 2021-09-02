public class CuentaBanco {

    //Inserte acÃ¡ los atributos
    private String numeroCuenta; // numero que identifica la cuenta bancaria
    private String nombrePropietario; // Es el nombre del propietario
    private double saldo; // Es el valor de dinero que tiene el usuario en la cuenta

    //Inserte acÃ¡ el mÃ©todo constructor
    public CuentaBanco(String numeroCuenta, String nombrePropietario, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
    }

    //Inserte acÃ¡ los SETTERS Y GETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
    public void depositar(double c) {// C = Cantidad de dinero a depositar
        this.saldo = this.saldo + c;
    }

    public void retirar(double c) {// C = Cantidad de dinero a retirar // Por cada retiro el banco cobra el 5% del valor a retirar (comisión)
        if (c + 0.05 * c <= this.saldo) {
            this.saldo = this.saldo - (c + 0.05 * c);
            //this.saldo = this.saldo - c; //Este es el mio
        }
    }
}
