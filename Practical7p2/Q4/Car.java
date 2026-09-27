package Practical7p2.Q4;

public class Car {
    private String carNumber;
    private String brand;
    private String model;
    private Engine engine;

    public Car(String carNumber, String brand, String model,
               String engineNumber, String engineType, int horsePower) {
        this.carNumber = carNumber;
        this.brand = brand;
        this.model = model;
        this.engine = new Engine(engineNumber, engineType, horsePower);
    }

    public void startCar() {
        System.out.println("\nStarting car: " + brand + " " + model + " (" + carNumber + ")");
        engine.startEngine();
    }

    public void stopCar() {
        System.out.println("\nStopping car: " + brand + " " + model + " (" + carNumber + ")");
        engine.stopEngine();
    }

    public void displayCarDetails() {
        System.out.println("\n=========== CAR DETAILS ===========");
        System.out.println("  Car Number : " + carNumber);
        System.out.println("  Brand      : " + brand);
        System.out.println("  Model      : " + model);
        System.out.println("  --- Engine Info ---");
        engine.displayEngineDetails();
    }

    public void displayEngineDetails() {
        System.out.println("\n=========== ENGINE DETAILS ===========");
        engine.displayEngineDetails();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
