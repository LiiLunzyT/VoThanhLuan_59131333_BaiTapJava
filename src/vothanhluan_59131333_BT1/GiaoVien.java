/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vothanhluan_59131333_BT1;

/**
 *
 * @author ASUS
 */
public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    
    @Override
    public String HienThiTT() {
        return "Ten: " + getHoTen() + "\nTuoi: " + getTuoi() +
               "\nDia chi: " + getDiaChi() + "\nSDT: " + getSdt() +
               "\nMon day: " + getMonDay() + "\nTo bo mon: " + getToBoMon();
    }

    public String getMonDay() {
        return monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    
}
