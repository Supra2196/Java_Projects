import java.util.Scanner;

public class Greetings
{
    public static String greet(String namey)
    {
        return "Hello " + namey;
    }

    public static String greet(String namey, int agey)
    {
        return "Hello " + namey + ", you are " + agey + " years old.";
    }

    public static String greet(String namey, int agey, String cityy)
    {
        return "Hello " + namey + ", you are " + agey + " years old and you are from " + cityy + ".";
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("City: ");
        String city = scan.nextLine();

        System.out.println(greet(name));
        System.out.println(greet(name, age));
        System.out.println(greet(name, age, city));
    }
}
