// Java program to rename an existing file

import java.io.File;
public class renameFiile 
{
    public static void main(String args[])
    {
       
    
    File f1 = new File("C:\\Glassfish\\create\\output.txt");
    File rename = new File("C:\\Glassfish\\create\\JavaOutout.txt");
    boolean flag = f1.renameTo(rename);
    if(flag == true)
    {
        System.out.println("File Successfully Rename");
    }
    else
    {
        System.out.println("Operation failed");
    }
    }
}
