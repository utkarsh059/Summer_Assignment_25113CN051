import java.util.Scanner;

public class Que106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] empName = new String[5];
        int[] empId = new int[5];
        double[] empSalary = new double[5];

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextInt();

            System.out.print("Enter Salary: ");
            empSalary[i] = sc.nextDouble();
        }

        System.out.println("\n===== EMPLOYEE RECORD =====");

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Name   : " + empName[i]);
            System.out.println("ID     : " + empId[i]);
            System.out.println("Salary : " + empSalary[i]);
        }

        sc.close();
    }
}