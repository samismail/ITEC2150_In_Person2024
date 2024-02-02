package bedroom;

public class Ceiling {

    private int numberOfLights;
    private String color;
    private Size size;

    public Ceiling(int numberOfLights, String color, Size size) {
        this.numberOfLights = numberOfLights;
        this.color = color;
        this.size = size;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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


}
