import java.util.Scanner;

public class BankingApp {
    // Variable to store user balance
    static double balance = 0.0;

    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);

        // username
        System.out.print("Please enter username: ");
        String username = scanner.next();

        // Welcome message
        System.out.println("Welcome " + username);

        // Display menu options
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt(); // User's choice

            // Handle user choice
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Banking App!");
                    scanner.close();
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }

    // Method to check balance
    public static void checkBalance() {
        System.out.printf("Your current balance is: R%.2f%n", balance);
    }

    // Method to deposit money
    public static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount; // Increase balance
            System.out.printf("R%.2f deposited successfully!%n", amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money
    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Decrease balance
            System.out.printf("R%.2f withdrawn successfully!%n", amount);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value or check your balance.");
        }
    }
}

