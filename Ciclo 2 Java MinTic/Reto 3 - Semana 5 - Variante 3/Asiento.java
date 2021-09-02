//EL CALIFICADOR GENERARÃ� ERROR SI USTED NO IMPLEMENTA TODOS LOS MÃ‰TODOS ESPECIFICADOS EN EL ENUNCIADO

public abstract class Asiento {

    //Inserte acÃ¡ los atributos
    char tipo; // Tipo de asiento (‘b’ para bronce, ‘p’ para plata y ‘o’ para oro)
    String ID; // Identificación del asiento dentro del avión
    boolean pantallaEncendida = false; // true si la pantalla está encendida y false en
    // caso de que la pantalla no esté encendida
    double inclinacionSilla = 90; // Grado de inclinación de la silla del usuario, este 
    // puede ir desde los 0 a 135 ( Launidad de medida es en grados) 
    boolean luzLecturaEncendida = false; //true si la luz de lectura está encendida, y false
    //en caso de que la luz de lectura no esté encendida

    boolean luzAsistenciaEncendida = false; //true si la luz de asistencia está encendida, y false en
    //caso de que la luz de asistencia no esté encendida
    boolean aireAcondicionadoEncendido = false; //true si el aire acondicionado está
    //encendido, y false en caso de que el aire acondicionado no esté encendido

    //Inserte acÃ¡ el mÃ©todo constructor
    public Asiento(String ID, char tipo) {
        this.tipo = tipo;
        this.ID = ID;
    }
    //Inserte acÃ¡ los SETTERS Y GETTERS

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncendida() {
        return luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }

    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
    public void gestionarAireAcondicionado() { //Si el aire acondicionado está
        //apagado, lo enciende,y si el aire acondicionado está encendido, lo apaga    
        if (aireAcondicionadoEncendido) {
            aireAcondicionadoEncendido = false;
        } else {
            aireAcondicionadoEncendido = true;
        }
    }

    public void gestionarPantalla() { //Si la pantalla está apagada, la enciende, y
        //si la pantalla está encendida, la apaga
        if (pantallaEncendida) {
            pantallaEncendida = false;
        } else {
            pantallaEncendida = true;
        }
    }

    public void gestionarLuzLectura() {//Si la luz de lectura está apagada, la enciende, y
        //si la luz de lectura está encendida, la apaga
        if (luzLecturaEncendida) {
            luzLecturaEncendida = false;
        } else {
            luzLecturaEncendida = true;
        }
    }

    public void gestionarLuzAsistencia() { // Si la luz de asistencia está apagada, la
        //enciende, y si la luz de asistencia está encendida, la apaga
        if (luzAsistenciaEncendida) {
            luzAsistenciaEncendida = false;
        } else {
            luzAsistenciaEncendida = true;
        }
    }

    public void aumentarInclinacion(double d) { //CAntidad de grados a aumentar // 
        //Suma d a inclinacionSilla (Nunca sobrepasando 
        // el límite especificado)
        if (d >= 0 && d <= 135) {
            this.inclinacionSilla += d;
            if (this.inclinacionSilla > 135) {
                this.inclinacionSilla = 135;
            }
        }
        if (d > 135) {
            this.inclinacionSilla = 135;
        }

    }

    public void disminuirInclinacion(double d) { //Cantidad de grados a disminuir
        // Resta d a inclinacionSilla (Nunca sobrepasando el límite especificado)
        if (d >= 0 && d <= 135) {
            this.inclinacionSilla -= d;
            if (this.inclinacionSilla < 0) {
                this.inclinacionSilla = 0;
            }
        }
        if (d <= 0 && d >= 135) {
            this.inclinacionSilla = 0;
        }
//        if (d < this.inclinacionSilla) {
//            this.inclinacionSilla -= d;
//
//        }
//
//        if (d > this.inclinacionSilla) {
//            this.inclinacionSilla = 0;
//        }
    }

    public abstract String imprimirMenuPantalla();
}
