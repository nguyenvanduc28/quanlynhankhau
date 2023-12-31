/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nhom71_quanlyhokhau.UI.QuanLyCovid;

import com.nhom71_quanlyhokhau.Util.DateForm;
import com.nhom71_quanlyhokhau.controllers.QuanLyCovidCtrl.ThongKeCoVidCtrl;
import com.nhom71_quanlyhokhau.controllers.QuanLyNkHkCtrl.QuanLyNhanKhauCtrl.NhanKhauCtrl;
import com.nhom71_quanlyhokhau.models.NhanKhau;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.sql.SQLException;
import java.util.EventObject;
import java.util.List;

/**
 *
 * @author nguyenduc
 */
public class CovidThongKePanel extends javax.swing.JPanel {
    private DefaultTableModel danhsachnhankhau;
    /**
     * Creates new form CovidThongKePanel
     */
    public CovidThongKePanel() throws SQLException, ClassNotFoundException {
        initComponents();
        loadData();
    }
    private void loadData() throws SQLException, ClassNotFoundException {
        if (danhsachnhankhau.getRowCount()>0) danhsachnhankhau.setRowCount(0);
        ThongKeCoVidCtrl thongKeCoVidCtrl = new ThongKeCoVidCtrl();
        List<NhanKhau> nhanKhauList = thongKeCoVidCtrl.getListNhanKhauCovid();

        for (int i = 0; i<nhanKhauList.size(); i++) {
            int id = nhanKhauList.get(i).getId();
            String hoTen = nhanKhauList.get(i).getHoTen();
            String ngaySinh = nhanKhauList.get(i).getNgaySinh();
            String gioiTinh = nhanKhauList.get(i).getGioiTinh();
            String diaChi = nhanKhauList.get(i).getDiaChiHienTai();

            Object[] row = {id, hoTen, gioiTinh, ngaySinh, diaChi};
            danhsachnhankhau.addRow(row);
        }
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
        jLabel = new javax.swing.JLabel();
        jComboGioiTinh = new javax.swing.JComboBox<>();

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButtonTimKiem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDanhSach = new javax.swing.JTable();

        jDateTuNgay = new com.toedter.calendar.JDateChooser();
        jDateDenNgay = new com.toedter.calendar.JDateChooser();
        jCheckF0 = new javax.swing.JCheckBox();
        jCheckFn = new javax.swing.JCheckBox();
        jCheckCachLyTaiNha = new javax.swing.JCheckBox();
        jCheckCachLyTaiTram = new javax.swing.JCheckBox();
        jCheckF1 = new javax.swing.JCheckBox();
        jCheckTest = new javax.swing.JCheckBox();
        jCheckChet = new javax.swing.JCheckBox();


        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel.setText("Giới tính:");


        jComboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Nam", "Nữ" }));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Ngày:");


        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("=>");


        jButtonTimKiem.setBackground(new java.awt.Color(255, 255, 153));
        jButtonTimKiem.setText("Tìm kiếm");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    jButtonTimKiemActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        jTableDanhSach.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTableDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
                new String [] {
                        "ID", "Họ tên", "Giới tính", "Ngày sinh", "Địa chỉ"
                }
        ));
        danhsachnhankhau = (DefaultTableModel) jTableDanhSach.getModel();
        TableCellEditor nonEditableCellEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhsachnhankhau.getColumnCount(); column++) {
            TableColumn tableColumn = jTableDanhSach.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor);
        }

        jTableDanhSach.setToolTipText("");
        jTableDanhSach.setEnabled(false);
        jTableDanhSach.setRowHeight(30);
        jTableDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDanhSachMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableDanhSachMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDanhSach);


        jDateTuNgay.setBackground(new java.awt.Color(255, 255, 255));

        jDateDenNgay.setBackground(new java.awt.Color(255, 255, 255));

        jCheckF0.setText("F0");

        jCheckFn.setText("Fn");

        jCheckCachLyTaiNha.setText("Cách Ly tại Nhà");

        jCheckCachLyTaiTram.setText("Cách ly tại trạm");

        jCheckF1.setText("F1");

        jCheckTest.setText("Đã test covid");

        jCheckChet.setText("Chết do covid");


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()

                                .addComponent(jDateTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jDateDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckF0, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckF1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckFn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckTest, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckCachLyTaiNha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckCachLyTaiTram, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckChet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonTimKiem))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addContainerGap(40, Short.MAX_VALUE))

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel)
                            .addComponent(jComboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(jCheckF0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckFn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckTest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckCachLyTaiTram, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckCachLyTaiNha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckChet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))

        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGap(0, 1167, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        // TODO add your handling code here:
        ThongKeCoVidCtrl thongKeCoVidCtrl = new ThongKeCoVidCtrl();

        String gioitinh = (String) jComboGioiTinh.getSelectedItem();
        String tuNgay = DateForm.returnDateString(jDateTuNgay.getDate());
        String denNgay = DateForm.returnDateString(jDateDenNgay.getDate());
        boolean f0 = jCheckF0.isSelected();
        boolean f1 = jCheckF1.isSelected();
        boolean fn = jCheckFn.isSelected();
        boolean test = jCheckTest.isSelected();
        boolean tainha = jCheckCachLyTaiNha.isSelected();
        boolean taitram = jCheckCachLyTaiTram.isSelected();
        boolean chet = jCheckChet.isSelected();
        if (danhsachnhankhau.getRowCount() > 0) danhsachnhankhau.setRowCount(0);
        List<NhanKhau> nhanKhauList = thongKeCoVidCtrl.locCovid(gioitinh, tuNgay, denNgay, f0, f1, fn, test, tainha, taitram, chet);
        for (int i = 0; i<nhanKhauList.size(); i++) {
            int id = nhanKhauList.get(i).getId();
            String hoTen = nhanKhauList.get(i).getHoTen();
            String ngaySinh = nhanKhauList.get(i).getNgaySinh();
            String gioiTinh = nhanKhauList.get(i).getGioiTinh();
            String diaChi = nhanKhauList.get(i).getDiaChiHienTai();

            Object[] row = {id, hoTen, gioiTinh, ngaySinh, diaChi};
            danhsachnhankhau.addRow(row);
        }
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jTableDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDanhSachMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableDanhSachMouseClicked

    private void jTableDanhSachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDanhSachMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableDanhSachMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JComboBox<String> jComboGioiTinh;
    private javax.swing.JComboBox<String> jComboLoai;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox jCheckCachLyTaiNha;
    private javax.swing.JCheckBox jCheckCachLyTaiTram;
    private javax.swing.JCheckBox jCheckChet;
    private javax.swing.JCheckBox jCheckF0;
    private javax.swing.JCheckBox jCheckF1;
    private javax.swing.JCheckBox jCheckFn;
    private javax.swing.JCheckBox jCheckTest;
    private com.toedter.calendar.JDateChooser jDateDenNgay;
    private com.toedter.calendar.JDateChooser jDateTuNgay;

    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDanhSach;
    // End of variables declaration//GEN-END:variables
}
