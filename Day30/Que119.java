import java.util.Scanner;

public class Que119 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] employee = new String[5];
        int[] id = new int[5];

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            employee[i] = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            id[i] = sc.nextInt();
        }

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        for (int i = 0; i < n; i++) {

            System.out.println("Employee Name : " + employee[i]);
            System.out.println("Employee ID   : " + id[i]);
            System.out.println();
        }

        sc.close();
    }
}