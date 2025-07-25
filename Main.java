package hotelReservationSystem;
import java.io.IOException;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Room> rooms = BookingManager.loadRooms();
        Hotel hotel = new Hotel(rooms);

        while (true) {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Make a Booking");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter category (Standard/Deluxe/Suite): ");
                    String cat = sc.nextLine();
                    List<Room> available = hotel.getAvailableRooms(cat);
                    if (available.isEmpty()) {
                        System.out.println("No rooms available in this category.");
                    } else {
                        for (Room r : available) {
                            System.out.println("Room No: " + r.getRoomNumber());
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter room category (Standard/Deluxe/Suite): ");
                    String cat = sc.nextLine();
                    Room booked = hotel.bookRoom(cat);
                    if (booked != null) {
                        Booking booking = new Booking(name, booked.getRoomNumber(), cat);
                        BookingManager.saveBooking(booking);
                        BookingManager.saveRooms(hotel.getAllRooms());
                        System.out.println("Booking Successful! Room No: " + booked.getRoomNumber());
                        System.out.println("Payment Successful (Simulated).");
                    } else {
                        System.out.println("No room available in this category.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter room number to cancel: ");
                    int rn = sc.nextInt();
                    hotel.cancelBooking(rn);
                    BookingManager.cancelBooking(name, rn);
                    BookingManager.saveRooms(hotel.getAllRooms());
                    System.out.println("Booking cancelled.");
                }
                case 4 -> BookingManager.viewBookings();
                case 5 -> {
                    System.out.println("Exiting system.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
