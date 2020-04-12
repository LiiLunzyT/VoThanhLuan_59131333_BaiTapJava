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
public class HocSinh extends CaNhan{
    String lop;
    String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    

    @Override
    public String HienThiTT() {
        return "Ten: " + getHoTen() + "\nTuoi: " + getTuoi() +
               "\nDia chi: " + getDiaChi() + "\nSDT: " + getSdt() +
               "\nLop: " + getLop() + "\nNang khieu: " + getNangKhieu();
    }

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
}
