//Java program to write content into file using FileOutputStream

package write.content;
import java.io.FileOutputStream;

public class WriteContent
{
    public static void main(String[] args)
    {
        String txt = "This is the content to write into file using FileOutputStream";
        try
        {
            FileOutputStream output = new FileOutputStream("C:\\Glassfish\\demo1.txt");
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
