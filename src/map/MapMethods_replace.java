package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods_replace {
    public static void main(String[] args) {

        Map<String, Object> map = new LinkedHashMap<>();

        map.put("name","Moni");
        map.put("name","Bell");
        map.put("age",33);
        map.put("gender","Female");
        map.put("salary",100_000);

        System.out.println(map);
        System.out.println(map.replace("age",27));
        System.out.println(map);

    }
}
