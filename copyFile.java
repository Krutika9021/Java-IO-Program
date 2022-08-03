//Java program to copy files

import java.io.*;

public class copyFile 
{
    public static void main(String args[])
    throws IOException
    {
        FileInputStream fin = null;
        FileOutputStream fop = null;
        try 
        {
            fin = new FileInputStream("C:\\Glassfish\\create\\input.txt");
            fop = new FileOutputStream("C:\\Glassfish\\create\\output.txt");
 
            int c;
            while ((c = fin.read()) != -1) 
            {
                fop.write(c);
            }
            System.out.println("copied the file successfully");
        }
        finally 
        {
            if (fin != null)
            {
                fin.close();
            }
            if (fop != null) 
            {
                fop.close();
            }
        }
    }
}
