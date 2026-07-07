import java.util.Scanner;

public class Que105 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[5];
        int[] age = new int[5];
        double[] marks = new double[5];

        int n;

        System.out.print("Enter Number of Students: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\n===== STUDENT RECORD =====");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.println("Name  : " + name[i]);
            System.out.println("Age   : " + age[i]);
            System.out.println("Marks : " + marks[i]);

        }

        sc.close();
    }
}