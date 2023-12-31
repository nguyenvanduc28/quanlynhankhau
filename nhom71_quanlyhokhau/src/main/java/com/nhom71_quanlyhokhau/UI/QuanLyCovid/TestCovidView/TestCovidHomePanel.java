/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nhom71_quanlyhokhau.UI.QuanLyCovid.TestCovidView;

import com.nhom71_quanlyhokhau.Bean.QuanLyCovidBean.TestCovidBean;
import com.nhom71_quanlyhokhau.controllers.QuanLyCovidCtrl.QuanLyTestCovidCtrl.TestCovidCtrl;

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
public class TestCovidHomePanel extends javax.swing.JPanel {

    /**
     * Creates new form TestCovidHomePanel
     */
    public TestCovidHomePanel() throws SQLException, ClassNotFoundException {
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
        jTableTestCovid = new javax.swing.JTable();
        jButtonTestCovidForm = new javax.swing.JButton();

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

        jTableTestCovid.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTableTestCovid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Test", "Họ tên", "Ngày sinh","Số điện thoại", "Ngày test", "Kết quả test"
            }
        ));
        danhSach = (DefaultTableModel) jTableTestCovid.getModel();
        TableCellEditor nonEditableCellEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSach.getColumnCount(); column++) {
            TableColumn tableColumn = jTableTestCovid.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor);
        }
        jTableTestCovid.setToolTipText("");
        jTableTestCovid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableTestCovid.setFocusable(false);
        jTableTestCovid.setRowHeight(30);
        jTableTestCovid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTestCovidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableTestCovidMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTestCovid);

        jButtonTestCovidForm.setBackground(new java.awt.Color(255, 255, 153));
        jButtonTestCovidForm.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonTestCovidForm.setText("Test Covid");
        jButtonTestCovidForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestCovidFormActionPerformed(evt);
            }
        });

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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTestCovidForm, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTimKiemMaNK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTestCovidForm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 712, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadData() throws SQLException, ClassNotFoundException {
        if (danhSach.getRowCount()>0) danhSach.setRowCount(0);
        TestCovidCtrl testCovidCtrl = new TestCovidCtrl();
        List<TestCovidBean> testCovidBeanList = testCovidCtrl.getAllTestCovid();
        for (int i = 0; i<testCovidBeanList.size(); i++) {
            int idTest = testCovidBeanList.get(i).getTestCovid().getId();
            String hoTen = testCovidBeanList.get(i).getNhanKhau().getHoTen();
            String soDienThoai = testCovidBeanList.get(i).getTestCovid().getSoDienThoai();
            String ngayTest = testCovidBeanList.get(i).getTestCovid().getNgayTest();
            String ketQuaTest = testCovidBeanList.get(i).getTestCovid().getKetQuaTest();

            Object[] row = {idTest, hoTen, soDienThoai, ngayTest, ketQuaTest};
            danhSach.addRow(row);
        }
    }
    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jTableTestCovidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTestCovidMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTestCovidMouseClicked

    private void jTableTestCovidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTestCovidMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTestCovidMouseEntered

    private void jButtonTestCovidFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestCovidFormActionPerformed
        // TODO add your handling code here:
        TestCovidFormView testCovidFormView = new TestCovidFormView();
        testCovidFormView.setVisible(true);
    }//GEN-LAST:event_jButtonTestCovidFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTestCovidForm;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTestCovid;
    private javax.swing.JTextField jTextTimKiemMaNK;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel danhSach;
}
