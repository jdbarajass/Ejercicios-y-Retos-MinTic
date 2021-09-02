//package ciclo;
import java.util.Scanner;
public class Ciclo{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        int a;
        long suma = 1L;
        System.out.print("");
        a = numero.nextInt();
        for (int i = 1; i <= a; i++){
            suma = suma *i;
        }
        
        System.out.println(suma);
    }
}