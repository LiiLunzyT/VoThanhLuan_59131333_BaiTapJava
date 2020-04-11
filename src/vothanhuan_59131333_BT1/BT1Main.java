/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhuan_59131333_BT1;

/**
 *
 * @author ASUS
 */
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc lh = new LopHoc();
        lh.themHocSinh(new HocSinh("Vo Thanh Luan", 21, "Nha Trang", "123", "CNTT1", "IT"));
        lh.themHocSinh(new HocSinh("Lam Mai Huynh", 20, "Nha Trang", "124", "CNTT2", "IT"));
        lh.themGVGD(new GiaoVien("Ngo Bao Chau", 50, "Ha Noi", "987", "Toan", "Toan-Tin"));
        lh.inDSHS();
        lh.inDSGV();
    }
}
