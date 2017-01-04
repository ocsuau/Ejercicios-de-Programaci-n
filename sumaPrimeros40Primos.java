
/**
 * Created by Oscar on 27/12/2016.
 */
public class sumaPrimeros40Primos {
    public static void main(String[] args) {
        //Imprimimos la suma de los primeros 40 números primos
        int resultado = 0;
        bucle:
        for (int i = 0, ninicial = 1; i < 40; ninicial++) {
            if ((ninicial % 2 == 0 && ninicial != 2) || (ninicial % 3 == 0 && ninicial != 3)) {
                continue;
            } else if (ninicial > 3) {
                for (int j = 5; j * j <= ninicial; j += 2) {
                    if (ninicial % j == 0) {
                        continue bucle;
                    }
                }
            }
            resultado += ninicial;
            i++;
        }
        System.out.print(resultado);
    }
}