package UsingIterators;

import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("mouse");

        Iterator<String> it = animals.iterator();
        // If you want to add items to list use ListIterator

        while(it.hasNext()){
            String value = it.next();
            if(value.equals("cat")){
                it.remove();
            }
            System.out.println(value);
        }

        System.out.println();

        // Modern iteration >= Java 5
        for(String animal: animals){
            System.out.println(animal);
        }
    }
}
