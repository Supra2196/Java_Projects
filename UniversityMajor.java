import java.util.Scanner;
public class UniversityMajor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your College of choice (Engineering, Business, Science): ");
        String college = scan.nextLine();

        if (college.equalsIgnoreCase("Engineering"))
        {
            System.out.println("These are the following engineering majors:");
            engineering();
            System.out.print("Which do you prefer "+name);
        }
        else if (college.equalsIgnoreCase("Business"))
        {
            System.out.println("These are the following business majors:");
            business();
            System.out.print("Which do you prefer "+name);
        }
        else if (college.equalsIgnoreCase("Science"))
        {
            System.out.println("These are the following science majors:");
            science();
            System.out.println("Which do you prefer Mr/Mrs "+name);
        }
        else
        {
            System.out.println("Invalid college choice.");
        }

        scan.close();
    }

     static void engineering()
    {
        System.out.println("Mechanical Engineering");
        System.out.println("Electrical Engineering");
        System.out.println("Civil Engineering");
        System.out.println("Chemical Engineering");
        System.out.println("Computer Science");
        System.out.println("Aerospace Systems (Option: Commercial Pilot License or Air Force Pilot)");
    }

     static void business()
    {
        System.out.println("Accounting");
        System.out.println("Business Administration");
        System.out.println("Finance");
        System.out.println("Marketing");
        System.out.println("Management Information Systems");
    }

     static void science()
    {
        System.out.println("Mathematics (Option: Applied, Pure, Actuary Science)");
        System.out.println("Statistics");
        System.out.println("Data Science");
        System.out.println("Biology (With Pre-Med or Pre-Dental)");
        System.out.println("Chemistry (With Pre-Med or Pre-Dental)");
        System.out.println("Biochemistry (With Pre-Med or Pre-Dental)");
    }
}
