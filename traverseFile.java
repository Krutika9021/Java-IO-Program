//Java program to traverse all files of a directory/folder

import java.io.File;
public class traverseFile 
{
    public static void displayFiles(File[] files)
    {
        for (File filename : files) 
        {
            if (filename.isDirectory()) 
            {
                System.out.println("Directory: "+ filename.getName());
                displayFiles(filename.listFiles());
            }
            else
            {
                System.out.println("File: "+ filename.getName());
            }
        }
    }
    public static void main(String[] args)
    {
        File[] files = new File("C:\\Glassfish").listFiles();
        displayFiles(files);
    }
}

