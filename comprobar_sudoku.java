/**
 * Created by Oscar on 17/12/2016.
 */
public class comprobar_sudoku {
    static boolean sudoku(int [][] sudoku){
        //Comprobamos las filas de los tres primeros valores de la primera columna y las columnas de los tres primeros valores de la primera fila
        if(superior_izquierda(sudoku)){
            return false;
        }
        //Comprobamos las filas de los tres últimos valores de la última columna y las columnas de los tres últimos valores de la última fila.
        else if(inferior_derecha(sudoku)){
            return false;
        }
        //Comprobamos filas y columnas de todos los valores del recuadro central.
        else if(centro(sudoku)){
            return false;
        }
        return true;

        //No comprobamos la repetición de cada recuadro ya que al realizar las comprobaciones anteriores, si devolvemos true, es por que no se repiten.
    }

    static boolean superior_izquierda(int [][] sudoku){
        for(int i=0;i<3;i++){
            for(int j=0;j<sudoku.length;j++){
                for(int k=j+1;k<sudoku.length;k++){

                    //Comprobamos fila y columna i al mismo tiempo.
                    if(sudoku[i][j] == sudoku [i][k] || sudoku[j][i] == sudoku [k][i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean inferior_derecha(int [][] sudoku){
        for(int i = sudoku.length-1;i>sudoku.length-4;i--){
            for(int j = sudoku.length-1; j>0;j--){
                for(int k= j-1;k>-1;k--){
                    //Comprobamos fila y columna i al mismo tiempo
                    if(sudoku[i][j] == sudoku[i][k] || sudoku [j][i] == sudoku [k][i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean centro (int [][] sudoku){
        //Comprobamos filas y columnas de las columnas 3-6 de las filas 3-6.
        for(int i = 3; i<6;i++){
            for(int j=3;j<6;j++){
                for(int k = 0; k<sudoku.length;k++){
                    //Si la posición que estamos comprobando es la misma que la que queremos comprobar, volvemos a la condición del bucle.
                    if (k==j){
                        continue;
                    }
                    //Comprobamos fila y columna i al mismo tiempo.
                    if(sudoku[i][j] == sudoku[i][k] || sudoku [j][i] == sudoku [k][i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}