import java.util.Scanner;

public class ChocolateWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the initial number of chocolates: ");
        int initialChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of wrappers needed for 1 free chocolate: ");
        int wrappersForFreeChocolate = scanner.nextInt();

        // Variables to keep track of total chocolates and wrappers
        int totalChocolates = initialChocolates;
        int wrappers = initialChocolates;

        // Calculate chocolates from wrappers
        while (wrappers >= wrappersForFreeChocolate) {
            int freeChocolates = wrappers / wrappersForFreeChocolate;
            totalChocolates += freeChocolates;
            wrappers = freeChocolates + (wrappers % wrappersForFreeChocolate);
        }

        // Display the result
        System.out.println("Total chocolates you can eat: " + totalChocolates);

        scanner.close();
    }
}
