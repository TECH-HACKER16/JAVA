import java.util.Scanner;

public class Subtraction 
{

      public static void main(String[] args)
    {
            int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number :");
        a = sc.nextInt();

        //Scanner sc = new Scanner(System.in);
        System.out.println("Input Second number");
        b = sc.nextInt();
        sc.close();

        c=a-b;
        System.out.println("Difference of two given number is " + c);

    }
}
