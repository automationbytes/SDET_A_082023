package Day1;

import java.util.LinkedHashMap;

public class CharFreq {
    public static void main(String[] args) {
        String input = "Hello World";
        LinkedHashMap<Character, Integer> charFreq = new LinkedHashMap<>();
//        for (char c: input.toCharArray()) {
//            charFreq.put(c,charFreq.getOrDefault(c,0)+1);
//        }
//        System.out.println(charFreq);

        for(char c: input.toCharArray()){
            if(charFreq.containsKey(c)){
                charFreq.put(c,charFreq.get(c)+1);
            }else {
                charFreq.put(c,1);
            }
        }
                System.out.println(charFreq);

    }
}
