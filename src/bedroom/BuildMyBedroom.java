package bedroom;

public class BuildMyBedroom {
    public static void main(String[] args) {

        Wall w1 = new Wall("North");
        Wall w2 = new Wall("South");
        Wall w3 = new Wall("East");
        Wall w4 = new Wall("West");
        Size size = new Size(10,5);
        Ceiling ceiling = new Ceiling(4, "Grey", size);
        Bed bed = new Bed(2, size, "black", "wood");
        Door door = new Door();
        Desk desk = new Desk();

        Bedroom myBedroom = new Bedroom("My Bedroom", w1, w2, w3, w4, ceiling, bed, door, desk);

    }
}
