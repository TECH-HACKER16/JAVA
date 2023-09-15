import java.io.*;

public class CreateFile 
{
    public static void main(String[] args) throws IOException
    {
        File obj = new File("C:\\Users\\<Name>\\OneDrive\\Desktop\\new.txt");// Give your System User name instead of <Name>
        if (obj.createNewFile())
        {
            System.out.println("Succesfully created");
        }
        else 
        {
            System.out.println("File already exists");

        }        
    }
}