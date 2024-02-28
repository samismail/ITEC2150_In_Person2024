package Sales;

/**
 * Sale class
 */
public class Sale {
    //two attributes: name and price

    private String name;
    private double price;


    public Sale(){
        name = "NOT YET CREATED";
        price = 0.0;
    }

    public Sale(String name, double nPrice) throws Exception{
        setName(name);
        setPrice(nPrice);
    }

    public Sale(Sale sObject){
        //pre-condition to check if sObject you are taking in the method is pointing to the null
        if(sObject == null){
            System.out.println("Null pointer exception or errors");
            System.exit(0);
        }
        this.name = sObject.name;
        this.price = sObject.price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name != null ) {
            this.name = name;
        }
        else{
            // System.out.println("Error: or null pointer exception");
            throw new Exception("Error, Null pointer exception ocurred");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if(price < 0){
            throw new Exception("Price cannot be a negative value");
        }
        else {
            this.price = price;
        }
    }

    public double totalPrice(){
        return price;
    }

    public boolean equalDeals(Sale compareSaleObject){
        if(compareSaleObject == null){
            return false;
        }

        else{
            return (this.totalPrice() == compareSaleObject.totalPrice())
                    && this.name.equals(compareSaleObject.name);
        }
    }

    /**
     * equals() method is used to compare two objects of the same class
     * @param obj
     * @return boolean
     *
     * purpose: downcasting the object to the Sale class and compare the name and price of the object
     */
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        else if(this.getClass() != obj.getClass() ){
            return false;
        }
        else {
            Sale sObj = (Sale)obj;
            //return (this.name.equals(((Sale)obj).name)) && (price == ((Sale)obj).price);
            return (this.name.equals(sObj.name) && (this.price == (sObj.price)));
        }
    }


    /**
     * compare the total price of two objects
     * @param so
     * @return
     */
    public boolean greaterThan(Sale so){
        if(so == null){
            System.out.println("error");
            System.exit(0);
        }

        return totalPrice() > so.totalPrice();

    }

    /**
     * compare the total price of two objects
     * @param so
     * @return
     */
    public boolean lessThan(Sale so){
        if(so == null){
            System.out.println("error. ");
            System.exit(0);
        }

        return totalPrice() < so.totalPrice();


    }

    public String toString(){
        return String.format("Unit price of %s: %.2f", name, price);
    }
}
