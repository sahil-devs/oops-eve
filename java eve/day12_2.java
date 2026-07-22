public class Room {

    int roomNo;
    String type;
    double rate;
    boolean available;

    Room(int roomNo, String type, double rate) {
        this.roomNo = roomNo;
        this.type = type;
        this.rate = rate;
        available = true;
    }

    void bookRoom(int days) {

        if (available) {
            available = false;

            System.out.println("Room Booked");
            System.out.println("Room Number: " + roomNo);
            System.out.println("Type: " + type);
            System.out.println("Total Amount = Rs." + (rate * days));
        }

        else {
            System.out.println("Room Not Available");
        }
    }
}

public class day12_2 {

    public static void main(String[] args) {

        Room r = new Room(305, "Deluxe", 2500);

        r.bookRoom(3);
    }
} 
