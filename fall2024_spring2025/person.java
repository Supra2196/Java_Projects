import java.util.Scanner;
import java.util.Random;
public class person
{
	public static void main(String[] args)
	{
		/*//MENU
		while(true)
		{
		System.out.println("1 is for Addition");
		System.out.println("2 is for Subtraction");
		System.out.println("3 is for Multiplication");
		System.out.println("4 is for Division");
		System.out.println("5 is for Exit");

		//FIRST USER INPUT
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number from 1-5");
		int numberinput=scan.nextInt();
		System.out.println("You entered"+numberinput);
		//SECOND USER INPUT
		Scanner casescanner = new Scanner(System.in);
		System.out.println("Enter a first number");
		int firstnumber=scan.nextInt();
		System.out.println("Enter a second number");
		int secondnumber=scan.nextInt();


		    //Use Switch
		 switch(numberinput)
		    {
		      case 1:
		      System.out.println("Result is "+(firstnumber+secondnumber));
		      break;
		      case 2:
		      System.out.println("Result is "+(firstnumber-secondnumber));
		      break;
		      case 3:
		      System.out.println("Result is "+(firstnumber*secondnumber));
		      break;
		      case 4:
		      System.out.println("Result is "+(firstnumber/secondnumber));
		      break;
		      case 5:
		      System.out.println("All right have a good day!");
		      break;
		      default:
		      System.out.println("Thank you for using it ");
		      break;
    		}
    	if(numberinput == 5)
    	{
			break;
		}
		*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an adjective (description):");
		String adjective1=scanner.nextLine();
		System.out.print("Enter a noun (animal or person):");
		String noun1=scanner.nextLine();
		System.out.print("Enter an adjective(description):");
		String adjective2=scanner.nextLine();;
		System.out.print("Enter a verb end with -ing(action):");
		String verb1=scanner.nextLine();
		System.out.println("Today I went to a " + adjective1 +" zoo.");
		System.out.println("In an exhibit I saw a " + noun1 +".");
		System.out.println(noun1 + " was "+ adjective2 +" and " + verb1 + "!");
		scanner.close();
		int x=10;
		int y=2;
		int z;
		z=x+y;
		System.out.println(z);
		z=x-y;
		System.out.println(z);
		z=x*y;
		System.out.println(z);
		z=x/y;
		System.out.println(z);
		z=x%y;
		System.out.println(z)*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("What item would you like to buy?: ");
		String item  = scanner.nextLine();
		System.out.println(item);
		System.out.print("What is the price for each?:  ");
		double price = scanner.nextDouble();
		System.out.print("How much would you like?:   ");
		int quantity=scanner.nextInt();
		double total = price *quantity;
		System.out.println("You would like a " + item +".Your cost is $"+total);*/


		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter a your age: ");
		int age = scanner.nextInt();
		System.out.print("Are youy a student (true/false): ");
		boolean isStudent = scanner.nextBoolean();
		if(name.isEmpty())
		{
			System.out.println("You didn't enter your name!");
		}
		else
		{
			System.out.println("Hello "+ name+"!");
		}
		if(isStudent)
		{
			System.out.println("You are a student");
		}
		else
		{
			System.out.println("You are NOT a Student");
		}

		if(age >=18)
		{
			System.out.println("You are an adult!");
		}
		else if(age <0)
		{
			System.out.println("You havent been born yet!");
		}
		else if(age >=65)
		{
			System.out.println("You are a senior!");
		}
		else if(age == 0)
		{
			System.out.println("You are a baby!");
		}
		else
		{
			System.out.println("You are a child!");
		}
		scanner.close();*/

		/*Random random = new Random();
		boolean isHeads;
		isHeads = random.nextBoolean();
		System.out.println(isHeads);
		if(isHeads)
		{
			System.out.println("Heads");
		}
		else
		{
			System.out.println("Tails");
		}
		*/
		/*System.out.println(Math.PI);
		System.out.println(Math.E);
		double result;
		result = Math.pow(2,5);
		result = Math.abs(-5);
		result = Math.sqrt(9);
		result = Math.round(3.14);
		result = Math.ceil(3.14);
		result = Math.floor(3.99);
		result = Math.max(10,20)
		System.out.println(result);*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side A:");
		double a=scan.nextDouble();
		System.out.println("Enter the length of side B:");
		double b=scan.nextDouble();
		System.out.println("Enter the length of side C:");
		double b=scan.nextDouble();
		double c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		System.out.println("The hypotnuse (side  c) "+ c +" cm");
		scan.close();*/
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scan.nextDouble();
		double circumference= 2*3.14*radius;
		System.out.println("The circumference is:" + circumference +" cm");
		System.out.println("");
		double area = 3.14*radius*radius;
		System.out.println("The area is:" + area +" cm^2");
		System.out.println("");
		double volume = (4.0/3.0) * 3.14 * Math.pow(radius,3);
		System.out.println("");
		System.out.println("The volume is:" + area +" cm^3");
		scan.close();*/
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter the principal: ");
		double principal = scan.nextDouble();
		System.out.print("Enter the rate: ");
		double rate = scan.nextDouble();
		System.out.print("Enter the total number of period: ");
		int period = scan.nextInt();
		System.out.print("Enter the total number of years: ");
		int years = scan.nextInt();
		double rateperiod=rate/period;
		int periodyears =period*years;
		double amount = principal*Math.pow((1+rateperiod),periodyears);
		System.out.println("Ammount is $"+amount);*/
		/*String name="Ranga";
		int length = name.length();
		char letter = name.charAt(1);
		int index = name.indexOf(" ");
		name = name.toUpperCase();
		name = name.toLowerCase();
		name = name.trim();
		name = name.replace("o", "a");
		System.out.println(name);
		if(name.isEmpty())
		{
			System.out.println("Your name is empty");
		}
		else
		{
			System.out.println("Hello "+name);
		}
		if(name.contains(" "))
		{
			System.out.println("Your name contains a space");
		}
		else
		{
			System.out.println("Your name has no space");
		}*/
		/*String email = "Bro123@gmail.com";
		String username = email.substring(0,email.indexOf("@"));
		System.out.println(username);
		String domain = email.substring(email.indexOf("@")+1);
		System.out.println(domain);*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Do u want in kg or lbs?");
		String choice = scan.nextLine();
		System.out.println("Enter a value");
		double value = scan.nextInt();
		if(choice.equals("kg"))
		{
			System.out.println((value*2.20462)+"Kilograms");
		}
		else if(choice.equals("lbs"))
		{
			System.out.println((value*0.453592)+" Pounds");
		}
		scan.close();
		Scanner newscan = new Scanner(System.in);
		System.out.println("Do u want it in Celsius or Fahrenheit(C or F):");
		String temp_choice = newscan.nextLine();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a temperature");
		double temp = scan.nextDouble();
		double farhentempera = temp-32;
		if(temp_choice.equals("C"))
		{
			System.out.println("Temperature is "+((temp*9/5)+32)+"°F");
		}

		else if(temp_choice.equals("F"))
		{
			System.out.println("Temperature is "+(farhentempera*0.555555556)+"°C");
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day of the week: ");
		String day =scanner.nextLine();
		switch(day)
		{
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
					System.out.println("It is a weekday");
			case "Saturday", "Sunday" -> System.out.println("It is a weekend");
			default -> System.out.println(day + " is not a day");

		}*/
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int numbione = scan.nextInt();
		System.out.println("Enter your an operator(+,-,*,/,^)");
		char operator = scan.next().charAt(0);
		System.out.print("Enter your second number:");
		int numbitwo = scan.nextInt();
		switch(operator)
		{
			case '+':
			System.out.println("Sum is"+(numbione+numbitwo));
			break;
			case '-':
			System.out.println("Difference is"+(numbione-numbitwo));
			break;
			case '*':
			System.out.println("Product is"+(numbitwo*numbione));
			break;
			case '/':
			System.out.println("Quotient is"+(numbitwo/numbione));
			break;
			case '^':
			System.out.println("Exponent is "+Math.pow(numbione,numbitwo));
			default:
		}*/
		/*double temp =20;
		boolean isSunny = true;
		if(temp<=30 && temp>=0 && isSunny)
		{
			System.out.println("The weather is GOOD");
			System.out.println("It is SUNNY outside");
		}
		else if(temp<=30 && temp>=0 && !isSunny)
		{
			System.out.println("The weather is GOOD");
			System.out.println("It is CLOUDY outside");
		}
		else if(temp >30 || temp < 0)
		{
			System.out.println("The weather is bad");
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your new username:");
		String username = scanner.nextLine();
		if(username.length()<4 || username.length()>12)
		{
			System.out.println("Username must be between 4-12 characters");
		}
		else if(username.contains(" ") || username.contains("_"))
		{
			System.out.println("Username must not contain space or underscore");
		}
		else
		{
			System.out.println("Welcome "+username);
		}
		scanner.close();
		/*Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isEmpty())
		{
			System.out.print("Enter your name:");
			name= scanner.nextLine();
		}
		System.out.println(name);
		scanner.close();
		Scanner scanner = new Scanner(System.in);
		String response="";
		while(!response.equals("Q"))
		{
			System.out.println("You are playing a game");
			System.out.println("Press Q to quit: ");
			response = scanner.next().toUpperCase();
		}
		System.out.println("You have quit the game");
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int guess;
		int attempts=0;
		int randomNumber = random.nextInt(1,51);
		System.out.print("Number Guessing Game");
		System.out.print("Guess a number between 1-51");
		do
		{
			System.out.println(" Enter a guess");
			guess = scanner.nextInt();
			attempts++;
			if(guess<randomNumber)
			{
				System.out.println("Too low");
			}
			else if(guess>randomNumber)
			{
				System.out.println("Too high");
			}
			else
			{
				System.out.println("Answer is "+randomNumber);
				System.out.println("No of attempts "+attempts);
			}
		}while(guess != randomNumber);
		System.out.println("You have won")
		for(int i =0; i<10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.print(i+" ");
		};
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		char symbol;
		System.out.print("Enter the number of rows:");
		rows = scanner.nextInt();
		System.out.print("Enter the number of columns:");
		columns = scanner.nextInt();
		System.out.print("Enter the symbol to use:");
		symbol = scanner.next().charAt(0);
		for(int i =0; i<rows; i++)
		{
		for(int i =0;i<columns; i++)
		{
			System.out.println(symbol);
		}
		}
		scanner.close();*/
		String name = "Bro";
		int age =25;
		happyBirthday(name);
		public static void happyBirthday(String name, int age)
		{
			System.out.println("Happy Birthday to you !");
			System.out.println("Happy Birthday dear you !");
			System.out.println("You are x years old!");
			System.out.println("Happy Birthday to you!");
		}
    }
}