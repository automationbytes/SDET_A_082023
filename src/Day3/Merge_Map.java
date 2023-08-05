package Day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Merge_Map {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("India","Chennai");
        map.put("America","New York");
        map.put("Australia","Sydney");
      //  map.put("India","Delhi");

        String newvalue = map.merge("India","Delhi",(oldval,newval) -> oldval + "/" + newval);
        System.out.println(newvalue);
        System.out.println(map);


        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ " -- "+entry.getValue());
        }

        for(String k : map.keySet()){
            System.out.println(k+" -- "+map.get(k));
        }



        map.forEach((k,v) -> System.out.println(k+"--"+v));

        //Iterator
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+"//"+entry.getValue());

        }
    }
}
