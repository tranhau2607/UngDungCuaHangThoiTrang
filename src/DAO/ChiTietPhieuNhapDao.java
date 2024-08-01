/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.ChiTietPhieuNhap;
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
public class ChiTietPhieuNhapDao {

    List<ChiTietPhieuNhap> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<ChiTietPhieuNhap> getlistCTPN() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "Select*from ChiTietPhieuNhap";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                ChiTietPhieuNhap pn = new ChiTietPhieuNhap();
                pn.setMaPhieuNhap(rs.getInt(1));
                pn.setMaSanPham(rs.getString(2));
                pn.setDonViTinh(rs.getString(3));
                pn.setSoLuong(Integer.parseInt(rs.getString(4)));
                pn.setDonGiaNhap(Float.parseFloat(rs.getString(5)));
                pn.setThanhTien(Float.parseFloat(rs.getString(6)));
                list.add(pn);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<ChiTietPhieuNhap> getlistCTPNByMaPN(int MaPN) {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "Select*from ChiTietPhieuNhap where  MaPhieuNhap=" + MaPN + "";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                ChiTietPhieuNhap pn = new ChiTietPhieuNhap();
                pn.setMaPhieuNhap(rs.getInt(1));
                pn.setMaSanPham(rs.getString(2));
                pn.setDonViTinh(rs.getString(3));
                pn.setSoLuong(Integer.parseInt(rs.getString(4)));
                pn.setDonGiaNhap(Float.parseFloat(rs.getString(5)));
                pn.setThanhTien(Float.parseFloat(rs.getString(6)));
                list.add(pn);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int kiemtraTrungCTPN(int MaPN, String MaSP) {
        int kq = -1;
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "Select count(MaSanPham)from ChiTietPhieuNhap where MaSanPham = '" + MaSP + "' and MaPhieuNhap=" + MaPN + ";";
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                kq = rs.getInt(1);
                return kq;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int addChiTietPhieuNhap(ChiTietPhieuNhap ctpn) {
        int kq = -1;
        try {
            String sqlInsert = "set IDENTITY_INSERT ChiTietPhieuNhap on; Insert Into ChiTietPhieuNhap(MaPhieuNhap,MaSanPham,DonViTinh,SoLuong,DonGiaNhap) Values (?,?,?,?,?)";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqlInsert);
            pst.setInt(1, ctpn.getMaPhieuNhap());
            pst.setString(2, ctpn.getMaSanPham());
            pst.setString(3, ctpn.getDonViTinh());
            pst.setInt(4, ctpn.getSoLuong());
            pst.setFloat(5, ctpn.getDonGiaNhap());
            kq = pst.executeUpdate();
            System.out.println("" + kq);
            if (kq != -1) {
                String sq = "exec updateThanhTien_CTPN ?; exec Update1PhieuNhap ?;";
                pst = con.prepareStatement(sq);
                pst.setInt(1, ctpn.getMaPhieuNhap());
                pst.setInt(2, ctpn.getMaPhieuNhap());
                kq = pst.executeUpdate();

                return kq;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int xoaCTPN(String ma, String MaSP) {
        int kt = 0;
        try {
            String insert = "delete ChiTietPhieuNhap where MaPhieuNhap=? and MaSanPham=?;";
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

    public int updateChiTietPhieuNhap(ChiTietPhieuNhap ctpn) {
        int kq = -1;
        try {
            Connection con = KetNoiCSDL.openConnection();

            String update = "update ChiTietPhieuNhap set DonViTinh=? ,SoLuong=? ,DonGiaNhap=?  where MaPhieuNhap=? and MaSanPham=?;";
            PreparedStatement pstm = con.prepareStatement(update);
            pstm.setString(1, ctpn.getDonViTinh());
            pstm.setFloat(2, ctpn.getSoLuong());
            pstm.setFloat(3, ctpn.getDonGiaNhap());
            pstm.setFloat(4, ctpn.getMaPhieuNhap());
            pstm.setString(5, ctpn.getMaSanPham());
            kq = pstm.executeUpdate();
            if (kq != -1) {
                String sq = "exec updateThanhTien_CTPN ?; exec Update1PhieuNhap ?;";
                pst = con.prepareStatement(sq);
                pst.setInt(1, ctpn.getMaPhieuNhap());
                pst.setInt(2, ctpn.getMaPhieuNhap());
                kq = pst.executeUpdate();

                return kq;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

}
