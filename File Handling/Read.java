import java.io.*;
import java.util.Scanner;

public class Read {  
  public static void main(String[] args) //throws IOException
  {  
    try {
          File myObj = new File("C:\\Users\\<Name>\\OneDrive\\Desktop\\new.txt");// Give your System User name instead of <Name>
          Scanner myReader = new Scanner(myObj);  
          while (myReader.hasNextLine()) 
          {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
       } 
    catch (FileNotFoundException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 

      