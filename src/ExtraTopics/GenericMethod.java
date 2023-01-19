package ExtraTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethod {
/*
    public static void printEach(Integer[] array){
        for (Integer each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(Character[] array){
        for (Character each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(Double[] array){
        for (Double each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }
 */
    public static <AnyName> void printEach(AnyName[] array){//this array can be any type of array
        for (AnyName each : array) {
            System.out.println(each);
        }
    }

    public static <T> void printEach(List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        String[] s = {"hannan","ayse","hilal","dilvin","mahmut"};
        Integer[] n = {1,2,3,4,5};
        Double[] d = {1.5,2.5,3.5};
        Character[] c ={'a','b','c'};
        System.out.println("---------arrays-------------");
        printEach(s);
        printEach(n);
        printEach(d);
        printEach(c);
        System.out.println("---------lists-------------");
        ArrayList<String> ls = new ArrayList<>(Arrays.asList(s));
        ArrayList<Integer> ln = new ArrayList<>(Arrays.asList(n));
        ArrayList<Double> ld = new ArrayList<>(Arrays.asList(d));
        ArrayList<Character> lc = new ArrayList<>(Arrays.asList(c));
        printEach(ls);
        printEach(ln);
        printEach(ld);
        printEach(lc);

    }
}
/*
instead of multiple separate methods we'll use generic method
 */