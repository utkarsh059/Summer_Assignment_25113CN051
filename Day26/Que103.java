import java.util.Scanner;

public class Que103 {

    static int balance = 10000;

    public static void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    public static void withdraw(int amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public static void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    deposit(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    withdraw(sc.nextInt());
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 4);

        sc.close();
    }
}