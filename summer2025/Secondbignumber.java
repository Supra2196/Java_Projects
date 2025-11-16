import java.util.Scanner;

public class Secondbignumber {

    // User-defined function to find second largest element
    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1; // assume -1 if not found

        // Step 1: Find largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Step 2: Find second largest (less than largest)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) {
                if (secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function
        int result = findSecondLargest(arr);

        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + result);
        }

        sc.close();
    }
}
