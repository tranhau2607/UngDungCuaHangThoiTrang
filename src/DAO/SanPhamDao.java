/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author tsmda
 */
public class SanPhamDao {

    List<SanPham> list = new ArrayList();
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<SanPham> showAllSP() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "SELECT * FROM SanPham where isDelete=0";
            rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                SanPham s = new SanPham();
                s.setMaSanPham(rs.getString(1));
                s.setTenSanPham(rs.getString(2));
                s.setGia(Float.parseFloat(rs.getString(3)));
                s.setMoTa(rs.getString(4));
                s.setAnh(rs.getString(5));
                s.setMaLoai(rs.getString(6));
                s.setMaNhaSanXuat(rs.getString(7));
                s.setSanPhamTon(Integer.parseInt(rs.getString(8)));
                s.setSanPhamDaBan(Integer.parseInt(rs.getString(9)));
                s.setIsDeleted(Integer.parseInt(rs.getString(10)));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SanPham> getlistSP(int soluong, int soluongMD) {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "SELECT * FROM SanPham where isDelete=0 \n"
                    + "ORDER BY MaSanPham\n"
                    + "OFFSET " + soluong + " ROWS\n"
                    + "FETCH NEXT " + soluongMD + " ROWS ONLY;";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                SanPham s = new SanPham();
                s.setMaSanPham(rs.getString(1));
                s.setTenSanPham(rs.getString(2));
                s.setGia(Float.parseFloat(rs.getString(3)));
                s.setMoTa(rs.getString(4));
                s.setAnh(rs.getString(5));
                s.setMaLoai(rs.getString(6));
                s.setMaNhaSanXuat(rs.getString(7));
                s.setSanPhamTon(Integer.parseInt(rs.getString(8)));
                s.setSanPhamDaBan(Integer.parseInt(rs.getString(9)));
                s.setIsDeleted(Integer.parseInt(rs.getString(10)));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SanPham> getlistSPNoiBac() {
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select top 6 * from SanPham where isDelete=0 order by SanPhamDaBan desc";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                SanPham s = new SanPham();
                s.setMaSanPham(rs.getString(1));
                s.setTenSanPham(rs.getString(2));
                s.setGia(Float.parseFloat(rs.getString(3)));
                s.setMoTa(rs.getString(4));
                s.setAnh(rs.getString(5));
                s.setMaLoai(rs.getString(6));
                s.setMaNhaSanXuat(rs.getString(7));
                s.setSanPhamTon(Integer.parseInt(rs.getString(8)));
                s.setSanPhamDaBan(Integer.parseInt(rs.getString(9)));
                s.setIsDeleted(Integer.parseInt(rs.getString(10)));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public SanPham get1SP(String MaSP) {
        SanPham s = new SanPham();
        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select * from SanPham where MaSanPham='" + MaSP + "' and isDelete=0;";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                s.setMaSanPham(rs.getString(1));
                s.setTenSanPham(rs.getString(2));
                s.setGia(Float.parseFloat(rs.getString(3)));
                s.setMoTa(rs.getString(4));
                s.setAnh(rs.getString(5));
                s.setMaLoai(rs.getString(6));
                s.setMaNhaSanXuat(rs.getString(7));
                s.setSanPhamTon(Integer.parseInt(rs.getString(8)));
                s.setSanPhamDaBan(Integer.parseInt(rs.getString(9)));
                s.setIsDeleted(Integer.parseInt(rs.getString(10)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public List<SanPham> search(String thongTin) {

        try {
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select * from SanPham where MaSanPham like'%" + thongTin + "%' or MoTa like N'%" + thongTin + "%' or TenSanPham like N'%" + thongTin + "%' and isDelete=0;";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                SanPham s = new SanPham();
                s.setMaSanPham(rs.getString(1));
                s.setTenSanPham(rs.getString(2));
                s.setGia(Float.parseFloat(rs.getString(3)));
                s.setMoTa(rs.getString(4));
                s.setAnh(rs.getString(5));
                s.setMaLoai(rs.getString(6));
                s.setMaNhaSanXuat(rs.getString(7));
                s.setSanPhamTon(Integer.parseInt(rs.getString(8)));
                s.setSanPhamDaBan(Integer.parseInt(rs.getString(9)));
                s.setIsDeleted(Integer.parseInt(rs.getString(10)));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SanPham> getSPbyTenLoai(String tenLoai, String txtGIaThap, String txtGIaCao) {

        try {
            Double gt = 0.0;
            Double gc = 0.0;
            if (txtGIaThap.length() != 0) {
                gt = Double.parseDouble(txtGIaThap);
            }
            if (txtGIaCao.length() != 0) {
                gc = Double.parseDouble(txtGIaCao);
            }
            con = KetNoiCSDL.openConnection();
            stm = con.createStatement();
            String sql = "select * from SanPham where  isDelete=0";
            if (tenLoai.length() != 0 && txtGIaThap.length() == 0 && txtGIaCao.length() == 0) {
                sql = "select * from SanPham where MaLoai in (select MaLoai from LoaiSanPham where TenLoai=N'" + tenLoai + "') and isDelete=0";
            } else {
                sql = "select * from SanPham where  Gia <=" + gc + " and Gia >=" + gt + "  and isDelete=0";
            }
            if (tenLoai.length() != 0 && txtGIaThap.length() != 0 && txtGIaCao.length() == 0) {
                sql = "select * from SanPham where MaLoai in "
                        + "(select MaLoai from LoaiSanPham where TenLoai=N'" + tenLoai + "')"
                        + " and Gia >=" + gt + "  and isDelete=0";
            }
            if (tenLoai.length() == 0 && txtGIaThap.length() == 0 && txtGIaCao.length() != 0) {
                sql = "select * from SanPham where  Gia <=" + gc + "  and isDelete=0";
            }
            if (tenLoai.length() != 0 && txtGIaThap.length() == 0 && txtGIaCao.length() != 0) {
                sql = "select * from SanPham where MaLoai in "
                        + "(select MaLoai from LoaiSanPham where TenLoai=N'" + tenLoai + "')"
                        + " and Gia <=" + gc + "  and isDelete=0";
            }
            if (tenLoai.length() == 0 && txtGIaThap.length() != 0 && txtGIaCao.length() == 0) {
                sql = "select * from SanPham where  Gia >=" + gt + "  and isDelete=0";
            }
            if (tenLoai.length() != 0 && txtGIaThap.length() != 0 && txtGIaCao.length() != 0) {
                sql = "select * from SanPham where MaLoai in "
                        + "(select MaLoai from LoaiSanPham where TenLoai=N'" + tenLoai + "')"
                        + " and Gia <=" + gc + " and Gia >=" + gt + "  and isDelete=0";
            }
            System.out.println(sql);

            rs = stm.executeQuery(sql);

            while (rs.next()) {
                SanPham s = new SanPham();
                s.setMaSanPham(rs.getString(1));
                s.setTenSanPham(rs.getString(2));
                s.setGia(Float.parseFloat(rs.getString(3)));
                s.setMoTa(rs.getString(4));
                s.setAnh(rs.getString(5));
                s.setMaLoai(rs.getString(6));
                s.setMaNhaSanXuat(rs.getString(7));
                s.setSanPhamTon(Integer.parseInt(rs.getString(8)));
                s.setSanPhamDaBan(Integer.parseInt(rs.getString(9)));
                s.setIsDeleted(Integer.parseInt(rs.getString(10)));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int Save(SanPham sp) {
        try {

            String sqlInsert = "Insert Into SanPham Values (?,?,?,?,?,?,?,?,?,?)";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlInsert);
            pst.setString(1, sp.getMaSanPham());
            pst.setString(2, sp.getTenSanPham());
            pst.setFloat(3, sp.getGia());
            pst.setString(4, sp.getMoTa());
            pst.setString(5, sp.getAnh());
            pst.setString(6, sp.getMaLoai());
            pst.setString(7, sp.getMaNhaSanXuat());
            pst.setInt(8, sp.getSanPhamTon());
            pst.setInt(9, sp.getSanPhamDaBan());
            pst.setInt(10, sp.getIsDeleted());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int ktTrungMa(String ma) {
        int kt = 0;
        try {
            String sqKT = "select count(*) from SanPham where MaSanPham=N'" + ma + "'";
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

    public int Delete(SanPham sp) {
        try {

            String sqlDelete = "UPDATE SanPham SET isDelete = 1 WHERE MaSanPham =?";
            con = KetNoiCSDL.openConnection();
            pst = con.prepareStatement(sqlDelete);
            pst.setString(1, sp.getMaSanPham());
            return pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int Update(SanPham sp) {
        try {
            String sqlUpdate = "update SanPham set TenSanPham=?,Gia=?,MoTa=?,Anh=?,MaLoai=?,MaNhaSanXuat=?,SanPhamTon=? where MaSanPham=? and isDelete=0";
            con = KetNoiCSDL.openConnection();

            pst = con.prepareStatement(sqlUpdate);

            pst.setString(1, sp.getTenSanPham());
            pst.setFloat(2, sp.getGia());
            pst.setString(3, sp.getMoTa());
            pst.setString(4, sp.getAnh());
            pst.setString(5, sp.getMaLoai());
            pst.setString(6, sp.getMaNhaSanXuat());
            pst.setInt(7, sp.getSanPhamTon());
            pst.setString(8, sp.getMaSanPham());

            return pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int tongSL() {
        int kt = 0;
        try {
            String sqKT = "select count(*) from SanPham where isDelete=0";
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
