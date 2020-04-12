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
    String soTuyen;
    double soKm;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    
    @Override
    public void xuat() {
        System.out.println();
    }
}
