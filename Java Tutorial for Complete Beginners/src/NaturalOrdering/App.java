package NaturalOrdering;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();

        if(len1 > len2){
            return 1;
        }
        else if (len1 < len2){
            return -1;
        }
        // In case they have equal lengths
        else {
            return name.compareTo(person.name);
        }
    }
}

public class App {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();
        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);
    }

    private static void addElements(Collection<Person> col){
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Claire"));
        col.add(new Person("Mike"));
    }

    private static void showElements(Collection<Person> col){
        for(Person element: col){
            System.out.println(element);
        }
    }
}

