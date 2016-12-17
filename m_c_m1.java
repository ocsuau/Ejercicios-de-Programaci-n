import java.util.Scanner;

/**
 * Created by Oscar on 29/09/2016.
 */
public class m_c_m1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
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
        int r=(a1*b1)/a;
        System.out.print("El m.c.d. de "+a1+" y "+b1+" es: "+r);
    }
}
