package com.Teja;
import java.util.Scanner;
import java.lang.Math;


public class Calculator_v2 {
    public static void main(String[] args)
    {
        System.out.println("1.)Arithmetic operations");
        System.out.println("2.)Matrix operations");
        System.out.println("3.)Formula Calculators");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice : ");
        int choice = sc.nextInt();

        if(choice==1)
        {

            System.out.println("1.) Addition");
            System.out.println("2.) Subtraction");
            System.out.println("3.) Multiplication");
            System.out.println("4.) Division");
            
            System.out.print("Enter your Choice :");
            int operations = sc.nextInt();
        

            switch(operations)
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
        else if(choice==2)
        {
            System.out.println("1.) Matrice addition");
            System.out.println("2.) Matrice subtraction");
            System.out.println("3.) MAtrice multiplication");
            System.out.println("4.) Matrice transpose");
        
            System.out.print("Enter your Choice :");
            int operations = sc.nextInt();

            switch(operations)
            {
                case 1:

                int row, col,i,j;
        
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
                res[i][j] = mat1[i][j] + mat2[i][j] ; 
        
                System.out.println("Sum of matrices:-");
        
                for ( i= 0 ; i < row ; i++ )
                { 
                for ( j= 0 ; j < col ;j++ )
                System.out.print(res[i][j]+"\t");
        
                System.out.println();
                }
                break;
                
                case 2:
                int rows, column,x,y;
            
                System.out.print("Enter the number of rows");
                rows = sc.nextInt();
        
                System.out.print("Enter the number columns");
                column = sc.nextInt();
        
                int matrice1[][] = new int[rows][column];
                int matrice2[][] = new int[rows][column];
                int resMatrice[][] = new int[rows][column];
        
                System.out.println("Enter the elements of matrix1");
        
                for ( x= 0 ; x < rows ; x++ )
                { 
        
                for ( y= 0 ; y < column ;y++ )
                matrice1[x][y] = sc.nextInt();
        
                System.out.println();
                }

                System.out.println("Recheck your matrice:-");

                for ( i= 0 ; i < rows ; i++ )
                { 
                for ( j= 0 ; j < column ;j++ )
                System.out.print(matrice1[i][j]+"\t");

                System.out.println();
                }
                System.out.println("Enter the elements of matrix2");
        
                for ( x= 0 ; x < rows ; x++ )
                {
        
                for ( y= 0 ; y < column ;y++ )
                matrice2[x][y] = sc.nextInt();
        
                System.out.println();
                }
                
                System.out.println("Recheck your matrice:-");

                for ( i= 0 ; i < rows ; i++ )
                { 
                for ( j= 0 ; j < column ;j++ )
                System.out.print(matrice2[i][j]+"\t");
        
                System.out.println();
                }

        
                for ( x= 0 ; x < rows ; x++ )
                for ( y= 0 ; y < column ;y++ )
                resMatrice[x][y] = matrice1[x][y] - matrice2[x][y] ; 
        
                System.out.println("Difference of matrices:-");
        
                for ( x= 0 ; x < rows ; x++ )
                { 
                for ( y= 0 ; y < column ;y++ )
                System.out.print(resMatrice[x][y]+"\t");
        
                System.out.println();
                }
                break;

                case 3:

                int r1, r2,c1,c2,a,b,k,sum;
                
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
                break;

                case 4:
                
                int Row, Col,m,p,temp,n;
                Scanner in = new Scanner(System.in);
            
                System.out.println("Enter the number of rows");
                Row = in.nextInt();
                
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
                    break;
            }
        }
        else if(choice==3)
        {
            System.out.println("1.) Perimeter of Square");
            System.out.println("2.) Area of Square");
            System.out.println("3.) Perimeter of Rectangle");
            System.out.println("4.) Area of Rectangle");
            System.out.println("5.) Perimeter of Triangle");
            System.out.println("6.) Area of Triangle" );
            System.out.println("7.) Area of Scalene Triangle using Heron's formula");
            System.out.println("8.) Area of Equilateral Triangle");
            System.out.println("9.) Area of Rhombus");
            System.out.println("10.) Circumference of Circle");
            System.out.println("11.) Area of Circle");
            System.out.println("12.) Area of Trapezium");
            System.out.println("13.) Altitude of an triangle");
            System.out.println("14.) Distance between two points");
            System.out.println("15.) Finding logarithm");

            System.out.println("Choose an option to continue :");
            int formula = sc.nextInt();

            switch(formula)
            {
                case 1:
                 System.out.print("Input the side of the square :");
                 int side = sc.nextInt();
                    System.out.println("Perimeter of Square is: 4 X Side");
                    System.out.println("perimeter of given square is " + 4*side);
                break;

                case 2:
                System.out.print("Input the side of the square :");
                 int Side = sc.nextInt();
                    System.out.println("Area of Square is : Side X Side");
                    System.out.println("Area of given square is " + Side*Side);
                break;

                case 3:
                System.out.print("Input the Length of the Rectangle :");
                 int length = sc.nextInt();
                 System.out.print("Input the breadth of the Rectangle :");
                 int breadth = sc.nextInt();
                    System.out.println("Perimeter of Rectangle is: 2 X (l+b)");
                    System.out.println("perimeter of given Rectangle is " + (length+breadth)*2);
                break;

                case 4:
                System.out.print("Input the Length of the Rectangle :");
                 int Length = sc.nextInt();
                 System.out.print("Input the breadth of the Rectangle :");
                 int Breadth = sc.nextInt();
                    System.out.println("Area of Rectangle is: lXb");
                    System.out.println("Area of given Rectangle is " + (Length*Breadth));
                break;

                case 5:
                System.out.print("Input the first side of triangle :");
                 int side1 = sc.nextInt();
                 System.out.print("Input the second side of triangle :");
                 int side2 = sc.nextInt();
                 System.out.print("Input the third side of triangle :");
                 int side3 = sc.nextInt();
                    System.out.println("Perimeter of Triangle is: A+B+C");
                    System.out.println("perimeter of given Triangle is " + side1+side2+side3);
                break;

                case 6:
                System.out.print("Input the first side of triangle :");
                 int Base = sc.nextInt();
                 System.out.print("Input the second side of triangle :");
                 int Height = sc.nextInt();
                 System.out.println("Area of Triangle is: 1/2 X Base X Height");
                    System.out.println("Area of given Triangle is " + (Base*Height)*1/2);
                break;

                case 7:
                Double S,Area;
                System.out.print("Input the first side of the Triangle :");
                 Double s1 = sc.nextDouble();
                 System.out.print("Input the second side of the Triangle :");
                 Double s2 = sc.nextDouble();
                 System.out.print("Input the third side of the Triangle :");
                 Double s3 = sc.nextDouble();
                 System.out.println("Area of scalene Triangle is S = (side1+side2+side3)/2 next \n Squareroot of (s(s-s1)*(s-s2)*(s-s3))");
                 S = (s1+s2+s3) /2;
                 Area = Math.sqrt(S *(S-s1)*(S-s2)*(S-s3));
                 System.out.println("Area of given Scalene triangle is " + Area);
                break;

                case 8:
                System.out.println("Enter the side of the Triangle:");
                 double a = sc.nextDouble();
                 double  area=(Math.sqrt(3)/4)*(a*a);
                 System.out.println("Area of Equilateral Triangle is squareroot of 3/4 X A square");
                 System.out.println("Area of given Equilateral Triangle is: " + area);
                break;

                case 9:
                System.out.print("Input the first Diagonal of Rhombus :");
                 int d1 = sc.nextInt();
                 System.out.print("Input the second Diagonal of Rhombus :");
                 int d2 = sc.nextInt();
                 System.out.println("Area of Rhombus is: 1/2 X Diagonal1 X Diagonal2");
                 System.out.println("Area of given Rhombus is " + (d1*d2)*1/2);
                break;

                case 10 :
                System.out.println("Enter the radius of the circle :");
                 int radius = sc.nextInt();
                 double circumference = Math.PI*2*radius;
                 System.out.println("Circumference of circle is 2\u03C0R");
                 System.out.println("Circumference of the circle is : "+circumference);
                break;
                
                case 11:
                System.out.println("Enter the radius of the circle ::");
                 int Radius = sc.nextInt();
                 double A = Math.PI*Radius*Radius;
                 System.out.println("Area of circle is \u03C0r Sq");
                 System.out.println("Circumference of the circle is : "+A);
                break;
                
                case 12:
                System.out.print("Input the base 1 of Trapezium :");
                 int b1 = sc.nextInt();
                 System.out.print("Input the base 2 of Trapezium :");
                 int b2 = sc.nextInt();
                 System.out.println("Input the height of the Trapezium");
                 int h1 = sc.nextInt();
                 System.out.println("Area of Trapezium is (base1 + base2)*height");
                 System.out.println("Area of given Trapezium is " + (b1+b2)*h1);
                break;

                case 13:
                System.out.println("Enter the side of the Triangle:");
                 double Side1 = sc.nextDouble();
                 double  area1 =(Math.sqrt(3)/2)*Side1;
                 System.out.println("Altitude of Triangle is squareroot of 3/2 X H ");
                 System.out.println("Altitude ofc triangle is: " + area1);
                break;

                case 14:
                int x1,x2,y1,y2;
                 double distance;
                 System.out.println("Input the Abscissa x1");
                 x1 = sc.nextInt();
                 System.out.println("Input the Ordinate y1");
                 y1 = sc.nextInt();
                 System.out.println("Input the Abscissa x2");
                 x2 = sc.nextInt();
                 System.out.println("Input the Ordinate y2");
                 y2 = sc.nextInt();

                 distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
                 System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);
                break;
                
                case 15:
                System.out.print("Enter a number: ");
                 double number = sc.nextDouble();
                
                 System.out.print("Enter the base of the logarithm: ");
                 double base = sc.nextDouble();
                
                 double result = Math.log(number) / Math.log(base);
                
                 System.out.println("Logarithm base " + base + " of " + number + " is: " + result);
                break;

            }
        }
    }   
}
