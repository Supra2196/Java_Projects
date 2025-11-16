import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;


class UserInput {
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        File file = new File("C:\\Users\\supra\\OneDrive\\Pictures\\JAVAPROGRAMS\\input.txt");
        PrintWriter filePrint = new PrintWriter(new FileWriter(file, true));

        //FIRST USER INPUT
        System.out.println("Enter your name:");
        String nameone = scan.nextLine();
        System.out.println("Enter first test mark:");
        int uiuno = scan.nextInt();
        System.out.println("Enter second test mark:");
        int uidos = scan.nextInt();
        System.out.println("Enter third test mark:");
        int uitres = scan.nextInt();
        int sum = uiuno + uidos + uitres;
        double average = sum / 3.0;
        System.out.println("Name: " + nameone);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        filePrint.println("Name: " + nameone);
        filePrint.println("Marks: " + uiuno + ", " + uidos + ", " + uitres);
        filePrint.println("Sum: " + sum);

        filePrint.println("Average: " + average);
        scan.nextLine(); // Consume newline left after nextInt()
		//SECOND USER INPUT
        System.out.println("Enter your name:");
        String nametwo = scan.nextLine();
        System.out.println("Enter first test mark:");
        int testmarkone = scan.nextInt();
        System.out.println("Enter second test mark:");
        int testmarktwo = scan.nextInt();
        System.out.println("Enter third test mark:");
        int testmarkthree = scan.nextInt();
        int sumtwo = testmarkone + testmarktwo + testmarkthree;
        double averagetwo = sumtwo / 3.0;
        System.out.println("Name: " + nametwo);
        System.out.println("Sum: " + sumtwo);
        System.out.println("Average: " + averagetwo);
        filePrint.println("Name: " + nametwo);
        filePrint.println("Marks: " + testmarkone + ", " + testmarktwo + ", " + testmarkthree);
        filePrint.println("Sum: " + sumtwo);
        filePrint.println("Average: " + averagetwo);
        filePrint.close();
    }
}
