package InheritenceDemo;

public class Mammal extends Animal{
    private boolean hasFur;
    private boolean giveBirth;

    public Mammal(boolean hasFur, boolean giveBirth){
        super(false, 2, "Omnivore");
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(" Meow~~~");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" Yummy ");
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isGiveBirth() {
        return giveBirth;
    }

    public void setGiveBirth(boolean giveBirth) {
        this.giveBirth = giveBirth;
    }
}
