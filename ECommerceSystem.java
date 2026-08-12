import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cart.ShoppingCart;
import orders.OrderManager;
import products.BookProduct;
import products.ClothingProduct;
import products.ElectronicsProduct;
import products.Product;

public class ECommerceSystem {

    private static Scanner scanner = new Scanner(System.in);
    private static ShoppingCart cart = new ShoppingCart();
    private static OrderManager orderManager = new OrderManager();
    private static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        initializeProducts();

        boolean running = true;

        while (running) {

            displayMenu();

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    browseProducts();
                    break;

                case 2:
                    addToCart();
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    updateCartQuantity();
                    break;

                case 5:
                    removeFromCart();
                    break;

                case 6:
                    placeOrder();
                    break;

                case 7:
                    orderManager.displayOrders();
                    break;

                case 8:
                    running = false;
                    System.out.println("Thank you for using the E-Commerce System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n=== E-COMMERCE SYSTEM ===");
        System.out.println("1. Browse Products");
        System.out.println("2. Add to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Update Cart Quantity");
        System.out.println("5. Remove from Cart");
        System.out.println("6. Place Order");
        System.out.println("7. View Orders");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void initializeProducts() {

        products.add(new ElectronicsProduct(
                "E001",
                "Smartphone",
                45000,
                "Latest smartphone",
                10,
                "Samsung",
                24
        ));

        products.add(new ClothingProduct(
                "C001",
                "T-Shirt",
                1200,
                "Cotton T-Shirt",
                20,
                "M",
                "Blue",
                "Cotton"
        ));

        products.add(new BookProduct(
                "B001",
                "Java Programming",
                800,
                "Learn Java",
                15,
                "James Gosling",
                "9781234567890",
                500
        ));
    }

    private static void browseProducts() {

        System.out.println("\n=== AVAILABLE PRODUCTS ===");

        for (Product product : products) {
            product.displayInfo();
            System.out.println();
        }
    }

    private static void addToCart() {

        browseProducts();

        System.out.print("Enter Product ID: ");
        String productId = scanner.next();

        Product product = findProduct(productId);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        cart.addItem(product, quantity);

        System.out.println("Product added to cart successfully.");
    }

    private static void updateCartQuantity() {

        System.out.print("Enter Product ID: ");
        String productId = scanner.next();

        System.out.print("Enter new quantity: ");
        int quantity = scanner.nextInt();

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        cart.updateQuantity(productId, quantity);

        System.out.println("Cart quantity updated.");
    }

    private static void removeFromCart() {

        System.out.print("Enter Product ID: ");
        String productId = scanner.next();

        cart.removeItem(productId);

        System.out.println("Product removed from cart.");
    }

    private static void placeOrder() {

        orderManager.placeOrder(cart);

        cart = new ShoppingCart();
    }

    private static Product findProduct(String productId) {

        for (Product product : products) {

            if (product.getId().equalsIgnoreCase(productId)) {
                return product;
            }
        }

        return null;
    }
}