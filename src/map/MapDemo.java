package map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        /*
          Collection of pair   (pair : key + value),accept two data
                Map ONLY accept pair
                Does not have is-a relation with Collection
                Size can be increased and decreased (dynamic)
                Key can not be duplicate (key unique), values can be duplicated.
                Supports non-primitives

                    Key     Value
                   -----    ------
                   name     Muhtar
                   gender   Male
                   age      32
                   ...      ....
         */
        Map<String, Object> hashMap = new HashMap<>(); //fastest because random order, null key & value
        hashMap.put("name","Hannan");
        hashMap.put("gender","Female");
        hashMap.put("age",27);
        hashMap.put(null,null);

        Map<String, Object> linkedHashMap = new LinkedHashMap<>();//insertion order,null key & value
        linkedHashMap.put("name","Hannan");
        linkedHashMap.put("gender","Female");
        linkedHashMap.put("age",27);
        linkedHashMap.put(null,null);

        Map<String, Object> hashTable = new Hashtable<>();//random order, no null key & value
        hashTable.put("name","Hannan");
        hashTable.put("gender","Female");
        hashTable.put("age",27);
        hashTable.put("salary",100_00);

        Map<String, Object> treeMap = new TreeMap<>(); //sorted order, no null key , yes null values
        treeMap.put("name","Hannan");
        treeMap.put("gender","Female");
        treeMap.put("age",27);
        treeMap.put("salary",null);

        System.out.println("hashMap : " + hashMap);
        System.out.println("linkedHashMap : " + linkedHashMap);
        System.out.println("hashTable : " + hashTable);
        System.out.println("treeMap : " + treeMap);

     }
}
