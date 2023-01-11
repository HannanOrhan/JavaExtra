package map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods_put {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("name","Moni");
        map.put("name","Bell");
        map.put("age",33);


        System.out.println(map);
    }
}
