/**
 * Created by Oscar on 05/01/2017.
 */
public class codNorris {
    static String norrisCod(String clave) {
        StringBuilder bin = new StringBuilder(pasarLetraBin(clave));
        return codificarMensaje(bin.toString());
    }

    static String codificarMensaje(String bin) {
        boolean b = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bin.length(); i++) {
            if (b) {
                if (bin.charAt(i) == '1') {
                    sb.append("0 0");
                } else {
                    sb.append("00 0");
                }
                b = false;
            } else {
                if (bin.charAt(i) == bin.charAt(i - 1)) {
                    sb.append('0');
                } else {
                    sb.append(' ');
                    i--;
                    b = true;
                }
            }
        }
        return sb.toString();
    }

    static String pasarLetraBin(String palabra) {
        StringBuilder sb = new StringBuilder();
        String numBin;
        for (int i = 0; i < palabra.length(); i++) {
            numBin = Integer.toBinaryString(palabra.charAt(i));
            sb.append(comprobarBits(numBin));
        }
        return sb.toString();
    }

    static String comprobarBits(String numBin) {
        while (numBin.length() != 7) {
            numBin = '0' + numBin;
        }
        return numBin;
    }

    //Parte de la decodificación

    static String deNorrisCod(String mensaje) {
        String[] message = mensaje.split(" ");
        StringBuilder sb = new StringBuilder();
        int bitsD = 7;
        sb.append(crearBinStr(message));
        return decodMensaje(sb.toString(), bitsD);
    }

    static String crearBinStr(String[] message) {
        StringBuilder retorno = new StringBuilder();
        int num;
        for (int i = 0; i < message.length; i++) {
            num = (message[i].length() == 1) ? 1 : 0;
            i++;
            retorno.append(addBits(num, message[i]));
        }
        return retorno.toString();
    }

    static String addBits(int num, String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append(num);
        }
        return sb.toString();
    }

    static String decodMensaje(String binario, int bitsD) {
        String provisional;
        StringBuilder retorno = new StringBuilder();
        for (int i = 0; i < binario.length(); i += bitsD) {
            provisional = binario.substring(i, i + bitsD);
            retorno.append((char) Integer.parseInt(provisional, 2));
        }
        return retorno.toString();
    }
}