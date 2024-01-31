package bedroom;

public class Door {

    private Size size;
    private String color;
    private String material;

    public Door(Size size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
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
}
