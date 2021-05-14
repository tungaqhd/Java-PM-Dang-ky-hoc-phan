/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhap_qtv;

import chinh.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class QTVDB extends Database {

    public ArrayList<QTV> dangNhap(String email, String password) {
        ArrayList<QTV> dsQTV = new ArrayList<QTV>();
        String getAllSQL = "SELECT * FROM qtv WHERE email = ? AND mat_khau = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, email);
            preStmt.setString(2, password);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                dsQTV.add(new QTV(rs.getString("ho_ten"), rs.getString("email"), rs.getString("mat_khau"), rs.getString("sdt"), rs.getInt("ma_qtv")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsQTV;
    }
}
