//Java program to get the file's owner name

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class OwnerName 
{
     public static void main(String[] args)
     {
         Path path = Paths.get("C:\\Glassfish\\create\\input.txt");
         FileOwnerAttributeView file = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
         try
         {
             UserPrincipal user = file.getOwner();
             System.out.println("Owner : " + user.getName());
         }
         catch (Exception e)
         {
             System.out.println(e);
         }
     }
}
