package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Filter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        List<Integer> outputlist = list.stream()
                .filter(value -> value %2 ==0)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(outputlist);
    }
}
