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
        //precondition to check if sObject you are taking in the method is pointing to nothing
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

    public boolean equalDeals(Sale compareSaleObject){
        if (compareSaleObject == null){
            return false;
        }
        else {
            return (this.totalPrice() == compareSaleObject.totalPrice()) && this.name.equals(compareSaleObject.name);
        }
    }
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        else if (this.getClass() != obj.getClass()) {
            return false;
        }
        else {
             Sale sObj = (Sale)obj;
//             return (this.name.equals(((Sale) obj).name) && sObj.price == ((Sale) obj).price);
             return (this.name.equals((sObj).name) && (this.price == (sObj.price));
        }
    }

    public boolean lessThan(Sale so) {
        if (so == null){
            System.out.println("error. ");
            System.exit(1);
        }
        else {
            return totalPrice() < so.totalPrice();
        }
    }

    public boolean greaterThan(Sale so) {
        if (so == null){
            System.out.println("error");
            System.exit(1);
        }
        else {
            return totalPrice() > so.totalPrice();
        }
    }

    public String toString(){
        return String.format("Unit price of %s: %.2f", name price);
    }
}
