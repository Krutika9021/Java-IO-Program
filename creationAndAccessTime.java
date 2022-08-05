//Java program to get file creation, last access and last modification time

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Calendar;
import java.util.Scanner;
public class creationAndAccessTime
{
  public static void main(String[] args) throws Exception
  {
    Scanner KB = new Scanner(System.in);

    System.out.print("Enter the file path : ");
    String A = KB.next();
    Path path = Paths.get(A);
    BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
    BasicFileAttributes attributes = view.readAttributes();

    FileTime lastModifedTime = attributes.lastModifiedTime();
    FileTime createTime = attributes.creationTime();

    long currentTime = Calendar.getInstance().getTimeInMillis();
    FileTime lastAccessTime = FileTime.fromMillis(currentTime);

    view.setTimes(lastModifedTime, lastAccessTime, createTime);

    System.out.println("Creation time of file is : " + attributes.creationTime());
    System.out.println("Last modification time of file is : " + attributes.lastModifiedTime());
    System.out.println("Last access time of file is : " + attributes.lastAccessTime());
  }
}

