package products;

public class ClothingProduct extends Product {
	private String size;
	private String color;
	private String material;
	public ClothingProduct(String id, String name, double price,
            String description, int stockQuantity, String size, String color, String material) {
		
	
	super(id, name, price, description, stockQuantity);
	this.size=size;
	this.color=color;
	this.material=material;
	}
	
	

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return price * 0.15;
	}

}
