/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author Hung Anh
 */
public class PhieuNhap {

    int MaPhieuNhap;
    Date NgayNhap;
    float TongGiaTri;
    String HinhThucThanhToan;
    String GhiChu;
    int isDelete;

    public PhieuNhap() {
    }

    public PhieuNhap(int MaPhieuNhap, Date NgayNhap, float TongGiaTri, String HinhThucThanhToan, String GhiChu) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.NgayNhap = NgayNhap;
        this.TongGiaTri = TongGiaTri;
        this.HinhThucThanhToan = HinhThucThanhToan;
        this.GhiChu = GhiChu;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public float getTongGiaTri() {
        return TongGiaTri;
    }

    public void setTongGiaTri(float TongGiaTri) {
        this.TongGiaTri = TongGiaTri;
    }

    public String getHinhThucThanhToan() {
        return HinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String HinhThucThanhToan) {
        this.HinhThucThanhToan = HinhThucThanhToan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

}
