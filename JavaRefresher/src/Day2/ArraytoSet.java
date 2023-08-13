package Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArraytoSet {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Mango","Pineapple","Stawberry","Pineapple","Mango","Mango"};
        Set<String> set = new LinkedHashSet<>(Arrays.asList(fruits));
        System.out.println(set);
        set.add("Banana");
        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();
        for(String f : fruits){
            set1.add(f);
        }
        System.out.println(set1);
        Set<String> set2 = new LinkedHashSet<>();
        Collections.addAll(set2,fruits);
        System.out.println(set2);
    }
}
