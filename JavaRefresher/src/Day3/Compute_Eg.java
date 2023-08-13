package Day3;

import java.util.HashMap;

public class Compute_Eg {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Apple",200);
        map.put("Stawberry",300);
        map.put("Orange",100);

        String newKey = "Banana";
        Integer price = 100;

        System.out.println(map);

//
//        map.compute(newKey,(key,value)-> (value == null)? price : value+price);
//        System.out.println(map);


        map.computeIfPresent("Apple",(key,value)-> price);
        System.out.println(map);



        //10% discount for apple

        int newApplePrice = map.compute("Apple",(key,val) -> val - (val* 10/100));
        System.out.println(newApplePrice);

        System.out.println(map);

        //computeifPresent


        //10% discount for apple

        int newPineApplePrice = map.computeIfAbsent("PineApple",key->200);
        System.out.println(newPineApplePrice);

        System.out.println(map);
    }
}
