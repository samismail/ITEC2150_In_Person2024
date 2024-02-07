package bedroom;
/*Class: Size
Author: Sam Ismail
Date: 02/02/2024
Description: class to output sizes for everything in the bedroom
 */

public class Size {

    private double height;
    private double width;
    private double length;

    public Size(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Size(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return  "Length: " + length +
                " Width: " + width +
                " Height: " + height;
    }
}
