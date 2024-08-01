/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author tranh
 */
public class TaiKhoan {

    private String VaiTro, Email, HoTen, GioiTinh, SoDienThoai, TenDN, MatKhau, AnhBiaUser;
    private Date NgaySinh;
    private int isDelete;

    public TaiKhoan() {
    }

    public TaiKhoan(String VaiTro, String Email, String HoTen, Date NgaySinh, String GioiTinh, String SoDienThoai, String TenDN, String MatKhau, String AnhBiaUser, int isDelete) {
        this.VaiTro = VaiTro;
        this.Email = Email;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SoDienThoai = SoDienThoai;
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
        this.AnhBiaUser = AnhBiaUser;
        this.isDelete = isDelete;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public String getEmail() {
        return Email;
    }

    public String getHoTen() {
        return HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getTenDN() {
        return TenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getAnhBiaUser() {
        return AnhBiaUser;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setAnhBiaUser(String AnhBiaUser) {
        this.AnhBiaUser = AnhBiaUser;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

}
