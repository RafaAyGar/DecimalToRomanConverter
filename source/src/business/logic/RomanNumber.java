package business.logic;

public class RomanNumber {

    String romanNumber = "";

    public RomanNumber(DecoupledNumberInDecimal decoupledNumber)
    {

        for(int currentWeight = decoupledNumber.getMaxWeight(); currentWeight >= 0; currentWeight--)
        {
            RomanDigit digit = new RomanDigit(currentWeight, decoupledNumber.getDigitOfWeight(currentWeight));
            romanNumber += digit.toString();
        }
    }

    public String toString()
    {
        return romanNumber;
    }
}
