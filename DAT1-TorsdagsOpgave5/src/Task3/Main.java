package Task3;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Room room1 = new Room(2,4,3);
        Room room2 = new Room(4,2,0);
        Room room3 = new Room(1,20,30);

        ArrayList<Room> roomCollection = new ArrayList<Room>();

        roomCollection.add(room1);
        roomCollection.add(room2);
        roomCollection.add(room3);

        Building building1 = new Building(roomCollection,1,2,false);

        countLampsInBuilding(building1);
        isNormal(building1);
    }
    public static void countLampsInBuilding(Building building1)
    {
        int total = 0;
        for(Room i: building1.getRooms())
        {
            total = total + i.getNumberOfLamps();

        }
            System.out.println("There is a total of " + total + " Lamps");
    }
    public static boolean isNormal(Building building1)
    {
        if(building1.getNumberOfFloors() > building1.getRooms().size())
        {
            System.out.println("This is not an odd building");
            return true;
        }
        else
            System.out.println("This is an odd building");
            return false;
    }

}



