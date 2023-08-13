package Day3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap_Eg {
    public static void main(String[] args) {
        //put -> Adding the elements
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer> ();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        System.out.println(map);

    }
}
