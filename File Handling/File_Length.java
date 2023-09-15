import java.io.*;

public class File_Length 
{
    public static void main(String[] args) throws IOException
    {
        File obj = new File("C:\\Users\\<Name>\\OneDrive\\Desktop\\new.txt");// Give your System User name instead of <Name>
        if (obj.exists())
        {
            System.out.println("Given File exists and have file length of " + obj.length());
        }
        else 
        {
            System.out.println("File Doesn't exists,Create a file to use length command");
        }
    }   

}
