package business.logic;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class RomanDigitTest {

    @Test
    public void get_I_V_X_whenWeightisZero()
    {
        RomanDigit digit = new RomanDigit(0, 0);

        assertEquals("I", digit.charsNeeded.getMinimum());
        assertEquals("V", digit.charsNeeded.getMiddle());
        assertEquals("X", digit.charsNeeded.getMax());
    }

    @Test
    public void get_X_L_C_whenWeightisOne()
    {
        RomanDigit digit = new RomanDigit(1, 0);

        assertEquals("X", digit.charsNeeded.getMinimum());
        assertEquals("L", digit.charsNeeded.getMiddle());
        assertEquals("C", digit.charsNeeded.getMax());
    }

    @Test
    public void getCorrectRomanNumber_whenDecimalIsBetween1and3WithWeight0()
    {
        RomanDigit digitToRepresent1WithWeight0 = new RomanDigit(0, 1);
        assertEquals("I", digitToRepresent1WithWeight0.toString());

        RomanDigit digitToRepresent2WithWeight0 = new RomanDigit(0, 2);
        assertEquals("II", digitToRepresent2WithWeight0.toString());

        RomanDigit digitToRepresent3WithWeight0 = new RomanDigit(0, 3);
        assertEquals("III", digitToRepresent3WithWeight0.toString());
    }

    public void getCorrectRomanNumber_whenDecimalIsBetween1and3WithWeight1()
    {
        RomanDigit digitToRepresent1WithWeight1 = new RomanDigit(1, 1);
        assertEquals("X", digitToRepresent1WithWeight1.toString());

        RomanDigit digitToRepresent2WithWeight1 = new RomanDigit(1, 2);
        assertEquals("XX", digitToRepresent2WithWeight1.toString());

        RomanDigit digitToRepresent3WithWeight1 = new RomanDigit(1, 3);
        assertEquals("XXX", digitToRepresent3WithWeight1.toString());
    }

    @Test
    public void getCorrectRomanNumber_whenDecimalIs4()
    {
        RomanDigit digitToRepresent4WithWeight0 = new RomanDigit(0, 4);
        assertEquals("IV", digitToRepresent4WithWeight0.toString());

        RomanDigit digitToRepresent4WithWeight1 = new RomanDigit(1, 4);
        assertEquals("XL", digitToRepresent4WithWeight1.toString());
    }

    @Test
    public void getCorrectRomanNumber_whenDecimalIs5()
    {
        RomanDigit digitToRepresent5WithWeight0 = new RomanDigit(0, 5);
        assertEquals("V", digitToRepresent5WithWeight0.toString());

        RomanDigit digitToRepresent5WithWeight1 = new RomanDigit(1, 5);
        assertEquals("L", digitToRepresent5WithWeight1.toString());
    }

    @Test
    public void getCorrectRomanNumber_whenDecimalIsBetween6and8WithWeight0()
    {
        RomanDigit digitToRepresent6WithWeight0 = new RomanDigit(0, 6);
        assertEquals(false, digitToRepresent6WithWeight0.digitInDecimalIsBetween1and3());
        assertEquals(true, digitToRepresent6WithWeight0.digitInDecimalIsBetween6and8());
        assertEquals("VI", digitToRepresent6WithWeight0.toString());

        RomanDigit digitToRepresent7WithWeight0 = new RomanDigit(0, 7);
        assertEquals("VII", digitToRepresent7WithWeight0.toString());

        RomanDigit digitToRepresent8WithWeight0 = new RomanDigit(0, 8);
        assertEquals("VIII", digitToRepresent8WithWeight0.toString());
    }

    public void getCorrectRomanNumber_whenDecimalIsBetween6and8WithWeight1()
    {
        RomanDigit digitToRepresent6WithWeight1 = new RomanDigit(1, 6);
        assertEquals("LX", digitToRepresent6WithWeight1.toString());

        RomanDigit digitToRepresent7WithWeight1 = new RomanDigit(1, 7);
        assertEquals("LXX", digitToRepresent7WithWeight1.toString());

        RomanDigit digitToRepresent8WithWeight1 = new RomanDigit(1, 8);
        assertEquals("LXXX", digitToRepresent8WithWeight1.toString());
    }

    public void getCorrectRomanNumber_whenDecimalIs9()
    {
        RomanDigit digitToRepresent9 = new RomanDigit(0, 9);
        assertEquals("IX", digitToRepresent9.toString());

        RomanDigit digitToRepresent90 = new RomanDigit(1, 9);
        assertEquals("XC", digitToRepresent90.toString());
    }
}
