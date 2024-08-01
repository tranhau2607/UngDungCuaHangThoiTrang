/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author tsmda
 */
public class ChiTietDonHang {

    String MaSanPham;
    int SoLuong;
    Float ThanhTien;
    int MaDonHang;
    String TenSanPham;
    String Anh;
    Float Gia;
    String KichThuoc;

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String KichThuoc) {
        this.KichThuoc = KichThuoc;
    }

    public Float getGia() {
        return Gia;
    }

    public void setGia(Float Gia) {
        this.Gia = Gia;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public int getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(int MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(String MaSanPham, int SoLuong, Float ThanhTien, int MaDonHang, String TenSanPham, String Anh, Float Gia, String KichThuoc) {
        this.MaSanPham = MaSanPham;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.MaDonHang = MaDonHang;
        this.TenSanPham = TenSanPham;
        this.Anh = Anh;
        this.Gia = Gia;
        this.KichThuoc = KichThuoc;
    }

}
