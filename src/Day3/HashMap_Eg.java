package Day3;

import java.util.HashMap;

/*

Hashmap stores elements in Key/value pair
Key - Unique
Values- Duplicates

One Null Key


 */
public class HashMap_Eg {
    public static void main(String[] args) {

        //put -> Adding the elements
        HashMap<String,Integer> map = new HashMap<String,Integer> ();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        System.out.println(map);


        System.out.println("getorDefault     "+map.getOrDefault("Ten",-1));
        System.out.println(map);



        //get -> Access the elements
        System.out.println(map.get("Three"));

       // System.out.println(map["Three"]);

        map.replace("Three",33);
        System.out.println(map);

        //remove
        map.remove("Three");
        System.out.println(map);

        //containsKey
        System.out.println(map.containsKey("Two"));

        //containsvalue
        System.out.println(map.containsValue(2));
    }
}
