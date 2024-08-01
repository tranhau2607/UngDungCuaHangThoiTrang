/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.NhaSanXuat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tranh
 */
public class NhaSanXuatDao {

    List<NhaSanXuat> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<NhaSanXuat> getlistNSX() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "Select*from NhaSanXuat where isDelete=0";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                NhaSanXuat s = new NhaSanXuat();
                s.setMaNhaSanXuat(rs.getString(1));
                s.setTenNhaSanXuat(rs.getString(2));
                s.setSoDienThoai(rs.getString(3));
                s.setDiaChi(rs.getString(4));
                s.setEmail(rs.getString(5));
                s.setIsDelete(rs.getInt(6));

                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int Save(NhaSanXuat nsx) {
        try {

            String sqlInsert = "Insert Into NhaSanXuat Values (?,?,?,?,?,0)";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlInsert);
            pst.setString(1, nsx.getMaNhaSanXuat());
            pst.setString(2, nsx.getTenNhaSanXuat());
            pst.setString(3, nsx.getSoDienThoai());
            pst.setString(4, nsx.getDiaChi());
            pst.setString(5, nsx.getEmail());

            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int ktTrungMa(String ma) {
        int kt = 0;
        try {
            String sqKT = "select count(*) from NhaSanXuat where MaNhaSanXuat=N'" + ma + "'";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqKT);
            rs = pst.executeQuery();
            if (rs.next()) {
                kt = rs.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return kt;
    }

    public int ktTrungEmail(String email) {
        int kt = 0;
        try {
            String sqKT = "select count(*) from NhaSanXuat where Email=N'" + email + "'";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqKT);
            rs = pst.executeQuery();
            if (rs.next()) {
                kt = rs.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return kt;
    }

    public int Delete(NhaSanXuat nsx) {
        try {

            String sqlDelete = "UPDATE NhaSanXuat SET isDelete = 1 WHERE MaNhaSanXuat =?";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqlDelete);
            pst.setString(1, nsx.getMaNhaSanXuat());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int Update(NhaSanXuat nsx) {
        try {
            String sqlUpdate = "update NhaSanXuat set TenNhaSanXuat=?,SoDienThoai=?,DiaChi=?,Email=? where MaNhaSanXuat=? and isDelete=0";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlUpdate);

            pst.setString(1, nsx.getTenNhaSanXuat());
            pst.setString(2, nsx.getSoDienThoai());
            pst.setString(3, nsx.getDiaChi());
            pst.setString(4, nsx.getEmail());
            pst.setString(5, nsx.getMaNhaSanXuat());

            return pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from NhaSanXuat where isDelete=0";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqKT);
            rs = pst.executeQuery();
            if (rs.next()) {
                kt = rs.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return kt;
    }
}
