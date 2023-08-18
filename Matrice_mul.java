import java.util.Scanner;

public class Matrice_mul 
{
    public static void main(String[] args) 
    {
        
        int r1, r2,c1,c2,a,b,k,sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of matrix1");
        r1 = sc.nextInt();
        
        System.out.println("Enter the number columns of matrix 1");
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows of matrix2");
        r2 = sc.nextInt();
        
        System.out.println("Enter the number of columns of matrix 2");
        c2 = sc.nextInt();
        
        if(c1==r2)
        {
        
        int Mat1[][] = new int[r1][c1]; 
        int Mat2[][] = new int[r2][c2]; 
        int result[][] = new int[r1][c2];
        
        System.out.println("Enter the elements of matrix1");
        
        for ( a= 0 ; a < r1 ; a++ )
        { 
        
        for ( b= 0 ; b < c1 ;b++ )
        Mat1[a][b] = sc.nextInt();
        
        }
        System.out.println("Enter the elements of matrix2");
        
        for ( a= 0 ; a < r2 ; a++ )
        { 
        
        for ( b= 0 ; b < c2 ;b++ )
        Mat2[a][b] = sc.nextInt();
        
        }
        
        System.out.println("\n\noutput matrix:-");
        for ( a= 0 ; a < r1 ; a++ )
        
        for ( b= 0 ; b <c2;b++)
        {
        sum=0;
        for ( k= 0 ; k <r2;k++ )
        {
        sum +=Mat1[a][k]*Mat2[k][b] ;
        
        }
        result[a][b]=sum;
        }
        for ( a= 0 ; a < r1; a++ )
        {
        for ( b=0 ; b < c2;b++ )
        System.out.print(result[a][b]+" ");
        
        System.out.println();
        }
        }
        else
        System.out.print("multipication does not exist ");
        sc.close();
                
    }
    
}
