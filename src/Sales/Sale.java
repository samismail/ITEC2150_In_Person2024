package Sales;

public class Sale {
    // two attributes: name and price

    private String name;
    private double price;


    public Sale(){
        name = "NOT YET CREATED";
        price = 0.0;
    }

    public Sale(String name, double nPrice) throws Exception{
        setName();
        setPrice(nPrice);
    }

    public Sale(Sale sObject){
        //pree condition to check if sObject you are taking in the method is pointing to nothing
        if (sObject == null){
            System.out.println("Null pointer exception of errors");

        }
        this.name = sObject.name;
        this.price = sObject.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name != null){
            this.name = name;
        }
        else {
           // System.out.println("Error: or null pointer exception");
            throw new Exception("Error: or null pointer exception");
        }

        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price < 0) {
            throw new Exception("Price can not be a negative value")
        }
        else {
            this.price = price;
        }
    }

    public double totalPrice() {
        return price;
    }

    public String toString(){
        return String.format("Unit price of %s: %.2f", name price);
    }
}
