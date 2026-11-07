// A PhysicalProduct IS-A Product because it is a kind of product that has everything a product has (id, name, price) plus its own weight and dimensions.
// ShoppingCart would NOT pass this test, because a ShoppingCart is not a Product; it HAS products (a HAS-A relationship).

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

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
}
