package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream_ForEach {
    public static void main(String[] args) {
        Stream.of("A","D","C")
                .parallel()
                .forEach(i -> System.out.println("forEach-> "+i));


        Stream.of("A","D","C")
                .parallel()
                .forEachOrdered(i -> System.out.println("forEach-> "+i));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.parallelStream()
                .forEach(System.out::println);
        System.out.println("-----");
        //count
        System.out.println(list.stream().count());

        //sum
        int sumofList = list.stream().reduce(0,(val,sum) -> sum += val);
        System.out.println(sumofList);

        //min
        int Min = list.stream().min((a,b) -> Integer.compare(a,b)).get();
        System.out.println(Min);

        //max
        int Max = list.stream().max((a,b) -> Integer.compare(a,b)).get();
        System.out.println(Max);

        System.out.println(list.stream().findFirst());
        Optional<Integer> a = list.stream().findAny();
        System.out.println(a);

        System.out.println(list.stream().noneMatch(v->v==2));
        System.out.println(list.stream().allMatch(v->v==2));
        System.out.println(list.stream().anyMatch(v->v==2));



    }


}
