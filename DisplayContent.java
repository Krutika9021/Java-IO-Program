//Java - Print File Content, Display File using Java Program

import java.util.Scanner;
import java.io.*;
public class DisplayContent
{
    public static void main(String args[])
    {
        String fname;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the name of File : ");
        fname = scan.nextLine();
        String line = null;
        try
        {
            FileReader fr = new FileReader(fname);
            BufferReader bfr = new BufferReader(fr);
            while((line = bfr.readLine()) != null)
            {
                System.out.println(line);
            }
            bfr.close();
        }
        catch(IOException e)
        {
            System.out.println("\nError occurred " + e);
        }
    }
}
