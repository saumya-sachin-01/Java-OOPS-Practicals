package Practical7p2.Q5;

public class OrderItems {
    int productId;
    String productName;
    double price;
    int quantity;

    OrderItems(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateItemTotal() {
        return price * quantity;
    }

    void displayItemDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Product Id = " + productId);
        System.out.println("Product Name = " + productName);
        System.out.println("Price = " + price);
        System.out.println("Quantity = " + quantity);
        System.out.println("Total Price = " + calculateItemTotal());
    }
}
