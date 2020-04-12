/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BaiTapJava.BaiTap2;
import vothanhluan_59131333_BaiTapJava.BaiTap1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList();
    }

    public QuanLyNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }
    
    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien nv : dsNhanVien) {
            System.out.println(nv.getThongTin());
        }
    }
    
}
