import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\supra\\OneDrive\\Documents\\CS-115\\example5.txt";
        try (FileWriter writer = new FileWriter(filePath, true))//Writer will only write in append mode
        {
            writer.write("Hello, world!\n");
            writer.write("This is a new line.\n");
        }

        catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}