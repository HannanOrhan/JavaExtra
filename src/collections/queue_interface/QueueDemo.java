package collections.queue_interface;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>(); //X null, \/ duplicate,random order
        priorityQueue.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        Queue<Integer> arrayDeque = new ArrayDeque<>();// X null, \/ duplicate, insertion order
        arrayDeque.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("priorityQueue : " + priorityQueue + "\narrayDeque : " + arrayDeque );
        System.out.println("priorityQueue : " + priorityQueue + "\narrayDeque : " + arrayDeque );


    }
}
