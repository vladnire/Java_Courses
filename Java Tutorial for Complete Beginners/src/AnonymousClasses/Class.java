package AnonymousClasses;

class Machine{
    public void start(){
        System.out.println("Starting machine.");
    }
}

interface Plant{
    public void grow();
}

public class Class {
    public static void main(String[] args) {
        Machine machine1 = new Machine(){
            @Override public void start(){
                System.out.println("Camera starting.");
            }
        };

        machine1.start();

        Plant plant1 = new Plant(){
            public void grow() {
                System.out.println("Plant growing.");
            }
        };

        plant1.grow();

    }
}
