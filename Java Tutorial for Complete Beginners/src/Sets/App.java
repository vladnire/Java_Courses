package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        // HashSet does not retain order.
        // Set<String> set1 = new HashSet<String>();

        // LinkedHashSet remembers the order.
        // Set<String> set1 = new LinkedHashSet<String>();

        // TreeSet sorts in natural order
        Set<String> set1 = new TreeSet<String>();

        if(set1.isEmpty()){
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");

        // Sets only contain unique items.
        set1.add("mouse");

        System.out.println(set1);

        // Iteration
        for(String element: set1){
            System.out.println(element);
        }

        // Does set contain a given item?
        // Sets are optimized for finding items quickly
        if(set1.contains("rahat")){
            System.out.println("Contains rahat");
        }

        // set2 contains some common elements with set1
        Set<String> set2 = new TreeSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("bear");
        set2.add("wolf");

        // Intersection
        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // Difference
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
