/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.DiaChi;
import MODEL.SanPham;
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
public class DiaChiDao {

    List<DiaChi> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<DiaChi> showAllDC() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "SELECT * FROM DiaChi where isDelete=0";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                DiaChi s = new DiaChi();
                s.setMaDiaChi(rs.getInt(1));
                s.setTenDN(rs.getString(2));
                s.setHoTen(rs.getString(3));
                s.setSoDienThoai(rs.getString(4));
                s.setChiTietDiaChi(rs.getString(5));
                s.setIsDelete(rs.getInt(6));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<DiaChi> getDiaChiTenDN(String tenDN) {

        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "SELECT * FROM DiaChi WHERE TenDN ='" + tenDN + "' and isDelete=0;";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                DiaChi s = new DiaChi();
                s.setMaDiaChi(rs.getInt(1));
                s.setTenDN(rs.getString(2));
                s.setHoTen(rs.getString(3));
                s.setSoDienThoai(rs.getString(4));
                s.setChiTietDiaChi(rs.getString(5));
                s.setIsDelete(rs.getInt(6));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public DiaChi get1DiaChiTenDN(String tenDN, int maDC) {
        DiaChi s = new DiaChi();
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "SELECT * FROM DiaChi WHERE MaDiaChi=" + maDC + "  and TenDN ='" + tenDN + "' and isDelete=0;";
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                s.setMaDiaChi(rs.getInt(1));
                s.setTenDN(rs.getString(2));
                s.setHoTen(rs.getString(3));
                s.setSoDienThoai(rs.getString(4));
                s.setChiTietDiaChi(rs.getString(5));
                s.setIsDelete(rs.getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public int Save(DiaChi dc) {
        try {

            String sqlInsert = "insert into DiaChi (TenDN,HoTen,SoDienThoai,ChiTietDiaChi,isDelete) values(?,?,?,?,0)";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlInsert);
            pst.setString(1, dc.getTenDN());
            pst.setString(2, dc.getHoTen());
            pst.setString(3, dc.getSoDienThoai());
            pst.setString(4, dc.getChiTietDiaChi());

            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int addDiaChi(String TenDN, String HoTen, String SoDienThoai, String ChiTietDiaChi) {
        int kq = -1;
        try {
            con = KetNoiCSDL.openConnection();
            String sql = "insert into DiaChi(TenDN,HoTen,SoDienThoai, ChiTietDiaChi, isDelete) values (?,?,?,?,0)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, TenDN);
            pstm.setString(2, HoTen);
            pstm.setString(3, SoDienThoai);
            pstm.setString(4, ChiTietDiaChi);

            kq = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public int Delete(DiaChi dc) {
        try {

            String sqlDelete = "update DiaChi set isDelete=1 where MaDiaChi=? and TenDN=? ";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqlDelete);
            pst.setInt(1, dc.getMaDiaChi());
            pst.setString(2, dc.getTenDN());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from DiaChi where isDelete=0";
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
