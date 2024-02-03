package bedroom;
/*Class: Bedroom
Author: Sam Ismail
Date: 02/02/2024
Description: main class to output all information of bedroom
 */

import java.awt.geom.Area;

public class Bedroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Door door;
    private Desk desk;
    private Size size;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Door door, Desk desk, Size size) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.door = door;
        this.desk = desk;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void makeBed(){
        System.out.println("makeBed() method from Bedroom class makes bed");
        this.make(); // from bedroom class (current class)
        bed.make(); //from Bed class
    }

    public void make(){
        straightenedSheet();

    }

    public void straightenedSheet(){
        System.out.println("Straightening the sheet");
    }

    @Override
    public String toString() {
        return  "               " + name + '\n' + "                  Walls" + '\n' +
                "Wall 1" + wall1 +
                ", Wall 2" + wall2 +
                ", Wall 3" + wall3 +
                ", Wall 4" + wall4 + '\n' +
                "                 Room Dimensions "+ '\n' + size + '\n' +
                "                  Ceiling " + '\n' + ceiling + '\n' +
                "                  Bed " + '\n' + bed + '\n' +
                "                  Door " + '\n' + door + '\n' +
                "                  Desk " + '\n' + desk;
    }
}
