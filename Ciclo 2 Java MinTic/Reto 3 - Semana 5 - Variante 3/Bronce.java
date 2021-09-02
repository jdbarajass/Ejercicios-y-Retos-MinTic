public class Bronce extends Asiento {
    // ^ hereda de Asiento

    //Inserte acÃ¡ el mÃ©todo constructor
    public Bronce(String ID, char tipo){
        super(ID,tipo);
    }
    //Inserte acÃ¡ los mÃ©todos (NO LOS GETTER Y SETTERS)
    public String imprimirMenuPantalla() {
        return "BRONCE";//
    }
}