/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.PhieuNhap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hung Anh
 */
public class PhieuNhapDao {

    List<PhieuNhap> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<PhieuNhap> getlistPhieuNhap() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select * from PhieuNhap where isDelete=0 order by NgayNhap desc";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                PhieuNhap pn = new PhieuNhap();
                pn.setMaPhieuNhap(rs.getInt(1));
                pn.setNgayNhap(rs.getDate(2));
                pn.setTongGiaTri(Float.parseFloat(rs.getString(3)));
                pn.setHinhThucThanhToan(rs.getString(4));
                pn.setGhiChu(rs.getString(5));
                list.add(pn);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int addPhieuNhap(PhieuNhap pn) {
        try {

            String sqlInsert = "Insert Into PhieuNhap(NgayNhap,TongGiaTri,HinhThucThanhToan,GhiChu,isDelete) Values (?,0,?,?,0)";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlInsert);

            java.sql.Date ngayNhapDate = new java.sql.Date(pn.getNgayNhap().getTime());
            pst.setDate(1, ngayNhapDate);
            pst.setString(2, pn.getHinhThucThanhToan());
            pst.setString(3, pn.getGhiChu());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int xoaPhieuNhap(PhieuNhap pn) {

        try {
            String insert = "update PhieuNhap set isDelete=1 where MaPhieuNhap=?;";
            Connection con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(insert);
            pst.setInt(1, pn.getMaPhieuNhap());
            return pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int updatePhieuNhap(PhieuNhap pn) {
        try {
            Connection con = KetNoiCSDL.openConnection();

            String update = "update PhieuNhap set NgayNhap=?, TongGiaTri=? ,HinhThucThanhToan=? ,GhiChu=? where MaPhieuNhap=? ;";
            pst = con.prepareStatement(update);
            java.sql.Date ngayNhapDate = new java.sql.Date(pn.getNgayNhap().getTime());
            pst.setDate(1, ngayNhapDate);
            pst.setFloat(2, pn.getTongGiaTri());
            pst.setString(3, pn.getHinhThucThanhToan());
            pst.setString(4, pn.getGhiChu());
            pst.setInt(5, pn.getMaPhieuNhap());

            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from PhieuNhap where isDelete=0";
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
