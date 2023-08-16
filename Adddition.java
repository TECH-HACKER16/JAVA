import java.util.Scanner;

public class Adddition 
{
    public static void main(String[] args)
    {
            int x,y,z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number :");
        x = sc.nextInt();

        //Scanner sc = new Scanner(System.in);
        System.out.println("Input Second number");
        y = sc.nextInt();
        sc.close();

        z = x+y;
        System.out.println("Sum of two given number is " + z);

    }
}

