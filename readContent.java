//Java program to read content from file using FileInputStream

import java.io.File;
import java.io.FileInputStream;

public class readContent 
{
    public static void main(String[] args)
    {
        File f1 = new File("C:\\Glassfish\\demo1.txt");
        try
        {
            FileInputStream input = new FileInputStream(f1);
            int character;
            while((character = input.read()) != -1)
            {
                System.out.print((char)character);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
