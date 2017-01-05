import java.util.Scanner;

/**
 * Created by Oscar on 05/01/2017.
 */
public class letreros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String palabra = s.next();
        palabra = palabra.toUpperCase();
        char[][] abc = abc4();

        pintarPalabra(abc, palabra);
    }

    static void pintarPalabra(char[][] abc, String palabra) {
        int pos;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < palabra.length(); j++) {
                pos = (int) palabra.charAt(j);
                pos -= 64;
                if (comprobarIntegridadLetra(pos)) {
                    pos = 4 * 26;
                } else {
                    pos = 4 * (pos - 1);
                }

                pintarCaracteres(abc, pos, i);
            }
            System.out.println();
        }
    }

    static boolean comprobarIntegridadLetra(int pos) {
        if (!(pos >= 1 && pos <= 26)) {
            return true;
        } else {
            return false;
        }
    }

    static void pintarCaracteres(char[][] abc, int pos, int i) {
        for (int k = 0; k < 4; k++, pos++) {
            System.out.print(abc[i][pos]);
        }
        System.out.print("   ");
    }


    static char[][] abc4() {
        char[][] retorno = new char[5][4 * 27];
        String letras1 = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###";
        String letras2 = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #";
        String letras3 = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##";
        String letras4 = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      ";
        String letras5 = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ";

        letras1.getChars(0, letras1.length(), retorno[0], 0);
        letras2.getChars(0, letras2.length(), retorno[1], 0);
        letras3.getChars(0, letras3.length(), retorno[2], 0);
        letras4.getChars(0, letras4.length(), retorno[3], 0);
        letras5.getChars(0, letras5.length(), retorno[4], 0);

        return retorno;
    }
}