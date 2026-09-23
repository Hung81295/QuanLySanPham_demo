package SoSanhStackQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BenhNhan {
    private String name;
    private boolean uuTien;

    public BenhNhan(String name, boolean uuTien) {
        this.name = name;
        this.uuTien = uuTien;
    }

    public String getName() {
        return name;
    }

    public boolean isUuTien() {
        return uuTien;
    }

    @Override
    public String toString() {
        return name + (uuTien ? "[CẤP CỨU]" : "");
    }

    public static void main(String[] args) {
        Queue<BenhNhan> hangDoiThuong = new LinkedList<>();
        hangDoiThuong.offer(new BenhNhan("Hưng", false));
        hangDoiThuong.offer(new BenhNhan("Ánh", false));
        hangDoiThuong.offer(new BenhNhan("Hùng", false));
        hangDoiThuong.offer(new BenhNhan("Anh", false));
        hangDoiThuong.offer(new BenhNhan("Canh", false));
        PriorityQueue<BenhNhan> hangDoiUuTien = new PriorityQueue<>(
                (bn1, bn2) -> Boolean.compare(bn2.isUuTien(), bn1.isUuTien()));
        hangDoiUuTien.offer(new BenhNhan("Hưng", false));
        hangDoiUuTien.offer(new BenhNhan("Ánh", true));
        hangDoiUuTien.offer(new BenhNhan("Hùng", false));
        hangDoiUuTien.offer(new BenhNhan("Anh", true));
        hangDoiUuTien.offer(new BenhNhan("Canh", false));
        System.out.println("Thứ tự khám (Queue thường)");
        while (!hangDoiThuong.isEmpty()) {
            System.out.println(hangDoiThuong.poll());
        }
        System.out.println("Thứ tự khám(PriorityQueue): ");
        while (!hangDoiUuTien.isEmpty()) {
            System.out.println(hangDoiUuTien.poll());
        }
    }
}

