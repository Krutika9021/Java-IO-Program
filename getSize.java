//Java program to get the size of given file in bytes, kilobytes and megabytes

import java.io.File;

public class getSize 
{
    public static void main (String[] args)
    {
        File f1 = new File("C:\\Glassfish\\create\\input.txt");
        if(f1.exists())
        {
            double bytes = f1.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            
            System.out.println("bytes : " + bytes);
            System.out.println("kilobytes : " + kilobytes);
            System.out.println("megabytes : " + megabytes);
        }
        else
        {
           System.out.println("FILE DOES NOT EXIST !");
        }
    }
}
