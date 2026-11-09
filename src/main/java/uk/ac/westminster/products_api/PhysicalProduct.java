// A PhysicalProduct IS-A Product because it is a kind of product that has everything a product has (id, name, price) plus its own weight and dimensions.
// ShoppingCart would NOT pass this test, because a ShoppingCart is not a Product; it HAS products (a HAS-A relationship).

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimensions;
    private double discountedPrice;


    public PhysicalProduct() {}

    public PhysicalProduct (Long id,String name,double price,double weightKg,String dimensions) {
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg () {
        return weightKg;
    }

    public String getDimensions () {
        return dimensions;
    }

    @Override
    public String getSummary(){
        return "Physical: " + getName()
                + " | Price: " + getPrice() + " | Weight: " + getWeightKg() + " | Dimensions: " + getDimensions();

    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate,0.20);
        discountedPrice = getPrice() * (1-capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
