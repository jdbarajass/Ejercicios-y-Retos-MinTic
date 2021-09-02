
class E4 {

    public static int[] ordenamientoPersonalizado(int[] vector) {
        int aux;
        for (int i = 0; i <= (vector.length / 2) - 1; i++) {
            for (int j = 1; j <= (vector.length / 2) - 1; j++) {
                if (i >= j) {
                    j = i;
                }
                if (vector[i] > vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }

            }
        }

        for (int i = vector.length / 2; i <= vector.length - 1; i++) {
            for (int j = (vector.length / 2) + 1; j <= vector.length - 1; j++) {
                if (i >= j) {
                    j = i;
                }
                if (vector[i] < vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        return vector;
    }
}