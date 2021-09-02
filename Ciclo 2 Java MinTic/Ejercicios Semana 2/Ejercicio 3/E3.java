
class E3 {

    public static double mean(int[] vector) {
        float promedio;
        float suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];    
        }
        promedio = (suma / vector.length);
        return promedio;
    }
}