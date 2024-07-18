import java.io.*;
public class fileCopy {
 public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the input file path: ");
    String inputFile = reader.readLine();
    String destFile = "dest.txt";
    
    BufferedReader sourceReader = new BufferedReader(new FileReader(inputFile));
    BufferedWriter destWriter = new BufferedWriter(new FileWriter(destFile));
   
    String line;
    while ((line = sourceReader.readLine()) != null) {
            destWriter.write(line);
            destWriter.newLine();
            }
        
        System.out.println("Copied Successfully successfully.");
        reader.close();
        sourceReader.close();
        destWriter.close();
        }
    }