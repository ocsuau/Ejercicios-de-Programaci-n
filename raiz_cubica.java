/**
 * Created by Oscar on 18/12/2016.
 */
public class raiz_cubica {
    static double rCubica(int numero) {
        double retorno = 0;
        double incremento = 1;
        for (int i = 0; i < 4; i++) {
            retorno = calcular_raiz(retorno, incremento, numero);
            incremento /= 10;
        }
        return retorno;
    }

    static double calcular_raiz(double retorno, double incremento, int numero) {
        while (((retorno + incremento) * (retorno + incremento) * (retorno + incremento)) <= numero) {
            retorno += incremento;
        }
        return retorno;
    }
}
