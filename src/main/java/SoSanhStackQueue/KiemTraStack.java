package SoSanhStackQueue;

import java.util.Stack;

public class KiemTraStack {
    public static boolean kiemTraHopLe(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char dauMo = stack.pop();
                if (dauMo == '(' && ch != ')') return false;
                if (dauMo == '[' && ch != ']') return false;
                if (dauMo == '{' && ch != '}') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(kiemTraHopLe("{[()]}"));
        System.out.println(kiemTraHopLe("([)]"));
        System.out.println(kiemTraHopLe("{[(])}"));
        System.out.println(kiemTraHopLe("(()"));
    }
}
