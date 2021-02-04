package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

class Animal{

}


public class App {
    public static void main(String[] args) {
        /* Before Java 5
        ArrayList list = new ArrayList();
        list.add("apple");

        String fruit = (String)list.get();
        System.out.println(fruit);
        */

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);

        // There can be more than one type argument
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Java 7 style
        ArrayList<Animal> someList = new ArrayList<>();

    }
}
