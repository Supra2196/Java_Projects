public class ExamThree {
    public static void main(String[] args) {
        final double mySalary = 985.43;
        Employee empone = new Employee();
        System.out.println("Name is " + empone.GetFirstName() + " " + empone.GetLastName());
        if (empone.SetSalary(mySalary)) {
            System.out.println("Salary set to $" + mySalary);
        } else {
            System.out.println("Salary not set");
            System.out.println("Salary is " + empone.GetSalary());
        }
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private final double MAXSALARY = 1000000.9;
    private final double STARTSALARY = 1313.00;

    public Employee() {
        firstName = "NoF";
        lastName = "NoL";
        salary = STARTSALARY;
        System.out.println("Constructor Called for Employee");
        System.out.println("Salary is: " + salary);
    }

    public String GetFirstName() {
        System.out.println("GetFirstName() Called");
        return firstName;
    }

    public String GetLastName() {
        System.out.println("GetLastName() Called");
        return lastName;
    }

    public double GetSalary() {
        System.out.println("GetSalary() Called");
        return salary;
    }

    public boolean SetSalary(double passedSalary) {
        System.out.println("SetSalary() Called with $" + passedSalary);
        if (passedSalary <= MAXSALARY) {
            salary = passedSalary;
            return true;
        } else {
            return false;
        }
    }
}
