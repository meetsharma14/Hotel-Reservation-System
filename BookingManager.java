package hotelReservationSystem;
import java.io.*;
import java.util.*;

public class BookingManager {
    private static final String ROOMS_FILE = "rooms.txt";
    private static final String BOOKINGS_FILE = "bookings.txt";

    public static List<Room> loadRooms() throws IOException {
        List<Room> rooms = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(ROOMS_FILE));
        String line;
        while ((line = br.readLine()) != null) {
            rooms.add(Room.fromString(line));
        }
        br.close();
        return rooms;
    }

    public static void saveRooms(List<Room> rooms) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ROOMS_FILE));
        for (Room r : rooms) {
            bw.write(r.toString());
            bw.newLine();
        }
        bw.close();
    }

    public static List<Booking> loadBookings() throws IOException {
        List<Booking> bookings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(BOOKINGS_FILE));
        String line;
        while ((line = br.readLine()) != null) {
            bookings.add(Booking.fromString(line));
        }
        br.close();
        return bookings;
    }

    public static void saveBooking(Booking booking) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(BOOKINGS_FILE, true));
        bw.write(booking.toString());
        bw.newLine();
        bw.close();
    }

    public static void cancelBooking(String name, int roomNumber) throws IOException {
        List<Booking> bookings = loadBookings();
        bookings.removeIf(b -> b.getName().equalsIgnoreCase(name) && b.getRoomNumber() == roomNumber);
        BufferedWriter bw = new BufferedWriter(new FileWriter(BOOKINGS_FILE));
        for (Booking b : bookings) {
            bw.write(b.toString());
            bw.newLine();
        }
        bw.close();
    }

    public static void viewBookings() throws IOException {
        List<Booking> bookings = loadBookings();
        System.out.println("\n--- All Bookings ---");
        for (Booking b : bookings) {
            System.out.println("Name: " + b.getName() + ", Room: " + b.getRoomNumber() + ", Category: " + b.getCategory());
        }
    }
}
