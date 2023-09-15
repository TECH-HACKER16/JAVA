import java.io.*;

public class Checking_file 
{
    public static void main(String[] args) throws IOException
    {
        File obj = new File("C:\\Users\\<Name>\\OneDrive\\Desktop\\new.txt");// Give your System User name instead of <Name>
        
        if (obj.exists())
        {
            System.out.println(obj.getName());
        }
        else 
        {
            System.out.println("File already exists");
        }
    }
}