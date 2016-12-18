import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oscar on 18/12/2016.
 */
public class transposicionDiagonalTest {
    @Test
    public void transpoDiagonal() throws Exception {
        String ori1 = "Hola, cómo va?";
        String ori2 = "Parece que hoy hace un buen día! Hay que disfrutarlo tanto como se pueda ya que,según el telediario, a partir de la semana que viene hará mucho frío!";

        assertEquals("oHal ,ócomv ?a", transposicionDiagonal.transpoDiagonal(ori1, 2));
        assertEquals("ceeru aqy P oeuehcbí a dahn Heun ufe!qsra iaaydttc u  sroo eltouanmpy,o  eneauútdqg i eld,seeoa lip er raaaila t mureeqeds ia avhun  mfee  náo!rhocír",
                transposicionDiagonal.transpoDiagonal(ori2, 5));

    }

}