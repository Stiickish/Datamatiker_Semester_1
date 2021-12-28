package TaskTwo;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Room> rooms = new ArrayList<Room>();


    public static void main(String[] args) {

        Room room1 = new Room(4,6,3,4);
        Room room2 = new Room(2,4,1,2);
        Room room3 = new Room(5,2,7,1);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,2,2,false); //Instantiere

        //printer alle lamper i hele bygningen
        System.out.println(building.getTotalLamps());

        if(building.getNumberOfFloors()>building.getRooms().size()){
            System.out.println("This is an odd building");
        }else{
            System.out.println("This is a normal building");
        }
    }
}
