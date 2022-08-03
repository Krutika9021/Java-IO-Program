//Java program to get file size and file path

import java.io.File;

public class getSize_getPath 
{
    public static void main(String args[])
    {
        final String fileName = "demo1.txt";
        try
        {
            File f1 = new File(fileName);
            System.out.println("File path is : " + f1.getAbsolutePath());
            System.out.println("File size is : " + f1.length() + " bytes");
        }
        catch(Exception e)
        {
            System.out.println("Exception : " + e.toString());
        }
    }
}
