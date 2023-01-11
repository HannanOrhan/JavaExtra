package collections.set_interface;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        /*
           SET (I) : Duplicates are not allowed --> common for all set child
                     Insertion order not preserved, random order -> NO ORDER  not common depends
                     Does not have index = NO ORDER -->  common for all set child
                     Accepts null except TreeSet
         */
    Set<Integer> hashSet = new HashSet<>(); //random order, \/ null , X duplicates
    hashSet.addAll(Arrays.asList(1,2,6,2,9,3,4,5,1,2,3,4,5,null));

    Set<Integer> linkedHashSet  = new LinkedHashSet<>();//insertion order, \/null, X duplicate
    linkedHashSet.addAll(Arrays.asList(1,2,6,2,9,3,4,5,1,2,3,4,5,null));

    Set<Integer> treeSet = new TreeSet<>();//sorted order, X null, X duplicate
    treeSet.addAll(Arrays.asList(1,2,6,2,9,3,4,5,1,2,3,4,5));

        System.out.println("hashSet : " + hashSet + "\nlinkedHashSet : " + linkedHashSet
        + "\ntreeSet : " + treeSet);
        System.out.println("hashSet : " + hashSet + "\nlinkedHashSet : " + linkedHashSet
                + "\ntreeSet : " + treeSet);

    }
}
