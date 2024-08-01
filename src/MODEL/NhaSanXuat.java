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
public class NhaSanXuat {

    private String MaNhaSanXuat, TenNhaSanXuat, SoDienThoai, DiaChi, Email;
    private int isDelete;

    public NhaSanXuat() {
    }

    public NhaSanXuat(String MaNhaSanXuat, String TenNhaSanXuat, String SoDienThoai, String DiaChi, String Email, int isDelete) {
        this.MaNhaSanXuat = MaNhaSanXuat;
        this.TenNhaSanXuat = TenNhaSanXuat;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.isDelete = isDelete;
    }

    public String getMaNhaSanXuat() {
        return MaNhaSanXuat;
    }

    public String getTenNhaSanXuat() {
        return TenNhaSanXuat;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setMaNhaSanXuat(String MaNhaSanXuat) {
        this.MaNhaSanXuat = MaNhaSanXuat;
    }

    public void setTenNhaSanXuat(String TenNhaSanXuat) {
        this.TenNhaSanXuat = TenNhaSanXuat;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

}
