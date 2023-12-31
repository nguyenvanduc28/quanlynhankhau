/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nhom71_quanlyhokhau.UI.QuanLyCovid.CachLyView;

import com.nhom71_quanlyhokhau.Bean.QuanLyCovidBean.CachLyBean;
import com.nhom71_quanlyhokhau.controllers.CovidHomeCtrl;
import com.nhom71_quanlyhokhau.controllers.QuanLyCovidCtrl.QuanLyCachLyCtrl.CachLyCtrl;
import com.nhom71_quanlyhokhau.controllers.QuanLyCovidCtrl.QuanLyCachLyCtrl.HoanThanhCachLyCtrl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

/**
 *
 * @author nguyenduc
 */
public class CachLyPanel extends javax.swing.JPanel {

    /**
     * Creates new form CachLyPanel
     */
    public CachLyPanel() throws SQLException, ClassNotFoundException {
        initComponents();
        loadData();
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
        jTextTimKiemMaNK = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCachLy = new javax.swing.JTable();
        jButtonFormCachLy = new javax.swing.JButton();
        jButtonHoanThanhCachLy = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDangCachLy = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextTimKiemMaNK.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Tìm kiếm theo mã Nhân Khẩu:");

        jButtonTimKiem.setBackground(new java.awt.Color(255, 255, 153));
        jButtonTimKiem.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonTimKiem.setText("Tìm kiếm");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });

        jTableCachLy.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTableCachLy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"fdds", "dsfgsd", "df", null},
                {null, null, null, null},
                {null, "dfdf", null, null},
                {null, "dfdf", null, null}
            },
            new String [] {
                "ID Cách ly", "Họ tên", "Giới tính", "Ngày sinh", "Cách ly tại nhà?", "Địa điểm cách ly", "Từ ngày", "Đến ngày", "Thuộc diện"
            }
        ));
        danhSach = (DefaultTableModel) jTableCachLy.getModel();
        TableCellEditor nonEditableCellEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSach.getColumnCount(); column++) {
            TableColumn tableColumn = jTableCachLy.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor);
        }
        jTableCachLy.setToolTipText("");
        jTableCachLy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCachLy.setFocusable(false);
        jTableCachLy.setRowHeight(30);
        jTableCachLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCachLyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableCachLyMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCachLy);

        jButtonFormCachLy.setBackground(new java.awt.Color(255, 255, 153));
        jButtonFormCachLy.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonFormCachLy.setText("Form Cách ly");
        jButtonFormCachLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFormCachLyActionPerformed(evt);
            }
        });

        jButtonHoanThanhCachLy.setBackground(new java.awt.Color(255, 255, 153));
        jButtonHoanThanhCachLy.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonHoanThanhCachLy.setText("Hoàn thành cách ly");
        jButtonHoanThanhCachLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonHoanThanhCachLyActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("ĐANG CÁCH LY");

        jLabelDangCachLy.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDangCachLy.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabelDangCachLy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDangCachLy.setText("num");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelDangCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDangCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextTimKiemMaNK, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonTimKiem))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonHoanThanhCachLy, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jButtonFormCachLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextTimKiemMaNK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonFormCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHoanThanhCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1067, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadData() throws SQLException, ClassNotFoundException {
        CovidHomeCtrl covidHomeCtrl =new CovidHomeCtrl();
        jLabelDangCachLy.setText(String.valueOf(covidHomeCtrl.getSoCachLyTaiNha()+covidHomeCtrl.getSoCachLyTaiTramYTe()));
        if (danhSach.getRowCount()>0) danhSach.setRowCount(0);
        List<CachLyBean> cachLyBeanList = new ArrayList<>();
        CachLyCtrl cachLyCtrl = new CachLyCtrl();
        cachLyBeanList = cachLyCtrl.getAllCachLy();

        for (int i = 0; i<cachLyBeanList.size(); i++) {
            int idCachLy = cachLyBeanList.get(i).getCachLy().getId();
            String hoTen = cachLyBeanList.get(i).getNhanKhau().getHoTen();
            String gioiTinh = cachLyBeanList.get(i).getNhanKhau().getGioiTinh();
            String ngaySinh = cachLyBeanList.get(i).getNhanKhau().getNgaySinh();
            String cachLyTaiNha = "";
            if (!cachLyBeanList.get(i).getCachLy().isCachLyTaiTramYTe()) {
                cachLyTaiNha = "Đúng";
            } else {
                cachLyTaiNha = "Tại trạm";
            }
            String diaDiemCachLy = cachLyBeanList.get(i).getCachLy().getDiaDiemCachLy();
            String tuNgay = cachLyBeanList.get(i).getCachLy().getTuNgay();
            String denNgay = cachLyBeanList.get(i).getCachLy().getDenNgay();
            String thuocDien = cachLyBeanList.get(i).getCachLy().getThuocDien();

            Object[] row = {idCachLy, hoTen, gioiTinh, ngaySinh, cachLyTaiNha, diaDiemCachLy, tuNgay, denNgay, thuocDien};
            danhSach.addRow(row);
        }
    }
    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jTableCachLyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCachLyMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTableCachLyMouseClicked

    private void jTableCachLyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCachLyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCachLyMouseEntered

    private void jButtonFormCachLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFormCachLyActionPerformed
        // TODO add your handling code here:
        CachLyFormView cachLyFormView = new CachLyFormView();
        cachLyFormView.setVisible(true);
    }//GEN-LAST:event_jButtonFormCachLyActionPerformed

    private void jButtonHoanThanhCachLyActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonHoanThanhCachLyActionPerformed
        // TODO add your handling code here:
       int row = jTableCachLy.getSelectedRow();
       if (row < 0) return;
       int choice = JOptionPane.showConfirmDialog(null, "Xác nhận hoàn thành cách ly cho "+danhSach.getValueAt(row, 1)+"?", "Xác nhận", JOptionPane.YES_NO_OPTION);

       if (choice == JOptionPane.YES_OPTION) {
           int idCachLy = (int) danhSach.getValueAt(row, 0);
           HoanThanhCachLyCtrl hoanThanhCachLyCtrl = new HoanThanhCachLyCtrl();
           hoanThanhCachLyCtrl.hoanThanhCachLy(idCachLy);
           loadData();
       }
    }//GEN-LAST:event_jButtonHoanThanhCachLyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFormCachLy;
    private javax.swing.JButton jButtonHoanThanhCachLy;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDangCachLy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCachLy;
    private javax.swing.JTextField jTextTimKiemMaNK;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel danhSach;
}
