class Person2 {

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain
    // 1. Data
    // 2. Subroutines (methods)
    void speak(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void sayHello(){
        System.out.println("Hello there!");
    }
}


public class Methods {
    public static void main(String[] args) {

        Person2 person1 = new Person2();
        person1.name = "Joe Blogs";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        Person2 person2 = new Person2();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
    }
}
