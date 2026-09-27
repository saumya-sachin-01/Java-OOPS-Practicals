package Practical7p2.Q4;
public class Engine {
    private String engineNumber;
    private String engineType;
    private int horsePower;
    private boolean running;

    public Engine(String engineNumber, String engineType, int horsePower) {
        this.engineNumber = engineNumber;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.running = false;
    }

    public void startEngine() {
        if (running) {
            System.out.println("Engine (" + engineNumber + ") is already running.");
        } else {
            running = true;
            System.out.println("Engine (" + engineNumber + ") started.");
        }
    }

    public void stopEngine() {
        if (!running) {
            System.out.println("Engine (" + engineNumber + ") is already stopped.");
        } else {
            running = false;
            System.out.println("Engine (" + engineNumber + ") stopped.");
        }
    }

    public void displayEngineDetails() {
        System.out.println("  Engine Number : " + engineNumber);
        System.out.println("  Engine Type   : " + engineType);
        System.out.println("  Horse Power   : " + horsePower + " HP");
        System.out.println("  Status        : " + (running ? "Running" : "Stopped"));
    }

    public boolean isRunning() {
        return running;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }
}