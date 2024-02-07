package InheritenceDemo;

public class Reptile extends Animal{
    private boolean hasTail;
    private String skinColor;
    private boolean hasLegs;

    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasTail, String skinColor, boolean hasLegs) {
        super(true, 0, "carnivore");
        this.hasTail = hasTail;
        this.skinColor = skinColor;
        this.hasLegs = hasLegs;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(" ssssssss~~~");
    }

    @Override
    public void eat() {
        Mammal.eat();
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
}
