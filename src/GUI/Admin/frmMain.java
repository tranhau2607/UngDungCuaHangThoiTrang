/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Admin;

import GUI.frmLogin;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author tranh
 */
public class frmMain extends javax.swing.JFrame {

    private String TenDN, HoTen, AnhBia;

    public String getTenDN() {
        return TenDN;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getAnhBia() {
        return AnhBia;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
        lblTenDN.setText(TenDN);
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
        lblTenND.setText(HoTen);
    }

    public void setAnhBia(String AnhBia) {
        this.AnhBia = AnhBia;
    }

    Color DefaultColor, ClickeColor;

    public frmMain() {
        initComponents();
        DefaultColor = new Color(255, 255, 255);
        ClickeColor = new Color(204, 204, 204);
        TC.setBackground(DefaultColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblTrangChu.getText());
        frmTrangChu asp = new frmTrangChu();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        EmptyBorder border = new EmptyBorder(20, 20, 20, 20);
        jDesktopPane.setBorder(border);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTenDN = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TC = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        SP = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        LSP = new javax.swing.JPanel();
        lblLoaiSanPham = new javax.swing.JLabel();
        NSX = new javax.swing.JPanel();
        lblNSX = new javax.swing.JLabel();
        PN = new javax.swing.JPanel();
        lblPhieuNhap = new javax.swing.JLabel();
        DH = new javax.swing.JPanel();
        lblDonHang = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TK = new javax.swing.JPanel();
        lblTaiKhoan = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        DX = new javax.swing.JPanel();
        lblDangXuat = new javax.swing.JLabel();
        lblTenMucChon = new javax.swing.JPanel();
        lblTenND = new javax.swing.JLabel();
        lblTenDM = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblTenDN.setText("TenDN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(lblTenDN)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(lblTenDN)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 130));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 235, 10));

        TC.setBackground(new java.awt.Color(255, 255, 255));
        TC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TCMousePressed(evt);
            }
        });

        lblTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(0, 102, 51));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setText("TRANG CHỦ");
        lblTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout TCLayout = new javax.swing.GroupLayout(TC);
        TC.setLayout(TCLayout);
        TCLayout.setHorizontalGroup(
            TCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TCLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        TCLayout.setVerticalGroup(
            TCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTrangChu)
                .addGap(20, 20, 20))
        );

        jPanel1.add(TC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 70));

        SP.setBackground(new java.awt.Color(255, 255, 255));
        SP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SPMousePressed(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(0, 102, 51));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("SẢN PHẨM");
        lblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout SPLayout = new javax.swing.GroupLayout(SP);
        SP.setLayout(SPLayout);
        SPLayout.setHorizontalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SPLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        SPLayout.setVerticalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSanPham)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(SP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 70));

        LSP.setBackground(new java.awt.Color(255, 255, 255));
        LSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LSPMousePressed(evt);
            }
        });

        lblLoaiSanPham.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblLoaiSanPham.setForeground(new java.awt.Color(0, 102, 51));
        lblLoaiSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoaiSanPham.setText("LOẠI SP");
        lblLoaiSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout LSPLayout = new javax.swing.GroupLayout(LSP);
        LSP.setLayout(LSPLayout);
        LSPLayout.setHorizontalGroup(
            LSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LSPLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        LSPLayout.setVerticalGroup(
            LSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LSPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLoaiSanPham)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(LSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 70));

        NSX.setBackground(new java.awt.Color(255, 255, 255));
        NSX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NSXMousePressed(evt);
            }
        });

        lblNSX.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblNSX.setForeground(new java.awt.Color(0, 102, 51));
        lblNSX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSX.setText("NHÀ SẢN XUẤT");
        lblNSX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout NSXLayout = new javax.swing.GroupLayout(NSX);
        NSX.setLayout(NSXLayout);
        NSXLayout.setHorizontalGroup(
            NSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NSXLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        NSXLayout.setVerticalGroup(
            NSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NSXLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblNSX)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(NSX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 70));

        PN.setBackground(new java.awt.Color(255, 255, 255));
        PN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PNMousePressed(evt);
            }
        });

        lblPhieuNhap.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblPhieuNhap.setForeground(new java.awt.Color(0, 102, 51));
        lblPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhieuNhap.setText("PHIẾU NHẬP");
        lblPhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PNLayout = new javax.swing.GroupLayout(PN);
        PN.setLayout(PNLayout);
        PNLayout.setHorizontalGroup(
            PNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        PNLayout.setVerticalGroup(
            PNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPhieuNhap)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(PN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, 70));

        DH.setBackground(new java.awt.Color(255, 255, 255));
        DH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DHMousePressed(evt);
            }
        });

        lblDonHang.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(0, 102, 51));
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonHang.setText("ĐƠN HÀNG");
        lblDonHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout DHLayout = new javax.swing.GroupLayout(DH);
        DH.setLayout(DHLayout);
        DHLayout.setHorizontalGroup(
            DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DHLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        DHLayout.setVerticalGroup(
            DHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DHLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblDonHang)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(DH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, 70));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 235, 10));

        TK.setBackground(new java.awt.Color(255, 255, 255));
        TK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TKMousePressed(evt);
            }
        });

        lblTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(0, 102, 51));
        lblTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaiKhoan.setText("TÀI KHOẢN");
        lblTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout TKLayout = new javax.swing.GroupLayout(TK);
        TK.setLayout(TKLayout);
        TKLayout.setHorizontalGroup(
            TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TKLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TKLayout.setVerticalGroup(
            TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TKLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblTaiKhoan)
                .addGap(20, 20, 20))
        );

        jPanel1.add(TK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, 70));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 235, 10));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 235, 10));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 235, 10));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 235, 10));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 260, 5));

        DX.setBackground(new java.awt.Color(255, 255, 255));
        DX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DXMousePressed(evt);
            }
        });

        lblDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(0, 102, 51));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setText("ĐĂNG XUẤT");
        lblDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout DXLayout = new javax.swing.GroupLayout(DX);
        DX.setLayout(DXLayout);
        DXLayout.setHorizontalGroup(
            DXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DXLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        DXLayout.setVerticalGroup(
            DXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DXLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblDangXuat)
                .addGap(20, 20, 20))
        );

        jPanel1.add(DX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 235, -1));

        lblTenMucChon.setBackground(new java.awt.Color(255, 255, 255));
        lblTenMucChon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        lblTenND.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lblTenND.setForeground(new java.awt.Color(0, 102, 51));
        lblTenND.setText("TenND");

        lblTenDM.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTenDM.setForeground(new java.awt.Color(0, 102, 51));
        lblTenDM.setText("Tên mục chọn");

        btnSearch.setBackground(new java.awt.Color(0, 102, 51));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Tìm kiếm");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLocaleChooser1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout lblTenMucChonLayout = new javax.swing.GroupLayout(lblTenMucChon);
        lblTenMucChon.setLayout(lblTenMucChonLayout);
        lblTenMucChonLayout.setHorizontalGroup(
            lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTenMucChonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTenDM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTenMucChonLayout.createSequentialGroup()
                        .addComponent(jLocaleChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTenMucChonLayout.createSequentialGroup()
                        .addComponent(lblTenND)
                        .addGap(66, 66, 66))))
        );
        lblTenMucChonLayout.setVerticalGroup(
            lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTenMucChonLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(lblTenMucChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenDM)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTenMucChonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTenND)
                .addGap(18, 18, 18)
                .addComponent(jLocaleChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jDesktopPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1172, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenMucChon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblTenMucChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TCMousePressed
        TC.setBackground(ClickeColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblTrangChu.getText());
        frmTrangChu asp = new frmTrangChu();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_TCMousePressed

    private void LSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSPMousePressed
        TC.setBackground(DefaultColor);
        LSP.setBackground(ClickeColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblLoaiSanPham.getText());
        frmLoaiSanPham asp = new frmLoaiSanPham();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_LSPMousePressed

    private void SPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPMousePressed
        TC.setBackground(DefaultColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(ClickeColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblSanPham.getText());
        frmSanPham asp = new frmSanPham();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_SPMousePressed

    private void NSXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NSXMousePressed
        TC.setBackground(DefaultColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(ClickeColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblNSX.getText());
        frmNSX asp = new frmNSX();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_NSXMousePressed

    private void PNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PNMousePressed
        TC.setBackground(DefaultColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(ClickeColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblPhieuNhap.getText());
        frmPhieuNhap asp = new frmPhieuNhap();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_PNMousePressed

    private void DHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DHMousePressed
        TC.setBackground(DefaultColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(ClickeColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblDonHang.getText());
        frmDonHang asp = new frmDonHang();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_DHMousePressed

    private void TKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TKMousePressed
        TC.setBackground(DefaultColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(ClickeColor);
        DX.setBackground(DefaultColor);
        lblTenDM.setText(lblTaiKhoan.getText());
        frmTaiKhoan asp = new frmTaiKhoan();
        jDesktopPane.removeAll();
        jDesktopPane.add(asp).setVisible(true);
    }//GEN-LAST:event_TKMousePressed

    private void DXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DXMousePressed
        TC.setBackground(DefaultColor);
        LSP.setBackground(DefaultColor);
        SP.setBackground(DefaultColor);
        NSX.setBackground(DefaultColor);
        PN.setBackground(DefaultColor);
        DH.setBackground(DefaultColor);
        TK.setBackground(DefaultColor);
        DX.setBackground(ClickeColor);
        lblTenDM.setText(lblDangXuat.getText());
        JOptionPane.showMessageDialog(this, "Bạn đã đăng xuất thành công!\n Cảm ơn bạn đã ghé!");
        frmLogin f = new frmLogin();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DXMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DH;
    private javax.swing.JPanel DX;
    private javax.swing.JPanel LSP;
    private javax.swing.JPanel NSX;
    private javax.swing.JPanel PN;
    private javax.swing.JPanel SP;
    private javax.swing.JPanel TC;
    private javax.swing.JPanel TK;
    private javax.swing.JButton btnSearch;
    private javax.swing.JDesktopPane jDesktopPane;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblLoaiSanPham;
    private javax.swing.JLabel lblNSX;
    private javax.swing.JLabel lblPhieuNhap;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTenDM;
    private javax.swing.JLabel lblTenDN;
    private javax.swing.JPanel lblTenMucChon;
    private javax.swing.JLabel lblTenND;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
