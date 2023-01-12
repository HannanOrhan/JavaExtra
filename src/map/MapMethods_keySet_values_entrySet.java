package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods_keySet_values_entrySet {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("name","Bell");
        map.put("age",33);
        map.put("gender","Female");
        map.put("salary",100_000);

        System.out.print("Keys = ");
        for (String eachKey : map.keySet()) {
            System.out.print(eachKey + " ");//name age gender salary
        }
        System.out.println();
        System.out.print("Values = ");
        for (Object eachValue : map.values()) {
            System.out.print(eachValue + " ");
        }

        System.out.println();

        for (Map.Entry<String, Object> each : map.entrySet()) {
            System.out.println(each.getKey() + " : " + each.getValue());
            /*
            name : Bell
            age : 33
            gender : Female
            salary : 100000
             */
        }
    }
}
