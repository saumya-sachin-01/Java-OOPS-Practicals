package Practical9part1.VEHICLEMANAGEMENT;

public class Bike extends Vehicle implements Serviceable{
Bike(String number,String brand){
    super(number,brand);
}
@Override
    void start(){
    System.out.println("Bike starts with  self start");
}
@Override
   public void service(){
    System.out.println("Bike is being serviced");
}
}
