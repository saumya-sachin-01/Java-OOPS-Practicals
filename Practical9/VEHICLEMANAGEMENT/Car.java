package Practical9.VEHICLEMANAGEMENT;

public class Car extends Vehicle implements Serviceable
{
  Car(String number,String brand){
      super(number,brand);
  }

    @Override
    void start() {
        System.out.println("Car starts with key");
    }

    @Override
    public void service() {
        System.out.println("Car is being serviced");
    }
}
