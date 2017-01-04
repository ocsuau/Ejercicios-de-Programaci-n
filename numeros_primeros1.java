/**
 * Created by Oscar on 04/10/2016.
 */
public class numeros_primeros1 {
    public static void main(String[] args) {
        System.out.println("Llista de numeros primers: ");
        //Imprimimos los números primos de los primeros 100 números.
        for(int n=1; n<100; n++) {
            if (esprimero(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    static boolean esprimero(int n) {
        boolean primero = true;
        if (n > 3) {
            if (n % 2 == 0 || n % 3 == 0) {
                primero = false;
            } else {
                for (int i = 5; i * i <= n; i += 2) {
                    if (n % i == 0) {
                        primero = false;
                        break;
                    }
                }
            }
        }
        return primero;
    }
}
