package Day2;

import java.util.Stack;

public class Stack_Eg {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10); //5
        s.push(5); //4
        s.push(5); //3
        s.push(2); //2
        s.push(1); //offset 1

        System.out.println(s.search(5));

        System.out.println("Before Pop"+s);
        Object rem = s.pop();
        System.out.println("After Pop"+s);
        System.out.println(rem);


        System.out.println("Before peek"+s);
        Object x = s.peek();
        System.out.println("After peek"+s);
        System.out.println(x);

    }
}
