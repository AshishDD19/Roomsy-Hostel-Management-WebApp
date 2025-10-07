package in.ashish.hostelapp.dtao;


public class Room {
    private int roomId;
    private String roomNumber;
    private int capacity;
    private int currentOccupancy;
    private String status;
    private String type;

    public Room() {}

    public Room(int roomId, String roomNumber, int capacity, int currentOccupancy,
                String status, String type) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.currentOccupancy = currentOccupancy;
        this.status = status;
        this.type = type;
    }

    public int getRoomId() { return roomId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public int getCurrentOccupancy() { return currentOccupancy; }
    public void setCurrentOccupancy(int currentOccupancy) { this.currentOccupancy = currentOccupancy; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Room [roomId=" + roomId + ", roomNumber=" + roomNumber +
               ", capacity=" + capacity + ", currentOccupancy=" + currentOccupancy +
               ", status=" + status + ", type=" + type + "]";
    }
}

