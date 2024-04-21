package FCDS_Project;

public class Cart {
    int customerId;
    int  nProducts;
    private Product[] products;
    public Cart(int customerId, int maxSize) {
        this.customerId = Math.abs(customerId);
        this.nProducts = 0;
        this.products = new Product[maxSize];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public Product[] getProducts() {
        return products;}
    void addProduct(Product Products){
        if (nProducts<=products.length) {
            products[nProducts++]=Products;

        }
        else {
            System.out.println("the cart is full ");

        }}
        void removeProduct(Product Products){
            int index = -1;
            for (int i = 0; i < nProducts; i++) {
                if (products[i].equals(Products)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = index; i < nProducts - 1; i++) {
                    products[i] = products[i + 1];
                }
                nProducts--;
            } else {
                System.out.println("Product not found in cart.");
            }


    }
    public double calculatePrice() {
        double totalPrice = 0;
        for (int i = 0; i < nProducts; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;}
    public void placeOrder() {
        // Logic to place order
        System.out.println("Order placed successfully!");
    }


}