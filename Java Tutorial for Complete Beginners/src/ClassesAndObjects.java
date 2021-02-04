class Person1 {
    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain
    // 1. Data
    // 2. Subroutines (methods)
}


public class ClassesAndObjects {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "Joe Blogs";
        person1.age = 37;

        Person1 person2 = new Person1();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}
