/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Hung Anh
 */
public class ChiTietPhieuNhap {

    int MaPhieuNhap;
    String MaSanPham;
    String DonViTinh;
    int SoLuong;
    float DonGiaNhap;
    float ThanhTien;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int MaPhieuNhap, String MaSanPham, String DonViTinh, int SoLuong, float DonGiaNhap, float ThanhTien) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSanPham = MaSanPham;
        this.DonViTinh = DonViTinh;
        this.SoLuong = SoLuong;
        this.DonGiaNhap = DonGiaNhap;
        this.ThanhTien = ThanhTien;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGiaNhap() {
        return DonGiaNhap;
    }

    public void setDonGiaNhap(float DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

}
