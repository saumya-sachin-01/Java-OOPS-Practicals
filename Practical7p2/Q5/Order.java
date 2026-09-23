package Practical7p2.Q5;

import java.util.*;

public class Order {
    String orderId, customerName;
    ArrayList<OrderItems> items;

    Order(String orderId, String customerName, ArrayList<OrderItems> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new ArrayList<>(items);
    }

    void addItem() {
        Scanner sc = new Scanner(System.in);
        int productId;
        String productName;
        double price;
        int quantity;
        System.out.println("Enter Product Id : ");
        productId = sc.nextInt();
        System.out.println("Enter Product Name : ");
        productName = sc.next();
        System.out.println("Enter price : ");
        price = sc.nextInt();
        System.out.println("Enter quantity : ");
        quantity = sc.nextInt();
        items.add(new OrderItems(productId, productName, price, quantity));
    }

    void removeItem() {
        Scanner sc = new Scanner(System.in);
        int productId;
        System.out.println("Enter Product Id : ");
        productId = sc.nextInt();
        boolean found = false;
        for (OrderItems i : items) {
            if (productId == i.productId) {
                items.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid Product Id!!");
        }
    }

    double calculateTotalAmount() {
        double amount = 0;
        for (OrderItems i : items) {
            amount = amount + (i.quantity * i.price);
        }
        return amount;
    }

    void displayOrderDetails() {
        System.out.println("----------- Order Details --------------");
        System.out.println("Order Id = " + this.orderId);
        System.out.println("Customer Name = " + this.customerName);
        System.out.println("----------------------------------------");
        System.out.println("----------- Product Details ------------");
        for (OrderItems item : items) {
            item.displayItemDetails();
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Amount = " + this.calculateTotalAmount());
        System.out.println("----------------------------------------");
    }
}
