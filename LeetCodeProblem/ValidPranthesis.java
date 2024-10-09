

// 20 Valid Pranthesis

import java.util.Stack;

public class ValidPranthesis {
    public static void main(String[] args) {
        String s= "(){}[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(stack.peek()== s.charAt(i)) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
