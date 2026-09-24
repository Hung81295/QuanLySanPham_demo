package SoSanhStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SanPham implements Comparable<SanPham> {
    private String ten;
    private int gia;
    private double soLuong;

    public SanPham(String ten, int gia, double soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    @Override
    public int compareTo(SanPham o) {
        return Integer.compare(this.getGia(),o.getGia());
    }

    @Override
    public String toString() {
        return ten + " " + gia + " " + soLuong;
    }

    public static void main(String[] args) {
        ArrayList<SanPham> obj = new ArrayList<>();
        obj.add(new SanPham("Táo", 10000, 10));
        obj.add(new SanPham("Ổi", 11000, 10));
        obj.add(new SanPham("Đào", 40000, 10));
        obj.add(new SanPham("Nho", 15000, 10));
        obj.add(new SanPham("Khế", 19000, 10));
        System.out.println("Danh sách sản phẩm theo giá:");
        Collections.sort(obj);
        for (SanPham s : obj) {
            System.out.println(s);
        }
        System.out.println("Danh sách sản phẩm theo tên ngược:");
        Collections.sort(obj,Collections.reverseOrder());
        for (SanPham s : obj) {
            System.out.println(s);
        }
        System.out.println("Danh sách sản phẩm theo giá:");
        Comparator<SanPham> theoGia = (sp1, sp2) -> Integer.compare(sp1.getGia(), sp2.getGia());
        Collections.sort(obj, theoGia);
        for (SanPham s : obj) {
            System.out.println(s);
        }
    }
}
