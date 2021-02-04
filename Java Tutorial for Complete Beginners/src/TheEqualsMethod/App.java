package TheEqualsMethod;

import java.util.Objects;

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }

}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");

        // == tells you if they point to the same object
        // will return false because they are 2 different objects
        System.out.println(person1 == person2);

        System.out.println(person1.equals(person2));

        // Only use == if two references point to same object
        Double value1 = 7.2;
        Double value2 = 7.2;
        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));

        Integer number1 = 6;
        Integer number2 = 6;
        System.out.println(number1.equals(number2));

        // Always use equals to compare strings
        String text1 = "Hello";
        String text2 = "Helloasda".substring(0, 5);
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));
    }
}
