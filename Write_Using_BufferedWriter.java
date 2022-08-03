//Java program to write content into file using BufferedWriter

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Write_Using_BufferedWriter 
{

  public static void main(String args[]) {

    String data = "This is the data in the output file";

    try 
    {
      FileWriter file = new FileWriter("C:\\Glassfish\\demo1.txt");
      BufferedWriter output = new BufferedWriter(file);
      output.write(data);
      output.close();
    }

    catch (Exception e)
    {
      e.getStackTrace();
    }
  }
}