//Java program to check whether a file is hidden or not

import java.io.File;
import java.io.IOException;

public class hiddenOrNot 
{
    public static void main (String args[]) throws IOException, SecurityException
    {
        File f1 = new File ("C:\\Glassfish\\create\\input.txt");
        if (f1.isHidden())
            System.out.println("The specified file is hidden ");
        else
            System.out.println("The specified file is not hidden");
    }
}
