package AbstractClasses;

public class App {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(1);

        Car car1 = new Car();
        car1.setId(2);

        cam1.run();
        car1.run();

        // Machine is abstract and cannot be instantiated
        // Machine machine1 = new Machine();
    }
}
