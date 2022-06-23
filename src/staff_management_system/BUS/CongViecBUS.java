package staff_management_system.BUS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DAO.CongViecDAO;
import staff_management_system.DTO.CongViec;

public class CongViecBUS {
    public static ArrayList<CongViec> dscv;
    CongViecDAO data = new CongViecDAO();

    public void docDSCV(){
        if(dscv==null)
            dscv = new ArrayList<>();
        dscv = data.docDSCV();
    }
    
    public boolean checkPK(String maCV, String tenCV){
        for(CongViec cv: dscv){
            if(cv.getMaCV().equals(maCV))
                return false;
        }
        return true;
    }

    public boolean themCV(CongViec cv) {
        if (data.themCV(cv)) {
            dscv.add(cv);
            return true;
        }
        return false;
    }

    public boolean suaCV(CongViec cv) {
        if (data.suaCV(cv)) {
            for(CongViec temp : dscv)
                if(temp.getMaCV().equals(cv.getMaCV())){
                    int pos = dscv.indexOf(temp);
                    CongViec old= dscv.set(pos, cv);
                    break;
                }
            return true;
        }
        return false;
    }

    public boolean xoaCV(int index) {
        if (data.xoaCV(dscv.get(index).getMaCV())) {
            dscv.remove(index);
            return true;
        }
        return false;
    }
    
    public ArrayList timKiem1 (int num1, String s) {
        ArrayList<CongViec> vc = new ArrayList <> ();
        switch(num1){
            case 1:
                for (CongViec temp: dscv)
                    if(temp.getMaCV().toUpperCase().contains(s.toUpperCase()))
                        vc.add(temp);
                break;
            case 2:
                for (CongViec temp: dscv)
                    if(temp.getTenCV().toUpperCase().contains(s.toUpperCase()))
                        vc.add(temp);
                break;
             }
        return vc;
    }      
}
