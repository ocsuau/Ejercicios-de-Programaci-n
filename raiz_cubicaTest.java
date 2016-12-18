import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oscar on 18/12/2016.
 */
public class raiz_cubicaTest {
    @Test
    public void rCubica() throws Exception {
        assertEquals(3.503, raiz_cubica.rCubica(43), 0.1);
        assertEquals(4.179, raiz_cubica.rCubica(73), 0.1);
        assertEquals(4, raiz_cubica.rCubica(64), 0.1);
    }

}