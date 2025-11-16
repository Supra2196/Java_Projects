import java.util.Scanner;

public class RetirementGoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int years = 0;
        double annualSavings = 0;

        // Get valid years
        while (years <= 0) {
            System.out.print("How many years until retirement? >> ");
            years = input.nextInt();
            if (years <= 0) {
                System.out.println("Please enter a positive number of years.");
            }
        }

        // Get valid annual savings
        while (annualSavings <= 0) {
            System.out.print("How much can you save annually? >> ");
            annualSavings = input.nextDouble();
            if (annualSavings <= 0)
            {
                System.out.println("Please enter a positive amount.");
            }
        }

        // Without interest
        double totalWithoutInterest = years * annualSavings;
        System.out.printf("If you save $%.2f for %d years without interest, you will have $%.2f%n",
                          annualSavings, years, totalWithoutInterest);

        // With 4% interest
        double totalWithInterest = 0;
        double interestRate = 0.04;
        double runningtotal = 0;
        for (int i = 1; i <= years; i++)
        {
            totalWithInterest = (totalWithInterest + annualSavings) * (interestRate);
            runningtotal+=annualSavings;
            runningtotal+=(runningtotal*interestRate);
            System.out.println("Year: "+i+" Running Total:"+runningtotal);
        }


        System.out.printf("If you save $%.2f for %d years, with 4.0%% interest, you will have $%.2f%n",
                          annualSavings, years, runningtotal);
    }
}
