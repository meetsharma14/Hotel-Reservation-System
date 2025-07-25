package hotelReservationSystem;
public class Room {
    private int roomNumber;
    private String category; // Standard, Deluxe, Suite
    private boolean isAvailable;

    public Room(int roomNumber, String category, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    @Override
    public String toString() {
        return roomNumber + "," + category + "," + isAvailable;
    }

    public static Room fromString(String line) {
        String[] parts = line.split(",");
        return new Room(Integer.parseInt(parts[0]), parts[1], Boolean.parseBoolean(parts[2]));
    }
}
