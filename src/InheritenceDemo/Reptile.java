package InheritenceDemo;

public class Reptile extends Animal{
    private boolean hasTail;
    private String skinColor;
    private boolean hasLegs;
    private boolean hasShell;

    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasTail,
                   String skinColor, boolean hasLegs, boolean hasShell) {
        super(true, 0, "carnivore");
        this.hasTail = hasTail;
        this.skinColor = skinColor;
        this.hasLegs = hasLegs;
        this.hasShell = hasShell;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(" ssssssss~~~ ");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" sssssoo taste!");
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public boolean isHasShell() {
        return hasShell;
    }

    public void setHasShell(boolean hasShell) {
        this.hasShell = hasShell;
    }
}
