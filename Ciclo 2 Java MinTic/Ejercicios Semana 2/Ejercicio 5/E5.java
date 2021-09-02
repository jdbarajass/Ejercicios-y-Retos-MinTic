class E5{
    public static int [] sumaVectorial(int [] v1, int [] v2){
        int [] vs = new int[v1.length];
        for(int i = 0; i<v1.length; i++){
            vs[i] = v1[i] + v2[i];
        }       
        return vs;
    }
}