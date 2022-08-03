//Java program to read text from file from a specified index or skipping byte using FileInputStream

import java.io.FileInputStream;
public class readText 
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Glassfish\\create\\input.txt");
            int i=0;
            fin.skip(7);
            System.out.println("Printing text from index 8: ");
            while ((i = fin.read()) != -1)
            {
                System.out.println((char) i);
            }
            fin.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
