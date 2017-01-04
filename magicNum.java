import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Oscar on 27/12/2016.
 */
public class magicNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime tu fecha de nacimiento.");
        String fecha = s.nextLine();
        int dia = convertirNum(fecha.substring(0, fecha.indexOf(' ')), true);
        int year = convertirNum(fecha.substring(fecha.length() - 4), true);
        int mes = convertirMes(fecha.substring(fecha.indexOf(' ', fecha.indexOf(' ') + 1) + 1, fecha.length() - 8));
        if (comprobarIntegridadTotal(dia, mes, year)) {
            throw new RuntimeException("Los valores que has introducido no son válidos");
        }
        System.out.printf("Tu número de la suerte es %s\n", calcularNumSuerte(dia + mes + year));
    }

    static int convertirNum(String num, boolean b) {
        int contenedor;
        int retorno = 0;
        int div = 1;
        if (num.length() > 1) {
            div *= Math.pow(10, num.length() - 1);
        }
        for (int i = 0; i < num.length(); i++, div /= 10) {
            contenedor = num.charAt(i);
            comprobarIntegridadIndividual(contenedor, num.length());
            contenedor -= 48;
            if (b) {
                contenedor *= div;
            }
            retorno += contenedor;
        }
        return retorno;
    }

    static int convertirMes(String mes) {
        switch (mes) {
            case "enero":
                return 1;
            case "febrero":
                return 2;
            case "marzo":
                return 3;
            case "abril":
                return 4;
            case "mayo":
                return 5;
            case "junio":
                return 6;
            case "julio":
                return 7;
            case "agosto":
                return 8;
            case "setiembre":
            case "septiembre":
                return 9;
            case "octubre":
                return 10;
            case "noviembre":
                return 11;
            case "diciembre":
                return 12;
            default:
                throw new RuntimeException("Mes introducido incorrectamente");
        }
    }

    static void comprobarIntegridadIndividual(int contenedor, int longitud) {
        if (!(contenedor >= '0' && contenedor <= '9')) {
            throw new RuntimeException((longitud == 4) ? "Año introducido incorrectamente" : "Día introducido incorrectamente");
        }
    }

    static boolean comprobarIntegridadTotal(int dia, int mes, int year) {
        boolean b = false;
        Calendar fecha = Calendar.getInstance();
        int annioActual = fecha.get(Calendar.YEAR);
        int mesActual = fecha.get(Calendar.MONTH) + 1;
        int diaActual = fecha.get(Calendar.DAY_OF_MONTH);
        if (dia < 1 || year < 1 || dia > 31 || year > annioActual) {
            b = true;
        } else if (year == annioActual && mes > mesActual) {
            b = true;
        } else if (year == annioActual && mes == mesActual && dia > diaActual) {
            b = true;
        } else if (concordanciaDiaMes(dia, mes, year)) {
            b = true;
        }
        return b;
    }

    static boolean concordanciaDiaMes(int dia, int mes, int year) {
        int yearbisiesto = (year / 100) * 100;
        yearbisiesto = year - yearbisiesto;
        boolean b = false;
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) {
            b = true;
        } else if (mes == 2) {
            if (dia > 29 || (yearbisiesto % 4 != 0 && dia > 28)) {
                b = true;
            }
        }
        return b;
    }

    static String calcularNumSuerte(int suerte) {
        StringBuilder sb = new StringBuilder(suerte);
        sb.append(suerte);
        if (sb.length() == 1) {
            return sb.toString();
        } else {
            return calcularNumSuerte(convertirNum(sb.toString(), false));
        }
    }
}