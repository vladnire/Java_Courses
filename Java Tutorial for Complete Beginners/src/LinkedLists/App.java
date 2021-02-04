package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        ArrayLists manage arrays internally.
        [0][1][2][3]
        Getting an item is very fast
        Add item to end of list is fast
        Add item at beginning is slow because you need to shift items
         */
        List<Integer> arrayList = new ArrayList<Integer>();

        /*
        LinkedLists consists of elements where each element has a reference
        to the previous and next
        [0]->[1]->[2]
        Add or remove middle of beginning use a LinkedList
        */
        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list){
        for(int i=0; i<1E5; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /*
        // Add items at end of list
        for(int i=0; i<1E5; i++){
            list.add(i);
        }
        */

        /*
        // Add items elsewhere in list
        for(int i=0; i<1E5; i++){
            list.add(0, i);
        }
         */

        for(int i=0; i<1E5; i++) {
            list.add(list.size() - 100, i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken:" + (end - start) + " ms for " + type);
    }
}
