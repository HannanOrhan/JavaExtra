package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods_keySet {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("name","Bell");
        map.put("age",33);
        map.put("gender","Female");
        map.put("salary",100_000);

        for (String eachKey : map.keySet()) {
            System.out.print(eachKey + " ");//name age gender salary
        }

        for (Object eachValue : map.values()) {
            System.out.print(eachValue + " ");
        }
    }

}
