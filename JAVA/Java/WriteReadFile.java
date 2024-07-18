import java.io.*;
import java.util.*;
public class WriteReadFile{
 public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the file name: ");
    String fileName = sc.nextLine();
    FileOutputStream fos = new FileOutputStream(fileName);
    System.out.println("Enter text to insert: ");
    String text = sc.nextLine();
    fos.write(text.getBytes());
    fos.close();
    FileInputStream fis = new FileInputStream(fileName);
    byte[] b = new byte[fis.available()];
    fis.read(b);
    fis.close();
    String fileContent = new String(b);
    System.out.println("Contents of " + fileName + ":");
    System.out.println(fileContent);
    sc.close();
    }
}
