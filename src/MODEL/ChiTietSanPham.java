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
public class ChiTietSanPham {

    String MaCT;
    String ThuongHieu;
    String MaSanPham;
    String TenSanPham;
    Float Gia;
    String Anh1;
    String Anh2;
    String Anh3;
    String MoTa1;
    String MoTa2;
    String MoTa3;
    String MoTa4;
    String SanPhamTon;
    int isDelete;

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getSanPhamTon() {
        return SanPhamTon;
    }

    public void setSanPhamTon(String SanPhamTon) {
        this.SanPhamTon = SanPhamTon;
    }
    String isDeleted;

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getMaCT() {
        return MaCT;
    }

    public void setMaCT(String MaCT) {
        this.MaCT = MaCT;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String ThuongHieu) {
        this.ThuongHieu = ThuongHieu;
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

    public String getAnh1() {
        return Anh1;
    }

    public void setAnh1(String Anh1) {
        this.Anh1 = Anh1;
    }

    public String getAnh2() {
        return Anh2;
    }

    public void setAnh2(String Anh2) {
        this.Anh2 = Anh2;
    }

    public String getAnh3() {
        return Anh3;
    }

    public void setAnh3(String Anh3) {
        this.Anh3 = Anh3;
    }

    public String getMoTa1() {
        return MoTa1;
    }

    public void setMoTa1(String MoTa1) {
        this.MoTa1 = MoTa1;
    }

    public String getMoTa2() {
        return MoTa2;
    }

    public void setMoTa2(String MoTa2) {
        this.MoTa2 = MoTa2;
    }

    public String getMoTa3() {
        return MoTa3;
    }

    public void setMoTa3(String MoTa3) {
        this.MoTa3 = MoTa3;
    }

    public String getMoTa4() {
        return MoTa4;
    }

    public void setMoTa4(String MoTa4) {
        this.MoTa4 = MoTa4;
    }

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String MaCT, String ThuongHieu, String MaSanPham, String TenSanPham, Float Gia, String Anh1, String Anh2, String Anh3, String MoTa1, String MoTa2, String MoTa3, String MoTa4, String SanPhamTon, String isDeleted) {
        this.MaCT = MaCT;
        this.ThuongHieu = ThuongHieu;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.Gia = Gia;
        this.Anh1 = Anh1;
        this.Anh2 = Anh2;
        this.Anh3 = Anh3;
        this.MoTa1 = MoTa1;
        this.MoTa2 = MoTa2;
        this.MoTa3 = MoTa3;
        this.MoTa4 = MoTa4;
        this.SanPhamTon = SanPhamTon;
        this.isDeleted = isDeleted;
    }

}
