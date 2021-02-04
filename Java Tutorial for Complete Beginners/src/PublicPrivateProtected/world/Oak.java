package PublicPrivateProtected.world;

public class Oak extends Plant{
    public Oak(){
        // Won't work, type is private: type = "tree";

        // This works because size is protected and Oak is a subclass of Plant.
        this.size = "large";

        // No access specifier works because Oak and Plant are in the same package.
        this.height = 10;
    }
}
