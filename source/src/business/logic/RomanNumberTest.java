package business.logic;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest
{

    @Test
    public void isXIV_whenDecimalIs14()
    {
        DecoupledNumberInDecimal decoupledNumberInDecimal = new DecoupledNumberInDecimal("14");
        RomanNumber romanNumber = new RomanNumber(decoupledNumberInDecimal);

        assertEquals("XIV", romanNumber.toString());
    }

    @Test
    public void isXCVIII_whenDecimalIs98()
    {
        DecoupledNumberInDecimal decoupledNumberInDecimal = new DecoupledNumberInDecimal("98");
        RomanNumber romanNumber = new RomanNumber(decoupledNumberInDecimal);

        assertEquals("XCVIII", romanNumber.toString());
    }

    @Test
    public void isCXC_whenDecimalIs190()
    {
        DecoupledNumberInDecimal decoupledNumberInDecimal = new DecoupledNumberInDecimal("190");
        RomanNumber romanNumber = new RomanNumber(decoupledNumberInDecimal);

        assertEquals("CXC", romanNumber.toString());
    }

    @Test
    public void isDCCCLV_whenDecimalIs190()
    {
        DecoupledNumberInDecimal decoupledNumberInDecimal = new DecoupledNumberInDecimal("855");
        RomanNumber romanNumber = new RomanNumber(decoupledNumberInDecimal);

        assertEquals("DCCCLV", romanNumber.toString());
    }
}
