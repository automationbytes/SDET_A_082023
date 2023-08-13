package Day2;

import java.util.ArrayList;

public class Arraylist_Egs {

    public static void main(String[] args) {

        ArrayList al = new ArrayList(5);

        //To add an element
        al.add(5);
        al.add(5);
        al.add("Hello");
        al.add(3.5);

        System.out.println(al);

        //To add an element in specified position
        al.add(2,9);
        System.out.println(al);

        //length
        System.out.println(al.size());

        //clone -> create a copy of an array

        ArrayList al2 = (ArrayList) al.clone();
        System.out.println(al2);

        System.out.println(al.clone());

        //remove value from arraylist
        al2.clear(); //remove everythg
        System.out.println(al2);

        al.remove(0);
        System.out.println(al);

        al.remove(3.5);
        System.out.println(al);

        al.removeIf(element -> element instanceof String);
        System.out.println(al);

        //contains
        System.out.println(al.contains(3.5));

        //get
        System.out.println(al.get(0));

        //System.out.println(al.get(2));

        //set
        al.set(0,19);
        System.out.println(al);

//        al.set(2,19);
//        System.out.println(al);

        al.add(5);
        al.add(3.5);
        al.add("Hello");
        al.add(3.5);
        System.out.println(al);

        //indexof- returns the index number of the object
        System.out.println(al.indexOf(5));


        System.out.println(al);
        //lastindexof- returns the index numbe`r of the object from last
        System.out.println(al.lastIndexOf(3.5));







    }
}
