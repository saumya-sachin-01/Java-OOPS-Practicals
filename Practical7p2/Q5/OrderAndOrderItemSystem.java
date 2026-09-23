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

        Order o1 = new Order("123", "Mohan", list1);
        Order o2 = new Order("134", "Ram", list2);
        Order o3 = new Order("111", "Shyam", list3);
        Scanner sc = new Scanner(System.in);
        int choice, k, c;
        do {
            System.out.println("---------- Order And Order Item Management System ---------");
            System.out.println("1.Order1");
            System.out.println("2.Order2");
            System.out.println("3.Order3");
            System.out.println("4.Exit");
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
                                o1.addItem();
                                break;
                            case 2:
                                o1.removeItem();
                                break;
                            case 3:
                                o1.displayOrderDetails();
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
                                o2.addItem();
                                break;
                            case 2:
                                o2.removeItem();
                                break;
                            case 3:
                                o2.displayOrderDetails();
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
                                o3.addItem();
                                break;
                            case 2:
                                o3.removeItem();
                                break;
                            case 3:
                                o3.displayOrderDetails();
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
                    System.out.println("Exit!!");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }
        while (c != 4);
    }
}
