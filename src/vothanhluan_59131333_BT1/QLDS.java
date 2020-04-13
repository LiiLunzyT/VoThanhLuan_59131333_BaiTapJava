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
public class QLDS implements IQLDS{
    ArrayList<CaNhan> dsCaNhan;

    public QLDS() {
        dsCaNhan = new ArrayList<CaNhan>();
    }

    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }
    
    @Override
    public int them(CaNhan p) {
        return dsCaNhan.add(p)? 1 : 0;
    }

    @Override
    public int xoa(String ten) {
        int count = 0;
        for(CaNhan c : dsCaNhan) {
            if(c.getHoTen() == ten) {
                dsCaNhan.remove(c);
                count++;
            }
        }
        return count;
    }

    @Override
    public void inDS(ArrayList<CaNhan> ls) {
        for(CaNhan c : ls) {
            System.out.println(c.HienThiTT());
        }
    }

    public ArrayList<CaNhan> getLs() {
        return dsCaNhan;
    }

    public void setLs(ArrayList<CaNhan> ls) {
        this.dsCaNhan = ls;
    }
    
}
