package Day1;

public class ReverseAString {
    public static void main(String[] args) {
        String a = "Hello World";

//        for(int i = a.length()-1; i >=0;i--){
//            System.out.println(a.charAt(i));
//        }

//        char[] carr = new char[a.length()];
//        for (int i =0; i< carr.length;i++){
//            carr[i] = a.charAt(a.length()-1-i);
//            System.out.println(carr[i]);
//        }
        int len = a.length();
        char[] carr = a.toCharArray();
    for (int i = 0; i<len/2; i++){
        char temp = carr[i];
        carr[i] = carr[len-1-i];
        carr[len-1-i] = temp;
    }


        System.out.println(new String(carr));

        //

        //Hello 2023 here we come
        //olleh 3202 ereh ew emoc // reversing entire chars/number
        //olleh 2023 ereh ew emoc // reversing the char
    }
}
