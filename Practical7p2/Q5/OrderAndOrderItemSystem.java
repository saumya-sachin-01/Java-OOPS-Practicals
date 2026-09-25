package Practical7p2.Q5;

import java.util.*;

public class OrderAndOrderItemSystem {
    static void main() {
        ArrayList<OrderItems> list1 = new ArrayList<>();
        ArrayList<OrderItems> list2 = new ArrayList<>();
        ArrayList<OrderItems> list3 = new ArrayList<>();

        list1.add(new OrderItems(1, "Shocks", 49, 1));
        list1.add(new OrderItems(2, "Shoes", 2000, 1));
        list2.add(new OrderItems(1, "Bag", 1400, 1));
        list3.add(new OrderItems(1, "Laptop", 100000, 1));

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order("1", "Mohan", list1));
        orders.add(new Order("2", "Ram", list2));
        orders.add(new Order("3", "Shyam", list3));
        Scanner sc = new Scanner(System.in);
        int choice, k, c;
        do {
            System.out.println("---------- Order And Order Item Management System ---------");
            System.out.println("1.Order1");
            System.out.println("2.Order2");
            System.out.println("3.Order3");
            System.out.println("4.Remove Order");
            System.out.println("5.Display All Order Details");
            System.out.println("6.Exit");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Enter your choice : ");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    do {
                        System.out.println("---------- Order And Order Item Management System ---------");
                        System.out.println("1.Add Item");
                        System.out.println("2.Remove Item");
                        System.out.println("3.Display Order Details");
                        System.out.println("4.Exit");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Enter your choice : ");
                        choice = sc.nextByte();
                        switch (choice) {
                            case 1:
                                orders.getFirst().addItem();
                                break;
                            case 2:
                                orders.get(1).removeItem();
                                break;
                            case 3:
                                orders.getLast().displayOrderDetails();
                                break;
                            case 4:
                                System.out.println("Exit!!");
                                break;
                            default:
                                System.out.println("Invalid Choice!!");
                                break;
                        }
                    }
                    while (choice != 4);
                    break;
                case 2:
                    do {
                        System.out.println("---------- Order And Order Item Management System ---------");
                        System.out.println("1.Add Item");
                        System.out.println("2.Remove Item");
                        System.out.println("3.Display Order Details");
                        System.out.println("4.Exit");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Enter your choice : ");
                        choice = sc.nextByte();
                        switch (choice) {
                            case 1:
                                orders.get(1).addItem();
                                break;
                            case 2:
                                orders.get(1).removeItem();
                                break;
                            case 3:
                                orders.get(1).displayOrderDetails();
                                break;
                            case 4:
                                System.out.println("Exit!!");
                                break;
                            default:
                                System.out.println("Invalid Choice!!");
                                break;
                        }
                    }
                    while (choice != 4);
                    break;
                case 3:
                    do {
                        System.out.println("---------- Order And Order Item Management System ---------");
                        System.out.println("1.Add Item");
                        System.out.println("2.Remove Item");
                        System.out.println("3.Display Order Details");
                        System.out.println("4.Exit");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Enter your choice : ");
                        choice = sc.nextByte();
                        switch (choice) {
                            case 1:
                                orders.getLast().addItem();
                                break;
                            case 2:
                                orders.getLast().removeItem();
                                break;
                            case 3:
                                orders.getLast().displayOrderDetails();
                                break;
                            case 4:
                                System.out.println("Exit!!");
                                break;
                            default:
                                System.out.println("Invalid Choice!!");
                                break;
                        }
                    }
                    while (choice != 4);
                    break;
                case 4:
                    String o_r;
                    System.out.println("Enter order number to remove : ");
                    o_r = sc.next();
                    boolean found = false;
                    for(Order o : orders){
                        if(o.orderId.equals(o_r)){
                            orders.remove(o);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Order not found !!");
                    }
                    break;
                case 5:
                    for(Order o : orders){
                        o.displayOrderDetails();
                    }
                    break;
                case 6:
                    System.out.println("Exit!!");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }
        while (c != 6);
    }
}
