/***
 * Tamara Gonzalez
 * Program : Java
 */

import java.util.*;
public class DivandMod 
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer1 = input.nextInt();

        System.out.print("Enter a second integer: ");
        int integer2 = input.nextInt();

        double math = (integer1 / integer2);
        double math2 = (integer1 % integer2);
        double math3 = (integer2 / integer1);
        double math4 = (integer2 % integer1);

        System.out.println(math);
        System.out.println(math2);
        System.out.println(math3);
        System.out.println(math4);
    }
}