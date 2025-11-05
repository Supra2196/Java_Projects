import java.util.Scanner;

public class BankAccountManager
{
    public static void main(String[] args)
    {
        int amount = 100;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name = scan.nextLine();
        System.out.print("Hello "+name+" Press 1 to Deposit, Press 2 to Withdraw, Press 3 to Check Balance:");
        int choice = scan.nextInt();

        if (choice == 1)
        {
            amount = deposit(amount, scan);
            System.out.println("Your new balance is: $" + amount);
        }
        else if (choice == 2)
        {
			amount = withdraw(amount,scan);
			System.out.println("Your balance now is: $" + amount);
		}
        else if (choice == 3)
        {
			System.out.println("You have:$"+amount);
		}
    }

    public static int deposit(int amount, Scanner scan)
    {
        System.out.println("How much do you want to deposit?");
        int depositAmount = scan.nextInt();
        amount += depositAmount;
        return amount;
    }
    public static int withdraw(int amount, Scanner scan)
    {
		System.out.print("How much do you want to withdraw?");
		int withdrawAmmount=scan.nextInt();
		if(amount>withdrawAmmount)
		{
			amount -= withdrawAmmount;
		}
		else
		{
			System.out.println("You have insufficient Money");
		}
		return amount;
	}
}
