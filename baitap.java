
import java.util.ArrayList;
import java.util.List;
class HocSinh {
    private String ten;
    private int tuoi;
    public HocSinh(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten + ", Tuổi: " + tuoi);
    }
}

class LopHoc {
    private String tenLop;
    private List<HocSinh> danhSachHocSinh;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.danhSachHocSinh = new ArrayList<>();
    }

    public void themHocSinh(HocSinh hocSinh) {
        danhSachHocSinh.add(hocSinh);
    }

    public void hienThiDanhSachHocSinh() {
        System.out.println("Danh sách học sinh của lớp " + tenLop + ":");
        for (HocSinh hocSinh : danhSachHocSinh) {
            hocSinh.hienThiThongTin();
        }
    }
}

public class baitap {
    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh("Nguyễn Văn A", 15);
        HocSinh hocSinh2 = new HocSinh("Trần Thị B", 16);
        HocSinh hocSinh3 = new HocSinh("Lê Minh C", 15);
        LopHoc lopHoc = new LopHoc("Lớp 10A1");
        lopHoc.themHocSinh(hocSinh1);
        lopHoc.themHocSinh(hocSinh2);
        lopHoc.themHocSinh(hocSinh3);
        lopHoc.hienThiDanhSachHocSinh();
    }
}


