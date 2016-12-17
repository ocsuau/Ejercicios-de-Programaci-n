import java.util.Scanner;

/**
 * Created by Oscar on 30/09/2016.
 */
public class m_c_m2 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Dame el primer número ");
        int a=s.nextInt();
        System.out.print("Dame el segundo número ");
        int b=s.nextInt();
        int a1=a;
        int b1=b;
        int n=0;
        while(a!=b){
            if (a<b){a+=a1;}
            else {b+=b1;}
        }
        System.out.print("El m.c.m. de "+a1+" y "+b1+" es "+a);
    }

}
