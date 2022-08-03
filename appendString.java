//Java program to append text/string in a file

import java.io.*;
public class appendString 
{
    public static void appendStrToFile(String filename, String str)
    {
        try
        {
            BufferedWriter bw =  new BufferedWriter( new FileWriter(filename, true));
            bw.write(str);
            bw.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception occurred"+ e);
        }
    }
    public static void main(String args[])
    {
        String filename = "input.txt";
        try
        {
            BufferedWriter bw =  new BufferedWriter( new FileWriter(filename));
            bw.write("Hello World");
            bw.close(); 
        }
        catch (IOException e)
        {
            System.out.println("Exception occurred"+ e);
        }
        String str = "\nThis is program";
        appendStrToFile(filename, str);
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String mystr;
            while((mystr = br.readLine()) != null)
            {
                System.out.println(mystr);
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception Occurred " + e);
        }
     }
}
