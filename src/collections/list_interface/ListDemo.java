package collections.list_interface;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        /*
         LIST(I) : Allows duplicates
            Insertion order preserve
            It has index number,except LinkedList because LinkedList is node-based
            Accepts null
         */

        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5,5));

        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1,2,3,4,5,5));

        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(1,2,3,4,5,5));

        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5,5));

        System.out.println("ArrayList : " + arrayList + "\nLinkedList : " + linkedList +
                "\nVector : " + vector + "\nStack : " + stack);

        System.out.println("--------------------------------------------------------------------");

        //Searching element faster
        //get first element from arrayList
        System.out.println(arrayList.get(0)); // 1

        //Removing or adding element faster
        //add element into linkedList
        linkedList.add(2);

        //vector is synchronized = slower

        //Stack is a child of Vector class
        //Synchronized
        //LIFO order, unique only for stack
        System.out.println("stack : " + stack);
        int element = ((Stack<Integer>) stack).pop(); //reference type List we need down-casting
        //pop returns integer and remove returning element(last element)
        System.out.println("last element of stack : " + element);
        System.out.println("stack : " + stack);

    }
}
