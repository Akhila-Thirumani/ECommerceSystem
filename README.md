# E-Commerce System

## Project Description

A console-based E-Commerce System developed using Java. The application demonstrates Object-Oriented Programming concepts through product management, shopping cart operations, and order processing.

## Features

* Browse available products
* Add products to shopping cart
* Update product quantities
* Remove products from cart
* Calculate cart total
* Apply product-specific discounts
* Place orders
* Generate unique order IDs
* Calculate 18% GST
* View previous orders

## Technologies Used

* **Programming Language:** Java
* **IDE:** Eclipse IDE
* **Data Structures:** ArrayList, List
* **Concepts:** OOP, Abstraction, Inheritance, Polymorphism, Encapsulation, HAS-A Relationship, Static Members

## Project Structure

```text
src
├── products
│   ├── Product.java
│   ├── ElectronicsProduct.java
│   ├── ClothingProduct.java
│   └── BookProduct.java
│
├── cart
│   ├── CartItem.java
│   └── ShoppingCart.java
│
├── orders
│   ├── Order.java
│   └── OrderManager.java
│
└── ECommerceSystem.java
```

## OOP Concepts Used

### Abstraction

`Product` is an abstract class that defines common properties and behaviors for different product types.

### Inheritance

`ElectronicsProduct`, `ClothingProduct`, and `BookProduct` extend the `Product` class.

### Polymorphism

A `Product` reference can refer to different product subclasses, allowing each product type to provide its own implementation of methods such as discount calculation and product information display.

### Encapsulation

Product, cart, and order data are stored in private fields and accessed through appropriate methods.

### HAS-A Relationship

* `CartItem` has a `Product`
* `ShoppingCart` has `CartItem` objects
* `Order` has a `ShoppingCart`
* `OrderManager` has multiple `Order` objects

### Static Members

A static order counter is used to generate unique order IDs such as `ORD1000`, `ORD1001`, and so on.

## How to Run

1. Clone or download the project.
2. Open the project in Eclipse IDE.
3. Make sure the Java source files are inside the appropriate packages.
4. Run `ECommerceSystem.java` as a Java Application.
5. Use the console menu to browse products, manage the cart, and place orders.

## Testing

The application was tested for:

* Product browsing
* Adding products to cart
* Adding the same product multiple times
* Updating cart quantity
* Removing products from cart
* Cart total calculation
* Order creation
* GST calculation
* Unique order ID generation
* Viewing previous orders
* Complete menu-driven application flow

All tested operations executed successfully.


