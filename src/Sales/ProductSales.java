package Sales;

public class ProductSales {
    public static void main(String[] args) throws Exception{

        Sale s1 = new Sale("Power Generator", 10.00);
        DiscountSale ds1 = new DiscountSale("Power Generator", 10.0,5);
        double newPrice = s1.totalPrice() - ds1.

        System.out.println("This is a good deal you are saving $" + );

        System.out.println(s1);
        System.out.println(s1.totalPrice());
        System.out.println(ds1);
        System.out.println(s1.greaterThan(ds1));
        System.out.println(s1.lessThan(ds1));
        System.out.println(s1.equalDeals(ds1));
        System.out.println(ds1.getDiscountRate() + "%");


    }
}
