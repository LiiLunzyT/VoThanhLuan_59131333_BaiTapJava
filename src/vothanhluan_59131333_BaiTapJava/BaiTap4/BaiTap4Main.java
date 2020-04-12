/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BaiTapJava.BaiTap4;

/**
 *
 * @author ASUS
 */
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.them(new XeNoiThanh("XYZ111", "Nguyen Van A", "79N1111", 100000, "Tuyen 1", 120));
        qlcx.them(new XeNoiThanh("XYZ222", "Nguyen Van B", "79N2222", 100000, "Tuyen 2", 120));
        qlcx.them(new XeNoiThanh("XYZ333", "Nguyen Van C", "79N3333", 100000, "Tuyen 3", 120));
        qlcx.them(new XeNgoaiThanh("ABC999", "Le Thi X", "79M999", 120000, "Nha Trang", 1));
        qlcx.them(new XeNgoaiThanh("ABC888", "Le Thi Y", "79M888", 200000, "Sai Gon", 2));
        qlcx.them(new XeNgoaiThanh("ABC777", "Le Thi Z", "79M777", 300000, "Ha Noi", 3));
        qlcx.inDS();
        System.out.println("Tong doanh thu xe noi thanh: " + qlcx.getDoanhThuNoiThanh());
        System.out.println("Tong doanh thu xe ngoai thanh: " + qlcx.getDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu: " + qlcx.getTongDoanhThu());
    }
}
