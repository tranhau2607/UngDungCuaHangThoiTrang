/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.User;

import DAO.*;
import GUI.frmLogin;
import MODEL.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tsmda
 */
public class frmUserMain extends javax.swing.JFrame {

    private String TenDN, HoTen, AnhBia, Email, MatKhau;

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getEmail() {
        return Email;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
        lblTenDN.setText(TenDN);
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getAnhBia() {
        return AnhBia;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
        lbTenND.setText(HoTen);
    }

    public void setAnhBia(String AnhBia) {
        this.AnhBia = AnhBia;
    }

    GioHang gh = new GioHang();
    GioHangDao ghdao = new GioHangDao();
    List<GioHang> list = new ArrayList();

    DefaultTableModel tblModel = new DefaultTableModel();
    List<SanPham> listSP = new ArrayList();
    SanPhamDao spdao = new SanPhamDao();
    LoaiSanPhamDao ldao = new LoaiSanPhamDao();
    List<LoaiSanPham> listLSP = new ArrayList();

    TaiKhoanDao tkDao = new TaiKhoanDao();
    TaiKhoan tk = new TaiKhoan();

    List<DiaChi> listDC = new ArrayList();
    DiaChiDao dcDao = new DiaChiDao();
    DiaChi dc = new DiaChi();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    int index = 0;
    int soLuong = 0;
    int soLuongMD = 16;

    int x = 0;    //chieu rong
    int y = 1000;    //chieu cao
    DonHang dh = new DonHang();
    DonHangDao dhdao = new DonHangDao();
    List<GioHang> listgh = new ArrayList();
    ChiTietDonHangDao ctdhdao = new ChiTietDonHangDao();
    String TongTien;

    List<DonHang> listdh = new ArrayList();

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;

    }

    public frmUserMain() {

        initComponents();

        LoadSP();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        EmptyBorder border = new EmptyBorder(20, 20, 20, 20);
        pnlMain.setBorder(border);
        loadLoaiSP();

        jplSlideMenu.setPreferredSize(new Dimension(x, y));
        jpllMenuBar.setPreferredSize(new Dimension(1920, 100));
        jPanelMain.setPreferredSize(new Dimension(1900, 900));
        jScrollPaneSanPham.setPreferredSize(new Dimension(1800, 1000));

        jScrollPaneGioHang.setPreferredSize(new Dimension(1300, 700));
        jPanelTieuDeGH.setPreferredSize(new Dimension(1300, 70));

        jPanel13.setPreferredSize(new Dimension(1500, 100));
        jPanel14.setPreferredSize(new Dimension(1500, 800));

        jScrollPaneDonHang.setPreferredSize(new Dimension(1600, 750));
        pnlTieuDe.setPreferredSize(new Dimension(1600, 100));

        jScrollPaneDiaChi.setPreferredSize(new Dimension(1300, 700));
        jPanelTieuDe.setPreferredSize(new Dimension(1300, 100));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jplSlideMenu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblTenDN = new javax.swing.JLabel();
        lblCloseMenu = new javax.swing.JLabel();
        lblTrangChu = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblSanPham = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblTaiKhoan = new javax.swing.JLabel();
        lblGioHang = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblDonHang = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblDiaChi = new javax.swing.JLabel();
        lblGioiThieu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTroGiup = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jpllMenuBar = new javax.swing.JPanel();
        lblOpenMenu = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        lblTenDanhMuc = new javax.swing.JLabel();
        lbTenND = new javax.swing.JLabel();
        lblCart = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        cardTrangChu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cardSanPham = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnTimKiem1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGiaCao = new javax.swing.JTextField();
        txtGiaThap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboLoaiSP = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPaneSanPham = new javax.swing.JScrollPane();
        pnlMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnTrangDau = new javax.swing.JButton();
        btnTrai = new javax.swing.JButton();
        btnGiua = new javax.swing.JButton();
        btnPhai = new javax.swing.JButton();
        tbnTrangCuoi = new javax.swing.JButton();
        cardTaiKhoan = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        lblAnh = new javax.swing.JLabel();
        btnChonAnh1 = new javax.swing.JButton();
        lblTenHinh = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel105 = new javax.swing.JLabel();
        cboDiaChi = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnCapNhatTK = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        dcNgaySinh = new com.toedter.calendar.JDateChooser();
        cardGioHang = new javax.swing.JPanel();
        jPanelTieuDeGH = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPaneGioHang = new javax.swing.JScrollPane();
        pnlDSGioHang = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTiepTuc = new javax.swing.JButton();
        cardDonHang = new javax.swing.JPanel();
        pnlTieuDe = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPaneDonHang = new javax.swing.JScrollPane();
        pnlDonHang = new javax.swing.JPanel();
        cardDiaChi = new javax.swing.JPanel();
        jPanelTieuDe = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPaneDiaChi = new javax.swing.JScrollPane();
        pnlDiaChi = new javax.swing.JPanel();
        btnThemDiaChi = new javax.swing.JButton();
        cardGioiThieu = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplSlideMenu.setBackground(new java.awt.Color(0, 102, 51));
        jplSlideMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jplSlideMenu.setPreferredSize(new java.awt.Dimension(190, 590));
        jplSlideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/avatar.png"))); // NOI18N

        lblTenDN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTenDN.setText("NKD");

        lblCloseMenu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCloseMenu.setForeground(new java.awt.Color(204, 0, 0));
        lblCloseMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseMenu.setText("X");
        lblCloseMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCloseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(76, 76, 76)
                .addComponent(lblCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblTenDN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTenDN)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jplSlideMenu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 150));

        lblTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setText("TRANG CHỦ");
        lblTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 70));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 270, 10));

        lblSanPham.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("SẢN PHẨM");
        lblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 350, 70));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setAlignmentX(1.0F);
        jSeparator3.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 270, 10));

        lblTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaiKhoan.setText("TÀI KHOẢN");
        lblTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTaiKhoanMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 350, 70));

        lblGioHang.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblGioHang.setForeground(new java.awt.Color(255, 255, 255));
        lblGioHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGioHang.setText("GIỎ HÀNG");
        lblGioHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGioHangMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblGioHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 350, 70));

        jSeparator5.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator5.setAlignmentX(1.0F);
        jSeparator5.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 270, 10));

        lblDonHang.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(255, 255, 255));
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonHang.setText("ĐƠN HÀNG");
        lblDonHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDonHangMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 350, 70));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setAlignmentX(1.0F);
        jSeparator4.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 270, 10));

        lblDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblDiaChi.setForeground(new java.awt.Color(255, 255, 255));
        lblDiaChi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiaChi.setText("ĐỊA CHỈ");
        lblDiaChi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiaChiMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 350, 70));

        lblGioiThieu.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblGioiThieu.setForeground(new java.awt.Color(255, 255, 255));
        lblGioiThieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGioiThieu.setText("GIỚI THIỆU");
        lblGioiThieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGioiThieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGioiThieuMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblGioiThieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 350, 70));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 870, 270, 10));

        lblTroGiup.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblTroGiup.setForeground(new java.awt.Color(255, 255, 255));
        lblTroGiup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTroGiup.setText("TRỢ GIÚP");
        lblTroGiup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jplSlideMenu.add(lblTroGiup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 350, 70));

        lblDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setText("ĐĂNG XUẤT");
        lblDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });
        jplSlideMenu.add(lblDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 350, 70));

        jSeparator6.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator6.setAlignmentX(1.0F);
        jSeparator6.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 270, 10));

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setAlignmentX(1.0F);
        jSeparator7.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 350, 10));

        jSeparator8.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator8.setAlignmentX(1.0F);
        jSeparator8.setAlignmentY(1.0F);
        jplSlideMenu.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, 270, 10));

        jPanel3.add(jplSlideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        jpllMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        jpllMenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 51), new java.awt.Color(204, 204, 204)));

        lblOpenMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        lblOpenMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpenMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenMenuMouseClicked(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        btnTimKiem.setBackground(new java.awt.Color(0, 102, 51));
        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        lblTenDanhMuc.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblTenDanhMuc.setForeground(new java.awt.Color(0, 102, 51));
        lblTenDanhMuc.setText("4TStyle");

        lbTenND.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lbTenND.setForeground(new java.awt.Color(0, 102, 51));
        lbTenND.setText("TND");

        lblCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconCart.png"))); // NOI18N
        lblCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpllMenuBarLayout = new javax.swing.GroupLayout(jpllMenuBar);
        jpllMenuBar.setLayout(jpllMenuBarLayout);
        jpllMenuBarLayout.setHorizontalGroup(
            jpllMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpllMenuBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblOpenMenu)
                .addGap(129, 129, 129)
                .addComponent(lblTenDanhMuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKiem)
                .addGap(73, 73, 73)
                .addComponent(lblCart)
                .addGap(40, 40, 40)
                .addComponent(lbTenND)
                .addGap(119, 119, 119))
        );
        jpllMenuBarLayout.setVerticalGroup(
            jpllMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpllMenuBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpllMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOpenMenu)
                    .addGroup(jpllMenuBarLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbTenND))
                    .addGroup(jpllMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTenDanhMuc)
                        .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jpllMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelMain.setLayout(new java.awt.CardLayout());

        cardTrangChu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel14.setText("CHÀO MỪNG BẠN ĐẾN VỚI CỬA HÀNG CỦA CHÚNG TÔI");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel15.setText("TRANG CHỦ");

        javax.swing.GroupLayout cardTrangChuLayout = new javax.swing.GroupLayout(cardTrangChu);
        cardTrangChu.setLayout(cardTrangChuLayout);
        cardTrangChuLayout.setHorizontalGroup(
            cardTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTrangChuLayout.createSequentialGroup()
                .addGroup(cardTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardTrangChuLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel14))
                    .addGroup(cardTrangChuLayout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(jLabel15)))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        cardTrangChuLayout.setVerticalGroup(
            cardTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTrangChuLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel15)
                .addGap(50, 50, 50)
                .addComponent(jLabel14)
                .addContainerGap(617, Short.MAX_VALUE))
        );

        jPanelMain.add(cardTrangChu, "card3");

        cardSanPham.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        btnTimKiem1.setBackground(new java.awt.Color(0, 102, 51));
        btnTimKiem1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnTimKiem1.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem1.setText("Lọc");
        btnTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Đến");

        txtGiaCao.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        txtGiaThap.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Giá từ");

        cboLoaiSP.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("Loại sản phẩm");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(171, 171, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGiaCao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiaThap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboLoaiSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(txtGiaThap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(txtGiaCao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jScrollPaneSanPham.setBackground(new java.awt.Color(255, 255, 255));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMain.setLayout(new java.awt.GridLayout(0, 4, 20, 20));
        jScrollPaneSanPham.setViewportView(pnlMain);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnTrangDau.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangDau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTrangDau.setText("<<");
        btnTrangDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangDauActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrangDau);

        btnTrai.setBackground(new java.awt.Color(255, 255, 255));
        btnTrai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTrai.setText("1");
        btnTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraiActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrai);

        btnGiua.setBackground(new java.awt.Color(255, 255, 255));
        btnGiua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGiua.setText("2");
        btnGiua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGiua);

        btnPhai.setBackground(new java.awt.Color(255, 255, 255));
        btnPhai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPhai.setText("3");
        btnPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnPhai);

        tbnTrangCuoi.setBackground(new java.awt.Color(255, 255, 255));
        tbnTrangCuoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbnTrangCuoi.setText(">>");
        tbnTrangCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTrangCuoiActionPerformed(evt);
            }
        });
        jPanel1.add(tbnTrangCuoi);

        javax.swing.GroupLayout cardSanPhamLayout = new javax.swing.GroupLayout(cardSanPham);
        cardSanPham.setLayout(cardSanPhamLayout);
        cardSanPhamLayout.setHorizontalGroup(
            cardSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(cardSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneSanPham))
                .addContainerGap(768, Short.MAX_VALUE))
        );
        cardSanPhamLayout.setVerticalGroup(
            cardSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardSanPhamLayout.createSequentialGroup()
                        .addComponent(jScrollPaneSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cardSanPhamLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jPanelMain.add(cardSanPham, "card2");

        cardTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        cardTaiKhoan.setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel13.setBackground(new java.awt.Color(0, 102, 51));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("THÔNG TIN NGƯỜI DÙNG");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(455, 455, 455))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel102.setText("Ảnh ");

        lblAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnChonAnh1.setBackground(new java.awt.Color(0, 102, 51));
        btnChonAnh1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnChonAnh1.setForeground(new java.awt.Color(255, 255, 255));
        btnChonAnh1.setText("Chọn ảnh");
        btnChonAnh1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChonAnh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(lblTenHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel102)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 127, Short.MAX_VALUE)
                .addComponent(btnChonAnh1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChonAnh1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel108.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel108.setText("Giới tính:");

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rdoNam.setText("Nam");
        rdoNam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rdoNu.setText("Nữ");
        rdoNu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel105.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel105.setText("Địa chỉ:");

        cboDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        cboDiaChi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Email", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtHoTen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Họ tên", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtSDT.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Số điện thoại", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        btnCapNhatTK.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhatTK.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnCapNhatTK.setForeground(new java.awt.Color(153, 153, 0));
        btnCapNhatTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua.png"))); // NOI18N
        btnCapNhatTK.setText("Cập nhật thông tin");
        btnCapNhatTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));
        btnCapNhatTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatTKActionPerformed(evt);
            }
        });

        btnDoiMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        btnDoiMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDoiMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        dcNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        dcNgaySinh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray), "Ngày sinh", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        dcNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(dcNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addComponent(jLabel105)
                            .addComponent(jLabel108)
                            .addComponent(cboDiaChi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(rdoNam)
                        .addGap(65, 65, 65)
                        .addComponent(rdoNu)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnCapNhatTK, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 317, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)))
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhatTK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cardTaiKhoanLayout = new javax.swing.GroupLayout(cardTaiKhoan);
        cardTaiKhoan.setLayout(cardTaiKhoanLayout);
        cardTaiKhoanLayout.setHorizontalGroup(
            cardTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cardTaiKhoanLayout.setVerticalGroup(
            cardTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTaiKhoanLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMain.add(cardTaiKhoan, "card3");

        cardGioHang.setBackground(new java.awt.Color(255, 255, 255));
        cardGioHang.setMaximumSize(new java.awt.Dimension(32767, 900));

        jPanelTieuDeGH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Tên sản phẩm");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Hình ảnh");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Size");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Giá");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Số lượng");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Thành tiền");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Chức năng");

        javax.swing.GroupLayout jPanelTieuDeGHLayout = new javax.swing.GroupLayout(jPanelTieuDeGH);
        jPanelTieuDeGH.setLayout(jPanelTieuDeGHLayout);
        jPanelTieuDeGHLayout.setHorizontalGroup(
            jPanelTieuDeGHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTieuDeGHLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(355, 355, 355)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel10)
                .addGap(82, 82, 82)
                .addComponent(jLabel11)
                .addGap(109, 109, 109)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(166, 166, 166)
                .addComponent(jLabel19)
                .addGap(57, 57, 57))
        );
        jPanelTieuDeGHLayout.setVerticalGroup(
            jPanelTieuDeGHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTieuDeGHLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelTieuDeGHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTieuDeGHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTieuDeGHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jScrollPaneGioHang.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneGioHang.setBorder(null);

        pnlDSGioHang.setBackground(new java.awt.Color(255, 255, 255));
        pnlDSGioHang.setLayout(new java.awt.GridLayout(0, 1, 0, 20));
        jScrollPaneGioHang.setViewportView(pnlDSGioHang);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnTiepTuc.setBackground(new java.awt.Color(255, 255, 255));
        btnTiepTuc.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnTiepTuc.setForeground(new java.awt.Color(51, 51, 255));
        btnTiepTuc.setText("Thanh Toán");
        btnTiepTuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        btnTiepTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTiepTuc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnTiepTuc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardGioHangLayout = new javax.swing.GroupLayout(cardGioHang);
        cardGioHang.setLayout(cardGioHangLayout);
        cardGioHangLayout.setHorizontalGroup(
            cardGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGioHangLayout.createSequentialGroup()
                .addGroup(cardGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneGioHang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTieuDeGH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cardGioHangLayout.setVerticalGroup(
            cardGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGioHangLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanelTieuDeGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneGioHang)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelMain.add(cardGioHang, "card5");

        cardDonHang.setBackground(new java.awt.Color(255, 255, 255));
        cardDonHang.setMaximumSize(new java.awt.Dimension(32767, 750));
        cardDonHang.setMinimumSize(new java.awt.Dimension(0, 750));
        cardDonHang.setPreferredSize(new java.awt.Dimension(1320, 750));

        pnlTieuDe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Mã ĐH");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Ngày đặt hàng");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Tên người nhận");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Số điện thoại");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Tổng tiền");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Địa chỉ");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Trạng thái");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("Chức năng");

        javax.swing.GroupLayout pnlTieuDeLayout = new javax.swing.GroupLayout(pnlTieuDe);
        pnlTieuDe.setLayout(pnlTieuDeLayout);
        pnlTieuDeLayout.setHorizontalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTieuDeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addComponent(jLabel13)
                .addGap(98, 98, 98)
                .addComponent(jLabel20)
                .addGap(53, 53, 53)
                .addComponent(jLabel21)
                .addGap(53, 53, 53)
                .addComponent(jLabel23)
                .addGap(297, 297, 297)
                .addComponent(jLabel22)
                .addGap(138, 138, 138)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(60, 60, 60))
        );
        pnlTieuDeLayout.setVerticalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTieuDeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jScrollPaneDonHang.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneDonHang.setBorder(null);

        pnlDonHang.setBackground(new java.awt.Color(255, 255, 255));
        pnlDonHang.setLayout(new java.awt.GridLayout(0, 1, 0, 20));
        jScrollPaneDonHang.setViewportView(pnlDonHang);

        javax.swing.GroupLayout cardDonHangLayout = new javax.swing.GroupLayout(cardDonHang);
        cardDonHang.setLayout(cardDonHangLayout);
        cardDonHangLayout.setHorizontalGroup(
            cardDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneDonHang)
                    .addComponent(pnlTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardDonHangLayout.setVerticalGroup(
            cardDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelMain.add(cardDonHang, "card6");

        cardDiaChi.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTieuDe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Địa Chỉ");

        javax.swing.GroupLayout jPanelTieuDeLayout = new javax.swing.GroupLayout(jPanelTieuDe);
        jPanelTieuDe.setLayout(jPanelTieuDeLayout);
        jPanelTieuDeLayout.setHorizontalGroup(
            jPanelTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(1006, Short.MAX_VALUE))
        );
        jPanelTieuDeLayout.setVerticalGroup(
            jPanelTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTieuDeLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
        );

        jScrollPaneDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneDiaChi.setBorder(null);

        pnlDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        pnlDiaChi.setLayout(new java.awt.GridLayout(0, 1, 0, 20));
        jScrollPaneDiaChi.setViewportView(pnlDiaChi);

        btnThemDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        btnThemDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnThemDiaChi.setForeground(new java.awt.Color(0, 102, 51));
        btnThemDiaChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/them.png"))); // NOI18N
        btnThemDiaChi.setText("Thêm địa chỉ");
        btnThemDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        btnThemDiaChi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardDiaChiLayout = new javax.swing.GroupLayout(cardDiaChi);
        cardDiaChi.setLayout(cardDiaChiLayout);
        cardDiaChiLayout.setHorizontalGroup(
            cardDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDiaChiLayout.createSequentialGroup()
                .addGroup(cardDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTieuDe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 329, Short.MAX_VALUE))
            .addGroup(cardDiaChiLayout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(btnThemDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardDiaChiLayout.setVerticalGroup(
            cardDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDiaChiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 587, Short.MAX_VALUE)
                .addComponent(btnThemDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jPanelMain.add(cardDiaChi, "card5");

        cardGioiThieu.setBackground(new java.awt.Color(255, 255, 255));
        cardGioiThieu.setPreferredSize(new java.awt.Dimension(1320, 233));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel32.setText("THÔNG TIN CỬA HÀNG:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel12.setText("Phần mềm Quản Lý Cửa Hàng Thời Trang là nơi để bạn có thể thoải mái lựa chọn sản phẩm cho riêng mình.");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel16.setText("Với những sản phẩm nổi bật, đặc biệt là với chị em phụ nữ.");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel26.setText("Tại đây có những ưu đãi không giới hạn, tha hồ lựa chọn.");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel33.setText("THÔNG TIN ĐỘI SẢN XUẤT:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel27.setText("Với tên đội là 4Style, nơi hội tụ những còn người hòa đồng, thân thiện, chịu khó.");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel28.setText("Mong muốn mang lại một sản phẩm tuyệt vời cho người sử dụng.");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel29.setText("Cảm ơn bạn đã lựa chọn sản phẩm này, chúc bạn thật nhiều sức khỏe.");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel30.setText("Thành viên:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel31.setText("TRẦN HẬU");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel34.setText("TẤN ĐẠT");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel35.setText("HÙNG ANH");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel36.setText("NHẬT TÚ");

        javax.swing.GroupLayout cardGioiThieuLayout = new javax.swing.GroupLayout(cardGioiThieu);
        cardGioiThieu.setLayout(cardGioiThieuLayout);
        cardGioiThieuLayout.setHorizontalGroup(
            cardGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGioiThieuLayout.createSequentialGroup()
                .addGroup(cardGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardGioiThieuLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(cardGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cardGioiThieuLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(cardGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel26)))
                    .addGroup(cardGioiThieuLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(cardGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)))
                    .addGroup(cardGioiThieuLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel31)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel34)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel35)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel36)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        cardGioiThieuLayout.setVerticalGroup(
            cardGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGioiThieuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addGap(45, 45, 45)
                .addComponent(jLabel16)
                .addGap(45, 45, 45)
                .addComponent(jLabel26)
                .addGap(50, 50, 50)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel27)
                .addGap(45, 45, 45)
                .addComponent(jLabel28)
                .addGap(45, 45, 45)
                .addComponent(jLabel29)
                .addGap(45, 45, 45)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardGioiThieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanelMain.add(cardGioiThieu, "card6");

        jPanel3.add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangDauActionPerformed

        soLuong = 0;
        btnTrai.setText("1");
        btnGiua.setText("2");
        btnPhai.setText("3");
        LoadSP();

    }//GEN-LAST:event_btnTrangDauActionPerformed

    private void btnTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraiActionPerformed
        if (soLuong >= soLuongMD) {
            soLuong = soLuong - soLuongMD;
        }
        int trai = Integer.parseInt(btnTrai.getText()) - 1;
        if (trai > 0) {
            btnPhai.setText(btnGiua.getText());
            btnGiua.setText(btnTrai.getText());
            btnTrai.setText("" + trai);
        }
        LoadSP();

    }//GEN-LAST:event_btnTraiActionPerformed

    private void btnGiuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiuaActionPerformed
        soLuong = Integer.parseInt(btnTrai.getText()) * soLuongMD;
        LoadSP();
    }//GEN-LAST:event_btnGiuaActionPerformed

    private void btnPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhaiActionPerformed
        soLuong = Integer.parseInt(btnGiua.getText()) * soLuongMD;
        LoadSP();
        int phai = Integer.parseInt(btnPhai.getText()) + 1;
        if (phai < 10) {
            btnTrai.setText(btnGiua.getText());
            btnGiua.setText(btnPhai.getText());
            btnPhai.setText("" + phai);
        }

    }//GEN-LAST:event_btnPhaiActionPerformed

    private void tbnTrangCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTrangCuoiActionPerformed
        soLuong = 8 * soLuongMD;
        btnTrai.setText("7");
        btnGiua.setText("8");
        btnPhai.setText("9");
        LoadSP();

    }//GEN-LAST:event_tbnTrangCuoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        searchSP();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem1ActionPerformed
        loadSPbyTenLoai();
    }//GEN-LAST:event_btnTimKiem1ActionPerformed

    private void lblOpenMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenMenuMouseClicked
        openMenu();
        Point location = jPanelMain.getLocation();
        Point newlocation = new Point(location.x + 200, location.y);
        jPanelMain.setLocation(newlocation);

    }//GEN-LAST:event_lblOpenMenuMouseClicked

    private void lblCloseMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMenuMouseClicked
        closeMenu();
        Point location = jPanelMain.getLocation();
        Point newlocation = new Point(location.x - 200, location.y);
        jPanelMain.setLocation(newlocation);

    }//GEN-LAST:event_lblCloseMenuMouseClicked

    private void lblTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseClicked
        cardTrangChu.setVisible(true);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(false);
        cardGioHang.setVisible(false);
        cardDonHang.setVisible(false);
        cardDiaChi.setVisible(false);
        cardGioiThieu.setVisible(false);
        lblTenDanhMuc.setText(lblTrangChu.getText());
        closeMenu();

    }//GEN-LAST:event_lblTrangChuMouseClicked

    private void lblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTaiKhoanMouseClicked
        cardTrangChu.setVisible(false);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(true);
        cardGioHang.setVisible(false);
        cardDonHang.setVisible(false);
        cardDiaChi.setVisible(false);
        cardGioiThieu.setVisible(false);
        lblTenDanhMuc.setText(lblTaiKhoan.getText());
        closeMenu();

        hienThiThongTinKhachHang();

    }//GEN-LAST:event_lblTaiKhoanMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        cardTrangChu.setVisible(false);
        cardSanPham.setVisible(true);
        cardTaiKhoan.setVisible(false);
        cardGioHang.setVisible(false);
        cardDonHang.setVisible(false);
        cardDiaChi.setVisible(false);
        cardGioiThieu.setVisible(false);
        lblTenDanhMuc.setText(lblSanPham.getText());
        closeMenu();
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jplSlideMenu.setSize(0, y);
        x = 0;
    }//GEN-LAST:event_formWindowOpened

    private void lblCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCartMouseClicked

        cardTrangChu.setVisible(false);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(false);
        cardGioHang.setVisible(true);
        cardDonHang.setVisible(false);
        cardDiaChi.setVisible(false);
        cardGioiThieu.setVisible(false);
        lblTenDanhMuc.setText(lblGioHang.getText());
        getGioHang(getTenDN());
        closeMenu();
    }//GEN-LAST:event_lblCartMouseClicked

    private void lblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGioHangMouseClicked

        cardTrangChu.setVisible(false);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(false);
        cardGioHang.setVisible(true);
        cardDonHang.setVisible(false);
        cardDiaChi.setVisible(false);
        cardGioiThieu.setVisible(false);
        lblTenDanhMuc.setText(lblGioHang.getText());
        getGioHang(getTenDN());
        closeMenu();
    }//GEN-LAST:event_lblGioHangMouseClicked

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void btnChonAnh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnh1ActionPerformed

        lblTenHinh.setText(ChonHinh());
        if (getAnhBia() != null) {
            int lblWidth = lblAnh.getWidth();
            int lblHeight = lblAnh.getHeight();

            ImageIcon imageIcon = new ImageIcon("src\\ImageND\\" + lblTenHinh.getText());
            Image image = imageIcon.getImage();
            Image newImage = image.getScaledInstance(lblWidth, lblHeight, java.awt.Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(newImage);
            lblAnh.setIcon(scaledImageIcon);
            this.closeMenu();
        } else {
            lblAnh.setIcon(null);
        }

    }//GEN-LAST:event_btnChonAnh1ActionPerformed

    private void btnThemDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDiaChiActionPerformed
        frmAddDiaChi fadd = new frmAddDiaChi();
        fadd.setVisible(true);
        fadd.setTenDN(getTenDN());

    }//GEN-LAST:event_btnThemDiaChiActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn đã đăng xuất thành công");
        this.dispose();
        frmLogin f = new frmLogin();
        f.setVisible(true);
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void btnCapNhatTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatTKActionPerformed

        StringBuilder sb = new StringBuilder();
        ktRong(sb);
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
        if (!dinhDangEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Định dạng email không hợp lệ!\n Dạng [name@gmail.com]");
            return;
        }
        UpdateTK();
    }//GEN-LAST:event_btnCapNhatTKActionPerformed

    private void lblGioiThieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGioiThieuMouseClicked
        cardTrangChu.setVisible(false);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(false);
        cardGioHang.setVisible(false);
        cardDonHang.setVisible(false);
        cardDiaChi.setVisible(false);
        cardGioiThieu.setVisible(true);
        lblTenDanhMuc.setText(lblDonHang.getText());
        closeMenu();

    }//GEN-LAST:event_lblGioiThieuMouseClicked

    private void lblDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDonHangMouseClicked
        cardTrangChu.setVisible(false);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(false);
        cardGioHang.setVisible(false);
        cardDonHang.setVisible(true);
        cardDiaChi.setVisible(false);
        cardGioiThieu.setVisible(false);
        lblTenDanhMuc.setText(lblDonHang.getText());
        getlistDonHang();
        closeMenu();
    }//GEN-LAST:event_lblDonHangMouseClicked

    private void btnTiepTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTucActionPerformed

        frmTaoDonHang frm = new frmTaoDonHang();
        frm.setTenDN(getTenDN());
        frm.setTongTien("" + tongTienThanhToan());
        frm.setVisible(true);
        frm.loadForm(this);
    }//GEN-LAST:event_btnTiepTucActionPerformed

    private void lblDiaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiaChiMouseClicked
        cardTrangChu.setVisible(false);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(false);
        cardGioHang.setVisible(false);
        cardDonHang.setVisible(false);
        cardDiaChi.setVisible(true);
        cardGioiThieu.setVisible(false);
        lblTenDanhMuc.setText(lblGioiThieu.getText());
        getDiaChi(getTenDN());
        closeMenu();
    }//GEN-LAST:event_lblDiaChiMouseClicked

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        frmDoiMatKhau f = new frmDoiMatKhau();
        f.setTenDN(getTenDN());
        f.setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUserMain().setVisible(true);
            }
        });
//        SwingUtilities.invokeLater(() -> new frmUserSanPham("My Application").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatTK;
    private javax.swing.JButton btnChonAnh1;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnGiua;
    private javax.swing.JButton btnPhai;
    private javax.swing.JButton btnThemDiaChi;
    private javax.swing.JButton btnTiepTuc;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiem1;
    private javax.swing.JButton btnTrai;
    private javax.swing.JButton btnTrangDau;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardDiaChi;
    private javax.swing.JPanel cardDonHang;
    private javax.swing.JPanel cardGioHang;
    private javax.swing.JPanel cardGioiThieu;
    private javax.swing.JPanel cardSanPham;
    private javax.swing.JPanel cardTaiKhoan;
    private javax.swing.JPanel cardTrangChu;
    private javax.swing.JComboBox<String> cboDiaChi;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private com.toedter.calendar.JDateChooser dcNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelTieuDe;
    private javax.swing.JPanel jPanelTieuDeGH;
    private javax.swing.JScrollPane jScrollPaneDiaChi;
    private javax.swing.JScrollPane jScrollPaneDonHang;
    private javax.swing.JScrollPane jScrollPaneGioHang;
    private javax.swing.JScrollPane jScrollPaneSanPham;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jplSlideMenu;
    private javax.swing.JPanel jpllMenuBar;
    private javax.swing.JLabel lbTenND;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblCloseMenu;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblGioHang;
    private javax.swing.JLabel lblGioiThieu;
    private javax.swing.JLabel lblOpenMenu;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTenDN;
    private javax.swing.JLabel lblTenDanhMuc;
    private javax.swing.JLabel lblTenHinh;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel lblTroGiup;
    private javax.swing.JPanel pnlDSGioHang;
    private javax.swing.JPanel pnlDiaChi;
    private javax.swing.JPanel pnlDonHang;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTieuDe;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JButton tbnTrangCuoi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiaCao;
    private javax.swing.JTextField txtGiaThap;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    ///----------------------MENU-----------------------------
    public void openMenu() {

        jplSlideMenu.setSize(x, y);
        if (x == 0) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 355; i++) {
                            jplSlideMenu.setSize(i, y);
                            Thread.sleep(1);
                        }
                    } catch (Exception e) {
                    }
                }
            }).start();
            x = 355;
        }
    }

    public void closeMenu() {
        jplSlideMenu.setSize(x, y);
        if (x == 355) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 355; i >= 0; i--) {
                            jplSlideMenu.setSize(i, y);
                            Thread.sleep(2);
                        }
                    } catch (Exception e) {
                    }
                }
            }).start();
            x = 0;
        }
    }
///-----------------------SẢN PHẨM------------------------

    public void LoadSP() {
        //System.out.println("" + soLuong);
        this.pnlMain.removeAll();
        listSP.clear();
        listSP = spdao.getlistSP(soLuong, soLuongMD);
        forSP();
    }

    public void forSP() {
        for (SanPham s : listSP) {
            cardSanPham frm = new cardSanPham();
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            this.pnlMain.add(frm, constraints);
            frm.setMASP(s.getMaSanPham());
            frm.setTenDN(this.getTenDN());
            frm.load1SP();
            frm.setVisible(true);
        }
    }

    public void searchSP() {
        this.pnlMain.removeAll();
        listSP.clear();
        listSP = spdao.search(txtSearch.getText());
        forSP();
    }

    public void loadSPbyTenLoai() {
        StringBuilder sb = new StringBuilder();;
        kiemTraNhap(sb);
        if (sb.length() != 0) {
            JOptionPane.showMessageDialog(this, sb);
        } else {
            this.pnlMain.removeAll();
            listSP.clear();
            String TenLoai = (String) cboLoaiSP.getSelectedItem();
            listSP = spdao.getSPbyTenLoai(TenLoai, txtGiaThap.getText(), txtGiaCao.getText());
            forSP();
        }
    }

    public void loadLoaiSP() {
        listLSP = ldao.getlistLoaiSP();
        for (LoaiSanPham l : listLSP) {
            String tenLoai = l.getTenLoai();
            cboLoaiSP.addItem(tenLoai);
        }
    }

    public void kiemTraNhap(StringBuilder sb) {
        if (txtGiaThap.getText().length() != 0) {
            String text2 = txtGiaThap.getText();
            try {
                int x = Integer.parseInt(text2);
                if (x < 0) {
                    sb.append("Giá phải lớn hơn 0\n");
                }
            } catch (NumberFormatException e) {
                sb.append("Giá chỉ được nhập số\n");
            }
        }
        if (txtGiaCao.getText().length() != 0) {
            String text2 = txtGiaCao.getText();
            try {
                int x = Integer.parseInt(text2);
                if (x < 0) {
                    sb.append("Giá phải lớn hơn 0\n");
                }
            } catch (NumberFormatException e) {
                sb.append("Giá chỉ được nhập số\n");
            }
        }
    }

    ///-----------------------GIỎ HÀNG------------------------
    private void xacNhanDongForm() {
        // Hiển thị câu hỏi xác nhận
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát ?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            System.exit(0);
        }
    }
    private cardGioHang loadForm;

    public void loadForm(cardGioHang loadForm) {
        this.loadForm = loadForm;
    }

    public void getGioHang(String TenDN) {
        this.pnlDSGioHang.removeAll();
        list.clear();
        list = ghdao.getGioHang(this.getTenDN());
        forSPGioHang();
        Double tongTien = list.stream()
                .mapToDouble(GioHang::getThanhTien)
                .sum();
//        lblTongTIen.setText("");

    }

    public void forSPGioHang() {
        for (GioHang s : list) {
            cardGioHang frm = new cardGioHang();
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            this.pnlDSGioHang.add(frm, constraints);
            frm.setTenDN(this.getTenDN());
            frm.setMaSP(s.getMaSanPham());
            frm.load1SP();
            frm.setVisible(true);

        }
    }

    ///-----------------------ĐƠN HÀNG------------------------
    public void getlistDonHang() {
        this.pnlDonHang.removeAll();
        listdh.clear();
        //System.out.println(dh.getTenDN());
        listdh = dhdao.getListDonHang(getTenDN());
        forDonHang();

    }

    public void forDonHang() {
        for (DonHang d : listdh) {
            cardDonHang frm = new cardDonHang();
            frm.dh = d;
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            this.pnlDonHang.add(frm, constraints);
            frm.show1DonHang();
            frm.setVisible(true);
        }
    }

    public Double tongTienThanhToan() {
        Double tongGiaTri = 0.0;
        for (GioHang gioHang : list) {
            // Cộng giá trị GioHang.ThanhTien vào biến tổng giá trị
            tongGiaTri += gioHang.getThanhTien();
        }
        return tongGiaTri;
    }

    ///-----------------------THÔNG TIN KHÁCH HÀNG------------------------
    public void hienThiThongTinKhachHang() {

        tk = tkDao.DangNhap(Email, TenDN, MatKhau);

        if (tk != null) {

            String email = tk.getEmail();
            String hoTen = tk.getHoTen();
            Date ngaySinh = tk.getNgaySinh();
            String gioiTinh = tk.getGioiTinh();
            String soDienThoai = tk.getSoDienThoai();
            String anhBia = "src\\ImageND\\" + tk.getAnhBiaUser();

            if (email != null) {
                txtEmail.setText(email);
            } else {
                txtEmail.setText("");
            }

            if (hoTen != null) {
                txtHoTen.setText(hoTen);
            } else {
                txtHoTen.setText("");
            }
            if (ngaySinh != null) {
                dcNgaySinh.setDate(ngaySinh);
            } else {
                dcNgaySinh.setDate(null);
            }

            if (gioiTinh != null && gioiTinh.trim().equalsIgnoreCase("Nam")) {
                rdoNam.setSelected(true);
                rdoNu.setSelected(false);
            } else if (gioiTinh != null && gioiTinh.trim().equalsIgnoreCase("Nữ")) {
                rdoNam.setSelected(false);
                rdoNu.setSelected(true);
            } else {
                rdoNam.setSelected(false);
                rdoNu.setSelected(false);
            }

            if (soDienThoai != null) {
                txtSDT.setText(soDienThoai);
            } else {
                txtSDT.setText("");
            }

            if (anhBia != null) {
                int lblWidth = lblAnh.getWidth();
                int lblHeight = lblAnh.getHeight();

                ImageIcon imageIcon = new ImageIcon(anhBia);
                Image image = imageIcon.getImage();
                Image newImage = image.getScaledInstance(lblWidth, lblHeight, java.awt.Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(newImage);
                lblAnh.setIcon(scaledImageIcon);
                lblTenHinh.setText(tk.getAnhBiaUser());
            } else {
                lblAnh.setIcon(null);
            }
            loadDiaChi();

        } else {
            txtEmail.setText("");
            txtHoTen.setText("");
            dcNgaySinh.setDate(null);
            txtSDT.setText("");
            rdoNam.setSelected(false);
            rdoNu.setSelected(false);

        }

    }

    public String ChonHinh() {
        JFileChooser fileChooser = new JFileChooser();
        String defaultPath = "src\\ImageND";
        fileChooser.setCurrentDirectory(new File(defaultPath));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png", "gif", "jpeg");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            String filename = selectedFile.getName();
            return filename;
        }
        return null;
    }

    public void UpdateTK() {
        tk.setEmail(txtEmail.getText());
        tk.setHoTen(txtHoTen.getText());
        tk.setSoDienThoai(txtSDT.getText());
        tk.setNgaySinh(dcNgaySinh.getDate());

        if (rdoNam.isSelected()) {
            tk.setGioiTinh("Nam");
        }
        if (rdoNu.isSelected()) {
            tk.setGioiTinh("Nữ");
        }
        tk.setAnhBiaUser(lblTenHinh.getText());
        int x = tkDao.Update(tk);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thất bại!");
        }

    }

    private void ktRong(StringBuilder sb) {

        if (txtEmail.getText().equals("")) {
            sb.append("Email không được để trống\n");
        }
        if (txtHoTen.getText().equals("")) {
            sb.append("Họ tên không được để trống\n");
        }
        if (txtSDT.getText().equals("")) {
            sb.append("Số điện không được để trống\n");
        }
        Date ngayHienTai = new Date();
        Date ngaySinh = dcNgaySinh.getDate();
        if (ngaySinh == null) {
            sb.append("Ngày sinh không được để trống\n");

        }
        if (ngaySinh != null && ngaySinh.after(ngayHienTai)) {
            sb.append("Ngày sinh phải nhỏ hơn ngày hiện tại!\n");
        }
    }

    private boolean dinhDangEmail(String email) {
        String dinhdang = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(dinhdang);
    }

    ///-----------------------ĐỊA CHỈ------------------------
    public void loadDiaChi() {
        listDC = dcDao.getDiaChiTenDN(getTenDN());
        cboDiaChi.removeAllItems();
        for (DiaChi diaChi : listDC) {
            String tendiaChi = diaChi.getChiTietDiaChi();
            cboDiaChi.addItem(tendiaChi);
        }
    }

    public void getDiaChi(String TenDN) {
        this.pnlDiaChi.removeAll();
        list.clear();
        listDC = dcDao.getDiaChiTenDN(getTenDN());
        forDSDiaChi();
    }

    public void forDSDiaChi() {

        for (DiaChi s : listDC) {
            cardDiaChi frm = new cardDiaChi();
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            this.pnlDiaChi.add(frm, constraints);
            frm.setTenDN(this.getTenDN());
            frm.dc = s;
            frm.show1DiaChi();
            frm.setVisible(true);
        }
    }

}
