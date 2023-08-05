package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoList {
    public static void main(String[] args) {

        String[] fruits = {"Apple","Mango","Pineapple","Stawberry"};
        List<String> list1 = Arrays.asList(fruits);
        System.out.println(list1);
       // list1.add("Jack fruit");

        //addAll
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,fruits);
        System.out.println(list2);
        list2.add("Jack Fruit");
        System.out.println(list2);

        List<String> list3 = new ArrayList<>();
        for(String f : fruits){
            list3.add(f);
        }
        System.out.println(list3);
        list3.add("Jack Fruit");
        System.out.println(list3);
    }
}
