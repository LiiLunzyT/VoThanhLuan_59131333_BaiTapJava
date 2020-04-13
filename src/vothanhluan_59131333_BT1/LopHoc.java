/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BT1;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class LopHoc {
    ArrayList<CaNhan> hocSinh;
    ArrayList<CaNhan> giaoVien;
    GiaoVien giaoVienCN;
    QLDS qldsHS;
    QLDS qldsGVGD;

    public LopHoc() {
        hocSinh = new ArrayList();
        giaoVien = new ArrayList();
        qldsHS = new QLDS(hocSinh);
        qldsGVGD = new QLDS(giaoVien);
    }

    public LopHoc(GiaoVien giaoVienCN, QLDS qldsHS, QLDS qldsGVGD) {
        this.giaoVienCN = giaoVienCN;
        this.qldsHS = qldsHS;
        this.qldsGVGD = qldsGVGD;
    }
    
    public int themHocSinh(HocSinh hs) {
        qldsHS.them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv) {
        qldsGVGD.them(gv);
        return 1;
    }
    
    public int inDSHS() {
        System.out.println("Danh Sach Hoc sinh(" + hocSinh.size() + "): ");
        qldsHS.inDS(hocSinh);
        return hocSinh.size();
    }
    
    public int inDSGV() {
        System.out.println("Danh Sach Giang vien(" + giaoVien.size() + "): ");
        qldsGVGD.inDS(giaoVien);
        return giaoVien.size();
    }

    public GiaoVien getGiaoVienCN() {
        return giaoVienCN;
    }

    public QLDS getQldsHS() {
        return qldsHS;
    }

    public QLDS getQldsGVGD() {
        return qldsGVGD;
    }

    public void setGiaoVienCN(GiaoVien giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }

    public void setQldsHS(QLDS qldsHS) {
        this.qldsHS = qldsHS;
    }

    public void setQldsGVGD(QLDS qldsGVGD) {
        this.qldsGVGD = qldsGVGD;
    }
    
}
