import static org.junit.Assert.*;

/**
 * Created by Oscar on 17/12/2016.
 */
public class comprobar_sudokuTest {
    @org.junit.Test
    public void sudoku() throws Exception {
        int [][] sudoku1 = {{5,4,7,9,1,6,2,3,8},{1,9,3,2,8,4,6,7,5},{6,2,8,7,5,3,4,9,1},{3,5,9,4,2,1,7,8,6},
                {4,6,2,5,7,8,9,1,3},{8,7,1,6,3,9,5,2,4},{9,1,6,8,4,7,3,5,2},{7,3,5,1,6,2,8,4,9},{2,8,4,3,9,5,1,6,7}};
        int [][] sudoku2 = {{5,4,7,9,1,6,2,3,8},{1,9,3,2,8,4,6,7,5},{6,2,8,7,5,3,4,9,1},{3,5,9,4,2,1,7,8,6},
                {4,6,2,5,9,8,9,1,3},{8,7,1,6,3,9,5,2,4},{9,1,6,8,4,7,3,5,2},{7,3,5,1,6,2,8,4,9},{2,8,4,3,9,5,1,6,7}};
        //En el quinto array de sudoku2, la quinta posición debería ser un 7


        assertEquals(true,comprobar_sudoku.sudoku(sudoku1));
        assertEquals(false,comprobar_sudoku.sudoku(sudoku2));

    }

}