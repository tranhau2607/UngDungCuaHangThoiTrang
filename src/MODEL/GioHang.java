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
public class GioHang {

    String TenDN;
    String MaSanPham;
    String TenSanPham;
    String Anh;
    String KichThuoc;
    String isDeleted;

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
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

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String KichThuoc) {
        this.KichThuoc = KichThuoc;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(Float Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    Float Gia;
    int SoLuong;
    Double ThanhTien;

    public GioHang() {
    }

    public GioHang(String TenDN, String MaSanPham, String TenSanPham, String Anh, String KichThuoc, String isDeleted, Float Gia, int SoLuong, Double ThanhTien) {
        this.TenDN = TenDN;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.Anh = Anh;
        this.KichThuoc = KichThuoc;
        this.isDeleted = isDeleted;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

}
