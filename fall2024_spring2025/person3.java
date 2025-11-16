import java.util.Random;
import java.util.Scanner;
public class person3
{
public static void main(String[] args)
{
	/*Scanner scanner = new Scanner(System.in);
	System.out.println("What do you choose (rock,papper,scissors)");
	Random random = new Random();
	String[] choices = {"rock", "paper", "scissors"};
	String playerChoice;
	String computerChoice;
	playerChoice = scanner.nextLine().toLowerCase();

	if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors"))
	{
		System.out.println("Invalid choice");
	}
	computerChoice = choices[random.nextInt(3)];
	System.out.println("Computer Choice:"+ computerChoice);
	scanner.close();
	//PLAYER WIN
	if(playerChoice.equals("rock")&&computerChoice.equals("scissors"))
	{
		System.out.println("You Win!");
	}
	else if(playerChoice.equals("scissors")&&computerChoice.equals("paper"))
	{
		System.out.println("You Win!");
	}
	else if(playerChoice.equals("paper")&&computerChoice.equals("rock"))
	{
		System.out.println("You Win!");
	}
	//PLAYER TIE
	else if(playerChoice.equals("rock")&&computerChoice.equals("rock"))
	{
			System.out.println("Tie!");
	}
	else if(playerChoice.equals("paper")&&computerChoice.equals("paper"))
	{
			System.out.println("Tie!");
	}
	else if(playerChoice.equals("scissors")&&computerChoice.equals("scissors"))
	{
			System.out.println("Tie!");
	}
	else
	{
		System.out.println("You lose!");
	}
	Car cars = new Car();
	Car cars2 = new Car();
	System.out.println(cars.make + " "+ cars.model);
	System.out.println(cars2.make + " "+ cars2.model);
	Student student1 = new Student("Ranga", "21", "3.3");
	Student student2 = new Student("Radus", "20", "3.0");
	Student student3 = new Student("Zudarzahn", "19", "2.6");

	System.out.println(student1.name);
	System.out.println(student1.age);
	System.out.println(student1.gpa);


	System.out.println(student2.name);
	System.out.println(student2.age);
	System.out.println(student2.gpa);


	System.out.println(student3.name);
	System.out.println(student3.age);
	System.out.println(student3.gpa);*/
	Car car = new Car("Charger","Yellow",10000);
	car.setColor("Blue");
	car.setPrice(5000);
	System.out.println(car.getModel() + " " + car.getColor()+ " "+car.getPrice());


}
}