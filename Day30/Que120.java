import java.util.Scanner;

public class Que120 {

    static String[] name = new String[10];
    static int[] marks = new int[10];
    static int count = 0;

    public static void addStudent(Scanner sc) {

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;

        System.out.println("Student Added Successfully!");
    }

    public static void displayStudents() {

        if (count == 0) {
            System.out.println("No Student Record Found.");
            return;
        }

        System.out.println("\n===== STUDENT RECORD =====");

        for (int i = 0; i < count; i++) {

            System.out.println("Name  : " + name[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== MINI PROJECT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
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