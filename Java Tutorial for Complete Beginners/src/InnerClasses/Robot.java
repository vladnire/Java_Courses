package InnerClasses;

public class Robot {
    private int id;

    // Best practice for inner classes to use private
    private class Brain{
        public void think(){
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    // Used where you want a normal class and group it with outer class
    static class Battery{
        public void charge(){
            System.out.println("Battery charging.");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        final String name = "Robert";

        class Temp{
            public void doSomething(){
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }
}
