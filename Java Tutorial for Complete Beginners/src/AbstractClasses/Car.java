package AbstractClasses;

public class Car extends Machine {
    public void start() {
        System.out.println("Starting car.");
    }

    public void doStuff() {
        System.out.println("Do stuff in car.");
    }

    public void shutDown() {
        System.out.println("Shutdown car.");
    }
}
