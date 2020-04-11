/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhuan_59131333_BT1;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class LopHoc {
    ArrayList<CaNhan> hocSinh;
    ArrayList<CaNhan> giaoVien;
    GiaoVien giaoVienCN;
    QLDS qldsHS = new QLDS(hocSinh);
    QLDS qldsGVGD = new QLDS(giaoVien);

    public LopHoc() {
    }

    public LopHoc(QLDS qldsGVGD, QLDS qldsHS, GiaoVien giaoVienCN) {
        this.qldsGVGD = qldsGVGD;
        this.qldsHS = qldsHS;
        this.giaoVienCN = giaoVienCN;
    }

    public int themHocSinh(HocSinh hs) {
        return qldsHS.them(hs);
    }
    
    public int themGVGD(GiaoVien gv) {
        return qldsGVGD.them(gv);
    }
    
    public int inDSHV() {
        qldsHS.inDS(hocSinh);
        return hocSinh.size();
    }
    
    public int inDSGVGD() {
        qldsGVGD.inDS(giaoVien);
        return giaoVien.size();
    }
    
    public QLDS getQldsGVGD() {
        return qldsGVGD;
    }

    public QLDS getQldsHS() {
        return qldsHS;
    }

    public GiaoVien getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setQldsGVGD(QLDS qldsGVGD) {
        this.qldsGVGD = qldsGVGD;
    }

    public void setQldsHS(QLDS qldsHS) {
        this.qldsHS = qldsHS;
    }

    public void setGiaoVienCN(GiaoVien giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    
}
