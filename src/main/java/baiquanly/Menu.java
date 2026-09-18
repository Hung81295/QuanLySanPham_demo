package baiquanly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public List<String> danhSachSp = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);


    public void showMenu() {
        int suLuaChon;
        do {
            System.out.println("-----Cửa hàng của tôi-----");
            System.out.println("1. Thêm mới");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Danh sách");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng trọn 1 số cần trọn.");
            suLuaChon = scanner.nextInt();
            scanner.nextLine();
            switch (suLuaChon) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    suaSp();
                    break;
                case 3:
                    xoaSP();
                    break;
                case 4:
                    danhSachSanPham();
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    break;

            }
        } while (suLuaChon != 0);
    }

    public void suaSp() {
        System.out.println("-----Sửa-----");
        System.out.println("Nhập tên muốn sửa");
        String tenSp = scanner.nextLine();
        int suaIndex = danhSachSp.indexOf(tenSp);
        if (suaIndex == -1) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            System.out.println("Nhập tên sản phẩm mới");
            String tenSp2 = scanner.nextLine();
            danhSachSp.set(suaIndex, tenSp2);
        }
    }

    public void themMoi() {
        System.out.println("---Thêm mới---");
        System.out.println("Nhập tên sản phầm: ");
        String tenSp = scanner.nextLine();
        danhSachSp.add(tenSp);
        System.out.println("Thêm sản phẩm thành công");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }

    public void danhSachSanPham() {
        System.out.println("Danh sách sản phẩm: ");
        int index = 1;
        for (String item : danhSachSp) {
            System.out.println(index + ". " + item);
            index++;
        }
    }

    public void xoaSP() {
        System.out.println("-----Xóa sản phẩm-----");
        System.out.println("Nhập tên sản phẩm muốn xóa:");
        String tenSp = scanner.nextLine();
        int xoaIndex = danhSachSp.indexOf(tenSp);
        if (xoaIndex == -1) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            danhSachSp.remove(xoaIndex);
            System.out.println("Xóa sản phẩm thành công");
        }

    }
}
