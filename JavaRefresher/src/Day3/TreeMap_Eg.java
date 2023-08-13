package Day3;

import java.util.LinkedHashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap_Eg {
    public static void main(String[] args) {
        //put -> Adding the elements
        NavigableMap<String, Integer> map = new TreeMap<String,Integer> ().descendingMap();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        System.out.println(map);

    }
}
