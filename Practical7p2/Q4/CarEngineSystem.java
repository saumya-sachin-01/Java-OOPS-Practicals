package Practical7p2.Q4;

public class CarEngineSystem {
    public static void main(String[] args) {

        Car car1 = new Car(
                "KA-01-1234", "Toyota", "Fortuner",
                "ENG-TY-001", "Diesel", 204
        );

        Car car2 = new Car(
                "DL-05-5678", "Honda", "City",
                "ENG-HN-002", "Petrol", 121
        );

        System.out.println("########## CAR 1 ##########");
        car1.displayCarDetails();

        System.out.println("\n########## CAR 2 ##########");
        car2.displayCarDetails();

        System.out.println("\n########## STARTING CARS ##########");
        car1.startCar();
        car2.startCar();

        System.out.println("\n########## STOPPING CAR 1 ##########");
        car1.stopCar();

        System.out.println("\n########## UPDATED STATUS ##########");
        car1.displayCarDetails();
        car2.displayCarDetails();

        System.out.println("\n########## PROOF OF COMPOSITION ##########");
        System.out.println("Car1 engine  : " + car1.getEngine().getEngineNumber());
        System.out.println("Car2 engine  : " + car2.getEngine().getEngineNumber());
        System.out.println("Both engines are different -> each Car owns its own Engine.");
    }
}
