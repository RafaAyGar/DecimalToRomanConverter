package business.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class DecoupledNumberInDecimalTest {

    @Test
    public void worksWithOneDigitNumbers()
    {
        DecoupledNumberInDecimal decoupledNumber = new DecoupledNumberInDecimal("1");

        assertEquals(1, decoupledNumber.getDigitOfWeight(0));
        assertEquals(0, decoupledNumber.getMaxWeight());
    }

    @Test
    public void worksWithTwoDigitNumbers()
    {
        DecoupledNumberInDecimal decoupledNumber = new DecoupledNumberInDecimal("25");

        assertEquals(5, decoupledNumber.getDigitOfWeight(0));
        assertEquals(2, decoupledNumber.getDigitOfWeight(1));
        assertEquals(1, decoupledNumber.getMaxWeight());
    }

    @Test
    public void worksWithSixDigitNumbers()
    {
        DecoupledNumberInDecimal decoupledNumber = new DecoupledNumberInDecimal("253487");

        assertEquals(7, decoupledNumber.getDigitOfWeight(0));
        assertEquals(8, decoupledNumber.getDigitOfWeight(1));
        assertEquals(4, decoupledNumber.getDigitOfWeight(2));
        assertEquals(3, decoupledNumber.getDigitOfWeight(3));
        assertEquals(5, decoupledNumber.getDigitOfWeight(4));
        assertEquals(2, decoupledNumber.getDigitOfWeight(5));

        assertEquals(5, decoupledNumber.getMaxWeight());
    }
}
