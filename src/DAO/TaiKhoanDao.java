/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * atk open the template in the editor.
 */
package DAO;

import MODEL.SanPham;
import MODEL.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tranh
 */
public class TaiKhoanDao {

    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    List<TaiKhoan> list = new ArrayList();

    public List<TaiKhoan> showAllTK() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "SELECT * FROM TaiKhoan where isDelete=0";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setVaiTro(rs.getString(1));
                tk.setEmail(rs.getString(2));
                tk.setHoTen(rs.getString(3));
                tk.setNgaySinh(rs.getDate(4));
                tk.setGioiTinh(rs.getString(5));
                tk.setSoDienThoai(rs.getString(6));
                tk.setTenDN(rs.getString(7));
                tk.setMatKhau(rs.getString(8));
                tk.setAnhBiaUser(rs.getString(9));
                tk.setIsDelete(Integer.parseInt(rs.getString(10)));
                list.add(tk);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //ham
    public TaiKhoan DangNhap(String email, String tendn, String pass) {
        TaiKhoan tk = null;
        try {
            String sql = "select * from TaiKhoan where Email=? and TenDN=? and MatKhau=? and isDelete=0";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, tendn);
            pst.setString(3, pass);
            rs = pst.executeQuery();
            if (rs.next()) {
                tk = new TaiKhoan();
                tk.setVaiTro(rs.getString("VaiTro"));
                tk.setEmail(rs.getString("Email"));
                tk.setHoTen(rs.getString("HoTen"));
                tk.setNgaySinh(rs.getDate("NgaySinh"));
                tk.setGioiTinh(rs.getString("GioiTinh"));
                tk.setSoDienThoai(rs.getString("SoDienThoai"));
                tk.setTenDN(rs.getString("TenDN"));
                tk.setMatKhau(rs.getString("MatKhau"));
                tk.setAnhBiaUser(rs.getString("AnhBiaUser"));
                tk.setIsDelete(rs.getInt("isDelete"));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tk;
    }

    public int DangKy(TaiKhoan tk) {
        try {
            String sql = "insert into TaiKhoan(VaiTro,Email,HoTen,SoDienThoai,TenDN,MatKhau,isDelete) Values (?,?,?,?,?,?,?) ";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, tk.getVaiTro());
            pst.setString(2, tk.getEmail());
            pst.setString(3, tk.getHoTen());
            pst.setString(4, tk.getSoDienThoai());
            pst.setString(5, tk.getTenDN());
            pst.setString(6, tk.getMatKhau());
            pst.setInt(7, tk.getIsDelete());
            return pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int ktTrungTenDN(String tedn) {
        int kt = 0;
        try {
            String sqKT = "select count(*) from TaiKhoan where TenDN=N'" + tedn + "'";
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
            String sqKT = "select count(*) from TaiKhoan where Email=N'" + email + "'";
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

    public int Update(TaiKhoan tk) {
        try {
            String sqlUpdate = "update TaiKhoan set Email=?,HoTen=?,NgaySinh=?,GioiTinh=?,SoDienThoai=?,AnhBiaUser=? where TenDN=? and isDelete=0";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlUpdate);

            pst.setString(1, tk.getEmail());
            pst.setString(2, tk.getHoTen());
            java.sql.Date ngaySinhSqlDate = new java.sql.Date(tk.getNgaySinh().getTime());
            pst.setDate(3, ngaySinhSqlDate);
            pst.setString(4, tk.getGioiTinh());
            pst.setString(5, tk.getSoDienThoai());
            pst.setString(6, tk.getAnhBiaUser());
            pst.setString(7, tk.getTenDN());

            return pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int DoiMatKhau(String TenDN, String MatKhauCu, String MatKhauMoi) {
        int kq = -1;
        try {
            String kt = "select count(*) from TaiKhoan where TenDN='" + TenDN + "' and MatKhau='" + MatKhauCu + "'";
            Connection con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(kt);
            if (rs.next()) {
                kq = rs.getInt(1);
            }
            if (kq == 1) {
                String update = "exec UpdateMK ?,? ";
                PreparedStatement pstm = con.prepareStatement(update);
                pstm.setString(1, TenDN);
                pstm.setString(2, MatKhauMoi);
                kq = pstm.executeUpdate();
                return kq;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int QuenMatKhau(String TenDN, String MatKhauMoi) {
        int kq = -1;
        try {
            Connection con = KetNoiCSDL.openConnection();
            String update = "exec UpdateMK ?,? ";
            PreparedStatement pstm = con.prepareStatement(update);
            pstm.setString(1, TenDN);
            pstm.setString(2, MatKhauMoi);
            kq = pstm.executeUpdate();
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int addTaiKhoan(TaiKhoan tk) {
        try {

            String sqlInsert = "Insert Into TaiKhoan Values (?,?,?,?,?,?,?,?,?,0)";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlInsert);
            pst.setString(1, tk.getVaiTro());
            pst.setString(2, tk.getEmail());
            pst.setString(3, tk.getHoTen());
            java.sql.Date ngaySinhSqlDate = new java.sql.Date(tk.getNgaySinh().getTime());
            pst.setDate(4, ngaySinhSqlDate);
            pst.setString(5, tk.getGioiTinh());
            pst.setString(6, tk.getSoDienThoai());
            pst.setString(7, tk.getTenDN());
            pst.setString(8, tk.getMatKhau());
            pst.setString(9, tk.getAnhBiaUser());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int xoaTaiKhoan(TaiKhoan tk) {
        try {
            String insert = "update TaiKhoan set isDelete=1 where TenDN=?;";
            Connection con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(insert);
            pst.setString(1, tk.getTenDN());
            return pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int UpdateAdmin(TaiKhoan tk) {
        try {
            String sqlUpdate = "update TaiKhoan set Email=?, HoTen=?,NgaySinh=?,GioiTinh=?,SoDienThoai=?,MatKhau=?,AnhBiaUser=? where TenDN=? and isDelete=0";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqlUpdate);

            pst.setString(1, tk.getEmail());
            pst.setString(2, tk.getHoTen());
            java.sql.Date ngaySinhSqlDate = new java.sql.Date(tk.getNgaySinh().getTime());
            pst.setDate(3, ngaySinhSqlDate);
            pst.setString(4, tk.getGioiTinh());
            pst.setString(5, tk.getSoDienThoai());
            pst.setString(6, tk.getMatKhau());
            pst.setString(7, tk.getAnhBiaUser());
            pst.setString(8, tk.getTenDN());

            return pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from TaiKhoan where isDelete=0";
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
