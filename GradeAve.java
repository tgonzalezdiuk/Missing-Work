/***
 * Tamara Gonzalez
 * Program : Java
 */

import java.util.*;
public class GradeAve 
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grades: ");
        int Grade1 = input.nextInt();

        System.out.print("Enter a grades: ");
        int Grade2 = input.nextInt();

        System.out.print("Enter a grades: ");
        int Grade3 = input.nextInt();

        System.out.print("Enter a grades: ");
        int Grade4 = input.nextInt();

        System.out.print("Enter a grades: ");
        int Grade5 = input.nextInt();

        double Average = ((Grade1 + Grade2 + Grade3 + Grade4 + Grade5)/5);
        System.out.print(Average);
    }
}