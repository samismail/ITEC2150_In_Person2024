package bedroom;
/*Class: Door
Author: Sam Ismail
Date: 02/02/2024
Description: class to output door size and info
 */

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

    public double getWidth(){
        return size.getWidth();
    }

    public void setWidth(Size size, double width){
        // size = new Size();
        this.size = size;
        size.setWidth(width);
    }

    public double getLength(){
        return size.getLength();
    }

    public void setLength(Size size, double length){
        this.size = size;
        size.setLength(length);
    }

    @Override
    public String toString() {
        return  "Color: " + color +
                ", Material: " + material +
                " Dimensions: " + getLength() + " ft by " + getWidth() + " ft";
    }
}
