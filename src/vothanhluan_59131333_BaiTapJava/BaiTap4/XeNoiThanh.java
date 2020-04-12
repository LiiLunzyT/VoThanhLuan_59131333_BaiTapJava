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
public class XeNoiThanh extends ChuyenXe{
    String soTuyen;
    double soKm;

    public XeNoiThanh() {
    }

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public void xuat() {
        System.out.println("Ma so chuyen: " + getMaSoChuyen());
        System.out.println("Ho ten tai xe: " + getHoTenTaiXe());
        System.out.println("So xe: " + getSoXe());
        System.out.println("So tuyen: " + getSoTuyen());
        System.out.println("So km di: " + getSoKm());
        System.out.println("Doanh thu: " + getDoanhThu());
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
}
