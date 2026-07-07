import java.util.Scanner;

public class Que104 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== JAVA QUIZ =====");

        System.out.println("\n1. Java is?");
        System.out.println("A. Programming Language");
        System.out.println("B. Animal");
        System.out.println("C. Car");
        System.out.print("Enter Answer: ");

        char ans = sc.next().charAt(0);

        if (ans == 'A' || ans == 'a') {
            score++;
        }

        System.out.println("\n2. Extension of Java file?");
        System.out.println("A. .py");
        System.out.println("B. .java");
        System.out.println("C. .html");
        System.out.print("Enter Answer: ");

        ans = sc.next().charAt(0);

        if (ans == 'B' || ans == 'b') {
            score++;
        }

        System.out.println("\n3. Which keyword is used to create object?");
        System.out.println("A. new");
        System.out.println("B. class");
        System.out.println("C. static");
        System.out.print("Enter Answer: ");

        ans = sc.next().charAt(0);

        if (ans == 'A' || ans == 'a') {
            score++;
        }

        System.out.println("\nFinal Score = " + score + "/3");

        sc.close();
    }
}