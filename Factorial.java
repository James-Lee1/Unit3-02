/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Nov 2018
 * Created for: ICS4U
 * Recursive factorial program
 *
 ****************************************************************************/

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter an integer: ");

        // Verifies that next line is an integer
        if(userInput.hasNextInt())
        {
            int factorialNum = userInput.nextInt();

            // Verifies input is greater or equal to 0
            if(factorialNum >= 0)
            {
                // Calculates factorial
                int ans = calculate(factorialNum);
                System.out.print("\nThe factorial of " + factorialNum + " is " + ans + ".\n");
            }
            else
            {
                System.out.print("\nError : Invalid input!\n");
            }
        }
        else
        {
            System.out.print("\nError : Invalid input!\n");
        }
    }
    // Function that calculates factorial
    public static int calculate(int num)
    {
        int result;
        // Factorial of 0 is 1
        if(num == 0)
        {
            result = 1;
            return result;
        }
        else
        {
            // Recursion, calculates factorial
            result = num * calculate(num - 1);
            return result;
        }
    }
}
