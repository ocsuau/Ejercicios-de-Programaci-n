import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oscar on 21/12/2016.
 */
public class TempInferiorTest {
    @Test
    public void calcTempInf() throws Exception {
        String ori1 = "3 -8 123 -643 -2 4";
        String ori2 = "3 1 -4 -1 49 2 45 6 23 5 192";
        String ori3 = "54 29 -14 39 14";

        assertEquals(-2, TempInferior.calcTempInf(ori1, 6));
        assertEquals(1, TempInferior.calcTempInf(ori2, 11));
        assertEquals(14, TempInferior.calcTempInf(ori3, 5));
        assertEquals(0, TempInferior.calcTempInf("", 0));
    }

}