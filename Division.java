import java.util.Scanner;

public class Division
{
    public static void main(String[] args)
    {
            int m,n;float p,o;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number :");
        m = sc.nextInt();

        //Scanner sc = new Scanner(System.in);
        System.out.println("Input Second number");
        n = sc.nextInt();
        sc.close();

        o = m/n;
        p = m%n;
        System.out.println("Result of two given numbers is "+ o);
        System.out.println("Remainder of two given numbers is " + p);

    }
}

