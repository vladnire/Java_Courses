package PublicPrivateProtected.world;

public class Plant {
    // Bad practice.
    public String name;

    // Acceptable practice, it's final.
    public final static int ID = 8;

    private String type;

    protected String size;

    int height; // package level visibility

    public Plant(){
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
    }
}
