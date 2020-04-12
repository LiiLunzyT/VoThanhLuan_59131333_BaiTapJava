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
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Marketing");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    
    @Override
    public double getDiem() {
        return (diemMarketing*2 + diemSales) / 3;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
}
