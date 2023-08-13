package Day1;

public class StringRefresher {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d = new String("Hello");

        // == and equals
        System.out.println(a.equals(c)); //just the value

        System.out.println(d == c); // check the value and the memory stored



    }
}
