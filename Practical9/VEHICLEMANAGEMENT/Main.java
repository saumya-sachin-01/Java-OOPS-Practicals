package Practical9.VEHICLEMANAGEMENT;

public class Main {
    static void main() {
Car c = new Car("GJ1234","Mahindra");
Bike b = new Bike("GJ0985","Tata");
c.displayDetails();
c.start();
c.service();
b.displayDetails();
b.start();
b.service();
    }
}
