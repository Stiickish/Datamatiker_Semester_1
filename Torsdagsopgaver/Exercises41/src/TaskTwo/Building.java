package TaskTwo;

import java.util.ArrayList;

public class Building {

    private final ArrayList<Room> Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> Rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.Rooms = Rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public int getTotalLamps() { // Tjekker alle rum for lamper
        int totalLamps = 0;

        for (Room r : Rooms) { //for each loop
            totalLamps += r.getNumberOfLamps();
        }
        return totalLamps; // returnere x antal lamper
    }
}

