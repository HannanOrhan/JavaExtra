package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods_contains {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("name","Moni");
        map.put("name","Bell");
        map.put("age",33);
        map.put("gender","Female");
        map.put("salary",100_000);

        System.out.println(map);
        System.out.println(map.containsKey("companyName"));//false

        map.put("companyName","Cydeo");
        System.out.println(map.containsKey("companyName"));//true

        System.out.println(map.containsValue("Bell"));
    }
}
