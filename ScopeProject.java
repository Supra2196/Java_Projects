import java.util.Scanner;

public class ScopeProject
{
    public static String addNewExpense(String name, double expense)
    {
        return name + ", you have added $" + expense;
    }
    public static double resetExpenses()
    {
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double totalExpense = 0;
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        while(true)
        {
            System.out.println("\nMenu:");
            System.out.println("1 - Add a new expense");
            System.out.println("2 - Show total expenses");
            System.out.println("3 - Reset expenses");
            System.out.println("4 - Exit");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            scan.nextLine(); // consume leftover newline

            if(choice == 1)
            {
                while(true)
                {
                    System.out.print("Enter expense name (or type 'break' to stop): ");
                    String expenseName = scan.nextLine();
                    if(expenseName.equalsIgnoreCase("break"))
                    {
                        break;
                    }

                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scan.nextDouble();
                    scan.nextLine(); // consume leftover newline

                    totalExpense += expenseAmount;
                    System.out.println(addNewExpense(expenseName, expenseAmount));
                }
            }
            else if(choice == 2)
            {
                System.out.println("Total Expenses: $" + totalExpense);
            }
            else if(choice == 3)
            {
                totalExpense = resetExpenses();
                System.out.println("Expenses have been reset.");
            }
            else if(choice == 4)
            {
                System.out.println("Exiting program. Goodbye!");
                break;
            }
            else
            {
                System.out.println("Invalid choice. Try again.");
            }
        }

    }
}
