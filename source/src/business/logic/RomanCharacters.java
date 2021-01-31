package business.logic;

public class RomanCharacters {

    private String minimum;
    private String middle;
    private String max;

    public RomanCharacters(int weight)
    {
        fillRomanCharsNeededForWeight(weight);
    }

    public void fillRomanCharsNeededForWeight(int weight)
    {
        switch (weight)
        {
            case 0: //10**0
                minimum = "I";
                middle = "V";
                max = "X";
            break;

            case 1: //10**1
                minimum = "X";
                middle = "L";
                max = "C";
            break;

            case 2: //10**2
                minimum = "C";
                middle = "D";
                max = "M";
            break;
        }
    }

    public String getMinimum()
    {
        return minimum;
    }

    public String getMiddle()
    {
        return middle;
    }

    public String getMax()
    {
        return max;
    }
}
