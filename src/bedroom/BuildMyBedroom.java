package bedroom;
/*Class: BuildMyBedroom
Author: Sam Ismail
Date: 02/02/2024
Description: tester class for Bedroom
 */

public class BuildMyBedroom {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Size size = new Size(10,10, 12);
        Ceiling ceiling = new Ceiling(4, "Grey", size);
        Bed bed = new Bed(2, "Queen", "Black", "Wood");
        Door door = new Door(new Size(3,8), "White", "Wood");
        Desk desk = new Desk("Black", "Rectangle", "Wood");

        Bedroom myBedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, door, desk, size);

        System.out.println(myBedroom);

    }
}
