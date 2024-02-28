package AbstractDemo;

public abstract class AbstractClass {
    public AbstractClass(){
        System.out.println("This is an Abstract class.");
    }

    abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {

    ConcreteClass(){
        super();
        System.out.println("This is from ConcreteClass");
    }

    public void abstractMethod(){
        System.out.println("This is an overridden abstractMethod");
    }
}

class AbstractTester{

    public static void main(String[] args){
//        AbstractClass ab = new AbstractClass(); INCORRECT
        AbstractClass abc = new ConcreteClass();
        ConcreteClass cc = new ConcreteClass();

            }
