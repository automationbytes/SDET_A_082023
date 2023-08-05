package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Distinct {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3));

        List<Integer> output = list.stream()
                .distinct()
                .collect(Collectors.toList());
        list.clear();
        list.addAll(output);
        System.out.println(output);
        System.out.println(list);
    }
}
