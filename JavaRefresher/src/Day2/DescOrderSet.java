package Day2;

import java.util.TreeSet;

public class DescOrderSet {
    public static void main(String[] args) {
        TreeSet set = (TreeSet) new TreeSet().descendingSet();
        set.add(5);
        set.add(50);
        set.add(19);

        System.out.println(set);

    }
}
