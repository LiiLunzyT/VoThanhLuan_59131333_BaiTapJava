/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BaiTapJava.BaiTap4;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class QuanLyChuyenXe implements IQuanLyChuyenXe {
    ArrayList<ChuyenXe> dsChuyenXe;

    public QuanLyChuyenXe() {
        dsChuyenXe = new ArrayList();
    }

    public QuanLyChuyenXe(ArrayList<ChuyenXe> dsChuyenXe) {
        this.dsChuyenXe = dsChuyenXe;
    }
    
    @Override
    public void them(ChuyenXe cx) {
        dsChuyenXe.add(cx);
    }

    @Override
    public double getDoanhThuNoiThanh() {
        double tong = 0;
        for(ChuyenXe cx : dsChuyenXe) {
            if(cx instanceof XeNoiThanh) {
                tong += cx.getDoanhThu();
            }
        }
        return tong;
    }

    @Override
    public double getDoanhThuNgoaiThanh() {
        double tong = 0;
        for(ChuyenXe cx : dsChuyenXe) {
            if(cx instanceof XeNgoaiThanh) {
                tong += cx.getDoanhThu();
            }
        }
        return tong;
    }

    @Override
    public double getTongDoanhThu() {
        return getDoanhThuNoiThanh() + getDoanhThuNgoaiThanh();
    }

    @Override
    public void inDS() {
        for(ChuyenXe cx : dsChuyenXe) {
            cx.xuat();
        }
    }
    
}
