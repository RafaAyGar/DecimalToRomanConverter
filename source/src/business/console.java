package business;

import business.logic.DecoupledNumberInDecimal;
import business.logic.RomanNumber;
import business.util.MyPrinter;
import business.util.DecimalNumberScanner;

public class console {

    public static void main(String[] args)
    {
        while(true)
        {
            String decimalNumber;

            MyPrinter.print("Escriba el número en base decimal:");
            decimalNumber = DecimalNumberScanner.scan();

            DecoupledNumberInDecimal decoupledNumberInDecimal = new DecoupledNumberInDecimal(decimalNumber);
            RomanNumber romanNumber = new RomanNumber(decoupledNumberInDecimal);

            MyPrinter.print("El número " + decimalNumber + " en romano es " + romanNumber.toString());
            MyPrinter.print("________________________________________");
        }
    }
}
