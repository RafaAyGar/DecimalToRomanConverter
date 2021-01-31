package business.logic;

import business.util.MyPrinter;

public class DecoupledNumberInDecimal
{
    int weights;
    char[] digits;

    public DecoupledNumberInDecimal(String numberInDecimal)
    {
        digits = new char[numberInDecimal.length()];
        weights = numberInDecimal.length() - 1;

        int index = 0;
        for(int i = weights; i >= 0; i--)
        {
            digits[index] = numberInDecimal.charAt(i);
            index++;
        }
    }

    public int getMaxWeight()
    {
        return weights;
    }

    public int getDigitOfWeight(int weight)
    {
        return Integer.valueOf(String.valueOf(digits[weight]));
    }
}
