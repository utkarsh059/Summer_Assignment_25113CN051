import java.util.Scanner;

public class Que110 {

    static double balance = 5000;

    public static void deposit(double amount) {
        balance += amount;
    }

    public static void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public static void displayBalance() {
        System.out.println("Current Balance = " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    withdraw(sc.nextDouble());
                    break;

                case 3:
                    displayBalance();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 4);

        sc.close();
    }
}