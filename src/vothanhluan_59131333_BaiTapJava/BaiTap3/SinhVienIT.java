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
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;

    public SinhVienIT() {
    }

    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    
    @Override
    public double getDiem() {
        return (diemJava*2 + diemCss + diemHtml) / 4;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
}
