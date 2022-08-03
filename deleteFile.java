//Java program to delete a file

import java.io.File;

public class deleteFile 
{
    public static void main (String args[])
    {
        File f1 = new File("C:\\Glassfish\\demo1.txt");
        boolean val = f1.delete();
        if (val)
        {
            System.out.println(" demo1.java is successfully deleted");
        }
        else
        {
            System.out.println("File doesn't exist : ");
        }
    }
}
