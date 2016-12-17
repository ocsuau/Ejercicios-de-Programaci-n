import java.util.Scanner;

/**
 * Created by Oscar on 29/09/2016.
 */
public class M_C_D
{
    static public void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Dame el primer número ");
        int a=s.nextInt();
        System.out.print("Dame el segundo número ");
        int b=s.nextInt();
        int a1=a;
        int b1=b;
        while(a!=b)
        {
            if(a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        System.out.print("El M.C.D. de "+a1+" y "+b1+" es: "+a);
    }
}
