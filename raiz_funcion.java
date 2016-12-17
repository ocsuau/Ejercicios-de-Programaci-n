import java.util.Scanner;

/**
 * Created by Oscar on 06/10/2016.
 */
public class raiz_funcion {
    public static void main (String[]args){
        Scanner s=new Scanner (System.in);
        System.out.print("Dame un número ");
        double n=s.nextDouble();
        double r=calcraiz(n);
        imprimir(r,n);
    }
    static double calcraiz(double n){
        n=Math.sqrt(n);
        return n;
    }
    static void imprimir(double r, double n){
        System.out.print("La raíz cuadrada de "+n+" es "+r);
    }
}
