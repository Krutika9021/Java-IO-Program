//Java program to check whether a file can be read or not

import java.io.File;
public class read_or_Not
{
    public static void main(String[] args)
    {
        try
        {
        File f1 = new File("input.txt");
        f1.createNewFile();
        System.out.println("The file can be read? " + f1.canRead());
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
