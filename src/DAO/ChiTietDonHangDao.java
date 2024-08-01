/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.ChiTietDonHang;
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
public class ChiTietDonHangDao {

    List<ChiTietDonHang> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    public int updateCTDH(ChiTietDonHang d) {
        int kq = -1;
        try {
            String insert = "SET IDENTITY_INSERT ChiTietDonHang ON; INSERT INTO ChiTietDonHang(MaDonHang,MaSanPham,SoLuong,KichThuoc) values(?,?,?,?);";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(insert);
            pstm.setString(1, String.valueOf(d.getMaDonHang()));
            pstm.setString(2, d.getMaSanPham());
            pstm.setString(3, String.valueOf(d.getSoLuong()));
            pstm.setString(4, d.getKichThuoc());
            kq = pstm.executeUpdate();
            if (kq != -1) {

                String sql2 = "exec updateThanhTien_CTDH ?;";
                pstm = con.prepareStatement(sql2);
                pstm.setInt(1, d.getMaDonHang());
                kq = pstm.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public List<ChiTietDonHang> getCTDHMaDH(int MaDH) {
        try {
            con = KetNoiCSDL.openConnection();
            String sql = "select MaDonHang,TenSanPham,Anh,KichThuoc,SoLuong,Gia,ThanhTien from ChiTietDonHang,SanPham where ChiTietDonHang.MaSanPham=SanPham.MaSanPham and MaDonHang=?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst = con.prepareStatement(sql);
            pst.setInt(1, MaDH);
            rs = pst.executeQuery();

            list.clear();
            while (rs.next()) {
                ChiTietDonHang s = new ChiTietDonHang();
                s.setMaDonHang(rs.getInt(1));
                s.setTenSanPham(rs.getString(2));
                s.setAnh(rs.getString(3));
                s.setKichThuoc(rs.getString(4));
                s.setSoLuong(rs.getInt(5));
                s.setGia(rs.getFloat(6));
                s.setThanhTien(rs.getFloat(7));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return list;
    }

    public List<ChiTietDonHang> getlistCTDH(String ma) {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "Select MaDonHang, MaSanPham, SoLuong, ThanhTien, KichThuoc from ChiTietDonHang where MaDonHang = " + ma + ";";
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                ChiTietDonHang s = new ChiTietDonHang();
                s.setMaDonHang(rs.getInt(1));
                s.setMaSanPham(rs.getString(2));
                s.setSoLuong(rs.getInt(3));
                s.setThanhTien(rs.getFloat(4));
                s.setKichThuoc(rs.getString(5));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int xoaCTDH(String ma, String MaSP) {
        int kt = 0;
        try {
            String insert = "delete ChiTietDonHang where MaDonHang=? and MaSanPham=?;";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(insert);
            pstm.setString(1, ma);
            pstm.setString(2, MaSP);
            kt = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kt;
    }

    public int CapNhatCTDH(ChiTietDonHang d) {
        int kq = -1;
        try {
            String insert = "update ChiTietDonHang set SoLuong=?, KichThuoc=? where MaDonHang= ? and MaSanPham=? ;";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(insert);
            pstm.setString(1, String.valueOf(d.getSoLuong()));
            pstm.setString(2, d.getKichThuoc());
            pstm.setString(3, String.valueOf(d.getMaDonHang()));
            pstm.setString(4, d.getMaSanPham());

            kq = pstm.executeUpdate();
            if (kq != -1) {

                String sql2 = "exec updateThanhTien_CTDH ?;exec Update1DonHang ?;";
                pstm = con.prepareStatement(sql2);
                pstm.setInt(1, d.getMaDonHang());
                pstm.setInt(2, d.getMaDonHang());
                kq = pstm.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
