import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Oscar on 20/12/2016.
 */
public class TempInferior {
    static int calcTempInf(String valores, int cantidad) {
        if (cantidad <= 0) {
            return 0;
        }
        String[] ars = stringAarray(valores, cantidad);
        int[] valoresenteros = transformarArray(ars, cantidad);
        return cercanaCero(valoresenteros);
    }

    static String[] stringAarray(String valores, int cantidad) {
        String[] ars = new String[cantidad];
        Arrays.fill(ars, "");
        int contador = 0;
        for (int i = 0; i < valores.length(); i++) {
            if (valores.charAt(i) == ' ') {
                contador++;
            } else {
                ars[contador] += valores.charAt(i);
            }
        }
        return ars;
    }

    static int[] transformarArray(String[] ars, int cantidad) {
        int contcaracter;
        int provisional;
        int nprovi;
        int[] valoresenteros = new int[cantidad];
        for (int i = 0; i < ars.length; i++) {
            contcaracter = comprobarNegativos(ars[i]);

            provisional = comprobarNDigitos(contcaracter);

            for (int j = ars[i].length() - contcaracter; j < ars[i].length(); j++) {

                valoresenteros[i] += calcularValores(ars[i].charAt(j), provisional);
                provisional /= 10;
            }
            if (contcaracter < ars[i].length()) {
                valoresenteros[i] *= -1;
            }
        }
        return valoresenteros;
    }

    static int comprobarNegativos(String valor) {
        int contcaracter = valor.length();
        if (valor.startsWith("-")) {
            contcaracter--;
        }
        return contcaracter;
    }

    static int comprobarNDigitos(int contcaracter) {
        int provisional = 1;
        if (contcaracter > 1) {
            provisional *= Math.pow(10, (contcaracter - 1));
        }
        return provisional;
    }

    static int calcularValores(char caracterN, int provisional) {
        int nprovi = caracterN;
        nprovi -= 48;
        return (nprovi *= provisional);
    }

    static int cercanaCero(int[] valoresenteros) {
        int contenedor = valoresenteros[0];
        int resta = Math.abs(0 - contenedor);
        boolean contador = false;
        int resta2;
        for (int i = 1; i < valoresenteros.length; i++) {
            resta2 = Math.abs(0 - valoresenteros[i]);
            if (resta2 < resta) {
                resta = resta2;
                contenedor = valoresenteros[i];
                contador = false;
            } else if (resta2 == resta) {
                if ((contenedor < 0 && valoresenteros[i] > 0) || (contenedor > 0 && valoresenteros[i] < 0)) {
                    contador = true;
                }
            }
        }
        if (contador && contenedor < 0) {
            contenedor *= -1;
        }
        return contenedor;
    }
}