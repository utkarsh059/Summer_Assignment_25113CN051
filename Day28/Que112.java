import java.util.Scanner;

public class Que112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] numbers = new String[10];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== Contact Management =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    numbers[count] = sc.nextLine();

                    count++;

                    System.out.println("Contact Saved Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Contacts Found.");
                    } else {

                        System.out.println("\n===== Contact List =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + names[i] + " - " + numbers[i]);
                        }
                    }

                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}