/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author tranh
 */
public class DiaChi {

    private int MaDiaChi;
    private String TenDN, ChiTietDiaChi, SoDienThoai, HoTen;
    private int isDelete;

    public DiaChi() {
    }

    public DiaChi(int MaDiaChi, String TenDN, String ChiTietDiaChi, String SoDienThoai, String HoTen, int isDelete) {
        this.MaDiaChi = MaDiaChi;
        this.TenDN = TenDN;
        this.ChiTietDiaChi = ChiTietDiaChi;
        this.SoDienThoai = SoDienThoai;
        this.HoTen = HoTen;
        this.isDelete = isDelete;
    }

    public int getMaDiaChi() {
        return MaDiaChi;
    }

    public void setMaDiaChi(int MaDiaChi) {
        this.MaDiaChi = MaDiaChi;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getChiTietDiaChi() {
        return ChiTietDiaChi;
    }

    public void setChiTietDiaChi(String ChiTietDiaChi) {
        this.ChiTietDiaChi = ChiTietDiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

}
