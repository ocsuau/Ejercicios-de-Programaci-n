/**
 * Created by Oscar on 04/10/2016.
 */
public class numeros_primeros1 {
    public static void main(String[] args) {
        System.out.println("Llista de numeros primers: ");
        for(int n=1; n<100; n++) {


            if (esprimer(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    static boolean esprimer(int n){
        boolean primer = true;
        if (n > 3) {
            if (n % 2 == 0 || n % 3 == 0) {
                primer = false;
            } else {
                for(int i=5; i <= n; i+=2) {
                    if (n % i == 0) {
                        primer = false;
                        break;
                    }
                }
            }
        }
        return primer;
    }
}
