import java.util.Scanner;

public class Que116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] itemName = new String[5];
        int[] quantity = new int[5];

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Enter Item Name: ");
            itemName[i] = sc.nextLine();

            System.out.print("Enter Quantity: ");
            quantity[i] = sc.nextInt();
        }

        System.out.println("\n===== INVENTORY =====");

        for (int i = 0; i < n; i++) {
            System.out.println(itemName[i] + " --> " + quantity[i]);
        }

        sc.close();
    }
}