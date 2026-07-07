import java.util.Scanner;

public class Que118 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Java",
                "Python",
                "C Programming",
                "DBMS",
                "Operating System"
        };

        System.out.println("===== BOOK LIST =====");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter Book Number to Issue: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= books.length) {
            System.out.println("You Issued: " + books[choice - 1]);
        } else {
            System.out.println("Invalid Book Number.");
        }

        sc.close();
    }
}