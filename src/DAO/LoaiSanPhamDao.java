/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.LoaiSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tsmda
 */
public class LoaiSanPhamDao {

    List<LoaiSanPham> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<LoaiSanPham> getlistLoaiSP() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "Select*from LoaiSanPham where isDelete=0";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                LoaiSanPham s = new LoaiSanPham();
                s.setMaLoai(rs.getString(1));
                s.setTenLoai(rs.getString(2));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int ktMaLoai(String malsp) {
        int n = 0;
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select count(*) from ChitietSP ct, SanPham lsp where  ct.MaSanPham=lsp.MaSanPham and MaLoai='LSP1' and lsp.MaSanPham='" + malsp + "' and lsp.isDelete=0";
            rs = stm.executeQuery(sql);

            if (rs.next()) {
                n = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    public int Save(LoaiSanPham lsp) {
        try {

            String sqlInsert = "Insert Into LoaiSanPham Values (?,?,0)";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlInsert);
            pst.setString(1, lsp.getMaLoai());
            pst.setString(2, lsp.getTenLoai());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int ktTrungMa(String ma) {
        int kt = 0;
        try {
            String sqKT = "select count(*) from LoaiSanPham where MaLoai=N'" + ma + "'";
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

    public int Delete(LoaiSanPham lsp) {
        try {

            String sqlDelete = "UPDATE LoaiSanPham SET isDelete = 1 WHERE MaLoai =?";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqlDelete);
            pst.setString(1, lsp.getMaLoai());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int Update(LoaiSanPham lsp) {
        try {
            String sqlUpdate = "update LoaiSanPham set TenLoai=? where MaLoai=? and isDelete=0";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlUpdate);

            pst.setString(1, lsp.getTenLoai());
            pst.setString(2, lsp.getMaLoai());

            return pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from LoaiSanPham where isDelete=0";
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
