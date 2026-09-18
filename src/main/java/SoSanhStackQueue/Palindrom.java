package SoSanhStackQueue;

import java.util.Stack;

public class Palindrom {
    public static void main(String[] args) {
        String[] chuoi = {"madam", "cọc", "chim", "bướm"};
        for (int i = 0; i < chuoi.length; i++) {
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < chuoi[i].length(); j++) {
                stack.push(chuoi[i].charAt(j));
            }
            boolean laPalindrom = true;
            for (int j = 0; j < chuoi[i].length(); j++) {
                if (chuoi[i].charAt(j) != stack.pop()) {
                    laPalindrom = false;
                    break;
                }
            }
            System.out.println(chuoi[i]+" -> "+laPalindrom);
        }

    }
}
