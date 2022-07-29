package createfile;
import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\Jayesh\\Documents\\New assignments\\Java IO");
        boolean result;
        try
        {
            result = file.createNewFile();
            if (result)
            {
                System.out.println("File is created " + file.getCanonicalPath());
            }
            else
            {
                System.out.println("File is already exist at location : " + file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
