package SoSanhStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NhanVien {
    private String ten;
    private int luong;

    public NhanVien(String ten, int luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public int getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return ten+" "+luong+"\n";
    }

    public static void main(String[] args) {
        ArrayList<NhanVien> list = new ArrayList<>();
        list.add(new NhanVien("B", 19000000));
        list.add(new NhanVien("G", 15000000));
        list.add(new NhanVien("H", 13000000));
        list.add(new NhanVien("K", 19000000));
        list.add(new NhanVien("D", 7000000));
        Comparator<NhanVien> theoLuong = (nv1, nv2) -> Double.compare(nv1.getLuong(), nv2.getLuong());
        Collections.sort(list, theoLuong);
        System.out.println(list);
        Comparator<NhanVien> theoTen=(nv1,nv2)->nv1.getTen().compareTo(nv2.getTen());
        Collections.sort(list, theoTen);
        System.out.println(list);
    }
}
