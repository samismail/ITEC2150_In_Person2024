package bedroom;

public class Desk {
    private String color;
    private String Shape;
    private String material;

    public Desk(String color, String shape, String material) {
        this.color = color;
        Shape = shape;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String shape) {
        Shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
