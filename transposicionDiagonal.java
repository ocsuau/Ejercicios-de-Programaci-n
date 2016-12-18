import java.util.Arrays;

/**
 * Created by Oscar on 18/12/2016.
 */
public class transposicionDiagonal {
    static String transpoDiagonal(String mensaje, int dim) {
        //Creamos la matriz donde meteremos el mensaje.
        char[][] matriz = new char[(int) (Math.ceil((double) mensaje.length() / (double) dim))][dim];
        asignar_valores(matriz, mensaje);
        return crear_cifrado(matriz);
    }

    static void asignar_valores(char[][] matriz, String mensaje) {
        int contador = 0;
        bucle:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++, contador++) {
                if (contador == mensaje.length()) {
                    break bucle;
                }
                matriz[i][j] = mensaje.charAt(contador);
            }
        }
    }

    static String crear_cifrado(char[][] matriz) {
        StringBuilder resultado = new StringBuilder();
        int x, y;
        int xx = 0;
        int yy = matriz[xx].length - 1;
        int contador = matriz[0].length;
        int pasadas = 1;
        while (xx < matriz.length) {
            x = xx;
            for (y = yy; y < contador; y++, x++) {
                if (matriz[x][y] != 0) {
                    resultado.append(matriz[x][y]);
                }
            }
            if (yy == 0) {
                xx++;
            } else {
                yy--;
            }
            if (pasadas == matriz.length) {
                contador--;
            } else {
                pasadas++;
            }
        }
        return resultado.toString();
    }
}
