package business.logic;

public class RomanDigit {

    public RomanCharacters charsNeeded;
    public int digitInDecimal;

    public RomanDigit(int weight, int decimalValue)
    {
        this.charsNeeded = getRomanCharsNeededForRepresentDigitOfWeight(weight);
        this.digitInDecimal = decimalValue;
    }

    private RomanCharacters getRomanCharsNeededForRepresentDigitOfWeight(int weight) {
        return new RomanCharacters(weight);
    }

    public String toString()
    {
        String romanDigit = "";

        if(digitInDecimalIsBetween1and3())
        {
            romanDigit = constructRomanFromDecimalBetween1and3();
        }
        else if(digitInDecimal == 4)
        {
            romanDigit = constructRomanFromDecimal4();
        }
        else if(digitInDecimal == 5)
        {
            romanDigit = constructRomanFromDecimal5();
        }
        else if(digitInDecimalIsBetween6and8())
        {
            romanDigit = constructRomanFromDecimalBetween6and8();
        }
        else if(digitInDecimal == 9)
        {
            romanDigit = constructRomanFromDecimal9();
        }

        return romanDigit;
    }

    private String constructRomanFromDecimal9()
    {
        return charsNeeded.getMinimum() + charsNeeded.getMax();
    }

    private String constructRomanFromDecimalBetween6and8()
    {
        String roman = charsNeeded.getMiddle();
        for(int i = 6; i <= digitInDecimal; i++)
        {
            roman += charsNeeded.getMinimum();
        }

        return roman;
    }

    public boolean digitInDecimalIsBetween6and8()
    {
        return digitInDecimal >= 6 && digitInDecimal <= 8;
    }

    private String constructRomanFromDecimal5()
    {
        return charsNeeded.getMiddle();
    }

    private String constructRomanFromDecimal4()
    {
        return charsNeeded.getMinimum() + charsNeeded.getMiddle();
    }

    private String constructRomanFromDecimalBetween1and3()
    {
        String roman = "";
        for(int i = 1; i <= digitInDecimal; i++)
        {
            roman += charsNeeded.getMinimum();
        }

        return roman;
    }

    public boolean digitInDecimalIsBetween1and3()
    {
        return digitInDecimal >= 1 && digitInDecimal <= 3;
    }
}
