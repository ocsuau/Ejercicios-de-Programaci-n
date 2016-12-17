import java.util.Scanner;

/**
 * Created by Oscar on 28/09/2016.
 */
public class verano
{
    static public void main (String[] args)
    {
        int m;
        int d;
        Scanner s = new Scanner(System.in);
        System.out.print("Dame el mes del año en número");
        m = s.nextInt();
        System.out.print("Ahora dame el día");
        d = s.nextInt();
        if (m <= 0 || m > 12 || d <= 0 || d > 31)
        {
            System.out.print("No seas pardal, dame bien los números");
        }
        else
        {
            boolean verano;
            verano = ((m == 7 || m == 8) || (m == 6 && d >= 21) || (m == 9 && d <= 21));
            String rf = (verano) ? "Sí!!, es verano!!!" : "Ouch, no es verano";
            System.out.print(rf);
        }
    }
}
