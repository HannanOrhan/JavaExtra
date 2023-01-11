package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods_putAll {
    public static void main(String[] args) {
        Map<String, Object> map1 = new LinkedHashMap<>();

        map1.put("name","Bell");
        map1.put("age",33);

        Map<String, Object> map2 = new LinkedHashMap<>();

        map2.put("gender","Female");
        map2.put("salary",100_000);

        Map<String, Object> map3 = new LinkedHashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);

        System.out.println(map3);

    }
}
