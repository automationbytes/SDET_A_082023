package Day1;

public class removeDuplicates {
    public static void main(String[] args) {
        String input = "Hello World";
        StringBuilder sb = new StringBuilder();
        boolean[] isPresent = new boolean[128];


        for(char c : input.toCharArray()){

            if(!isPresent[c]){
                sb.append(c);
                isPresent[c] = true;
            }


//            if(sb.indexOf(String.valueOf(c)) == -1){
//                sb.append(c);
//            }
        }
        System.out.println(sb.toString());
    }
}


//reverse a number : 1234
//4321

//sort an array
//ascending
//descending
//find the largest
//smallest
//second largest
//second smallest