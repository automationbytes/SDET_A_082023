package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(11,22,33,44,55));
        System.out.println(list);

        List<Integer> outputlist = list.stream()
                .map(value -> value +3)
                .collect(Collectors.toList());

        System.out.println(outputlist);

    }
}
