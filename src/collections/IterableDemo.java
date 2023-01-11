package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);//it couses bug because list is dynamic when we remove element others shifted their place

        System.out.println("-----------------------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        Iterator<Integer> it = list2.iterator(); //it has all element in this list

        while (it.hasNext()){//as long as there is element in list
            if (it.next()<4){
                it.remove();//when we remove from it , we also remove from list2
            }
        }
        System.out.println(list2);

        System.out.println("-----------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        list3.removeIf(p -> p < 4); //removeIf method creates iterator and removes given condition element
        System.out.println(list3);

    }
}
