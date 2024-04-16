/***
 * Tamara Gonzalez
 * Program : Java
 */

import java.util.*;
public class AccountSetup 
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = input.next();

        System.out.print("Enter your password: ");
        String password = input.next();

        System.out.print("Your name is " + name + " \nYour password is " + password);
    }
}