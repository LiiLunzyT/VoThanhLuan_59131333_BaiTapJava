/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BaiTapJava.BaiTap3;

/**
 *
 * @author ASUS
 */
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc() {
        double diem = getDiem();
        if(diem < 5) return "Yếu";
        if(diem < 6.5) return "Trung Bình";
        if(diem < 7.5) return "Khá";
        if(diem < 9) return "Giỏi";
        return "Xuất sắc";
    }
    
    public void xuat() {
        System.out.println("Ten: " + hoTen);
        System.out.println("Nganh: " + nganh);
        System.out.println("Diem: " + getDiem() + " => " + getHocLuc());
    }
}
