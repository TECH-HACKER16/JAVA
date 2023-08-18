import java.util.Scanner;

public class Matrice_transpose 
{
    public static void main(String[] args) 
    {
        int Row, Col,m,p,temp,n;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number of rows");
        Row = sc.nextInt();
        
        System.out.println("Enter the number  columns");
        Col  = sc.nextInt();
        if(Row >Col)
        n=Row;
        else
        n= Col;
        int Matrice1[][] = new int[n][n]; 
    
    
            System.out.println("Enter the elements of matrix");
    
            for (  m= 0 ; m < Row ; m++ )
        {   
        
            for ( p= 0 ; p < Col ;p++ )
            Matrice1[m][p] = sc.nextInt();
                
        }
        
            System.out.println("\n\nOriginal   matrix:-");
            for (  m= 0 ; m < Row ; m++ )
        {  
            for ( p= 0 ; p <Col;p++ )
            System.out.print(Matrice1[m][p]+" ");
        
            System.out.println();
        }
    
            for (  m= 0 ; m < n; m++ )
            for ( p= m+1 ; p < n ;p++ )
            {
                temp=Matrice1[m][p]  ;
                Matrice1[m][p] =Matrice1[p][m]  ;
                Matrice1[p][m]  =temp;
            }
    
    
            System.out.println("Transpose  of   matrix:-");
            for (  m= 0 ; m < Col ; m++ )
        {  
            for ( p= 0 ; p < Row;p++ )
            System.out.print(Matrice1[m][p]+" ");
        
            System.out.println();
        }
    }
}
