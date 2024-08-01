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

public class DonHangDao {

    List<DonHang> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public int addDonHang(DonHang d) {
        int kq = -1;
        try {
            String insert = "insert into DonHang(TenDN,NgayDat,HinhThucThanhToan,ChiTietDiaChi,HoTen,SoDienThoai,TrangThai,isDelete) values(?,?,?,?,?,?,?,0);";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(insert);
            pstm.setString(1, d.getTenDN());
            pstm.setString(2, d.getNgayDat());
            pstm.setString(3, d.getHinhThucThanhToan());
            pstm.setString(4, d.getChiTietDiaChi());
            pstm.setString(5, d.getHoTen());
            pstm.setString(6, d.getSoDienThoai());
            pstm.setString(7, d.getTrangThai());
            kq = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public int getMaDonHang(String TenDN, String NgayDat) {
        int n = 0;
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String kt = "select MaDonHang From DonHang where TenDN='" + TenDN + "' and NgayDat='" + NgayDat + "' and isDelete=0";
            rs = stm.executeQuery(kt);
            if (rs.next()) {
                n = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    public int update1DonHang(int MaDH) {
        int kq = -1;
        try {
            String insert = "exec Update1DonHang ?;";

            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(insert);
            pstm.setInt(1, MaDH);
            kq = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public int updateTrangThaiDH(String MaDH, String trangThai) {
        int kq = -1;
        try {
            String insert = "update DonHang set TrangThai =? where MaDonHang=?";

            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(insert);
            pstm.setString(1, MaDH);
            pstm.setString(2, trangThai);
            kq = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public int deleteDonHang(String MaDH) {
        int kq = -1;
        try {
            String kt = "select count(*) from DonHang where TrangThai=N'Đang xử lý' and MaDonHang = " + MaDH + "";
            Connection con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(kt);
            if (rs.next()) {
                kq = rs.getInt(1);
            }
            if (kq != 0) {
                String delete2 = "update DonHang set isDelete=1 where MaDonHang =? ; ";
                PreparedStatement pstm = con.prepareStatement(delete2);
                pstm.setString(1, MaDH);
                kq = pstm.executeUpdate();
                return kq;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public List<DonHang> getListDonHang(String TenDN) {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select * from DonHang where TenDN ='" + TenDN + "' and isDelete=0 order by NgayDat desc";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                DonHang s = new DonHang();
                s.setMaDonHang(rs.getInt(1));
                s.setTenDN(rs.getString(2));
                s.setNgayDat(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setHoTen(rs.getString(5));
                s.setSoDienThoai(rs.getString(6));
                s.setChiTietDiaChi(rs.getString(7));
                s.setTongGiaTri(rs.getFloat(8));
                s.setHinhThucThanhToan(rs.getString(9));
                s.setTrangThai(rs.getString(10));
                s.setIsDelete(rs.getString(11));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<DonHang> showAllDonHang() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "SELECT * FROM DonHang where isDelete=0 order by NgayDat desc ";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                DonHang dh = new DonHang();
                dh.setMaDonHang(rs.getInt(1));
                dh.setTenDN(rs.getString(2));
                dh.setNgayDat(rs.getString(3));
                dh.setEmail(rs.getString(4));
                dh.setHoTen(rs.getString(5));
                dh.setSoDienThoai(rs.getString(6));
                dh.setChiTietDiaChi(rs.getString(7));
                dh.setTongGiaTri(rs.getFloat(8));
                dh.setHinhThucThanhToan(rs.getString(9));
                dh.setTrangThai(rs.getString(10));
                list.add(dh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int huyDonHang(String ma) {
        int kt = 0;
        try {
            String insert = "update DonHang set isDelete=1 where MaDonHang=?;";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(insert);
            pstm.setString(1, ma);
            kt = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kt;
    }

    public int updateDonHang(DonHang dh) {
        try {
            Connection con = KetNoiCSDL.openConnection();

            String update = "update DonHang set TrangThai = ? where MaDonHang=? and isDelete=0 ;";
            pst = con.prepareStatement(update);
            pst.setString(1, dh.getTrangThai());
            pst.setInt(2, dh.getMaDonHang());
            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from DonHang where isDelete=0";
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
