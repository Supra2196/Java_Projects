import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderFile {
    public static void main(String[] args) {

        int counter = 0;
        String filePath = "C:\\Users\\supra\\OneDrive\\Documents\\CS-115\\example5.txt";
        String filePath1 = "C:\\Users\\supra\\OneDrive\\Documents\\CS-115\\newexample5.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             BufferedWriter br2 = new BufferedWriter(new FileWriter(filePath1)))
         {

            String line;
            while ((line = br.readLine()) != null)
          { // Read all lines
                System.out.println(line);
                for (int i = 0; i < line.length(); i++)
                {
                    if (line.charAt(i) == ' ')
                    {
                        counter++;
                    }
                }
          }

            br2.write("Total number of spaces is " + counter);
            System.out.println("Total number of spaces is " + counter);

        }
        catch (IOException e)
        {
            System.err.println("Error reading or writing the file: " + e.getMessage());
        }
    }
}
