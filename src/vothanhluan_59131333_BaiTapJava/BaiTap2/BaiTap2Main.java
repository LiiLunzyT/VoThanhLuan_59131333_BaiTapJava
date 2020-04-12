/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BaiTapJava.BaiTap2;
import vothanhluan_59131333_BaiTapJava.BaiTap1.NhanVien;

/**
 *
 * @author ASUS
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.them(new NhanVien("Vo Thanh Luan", 20, "Nha Trang", 1000, 210));
        qlnv.them(new NhanVien("Nguyen Tan Kiet", 20, "Ninh Hoa", 1100, 250));
        qlnv.them(new NhanVien("Pham Truong Phat", 20, "Nha Trang", 1200, 300));
        qlnv.them(new NhanVien("Cao Quynh Anh", 20, "Ninh Hoa", 1050, 260));
        qlnv.them(new NhanVien("Lam Mai Huynh", 20, "Nha Trang", 1150, 290));
        qlnv.inDS();
    }
}
