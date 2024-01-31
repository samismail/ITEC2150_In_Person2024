package bedroom;

public class Bed {

    private int numberOfPillows
    private String size; // queen double twin king ect
    private String color;
    private String material; // wood metal

    public Bed(int numberOfPillows, String size, String color, String material) {
        this.numberOfPillows = numberOfPillows;
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public void setNumberOfPillows(int numberOfPillows) {
        this.numberOfPillows = numberOfPillows;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void make(){
        System.out.println("Bed class - make() method ");
    }
}