import java.util.Scanner;

public class Que111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 10;
        int bookedSeats = 0;

        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (bookedSeats < totalSeats) {
                        bookedSeats++;
                        System.out.println("Ticket Booked Successfully!");
                        System.out.println("Seat Number: " + bookedSeats);
                    } else {
                        System.out.println("Sorry! No seats available.");
                    }
                    break;

                case 2:
                    System.out.println("Available Seats: " + (totalSeats - bookedSeats));
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