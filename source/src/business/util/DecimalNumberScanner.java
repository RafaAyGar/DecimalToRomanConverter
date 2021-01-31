package business.util;

import java.util.Scanner;

public class DecimalNumberScanner {

    public static String scan()
    {
        String valueRead = readValue();

        while(isNotANumberBetween1and999(valueRead))
        {
            MyPrinter.print("Inténtelo de nuevo... ");
            valueRead = readValue();
        }

        return valueRead;
    }

    protected static boolean isNotANumberBetween1and999(String valueRead)
    {
        try
        {
            int number = Integer.parseInt(valueRead);

            if(number > 999)
            {
                MyPrinter.print("Introduca un número menor que 1000");
                return true;
            }
            else if(number < 0)
            {
                MyPrinter.print("Los romanos no tenían números negativos");
                return true;
            }
            else if(number == 0)
            {
                MyPrinter.print("Los romanos no tenían número cero");
                return true;
            }

            return false;
        }
        catch(Exception e)
        {
            MyPrinter.print("Ha escrito una cadena demasiado larga");
            return true;
        }
    }

    protected static String readValue() {
        String readValue;

        Scanner sc = new Scanner(System.in);
        readValue = sc.nextLine();
        return readValue;
    }
}
