import java.util.Scanner;

public class SALESPERSON
{

    // Attributes
    String name;
    double totalMoney;



    // Non-Default Constructor
    public SALESPERSON(String name, double totalMoney) {
        this.name = name;
        this.totalMoney = totalMoney;
}

    // Default Constructor
    public SALESPERSON() {
        this.name = "Unknown";
        this.totalMoney = 0.0;
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    // Accessor for totalMoney
    public double getTotalMoney() {
        return totalMoney;
    }

    // Mutator for name
    public void setName(String name) {
        this.name = name;
    }

    // Mutator for totalMoney
    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    // Method to calculate commission
    public double calculateCommission()
{
		double comission;
        if (totalMoney >= 50000 && totalMoney < 100000)
        {
            System.out.println(0.05 * totalMoney);
            comission = (0.05 * totalMoney);
        }

        else if (totalMoney >= 100000 && totalMoney < 150000)
        {
           System.out.println(0.08 * totalMoney);
           comission = (0.08 * totalMoney);
        }

        else if (totalMoney >= 150000 && totalMoney <= 200000)
        {
            System.out.println(0.09 * totalMoney);
            comission = (0.09 * totalMoney);
        }
        else if (totalMoney > 200000)
        {
            System.out.println(0.10 * totalMoney);
            comission = (0.10 * totalMoney);
        }
        else
	    {
            System.out.println(0.0*totalMoney);
            comission = (0.0 * totalMoney);
        }
        return comission;


    }

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask their name
        System.out.println("Enter your name:");
        String salespersonName = scan.nextLine();

        // Ask how much money made
        System.out.println("Enter the amount of money made:");
        double salesAmount = scan.nextDouble();

        // Create an object of SALESPERSON
        SALESPERSON salesperson = new SALESPERSON(salespersonName, salesAmount);

        // Calculate and display commission
        double commission = salesperson.calculateCommission();
        System.out.println("Salesperson Name: " + salesperson.getName());
        System.out.println("Total Money Made: $" + salesperson.getTotalMoney());
        System.out.println("Commission Earned: $" + commission);
    }
}
equals 
to string
