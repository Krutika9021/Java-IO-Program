//Java program to read content from file using BufferedReader

import java.io.FileReader;
import java.io.BufferedReader;

public class read_using_BufferedReader
{
    public static void main(String args[])
    {
         char[] array = new char[100];
    try 
    {
      FileReader fr = new FileReader("C:\\Glassfish\\demo1.txt");
      BufferedReader br = new BufferedReader(fr);
      br.read(array);
      System.out.println("Data in the file: ");
      System.out.println(array);
      br.close();
    }

    catch(Exception e) 
    {
      e.getStackTrace();
    }
  }
}