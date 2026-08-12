package orders;

import java.util.ArrayList;
import java.util.List;

import cart.ShoppingCart;

public class OrderManager {
	 private List<Order> orders;

	    public OrderManager() {
	        orders = new ArrayList<>();
	    }
	    public void placeOrder(ShoppingCart cart) {
	        Order order = new Order(cart);
	        orders.add(order);
	        order.displayOrder();
	    }
	    public void displayOrders() {

	        if (orders.isEmpty()) {
	            System.out.println("No orders found.");
	            return;
	        }

	        System.out.println("\n=== ALL ORDERS ===");

	        for (Order order : orders) {
	            order.displayOrder();
	        }
	    }


}
