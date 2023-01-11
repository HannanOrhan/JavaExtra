package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethos_isEmpty_clear_equals {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("name","Bell");
        map.put("age",33);
        map.put("gender","Female");
        map.put("salary",100_000);

        System.out.println("map is empty = " + map.isEmpty());//false

        map.clear();

        System.out.println("map is empty = " + map.isEmpty());//true

        System.out.println("-------------------------------------------");
        Map<String, Object> map2 = new LinkedHashMap<>();

        map2.put("name","Bell");
        map2.put("age",33);
        map2.put("gender","Female");
        map2.put("salary",100_000);

        Map<String, Object> map3 = new LinkedHashMap<>();

        map3.put("name","Bell");
        map3.put("age",33);
        map3.put("gender","Female");
        map3.put("salary",100_000);

        System.out.println("map2 is equal map3 = "+map2.equals(map3));//true

        map3.put("jobTitle","SDET");


        System.out.println("map2 is equal map3 = "+map2.equals(map3));//false


    }
}
