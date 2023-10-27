package Questions;//comment this line if error occurs

import java.util.*;

public class Even_or_odd 
{
    void fn()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if ((num & 1) == 0)
            System.out.println("\n"+num+" is an even integer\n");
        else
            System.out.println("\n"+num+" is an odd integer\n");
        sc.close();
    }
    public static void main(String[] args) 
    {
        Even_or_odd obj = new Even_or_odd();
        obj.fn();
    }  
}
