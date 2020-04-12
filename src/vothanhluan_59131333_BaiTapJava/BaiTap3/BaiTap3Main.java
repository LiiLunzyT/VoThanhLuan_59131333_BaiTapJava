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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienIT it1 = new SinhVienIT("Vo Thanh Luan", 8, 9, 9);
        SinhVienIT it2 = new SinhVienIT("Nguyen Tan Kiet", 8, 9, 9);
        SinhVienBiz bi1 = new SinhVienBiz("Lam Mai Huynh", 8, 9);
        
        it1.xuat(); it2.xuat(); bi1.xuat();
    }
    
}
