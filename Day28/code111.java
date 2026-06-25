package Day28;

import java.util.Scanner;
//seat
class Seat{
    private final int seatNumber;
    private boolean isBooked;
    private String customerName;
        public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
        this.customerName = "";
    }
    public int getSeatNumber() { return seatNumber; }
    public boolean isBooked() { return isBooked; }
    public String getCustomerName() { return customerName; }
    public synchronized boolean book(String customerName) {
        if (!this.isBooked) {
            this.isBooked = true;
            this.customerName = customerName;
            return true;
        }
        return false;
    }

    public synchronized void cancel() {
        this.isBooked = false;
        this.customerName = "";
    }
}
//ticket booking system
class TicketBookingSystem {
    private final Seat[] seats;

    public TicketBookingSystem(int totalSeats) {
        seats = new Seat[totalSeats];
        for (int i = 0; i < totalSeats; i++) {
            seats[i] = new Seat(i + 1);
        }
    }

    // Displays the layout map of the tickets
    public void displaySeatMap() {
        System.out.println("\n===== CURRENT SEATING ARRANGEMENT =====");
        System.out.println("[01-10]: Front Row | [11-20]: Back Row\n");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].isBooked()) {
                System.out.printf("[X: Seat %02d]  ", seats[i].getSeatNumber());
            } else {
                System.out.printf("[_: Seat %02d]  ", seats[i].getSeatNumber());
            }
            if ((i + 1) % 5 == 0) System.out.println(); 
        }
        System.out.println("=======================================");
    }

    // Handles ticket booking
    public void processBooking(int seatNumber, String name) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("❌ Invalid seat number! Please select between 1 and " + seats.length);
            return;
        }

        Seat selectedSeat = seats[seatNumber - 1];
        if (selectedSeat.book(name)) {
            System.out.println("✅ Success! Seat " + seatNumber + " successfully reserved for " + name + ".");
        } else {
            System.out.println("❌ Sorry, Seat " + seatNumber + " is already taken by " + selectedSeat.getCustomerName() + ".");
        }
    }

    // Handles ticket cancellations
    public void processCancellation(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("❌ Invalid seat number!");
            return;
        }

        Seat selectedSeat = seats[seatNumber - 1];
        if (selectedSeat.isBooked()) {
            System.out.println("🔄 Ticket cancelled for Seat " + seatNumber + " (Previously: " + selectedSeat.getCustomerName() + ").");
            selectedSeat.cancel();
        } else {
            System.out.println("❌ This seat is already empty.");
        }
    }
}
public class code111 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        TicketBookingSystem system = new TicketBookingSystem(20); // Initializes a 20-seat ticket layout
        boolean running = true;

        System.out.println("🚀 Welcome to the Advanced Java Ticket Booking Engine!");

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Cancel a Ticket");
            System.out.println("4. Exit Application");
            System.out.print("Select your choice (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid option. Please key in a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // clears buffer

            switch (choice) {
                case 1:
                    system.displaySeatMap();
                    break;
                case 2:
                    system.displaySeatMap();
                    System.out.print("Enter Seat Number to book: ");
                    int bookSeat = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Passenger/Customer Name: ");
                    String name = scanner.nextLine();
                    system.processBooking(bookSeat, name);
                    break;
                case 3:
                    System.out.print("Enter Seat Number to cancel reservation: ");
                    int cancelSeat = scanner.nextInt();
                    system.processCancellation(cancelSeat);
                    break;
                case 4:
                    System.out.println("👋 Thank you for using the Ticket Booking System!");
                    running = false;
                    break;
                default:
                    System.out.println("❌ Option out of bounds. Select 1 to 4.");
            }
        }
        scanner.close();
    }
}
