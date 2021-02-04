package PublicPrivateProtected;
import PublicPrivateProtected.world.Plant;

/* private --- only within same class
   public --- from anywhere
   protected --- same class, subclass, package
   no modifier --- same package only
   Only applies for variables, not classes.

 */

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(plant.ID);
        // Won't work, type is private:
        // System.out.println(plant.type);
        // size is protected; App is not in the same package as Plant
        // System.out.println(plant.size);
    }
}
