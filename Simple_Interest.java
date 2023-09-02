import java.util.Scanner;

public class Simple_Interest 
{
   public static void main(String[] args) 
    {
        double P,T,R;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input Principle Amount :");
        P = sc.nextDouble();
        System.out.println("Input Time period : ");
        T = sc.nextDouble();
        System.out.println("Input Rate of Interest:");
        R=sc.nextDouble();
        sc.close();

        double Simple_Interest = P*T*R/100;

        System.out.println("Simple Interest = " + Simple_Interest);
    } 
}
