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
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }
    public String getThongTin() {
        return "Ten: " + getTen() + "\nTuoi: " + getTuoi() + 
               "\nDia chi: " + getDiaChi() + "\nTien luong: " + getTienLuong() +
               "\nTong gio lam: " + getTongGioLam() + "\nTinh Thuong: " +
               tinhThuong();
    }
    
    public double tinhThuong() {
        if(this.tongGioLam > 200) return this.tienLuong * 0.2;
        if(this.tongGioLam >= 100) return this.tienLuong * 0.1;
        return 0;
    }
    
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
}
