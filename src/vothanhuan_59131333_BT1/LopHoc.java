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
    GiaoVien giaoVienCN;
    QLDS qldsHS;
    QLDS qldsGVGD;

    public LopHoc() {
        qldsHS = new QLDS();
        qldsGVGD = new QLDS();
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
        qldsHS.inDS();
        return 1;
    }
    
    public int inDSGV() {
        qldsGVGD.inDS();
        return 1;
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
