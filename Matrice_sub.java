import java.util.Scanner;
//import java.lang.math;

public class Matrice_sub
{
    public static void main(String[] args) {
    
       int row, col,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        row = sc.nextInt();

        System.out.print("Enter the number columns");
        col = sc.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];

        System.out.println("Enter the elements of matrix1");

        for ( i= 0 ; i < row ; i++ )
        { 

        for ( j= 0 ; j < col ;j++ )
        mat1[i][j] = sc.nextInt();

        System.out.println();
        }
        
        System.out.println("Recheck your matrice:-");

        for ( i= 0 ; i < row ; i++ )
        { 
        for ( j= 0 ; j < col ;j++ )
        System.out.print(mat1[i][j]+"\t");

        System.out.println();
        }
        
        System.out.println("Enter the elements of matrix2");

        for ( i= 0 ; i < row ; i++ )
        {

        for ( j= 0 ; j < col ;j++ )
        mat2[i][j] = sc.nextInt();

        System.out.println();
        }

        System.out.println("Recheck your matrice:-");

        for ( i= 0 ; i < row ; i++ )
        { 
        for ( j= 0 ; j < col ;j++ )
        System.out.print(mat1[i][j]+"\t");

        System.out.println();
        }

        for ( i= 0 ; i < row ; i++ )
        for ( j= 0 ; j < col ;j++ )
        res[i][j] = mat1[i][j] - mat2[i][j] ; 

        System.out.println("Difference of matrices:-");

        for ( i= 0 ; i < row ; i++ )
        { 
        for ( j= 0 ; j < col ;j++ )
        System.out.print(res[i][j]+"\t");

        System.out.println();
        }
    }
}