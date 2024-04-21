package FCDS_Project;


import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating some sample products
        Product electronicProduct = new ElectronicProduct(1, "Laptop", 1200, "HP", 12);
        Product clothingProduct = new ClothingProduct(2, "T-shirt", 20, "M", "Cotton");
        Product bookProduct = new BookProduct(3, "Java Programming", 45, "John Doe", "ABC Publications");

        // Creating a sample customer
        Customer customer = new Customer(101, "John Doe", "123 Main St");

        // Creating a sample order
        Product[] products = {electronicProduct, clothingProduct, bookProduct};
        Order order = new Order(customer.getCustomerId(), 1, products);

        // Printing order information
        order.printOrderInfo();

        // Example of adding/removing products from the cart
        Cart cart = new Cart(customer.getCustomerId(), 5);
        cart.addProduct(electronicProduct);
        cart.addProduct(clothingProduct);
        cart.addProduct(bookProduct);

        System.out.println("Current products in cart:");
        for (Product product : cart.getProducts()) {
            if (product != null) {
                System.out.println("- " + product.getName());
            }

        // Removing a product from the cart
        cart.removeProduct(clothingProduct);

        System.out.println("Updated products in cart:");
            System.out.println("Current products in cart:");
            for (Product product8 : cart.getProducts()) {
                if (product != null) {
                    System.out.println("- " + product.getName());
                }
        // Placing the order
        cart.placeOrder();
    }
}}}
