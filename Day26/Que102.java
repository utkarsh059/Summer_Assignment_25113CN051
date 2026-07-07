import java.util.Scanner;

public class Que102 {

    public static void checkEligibility(int age) {

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkEligibility(age);

        sc.close();
    }
}