import java.util.Scanner;

public class Que117 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[5];
        int[] roll = new int[5];
        double[] marks = new double[5];

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            roll[i] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\n===== STUDENT RECORD =====");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name  : " + name[i]);
            System.out.println("Roll  : " + roll[i]);
            System.out.println("Marks : " + marks[i]);
        }

        sc.close();
    }
}