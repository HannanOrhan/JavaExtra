package ExtraTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericClass<T> {//we can pass generic also to the class
    //generic class online can be defined only we create object and because of that reason we can not make method static
    //it should be instance method
    public  void printEach(T[] array){//this array can be any type of array
        for (T each : array) {
            System.out.println(each);
        }
    }

    public  <T> void printEach(List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        //when we create generic type object we need to pass generic type

        Integer[] n = {1,2,3,4,5};
        ArrayList<Integer> ln = new ArrayList<>(Arrays.asList(n));
        GenericClass<Integer> generics_int = new GenericClass<>();

        System.out.println("---------arrays-------------");
        generics_int.printEach(n);
        System.out.println("---------lists-------------");
        generics_int.printEach(ln);


        Double[] d = {1.5,2.5,3.5};
        ArrayList<Double> ld = new ArrayList<>(Arrays.asList(d));
        GenericClass<Double> generics_double = new GenericClass<>();

        System.out.println("---------arrays-------------");
        generics_double.printEach(d);
        System.out.println("---------lists-------------");
        generics_double.printEach(ld);
    }
}
