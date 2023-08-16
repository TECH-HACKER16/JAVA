import java.util.Scanner;
import java.lang.math;

public class Armstrong_Numbers
{

    public static void main(String[] args) 
        
    {   int number , originalNumber, remainder, result = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        number = sc.nextInt();
        sc.close();

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += remainder*remainder*remainder;
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");




    }
}