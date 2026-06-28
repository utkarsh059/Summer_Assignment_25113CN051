import java.util.Scanner;

public class Que46 {

    static boolean isArmstrong(int n) {

        int temp = n, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

        sc.close();
    }
}