import java.io.FileWriter;
import java.io.IOException;

public class ExamThreeQuestionThree {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\test.txt")) {
            writer.write("I like Pizza");
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println("Could not write file");
            e.printStackTrace();
        }
    }
}
