import java.util.Scanner;

/**
 * Created by Oscar on 28/09/2016.
 */
public class raiz_cuadrada
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Dame un número ");
        double n=s.nextInt();
        int r=(int)n;
       if((n-r)>0||n==0)
       {
           System.out.print("No se puede obtener un resultado real");
       }
       else
       {
           int m;
           for(m=0;(m+1)*(m+1)<=n;m++)
           {}
           System.out.print("El resultado es "+m);
       }

    }
}
