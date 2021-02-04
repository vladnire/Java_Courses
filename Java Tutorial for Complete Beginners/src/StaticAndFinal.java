class Thing{
    public String name;
    public static String description;
    public final static int LUCKY_NUMBER = 7;
    public static int count = 0;
    public int id;

    public Thing(){
        // count is a class object, it is shared by all Thing objects
        id = count;
        count++;
    }

    public void showName(){
        System.out.println("Object id " + id + ", " + description + ": " +name);
    }

    public static void showInfo(){
        System.out.println(description);
        // Won't work: System.out.println(name);
    }
}


public class StaticAndFinal {
    public static void main(String[] args) {
        Thing.description = "I am a thing";
        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        thing1.name = "Bob";
        thing2.name = "Sue";
        thing1.showName();
        thing2.showName();

        System.out.println("After creating objects, count is: " + Thing.count);

        System.out.println(Math.PI);
        // Won't work, constant value: Math.PI = 3
        System.out.println(Thing.LUCKY_NUMBER);
    }
}