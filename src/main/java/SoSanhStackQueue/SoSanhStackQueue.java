package SoSanhStackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SoSanhStackQueue {
    public static void main(String[] args) {
        String[] khach={"Hưng","Ánh","Long","Phượng","Quy"};
        Stack<String> stack=new Stack<>();
        Queue<String> queue=new LinkedList<>();
        /*stack.push(khach[0]);
        stack.push(khach[1]);
        stack.push(khach[2]);
        stack.push(khach[3]);
        stack.push(khach[4]);
        queue.offer(khach[0]);
        queue.offer(khach[1]);
        queue.offer(khach[2]);
        queue.offer(khach[3]);
        queue.offer(khach[4]);*/
        for (String ten :khach) {
            stack.push(ten);
            queue.offer(ten);
        }
        System.out.println("Lấy ra từ Stack: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Lấy ra từ Queue: ");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
