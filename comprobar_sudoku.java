/**
 * Created by Oscar on 17/12/2016.
 */
public class comprobar_sudoku {
    static boolean sudoku(int [][] sudoku){
        if(superior_izquierda(sudoku)){
            return false;
        }
        else if(inferior_derecha(sudoku)){
            return false;
        }
        else if(centro(sudoku)){
            return false;
        }
        return true;
    }

    static boolean superior_izquierda(int [][] sudoku){
        for(int i=0;i<3;i++){
            for(int j=0;j<sudoku.length;j++){
                for(int k=j+1;k<sudoku.length;k++){
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
                    if(sudoku[i][j] == sudoku[i][k] || sudoku [j][i] == sudoku [k][i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean centro (int [][] sudoku){
        for(int i = 3; i<6;i++){
            for(int j=3;j<6;j++){
                for(int k = 0; k<sudoku.length;k++){
                    if (k==j){
                        continue;
                    }
                    if(sudoku[i][j] == sudoku[i][k] || sudoku [j][i] == sudoku [k][i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}