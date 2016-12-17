import java.util.Scanner;

/**
 * Created by Oscar on 29/09/2016.
 */
public class factorial {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Dame un número ");
        int n=s.nextInt();
        int n1=n;
        int m=n;
        while (n>2){
            n--;
            m*=n;
        }
        System.out.print("El factorial de "+n1+" es "+m);
    }
}
