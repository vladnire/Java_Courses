package PublicPrivateProtected;
import PublicPrivateProtected.world.Plant;


public class Grass extends Plant{
    public Grass(){
        // Grass not in same package as plant, even if subclass
        //System.out.println(this.height);
    }
}
