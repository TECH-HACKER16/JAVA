import java.io.*;

public class Delete 
{
  public static void main(String[] args) throws IOException
  { 
    File myObj = new File("C:\\Users\\<Name>\\OneDrive\\Desktop\\new.txt"); // Give your System User name instead of <Name>
    if (myObj.delete()) 
    { 
      System.out.println("Deleted the file: " + myObj.getName());
    } 
    else 
    {
      System.out.println("Failed to delete the file.");
    } 
  } 
}