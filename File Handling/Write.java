import java.io.*;

public class Write {  
  public static void main(String[] args) //throws IOException
  {  
    try {  
      FileWriter myWriter = new FileWriter("C:\\Users\\<Name>\\OneDrive\\Desktop\\new.txt");// Give your System User name instead of <Name>
      myWriter.write("Using Write function to write in files");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 

