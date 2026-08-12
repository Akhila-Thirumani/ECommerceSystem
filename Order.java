package orders;

import java.util.Date;

import cart.ShoppingCart;

public class Order {
	 private static int orderCounter = 1000;

	    private String orderId;
	    private Date orderDate;
	    private ShoppingCart cart;
	    private double finalAmount;
	    
	    public Order(ShoppingCart cart) {
	        this.orderId = "ORD" + (orderCounter++);
	        this.orderDate = new Date();
	        this.cart = cart;
	        this.finalAmount = calculateFinalAmount();
	    }
	    private double calculateFinalAmount() {
	        double total = cart.getTotalAmount();
	        return total * 1.18;
	    }
	    public void displayOrder() {
	        System.out.println("\n=== ORDER DETAILS ===");
	        System.out.println("Order ID: " + orderId);
	        System.out.println("Order Date: " + orderDate);

	        cart.displayCart();

	        System.out.println("\nOrder Summary:");
	        System.out.printf("Subtotal: ₹%.2f%n", cart.getTotalAmount());
	        System.out.printf("GST (18%%): ₹%.2f%n", cart.getTotalAmount() * 0.18);
	        System.out.printf("Final Amount: ₹%.2f%n", finalAmount);
	        System.out.println("Thank you for your order!");
	    }

}
