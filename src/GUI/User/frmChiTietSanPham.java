/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.User;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import MODEL.*;
import DAO.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author tsmda
 */
public class frmChiTietSanPham extends javax.swing.JFrame {

    LoaiSanPhamDao ldao = new LoaiSanPhamDao();
    List<LoaiSanPham> listLSP = new ArrayList();
    ChiTietSanPham ctsp = new ChiTietSanPham();
    SanPham sp = new SanPham();
    List<SanPham> listSP = new ArrayList();
    SanPhamDao spdao = new SanPhamDao();
    List<GioHang> listGH = new ArrayList();
    GioHangDao ghdao = new GioHangDao();
    String MaSP;
    String KichThuoc;
    ChiTietSanPhamDao ctspdao = new ChiTietSanPhamDao();

    private String TenDN;

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String Size) {
        this.KichThuoc = Size;
    }

    public frmChiTietSanPham() {
        initComponents();
        setLocationRelativeTo(null);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 100, 1);
        spinnerSoluong.setModel(model);
        lblQuayLai.setLocation(10, 10);
        btnClick(1);
        setKichThuoc(btnSize1.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hinh1 = new javax.swing.JLabel();
        hinh3 = new javax.swing.JLabel();
        hinh2 = new javax.swing.JLabel();
        jblTenSP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlSize = new javax.swing.JPanel();
        btnSize1 = new javax.swing.JButton();
        btnSize2 = new javax.swing.JButton();
        btnSize3 = new javax.swing.JButton();
        btnSize4 = new javax.swing.JButton();
        btnSize5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        spinnerSoluong = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMota2 = new javax.swing.JLabel();
        lblMota1 = new javax.swing.JLabel();
        lblMota3 = new javax.swing.JLabel();
        lblMota4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlSPNoiBac = new javax.swing.JPanel();
        lblQuayLai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chi tiết sản phẩm");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        hinh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        hinh3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        hinh2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jblTenSP.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jblTenSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jblTenSP.setText("Tên sản phẩm");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Size:");

        pnlSize.setBackground(new java.awt.Color(255, 255, 255));
        pnlSize.setLayout(new java.awt.GridLayout(1, 5, 10, 0));

        btnSize1.setBackground(new java.awt.Color(204, 255, 255));
        btnSize1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSize1.setText("35");
        btnSize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSize1ActionPerformed(evt);
            }
        });
        pnlSize.add(btnSize1);

        btnSize2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSize2.setText("36");
        btnSize2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSize2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSize2ActionPerformed(evt);
            }
        });
        pnlSize.add(btnSize2);

        btnSize3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSize3.setText("37");
        btnSize3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSize3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSize3ActionPerformed(evt);
            }
        });
        pnlSize.add(btnSize3);

        btnSize4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSize4.setText("38");
        btnSize4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSize4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSize4ActionPerformed(evt);
            }
        });
        pnlSize.add(btnSize4);

        btnSize5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSize5.setText("39");
        btnSize5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSize5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSize5ActionPerformed(evt);
            }
        });
        pnlSize.add(btnSize5);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Số lượng: ");

        spinnerSoluong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spinnerSoluong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 0, 0));
        jButton6.setText("Thêm giỏ hàng");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 0, 51)));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Sản phẩm tồn: ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setText("Mô tả sản phẩm: ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        lblMota2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMota2.setText("jLabel4");
        jPanel2.add(lblMota2);

        lblMota1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMota1.setText("jLabel1");
        jPanel2.add(lblMota1);

        lblMota3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMota3.setText("jLabel7");
        jPanel2.add(lblMota3);

        lblMota4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMota4.setText("jLabel8");
        jPanel2.add(lblMota4);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Sản phẩm nổi bậc");

        pnlSPNoiBac.setBackground(new java.awt.Color(255, 255, 255));
        pnlSPNoiBac.setLayout(new java.awt.GridLayout(1, 6));

        lblQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thoat.png"))); // NOI18N
        lblQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuayLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuayLaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(pnlSPNoiBac, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(hinh3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(pnlSize, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(spinnerSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblQuayLai))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuayLai)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlSize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(spinnerSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hinh3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSPNoiBac, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btnSize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSize1ActionPerformed
        setKichThuoc(btnSize1.getText());
        btnClick(1);
    }//GEN-LAST:event_btnSize1ActionPerformed

    private void btnSize2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSize2ActionPerformed
        setKichThuoc(btnSize2.getText());
        btnClick(2);
    }//GEN-LAST:event_btnSize2ActionPerformed

    private void btnSize3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSize3ActionPerformed
        setKichThuoc(btnSize3.getText());
        btnClick(3);
    }//GEN-LAST:event_btnSize3ActionPerformed

    private void btnSize4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSize4ActionPerformed
        setKichThuoc(btnSize4.getText());
        btnClick(4);
    }//GEN-LAST:event_btnSize4ActionPerformed

    private void btnSize5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSize5ActionPerformed
        setKichThuoc(btnSize5.getText());
        btnClick(5);
    }//GEN-LAST:event_btnSize5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        addGioHang();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lblQuayLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuayLaiMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblQuayLaiMouseClicked

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
            java.util.logging.Logger.getLogger(frmChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChiTietSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSize1;
    private javax.swing.JButton btnSize2;
    private javax.swing.JButton btnSize3;
    private javax.swing.JButton btnSize4;
    private javax.swing.JButton btnSize5;
    private javax.swing.JLabel hinh1;
    private javax.swing.JLabel hinh2;
    private javax.swing.JLabel hinh3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblTenSP;
    private javax.swing.JLabel lblMota1;
    private javax.swing.JLabel lblMota2;
    private javax.swing.JLabel lblMota3;
    private javax.swing.JLabel lblMota4;
    private javax.swing.JLabel lblQuayLai;
    private javax.swing.JPanel pnlSPNoiBac;
    private javax.swing.JPanel pnlSize;
    private javax.swing.JSpinner spinnerSoluong;
    // End of variables declaration//GEN-END:variables

    public void loadCTSP() {

        ctsp = ctspdao.get1CTSP(getMaSP());
        ImageIcon iHinh1 = new ImageIcon("src\\IMG_Product\\IMG_Product1\\" + ctsp.getAnh1());
        ImageIcon iHinh2 = new ImageIcon("src\\IMG_Product\\IMG_Product23\\" + ctsp.getAnh2());
        ImageIcon iHinh3 = new ImageIcon("src\\IMG_Product\\IMG_Product23\\" + ctsp.getAnh3());

        Image scaledImage1 = iHinh1.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        Image scaledImage2 = iHinh2.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH);
        Image scaledImage3 = iHinh3.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH);

        iHinh1.setImage(scaledImage1);
        hinh1.setIcon(iHinh1);
        iHinh2.setImage(scaledImage2);
        hinh2.setIcon(iHinh2);
        iHinh3.setImage(scaledImage3);
        hinh3.setIcon(iHinh3);
        jblTenSP.setText(ctsp.getTenSanPham());

        lblMota1.setText("- " + ctsp.getMoTa1());
        lblMota2.setText("- " + ctsp.getMoTa2());
        lblMota3.setText("- " + ctsp.getMoTa3());
        lblMota4.setText("- " + ctsp.getMoTa4());

        jLabel5.setText("Sản phẩm tồn: " + ctsp.getSanPhamTon());
        listSP = spdao.getlistSPNoiBac();
        for (SanPham s : listSP) {
            cardSanPhamNoiBac frm = new cardSanPhamNoiBac();
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            this.pnlSPNoiBac.add(frm, constraints);
            frm.setMASP(s.getMaSanPham());
            frm.load1SP();

            frm.setVisible(true);
        }
        loadSize();
    }

    public void loadSize() {
        int n = ldao.ktMaLoai(getMaSP());
        if (n == 0) {
            pnlSize.remove(btnSize4);
            pnlSize.remove(btnSize5);
            pnlSize.setPreferredSize(new Dimension(165, 25));
            btnSize1.setText("S");
            btnSize2.setText("M");
            btnSize3.setText("L");
        }
    }

    public void addGioHang() {
        int sl = (int) spinnerSoluong.getValue();
        int n = ghdao.addGioHang(this.getTenDN(), ctsp.getMaSanPham(), sl, getKichThuoc());
        if (n != -1) {
            this.dispose();
            JOptionPane.showMessageDialog(this, "Thêm giỏ hàng thành công!");
        }
    }

    public void btnClick(int n) {
        if (n == 1) {
            btnSize1.setBackground(new Color(204, 255, 255));
            btnSize2.setBackground(Color.WHITE);
            btnSize3.setBackground(Color.WHITE);
            btnSize4.setBackground(Color.WHITE);
            btnSize5.setBackground(Color.WHITE);
        }
        if (n == 2) {
            btnSize1.setBackground(Color.WHITE);
            btnSize2.setBackground(new Color(204, 255, 255));
            btnSize3.setBackground(Color.WHITE);
            btnSize4.setBackground(Color.WHITE);
            btnSize5.setBackground(Color.WHITE);
        }
        if (n == 3) {
            btnSize1.setBackground(Color.WHITE);
            btnSize2.setBackground(Color.WHITE);
            btnSize3.setBackground(new Color(204, 255, 255));
            btnSize4.setBackground(Color.WHITE);
            btnSize5.setBackground(Color.WHITE);
        }
        if (n == 4) {
            btnSize1.setBackground(Color.WHITE);
            btnSize2.setBackground(Color.WHITE);
            btnSize3.setBackground(Color.WHITE);
            btnSize4.setBackground(new Color(204, 255, 255));
            btnSize5.setBackground(Color.WHITE);
        }
        if (n == 5) {
            btnSize1.setBackground(Color.WHITE);
            btnSize2.setBackground(Color.WHITE);
            btnSize3.setBackground(Color.WHITE);
            btnSize4.setBackground(Color.WHITE);
            btnSize5.setBackground(new Color(204, 255, 255));
        }
    }
}
