/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author tsmda
 */
public class DonHang {

    int MaDonHang;
    String TenDN;
    String NgayDat;
    String Email;
    String HoTen;
    String SoDienThoai;
    String ChiTietDiaChi;
    Float TongGiaTri;
    String HinhThucThanhToan;
    String TrangThai;
    String isDelete;

    public DonHang() {
    }

    public DonHang(int MaDonHang, String TenDN, String NgayDat, String Email, String HoTen, String SoDienThoai, String ChiTietDiaChi, Float TongGiaTri, String HinhThucThanhToan, String TrangThai, String isDelete) {
        this.MaDonHang = MaDonHang;
        this.TenDN = TenDN;
        this.NgayDat = NgayDat;
        this.Email = Email;
        this.HoTen = HoTen;
        this.SoDienThoai = SoDienThoai;
        this.ChiTietDiaChi = ChiTietDiaChi;
        this.TongGiaTri = TongGiaTri;
        this.HinhThucThanhToan = HinhThucThanhToan;
        this.TrangThai = TrangThai;
        this.isDelete = isDelete;
    }

    public int getMaDonHang() {
        return MaDonHang;
    }

    public String getTenDN() {
        return TenDN;
    }

    public String getNgayDat() {
        return NgayDat;
    }

    public String getEmail() {
        return Email;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getChiTietDiaChi() {
        return ChiTietDiaChi;
    }

    public Float getTongGiaTri() {
        return TongGiaTri;
    }

    public String getHinhThucThanhToan() {
        return HinhThucThanhToan;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setMaDonHang(int MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public void setNgayDat(String NgayDat) {
        this.NgayDat = NgayDat;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setChiTietDiaChi(String ChiTietDiaChi) {
        this.ChiTietDiaChi = ChiTietDiaChi;
    }

    public void setTongGiaTri(Float TongGiaTri) {
        this.TongGiaTri = TongGiaTri;
    }

    public void setHinhThucThanhToan(String HinhThucThanhToan) {
        this.HinhThucThanhToan = HinhThucThanhToan;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

}
