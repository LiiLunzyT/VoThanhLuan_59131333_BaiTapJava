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
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    double soNgay;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, double soNgay) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }
    
    @Override
    public void xuat() {
        System.out.println("Ma so chuyen: " + getMaSoChuyen());
        System.out.println("Ho ten tai xe: " + getHoTenTaiXe());
        System.out.println("So xe: " + getSoXe());
        System.out.println("Noi den: " + getNoiDen());
        System.out.println("So ngay di: " + getSoNgay());
        System.out.println("Doanh thu: " + getDoanhThu());
    }

    public String getNoiDen() {
        return noiDen;
    }

    public double getSoNgay() {
        return soNgay;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgay(double soNgay) {
        this.soNgay = soNgay;
    }
}
