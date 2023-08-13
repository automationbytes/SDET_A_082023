package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Arraylist2{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Tim");
        list.add("Jack");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Rose");
        list2.add("Kal");
        list2.add("Raddy");

        list.addAll(2,list2);
        System.out.println(list);


        System.out.println("list1"+list);
        System.out.println("list2"+list2);

//        list.removeAll(list2);
//        System.out.println("Org list1"+list);

//        list.retainAll(list2);
//        System.out.println("retained list1"+list);

        System.out.println(list.containsAll(list2));

        System.out.println(list2.containsAll(list));

        list.replaceAll(ele -> ele.toUpperCase());
        System.out.println(list);

        System.out.println(list.subList(2,5));

        ArrayList<Integer> al = new ArrayList<>();
     //   al.ensureCapacity(3);
        al.add(5);
        al.add(7);
        al.add(10);
        al.add(2);
        al.add(4);
//        al.trimToSize();
//        System.out.println(al);

        //sorting using collections
        Collections.sort(al);
        System.out.println(al);

        //descending order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        //sorting using comparator operator
        al.sort(Comparator.naturalOrder());
        System.out.println(al);


        al.sort(Comparator.reverseOrder());
        System.out.println(al);



    }

}
