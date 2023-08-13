package Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_Map_Eg {
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Tom",77);
        marks.put("Tim",27);
        marks.put("Mahi",99);
        marks.put("Maha",95);

        double averageScore = marks.values().stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(averageScore);

        String topScorer = marks.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No top scorer");
        System.out.println(topScorer);


        String lowScorer = marks.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No low scorer");
        System.out.println(lowScorer);

        Map<String, Integer> abv90 = marks.entrySet().stream()
                .filter(entry ->entry.getValue() > 90)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(abv90);

    }
}
