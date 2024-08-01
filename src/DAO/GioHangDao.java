/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.*;
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
public class GioHangDao {

    List<GioHang> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<GioHang> getGioHang(String TenDN) {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select * from GioHang where TenDN='" + TenDN + "' and isDelete=0";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                GioHang s = new GioHang();
                s.setTenDN(rs.getString(1));
                s.setMaSanPham(rs.getString(2));
                s.setTenSanPham(rs.getString(3));
                s.setAnh(rs.getString(4));
                s.setGia(Float.parseFloat(rs.getString(5)));
                s.setSoLuong(Integer.parseInt(rs.getString(6)));
                s.setKichThuoc(rs.getString(7));
                s.setThanhTien(Double.parseDouble(rs.getString(8)));
                s.setIsDeleted(rs.getString(9));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public GioHang get1GioHang(String TenDN, String MaSP) {
        GioHang s = new GioHang();
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select * from GioHang where TenDN='" + TenDN + "' and isDelete=0 and MaSanPham='" + MaSP + "'";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                s.setTenDN(rs.getString(1));
                s.setMaSanPham(rs.getString(2));
                s.setTenSanPham(rs.getString(3));
                s.setAnh(rs.getString(4));
                s.setGia(Float.parseFloat(rs.getString(5)));
                s.setSoLuong(Integer.parseInt(rs.getString(6)));
                s.setKichThuoc(rs.getString(7));
                s.setThanhTien(Double.parseDouble(rs.getString(8)));
                s.setIsDeleted(rs.getString(9));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public int deleteGioHang(String TenDN, String MaSP) {
        int kt = -1;
        try {
            String delete = "delete GioHang  where TenDN=? and MaSanPham=?;";
            Connection con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(delete);
            pst.setString(1, TenDN);
            pst.setString(2, MaSP);
            kt = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kt;
    }

    public int updateGioHang(String TenDN, String MaSP, int SoLuong) {
        int kq = -1;
        try {
            String insert = "exec UpdateSoLuong ?,?,?;";

            Connection con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(insert);
            pst.setString(1, MaSP);
            pst.setString(2, TenDN);
            pst.setString(3, String.valueOf(SoLuong));

            kq = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public int addGioHang(String TenDN, String MaSP, int SoLuong, String Size) {
        int kq = -1;
        try {
            String insert = "exec ThemGioHang2 ?,?,?,?";
            Connection con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(insert);
            pst.setString(1, MaSP);
            pst.setString(2, TenDN);
            pst.setString(3, Size);
            pst.setString(4, String.valueOf(SoLuong));
            kq = pst.executeUpdate();
            System.out.println(MaSP + "---" + TenDN + "---" + Size + "---" + SoLuong);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public int deleteAllGioHang(String TenDN) {
        int kt = -1;
        try {
            String delete = "delete GioHang  where TenDN=?;";
            Connection con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(delete);
            pst.setString(1, TenDN);
            kt = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kt;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from GioHang where isDelete=0";
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
