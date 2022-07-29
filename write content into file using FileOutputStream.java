package write.content;
import java.io.FileOutputStream;

public class WriteContent
{
    public static void main(String[] args)
    {
        String txt = "This is a line of text";
        try
        {
            FileOutputStream output = new FileOutputStream("C:\\Glassfish\\demo.txt");
            byte[] array = txt.getBytes();
            output.write(array);
            output.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }   
}
