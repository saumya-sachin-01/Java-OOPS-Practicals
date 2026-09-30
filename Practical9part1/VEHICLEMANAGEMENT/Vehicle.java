package Practical9part1.VEHICLEMANAGEMENT;

abstract public class Vehicle {
    String number;
    String brand;
    Vehicle(String number,String brand){
        this.brand=brand;
        this.number=number;
    }
    abstract void start();
    void displayDetails(){
        System.out.println("Vehicle Number : "+number);
        System.out.println("Brand : "+brand);
    }
}
