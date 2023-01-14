package javaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result="";

        for (String each : list) {
            int n = Collections.frequency(list,each);
            if (!result.contains(each)){
                result += each + n;
            }
        }
        System.out.println(result);
    }
}
