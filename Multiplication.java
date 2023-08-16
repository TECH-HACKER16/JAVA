import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
            int p,q,r;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number :");
        p = sc.nextInt();

        //Scanner sc = new Scanner(System.in);
        System.out.println("Input Second number");
        q = sc.nextInt();
        sc.close();

        r = p*q;
        System.out.println("Product of two given number is " + r);

    }
}

