package InnerClasses;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot(7);
        robot.start();

        // not used, best practice is to have inner class as private
        // Robot.Brain brain = robot.new Brain();
        // brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
