package staff_management_system.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import staff_management_system.DTO.CongViec;
import staff_management_system.Helpers.ConnectSql;

public class CongViecDAO {
    ConnectSql con = new ConnectSql("localhost","root","thanhnga","staff_salary_management");

    public CongViecDAO() {
    }

    public ArrayList docDSCV(){
        ArrayList dscv = new ArrayList<CongViec>();
        ResultSet rs;
        try {
            String qry = "SELECT * FROM congviec";
            rs = con.excuteQuery(qry);
            while(rs.next()){
                CongViec cv = new CongViec();
                cv.setMaCV(rs.getString(1));
                cv.setTenCV(rs.getString(2));
                dscv.add(cv);
            }
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(CongViecDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dscv;
    }
    
    public boolean themCV(CongViec cv){
        try {
            String s="INSERT INTO congviec VALUES ";
            s+="('"+cv.getMaCV()+"','"+cv.getTenCV()+"');";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(CongViecDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean suaCV(CongViec cv){
        try {
            String s="UPDATE congviec SET ";
            s+="tencongviec='"+cv.getTenCV();
            s+="' WHERE macongviec='"+cv.getMaCV()+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(CongViecDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean xoaCV(String ma){
        try {
            String s = "DELETE FROM congviec WHERE MaCongViec='"+ma+"';";
            con.executeUpdate(s);
            con.Close();
        } catch (Exception ex) {
            Logger.getLogger(CongViecDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
}
