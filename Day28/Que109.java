import java.util.Scanner;

public class Que109 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Java Programming",
                "Python Basics",
                "Data Structures",
                "Operating System",
                "Computer Networks"
        };

        boolean[] issued = new boolean[5];

        int choice;

        do {

            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < books.length; i++) {
                        System.out.println((i + 1) + ". " + books[i]
                                + (issued[i] ? " (Issued)" : " (Available)"));
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Number: ");
                    int issue = sc.nextInt() - 1;

                    if (!issued[issue]) {
                        issued[issue] = true;
                        System.out.println("Book Issued Successfully.");
                    } else {
                        System.out.println("Book Already Issued.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Number: ");
                    int ret = sc.nextInt() - 1;

                    issued[ret] = false;
                    System.out.println("Book Returned Successfully.");
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