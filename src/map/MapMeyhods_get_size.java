package map;

import java.util.HashMap;
import java.util.Map;

public class MapMeyhods_get_size {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("name","Moni");
        map.put("name","Bell");
        map.put("age",33);
        map.put("gender","Female");
        map.put("salary",100_000);

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("salary"));
        System.out.println(map.get("age"));
    }
}
