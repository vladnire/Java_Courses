package TransientKeyword;

import java.io.Serializable;

public class Person implements Serializable {

    private transient int id;
    private String name;
    private static int count;

    public Person(){
        System.out.println("Default constructor");
    }

    public Person(int id, String name) {
        System.out.println("Custom constructor");
        this.id = id;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count= " + count +
                '}';
    }
}
