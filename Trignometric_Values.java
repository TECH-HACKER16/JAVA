import java.util.Scanner;
import java.lang.Math;

public class Trignometric_Values
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input degrees : ");
        double degrees = sc.nextInt();
  
        double radians = Math.toRadians(degrees);

        double sinValue = Math.sin(radians);

        System.out.println("sin(" + degrees + ") = " + sinValue);
        
        double cosValue = Math.cos(radians);
  
        System.out.println("cos(" + degrees + ") = " + cosValue);

        double tanValue = Math.tan(radians);
  
        System.out.println("tan(" + degrees + ") = " + tanValue);

        double cosineValue = 1/Math.cos(radians);
  
        System.out.println("Cosec(" + degrees + ") = " + cosineValue);

        double SecantValue = 1/Math.sin(radians);
  
        System.out.println("Sec(" + degrees + ") = " + SecantValue);

        double cotValue = 1/Math.tan(radians);
  
        System.out.println("Cot(" + degrees + ") = " + cotValue);

        sc.close();   
    }
}

