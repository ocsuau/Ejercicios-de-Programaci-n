import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Oscar on 20/12/2016.
 */
public class TempInferior {
    static int calcTempInf(String valores, int cantidad) {
        if (cantidad == 0) {
            return 0;
        }
        String[] temps = valores.split(" ");
        int[] tempi = new int[temps.length];
        for (int i = 0; i < temps.length; i++) {
            tempi[i] = Integer.parseInt(temps[i]);
        }
        int temp = tempi[0];
        int provisional1 = Math.abs(temp);
        boolean b = false;
        int provisional2;
        for (int i = 1; i < tempi.length; i++) {
            provisional2 = Math.abs(tempi[i]);
            if (provisional2 == provisional1) {
                b = true;
            }
            if (provisional2 < provisional1) {
                b = false;
                provisional1 = provisional2;
                temp = tempi[i];
            }
        }
        if (b && temp < 0) {
            temp *= -1;
        }
        return temp;
    }
}