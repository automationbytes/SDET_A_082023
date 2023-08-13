package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Sorted {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(33,11,44,22,55));
        System.out.println(list);

        list.stream().sorted()
                .forEach(System.out::println);

        list.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
