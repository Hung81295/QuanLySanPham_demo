package SoSanhStackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class CuaHang {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Ánh");
        queue.offer("Yêu");
        queue.offer("Hưng");
        queue.offer("Nhiều");
        queue.offer("Lắm");
        for (int i = 0; i < 3; i++) {
            System.out.println("Đang phục vụ: " + queue.poll());
        }
        System.out.println("Còn lại số khách hàng là: "+queue.size());
        System.out.println("Người xếp đầu hàng là: "+queue.peek());
    }
}
