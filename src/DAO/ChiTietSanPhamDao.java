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
public class ChiTietSanPhamDao {

    List<ChiTietSanPham> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public ChiTietSanPham get1CTSP(String MaSP) {
        ChiTietSanPham s = new ChiTietSanPham();
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select MaCT,ThuongHieu,ct.MaSanPham,ct.TenSanPham,ct.Gia,ct.Anh1,Anh2,Anh3,MoTa1,MoTa2,MoTa3,MoTa4,ctsp.SanPhamTon \n"
                    + "from ChitietSP ct,SanPham ctsp\n"
                    + "where ct.MaSanPham=ctsp.MaSanPham and ct.MaSanPham='" + MaSP + "' and ct.isDelete=0";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                s.setMaCT(rs.getString(1));
                s.setThuongHieu(rs.getString(2));
                s.setMaSanPham(rs.getString(3));
                s.setTenSanPham(rs.getString(4));
                s.setGia(Float.parseFloat(rs.getString(5)));
                s.setAnh1(rs.getString(6));
                s.setAnh2(rs.getString(7));
                s.setAnh3(rs.getString(8));
                s.setMoTa1(rs.getString(9));
                s.setMoTa2(rs.getString(10));
                s.setMoTa3(rs.getString(11));
                s.setMoTa4(rs.getString(12));
                s.setSanPhamTon(rs.getString(13));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public int Save(ChiTietSanPham ctsp) {
        try {
            String sqlInsert = "insert into ChitietSP (MaCT,ThuongHieu,MaSanPham,TenSanPham,Gia,Anh1,Anh2,Anh3,MoTa1,MoTa2,MoTa3,MoTa4,isDelete) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlInsert);
            pst.setString(1, ctsp.getMaCT());
            pst.setString(2, ctsp.getThuongHieu());
            pst.setString(3, ctsp.getMaSanPham());
            pst.setString(4, ctsp.getTenSanPham());
            pst.setFloat(5, ctsp.getGia());
            pst.setString(6, ctsp.getAnh1());
            pst.setString(7, ctsp.getAnh2());
            pst.setString(8, ctsp.getAnh3());
            pst.setString(9, ctsp.getMoTa1());
            pst.setString(10, ctsp.getMoTa2());
            pst.setString(11, ctsp.getMoTa3());
            pst.setString(12, ctsp.getMoTa4());
            pst.setInt(13, ctsp.getIsDelete());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
