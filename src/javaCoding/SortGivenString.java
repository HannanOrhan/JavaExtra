package javaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortGivenString {
    public static void main(String[] args) {
        String strFirst = "Blizzard is a 3 place I want 2 work @t";
        String str = "";
        for (char c : strFirst.toCharArray()) {//clean digits and chars
            if (!(c>=33 && c<65)){
                str+= c;
            }
        }
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.toLowerCase().split(" ")));
        ArrayList<String> remove = new ArrayList<>();
        for (String s : list) {
            if (s.length() == 0){
                remove.add(s);
            }
        }
        list.removeAll(remove);
        Collections.sort(list);
        for (String eachString : list) {
            String tmp = eachString;
            String tmp2 = "";
            for (String each : list) {
                if (each.length()<=eachString.length() && !each.contains(".")){
                    list.set(list.indexOf(eachString),each );
                    list.set(list.lastIndexOf(each),tmp);
                }
            }
            if (eachString.contains(".")) {
                tmp2 = list.get(list.size()-1) ;
                tmp = list.get(eachString.indexOf(eachString));
                list.set(list.size()-1,tmp);
                list.set(list.lastIndexOf(tmp),tmp2 );
            }
        }
        list.set(0,list.get(0).replace(list.get(0).charAt(0),Character.toUpperCase(list.get(0).charAt(0))));
        list.set(list.size()-1,list.get(list.size()-1) + ".");
        System.out.println(list);
    }
}
/*
Java Task: Sort String words in ascending order by length, No special Characters allowed or Digits except for a period (.), and the period must be at the end of the sorted string. Only the very first character of the first word after sorted must be Uppercase and all other characters must be lowercase. If two String words have the same length word, then the first occurring word should come before the other string words of same length.

Example 1:

Input: Cats and hats.

Output: And cats hats.

Example 2 :

Input: i Love to Game!

Output: I to love game.

Example 3:

Input: Blizzard is a place I want 2 work @t!

Output: A i t is want work place blizzard.
 */