import java.util.Scanner;

public class Sum_of_Array_Elements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0,i;
        System.out.println("Input the size of array :");
        int m = sc.nextInt();
        int myArray[]= new int[m];
        

        System.out.println("Enter array elements :");
        for ( i= 0 ; i < m ; i++ )
        {
        myArray[i]=sc.nextInt();
        }
        
            
        for (i = 0; i < myArray.length; i++) 
        {
            sum += myArray[i];
        }
        System.out.println("The sum is: " + sum);

            
    
    }
}