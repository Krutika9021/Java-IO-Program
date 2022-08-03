//Java program to get the last modification date and time of a file

import java.io.*;
import java.text.SimpleDateFormat;

public class get_dateTime
{
    public static void main(String args[])
    {
        File f1 = new File("C:\\Glassfish\\create\\input.txt");
        File f2 = new File ("C:\\Glassfish\\create\\output.txt");
        
        System.out.println("Before format : " + f1.lastModified());
        System.out.println("Before Format : " + f2.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat ("MM/dd/yyyy  HH:mm:ss");
        
        System.out.println("After Format : " + sdf.format(f1.lastModified()));
        SimpleDateFormat sdf1 = new SimpleDateFormat ("MM-dd-yyyy  HH:mm a");
        System.out.println("Alternate Format type : " + sdf1.format(f1.lastModified()));
    }
}
