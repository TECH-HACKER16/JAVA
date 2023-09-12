import java.util.Scanner;


public class Rev_Array 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the required no.of elements");
       int a = sc.nextInt();
       int Array[] = new int[a];

       for(int i=0;i<a;i++)
       {
            System.out.println("Input element "+(i+1));
            Array[i]=sc.nextInt();
       }
       
       System.out.println("\nRecheck elements");
       for(int i=0;i<a;i++)
       {
            System.out.print(Array[i]+" ");
       }
      
       System.out.println("\nReversed Array : ");
       for(int i=a-1;i>=0;i--)
       {
            System.out.print(Array[i]+" ");
       }
       sc.close();
    }
}
