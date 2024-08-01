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
public class SanPham {

    String MaSanPham;
    String TenSanPham;
    Float Gia;
    String MoTa;
    String Anh;
    String MaLoai;
    String MaNhaSanXuat;
    int SanPhamTon;
    int SanPhamDaBan;
    int isDeleted;

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
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

    public Float getGia() {
        return Gia;
    }

    public void setGia(Float Gia) {
        this.Gia = Gia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getMaNhaSanXuat() {
        return MaNhaSanXuat;
    }

    public void setMaNhaSanXuat(String MaNhaSanXuat) {
        this.MaNhaSanXuat = MaNhaSanXuat;
    }

    public int getSanPhamTon() {
        return SanPhamTon;
    }

    public void setSanPhamTon(int SanPhamTon) {
        this.SanPhamTon = SanPhamTon;
    }

    public int getSanPhamDaBan() {
        return SanPhamDaBan;
    }

    public void setSanPhamDaBan(int SanPhamDaBan) {
        this.SanPhamDaBan = SanPhamDaBan;
    }

    public SanPham() {
    }

    public SanPham(String MaSanPham, String TenSanPham, Float Gia, String MoTa, String Anh, String MaLoai, String MaNhaSanXuat, int SanPhamTon, int SanPhamDaBan, int isDeleted) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.Gia = Gia;
        this.MoTa = MoTa;
        this.Anh = Anh;
        this.MaLoai = MaLoai;
        this.MaNhaSanXuat = MaNhaSanXuat;
        this.SanPhamTon = SanPhamTon;
        this.SanPhamDaBan = SanPhamDaBan;
        this.isDeleted = isDeleted;
    }

}
