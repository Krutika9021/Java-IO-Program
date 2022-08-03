//Java program to determine number of bytes written to file using DataOutputStream

import java.io.*;
public class determineBytes 
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("c:\\Glassfish\\create\\input.txt");
            DataOutputStream dos = new DataOutputStream (fos);
            dos.writeBytes("This is the java program to determine the bytes written to file using DataOutputStream");
            int total_bytes = dos.size();
            dos.close();
            System.out.println("Total " + total_bytes + " bytes were written to stream. ");
        }
        catch (Exception e)
        {
            System.out.println("Exception : " + e.toString());
        }
    }
}
