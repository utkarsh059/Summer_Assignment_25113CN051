import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n == 1) {
            System.out.println("Nth Fibonacci term = 0");
        } else if (n == 2) {
            System.out.println("Nth Fibonacci term = 1");
        } else {
            int c = 0;

            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci term = " + b);
        }
    }
}