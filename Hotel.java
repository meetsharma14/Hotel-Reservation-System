package hotelReservationSystem;
import java.util.*;

public class Hotel {
    private List<Room> rooms;

    public Hotel(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getAvailableRooms(String category) {
        List<Room> available = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getCategory().equalsIgnoreCase(category) && room.isAvailable()) {
                available.add(room);
            }
        }
        return available;
    }

    public Room bookRoom(String category) {
        for (Room room : rooms) {
            if (room.getCategory().equalsIgnoreCase(category) && room.isAvailable()) {
                room.setAvailable(false);
                return room;
            }
        }
        return null;
    }

    public void cancelBooking(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(true);
                break;
            }
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
