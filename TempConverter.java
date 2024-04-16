/***
 * Tamara Gonzalez
 * Program : Java
 */

import java.util.*;
public class TempConverter 
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Farenheit: ");
        double Temperature = input.nextInt();
        
        double TempCelsius = (Temperature - 32.0);
        double FinalTemp = ((5.0/9.0) * TempCelsius);
        System.out.print(FinalTemp);
    }
}