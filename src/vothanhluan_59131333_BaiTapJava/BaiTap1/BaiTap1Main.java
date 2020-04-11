/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BaiTapJava.BaiTap1;
/**
 *
 * @author ASUS
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien("Vo Thanh Luan", 18, "Nha Trang", 1000, 300);
        NhanVien nhanvien2 = new NhanVien("Lam Mai Huynh", 19, "Nha Trang", 1200, 250);
        System.out.println(nhanvien1.getThongTin());
        System.out.println(nhanvien2.getThongTin());
    }
}
