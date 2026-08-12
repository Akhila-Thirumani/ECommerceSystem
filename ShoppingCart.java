package cart;

import java.util.ArrayList;
import java.util.List;

import products.Product;

public class ShoppingCart {
	private List<CartItem> items;
	
	public ShoppingCart() {
	    items = new ArrayList<>();
	}
	public void addItem(Product product, int quantity) {

	    for (CartItem item : items) {

	        if (item.getProduct().getId().equals(product.getId())) {
	            item.setQuantity(item.getQuantity() + quantity);
	            return;
	        }
	    }

	    items.add(new CartItem(product, quantity));
	}
	public void removeItem(String productId) {
	    items.removeIf(item ->
	        item.getProduct().getId().equals(productId)
	    );
	}
	public void updateQuantity(String productId, int quantity) {

	    for (CartItem item : items) {

	        if (item.getProduct().getId().equals(productId)) {
	            item.setQuantity(quantity);
	            return;
	        }
	    }
	}
	public double calculateTotal() {

	    double total = 0;

	    for (CartItem item : items) {
	        total += item.getItemTotal();
	    }

	    return total;
	}
	public void displayCart() {
	    System.out.println("\n=== SHOPPING CART ===");

	    if (items.isEmpty()) {
	        System.out.println("Your cart is empty!");
	        return;
	    }

	    System.out.printf("%-15s %-20s %-10s %-10s %-12s%n",
	            "Product ID", "Name", "Price", "Qty", "Total");

	    System.out.println("-".repeat(70));

	    for (CartItem item : items) {
	        Product product = item.getProduct();

	        System.out.printf("%-15s %-20s ₹%-9.2f %-10d ₹%-11.2f%n",
	                product.getId(),
	                product.getName(),
	                product.getFinalPrice(),
	                item.getQuantity(),
	                item.getItemTotal());
	    }

	    System.out.println("-".repeat(70));
	    System.out.printf("Total Amount: ₹%.2f%n", calculateTotal());
	}
	public double getTotalAmount() {
		return calculateTotal();
		
	}
	
}

