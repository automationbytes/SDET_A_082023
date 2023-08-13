package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListItre {

    public static void main(String[] args) {
        String[] fruits = {"Apple","Mango","PineApple","Stawberry"};
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,fruits);
        System.out.println(list2);

//        for (String f: list2) {
//            if(f.contains("Apple")){
//                list2.remove(f);
//            }
//        }
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()){
           // System.out.println(iterator.next());
            String fruitname = (String) iterator.next();
            if(fruitname.contains("Apple")){
                iterator.remove();
            }
        }
        System.out.println(list2);

    }
}
