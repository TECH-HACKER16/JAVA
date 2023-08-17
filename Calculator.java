import java.util.Scanner;
import java.lang.math;

public class Calculator{

    public static void main(String[] args)
    {
        System.out.println("1.) Addition");
        System.out.println("2.) Subtraction");
        System.out.println("3.) Multiplication");
        System.out.println("4.) Division");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice :");
        int choice = sc.nextInt();
        

        switch(choice)
        {
            case 1:
            int x,y,z;

            System.out.println("Input first number :");
            x = sc.nextInt();

            System.out.println("Input Second number");
            y = sc.nextInt();
    
            z = x+y;
            System.out.println("Sum of two given number is " + z);
            break;

            case 2:
            int a,b,c;

            System.out.println("Input first number :");
            a = sc.nextInt();
    
            //Scanner sc = new Scanner(System.in);
            System.out.println("Input Second number");
            b = sc.nextInt();
    
            c=a-b;
            System.out.println("Difference of two given number is " + c);
            break;

            case 3:
            
            int p,q,r;

            System.out.println("Input first number :");
            p = sc.nextInt();

            System.out.println("Input Second number");
            q = sc.nextInt();

            r = p*q;
            System.out.println("Product of two given number is " + r);
            break;

            case 4:
        
            int m,n;float s,o;

            System.out.println("Input first number :");
            m = sc.nextInt();

            System.out.println("Input Second number");
            n = sc.nextInt();
            sc.close();

            o = m/n;
            s = m%n;
            System.out.println("Result of two given numbers is "+ o);
            System.out.println("Remainder of two given numbers is " + s);



        }
    }
}
