package baiquanlycongviec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCongViec {
    Scanner scanner = new Scanner(System.in);
    List<String> danhSachCV = new ArrayList<>();

    public void denTrangChu() {
        int chonSo;
        do {
            System.out.println("---Bảng quán lý công việc---");
            System.out.println("1. Thêm công việc mới");
            System.out.println("2. Sửa công việc");
            System.out.println("3. Xóa công việc");
            System.out.println("4. Danh sách công việc hiện tại");
            System.out.println("5. Đánh dấu hoàn thành công việc");
            System.out.println("0. Thoát");
            chonSo = scanner.nextInt();
            scanner.nextLine();
            switch (chonSo) {
                case 0:
                    System.out.println("Tạm biệt");
                    break;
                case 1:
                    themMoiCV();
                    break;
                case 2:
                    suaCV();
                    break;
                case 3:
                    xoaCV();
                    break;
                case 4:
                    danhSachCongViecHienTai();
                    break;
                case 5:
                    congViecDaHoanThanh();
                    break;
            }
        } while (chonSo != 0);
    }

    public void themMoiCV() {
        System.out.println("---Thêm mơi---");
        System.out.println("Nhập công việc mới ");
        String tenCv = scanner.nextLine();
        danhSachCV.add(tenCv);
        System.out.println("Thêm công việc mới thành công");
    }

    public void suaCV() {
        System.out.println("---Sửa---");
        System.out.println("---Nhập tên công việc cần thay đổi---");
        String tenCv = scanner.nextLine();
        int danhSachSua = danhSachCV.indexOf(tenCv);
        if (danhSachSua == -1) {
            System.out.println("Không tìm thấy công việc");
        } else {
            System.out.println("Nhập tên công việc muốn thay đổi");
            String tenCvMoi = scanner.nextLine();
            danhSachCV.set(danhSachSua, tenCvMoi);
        }
    }

    public void xoaCV() {
        System.out.println("---Xóa công việc---");
        System.out.println("Nhập tên công việc muốn xóa");
        String tenCv = scanner.nextLine();
        int nhapSoXoa = danhSachCV.indexOf(tenCv);
        if (nhapSoXoa == -1) {
            System.out.println("Không thể tìm thấy công việc");
        } else {
            danhSachCV.remove(nhapSoXoa);
            System.out.println("Xóa công việc thành công");
        }
    }

    public void danhSachCongViecHienTai() {
        System.out.println("Danh sách công việc hiện tại");
        int cong1VaoDS = 1;
        for (String tenCv : danhSachCV) {
            System.out.println(cong1VaoDS + ". " + tenCv);
            cong1VaoDS++;
        }
    }

    public static void main(String[] args) {
        QuanLyCongViec obj = new QuanLyCongViec();
        obj.denTrangChu();
    }
    public void congViecDaHoanThanh() {
        System.out.println("---Đánh dấu công việc---");
        System.out.println("Nhập tên công việc đã hoàn thành");
        String tenCv = scanner.nextLine();
        int danhSachSua= danhSachCV.indexOf(tenCv);
        if (danhSachSua == -1) {
            System.out.println("Không tìm thấy công việc");
        }else {
            danhSachCV.set(danhSachSua,"[Đã xong] "+ tenCv);
        }

    }
}
