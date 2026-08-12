package products;
public class ElectronicsProduct extends Product {

    private String brand;
    private int warrantyMonths;

    public ElectronicsProduct(String id, String name, double price,
                              String description, int stockQuantity,
                              String brand, int warrantyMonths) {

        super(id, name, price, description, stockQuantity);

        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }
}