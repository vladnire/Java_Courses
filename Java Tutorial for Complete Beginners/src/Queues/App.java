package Queues;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {
        // FIFO
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        // Throws no such element exception
        // System.out.println("Head of the queue is: " + q1.element());

        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println("Head of the queue is: " + q1.element());

        try {
            q1.add(40);
        } catch(IllegalStateException e){
             System.out.println("Tried to add too many items in queue.");
        }

        for(Integer val: q1){
            System.out.println("Queue1 value: " + val);
        }

        // Remove the head of the queue
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        try {
            System.out.println("Removed from queue: " + q1.remove());;
        } catch(NoSuchElementException e){
            System.out.println("Tried to remove too many items from queue.");
        }

        //
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        System.out.println("Queue 2 peek: " + q2.peek());

        q2.offer(10);
        q2.offer(20);

        if(!q2.offer(30)){
            System.out.println("Offer failed to add third item.");
        }

        for(Integer val: q2){
            System.out.println("Queue2 value: " + val);
        }

        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
    }
}
