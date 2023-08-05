package Day1;

public class ReverseAllWrds {

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String w : words) {
            if(isNumber(w)){
                reversedString.append(w).append(" ");
            }else{
                reversedString.append(reverse(w)).append(" ");
            }
        }
        return reversedString.toString().strip();
    }

    public static  String reverse(String a){
        int len = a.length();
        char[] carr = a.toCharArray();
        //swap chars from both ends
        for (int i = 0; i<len/2; i++){
            char temp = carr[i];
            carr[i] = carr[len-1-i];
            carr[len-1-i] = temp;
        }
        return new String(carr);
    }

    public static boolean isNumber(String str){
        return str.matches("(\\d+)");
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello 2023 here we come"));
    }
}





