
public class CuentaAhorro extends CuentaBanco {

    //Inserte acÃ¡ el mÃ©todo constructor
    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
    public CuentaAhorro(String numeroCuenta, String nombrePropietario, double saldo) {
        super(numeroCuenta, nombrePropietario, saldo);
    }

    //Inserte acÃ¡ el mÃ©todo constructor
    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
//    public void pagarInteres(int dias) {// La cantidad de días que han pasado con el saldo constante
//        // Suma al saldo el interés diario por cada día transcurrido
//        // El banco reconoce interes diarios sobre saldos diarios
//        if (dias >= 1) {
//            setSaldo(getSaldo() + (getIEA() * dias));
//        }
//    }
//
//    public double getIEA() { // IEA = Interes Efectivo Anual
//        double IEA = 0;
//        if (getSaldo() < 1000000) {
//            IEA = (getSaldo() * 0.01) / 365;
//        } else if (getSaldo() >= 1000000 && getSaldo() <= 2000000) {
//            IEA = (getSaldo() * 0.0175) / 365;
//        } else if (getSaldo() >= 2000000) {
//            IEA = (getSaldo() * 0.023) / 365;
//        }
//        return IEA; // Retorna el valor de la tasa de IEA correspondiente según las condiciones expuestas anteriormente
//    }
    public double getIEA() {

        double valor = 0;

        if (getSaldo() < 1000000) {
            valor = 0.01;
        } else if (getSaldo() >= 1000000 && getSaldo() < 2000000) {
            valor = 0.0175;
        } else if (getSaldo() >= 2000000) {
            valor = 0.023;
        }
        return valor;

    }

    public void pagarInteres(int dias) {
        if (dias >= 1) {
            for (int i = 1; i <= dias; i++) {
                setSaldo(getSaldo() * (1 + getIEA() / 365));
            }

        }
    }

}
