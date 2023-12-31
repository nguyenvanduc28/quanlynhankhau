/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom71_quanlyhokhau.UI.HoKhauView;

import com.nhom71_quanlyhokhau.Bean.QuanLyHoKhauBean.HoKhauBean;
import com.nhom71_quanlyhokhau.Bean.QuanLyHoKhauBean.ThanhVienCuaHoBean;
import com.nhom71_quanlyhokhau.controllers.QuanLyNkHkCtrl.QuanLyHoKhauCtrl.HoKhauCtrl;
import com.nhom71_quanlyhokhau.controllers.QuanLyNkHkCtrl.QuanLyHoKhauCtrl.TachHoKhauCtrl;
import com.nhom71_quanlyhokhau.models.HoKhau;
import com.nhom71_quanlyhokhau.models.HoKhauNhanKhau;
import com.nhom71_quanlyhokhau.models.NhanKhau;

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
public class TachHoKhauView extends javax.swing.JFrame {

    /**
     * Creates new form TachHoKhauView
     */
    public TachHoKhauView() throws SQLException, ClassNotFoundException {
        isDaCoChuHoMoi = false;
        nhanKhauSelectedList = new ArrayList<>();
        hoKhauBeanList = new HoKhauCtrl().getDanhSachHoKhau();
        initComponents();
        setLocationRelativeTo(null);

        loadDanhSachHoKhau();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHoKhauCu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableThanhVienHoKhauCu = new javax.swing.JTable();
        jButtonChuyen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextMaHoKhau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextIdChuHoMoi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextTenChuHoMoi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextMaKhuVuc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonXoa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableThanhVienMoi = new javax.swing.JTable();
        jButtonThem1 = new javax.swing.JButton();
        jButtonThem2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Danh sách hộ khẩu:");

        jTableHoKhauCu.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTableHoKhauCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Hộ khẩu", "Mã hộ khẩu", "Chủ hộ"
            }
        ));
        danhSachHoKhauCu = (DefaultTableModel) jTableHoKhauCu.getModel();
        TableCellEditor nonEditableCellEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachHoKhauCu.getColumnCount(); column++) {
            TableColumn tableColumn = jTableHoKhauCu.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor);
        }
        jTableHoKhauCu.setFocusable(false);
        jTableHoKhauCu.setRowHeight(30);
        jTableHoKhauCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHoKhauCuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHoKhauCu);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Thành viên của hộ khẩu:");

        jTableThanhVienHoKhauCu.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTableThanhVienHoKhauCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Quan hệ với chủ hộ"
            }
        ));
        danhSachThanhVienHoKhauCu = (DefaultTableModel) jTableThanhVienHoKhauCu.getModel();
        TableCellEditor nonEditableCellEditor2 = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachThanhVienHoKhauCu.getColumnCount(); column++) {
            TableColumn tableColumn = jTableThanhVienHoKhauCu.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor2);
        }
        jTableThanhVienHoKhauCu.setFocusable(false);
        jTableThanhVienHoKhauCu.setRowHeight(30);
        jTableThanhVienHoKhauCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableThanhVienHoKhauCuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableThanhVienHoKhauCu);

        jButtonChuyen.setBackground(new java.awt.Color(255, 255, 153));
        jButtonChuyen.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonChuyen.setText("Chuyển");
        jButtonChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChuyenActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Mã Hộ Khẩu:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("ID Chủ hộ:");

        jTextIdChuHoMoi.setEditable(false);
        jTextIdChuHoMoi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("Tên chủ hộ:");

        jTextTenChuHoMoi.setEditable(false);
        jTextTenChuHoMoi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("Mã Khu Vực:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setText("Địa chỉ:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setText("Thành viên của hộ:");

        jButtonXoa.setBackground(new java.awt.Color(255, 255, 153));
        jButtonXoa.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jTableThanhVienMoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Quan hệ với chủ hộ"
            }
        ));
        danhSachThanhVienhoKhauMoi = (DefaultTableModel) jTableThanhVienMoi.getModel();
        TableCellEditor nonEditableCellEditor3 = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachThanhVienhoKhauMoi.getColumnCount()-1; column++) {
            TableColumn tableColumn = jTableThanhVienMoi.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor3);
        }
        jTableThanhVienMoi.setRowHeight(30);
        jTableThanhVienMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableThanhVienMoiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableThanhVienMoi);

        jButtonThem1.setBackground(new java.awt.Color(255, 255, 153));
        jButtonThem1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonThem1.setText("Lưu");
        jButtonThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonThem1ActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButtonThem2.setBackground(new java.awt.Color(255, 255, 204));
        jButtonThem2.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonThem2.setText("Hủy");
        jButtonThem2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThem2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThem2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonThem2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonThem1))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMaHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(jTextMaKhuVuc, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextTenChuHoMoi, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextIdChuHoMoi, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonChuyen)
                            .addComponent(jButtonXoa, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMaHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIdChuHoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTenChuHoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkInput() {
        if (    jTextMaHoKhau.getText().isEmpty()
                ||  jTextIdChuHoMoi.getText().isEmpty()
                ||  jTextTenChuHoMoi.getText().isEmpty()
                ||  jTextMaKhuVuc.getText().isEmpty()
                ||  jTextDiaChi.getText().isEmpty()
        ) {
            JOptionPane.showMessageDialog(null, "Hãy nhập đủ thông tin");
            return false;
        }

        for (int i = 0; i < jTableThanhVienMoi.getRowCount(); i++) {
            String quanhe = (String) danhSachThanhVienhoKhauMoi.getValueAt(i, 2);
            if (quanhe == null) {
                JOptionPane.showMessageDialog(null, "Hãy nhập Quan hệ với chủ hộ");
                return false;
            }
        }
        return true;
    }
    private void loadDanhSachHoKhau () {
        if (danhSachHoKhauCu.getRowCount()>0) danhSachHoKhauCu.setRowCount(0);
        for (int i = 0; i<hoKhauBeanList.size(); i++) {
            int idHoKhau = hoKhauBeanList.get(i).getHoKhau().getId();
            String maHoKhau = hoKhauBeanList.get(i).getHoKhau().getMaHoKhau();
            String chuHo = hoKhauBeanList.get(i).getChuHo().getHoTen();

            Object[] row = {idHoKhau, maHoKhau, chuHo};
            danhSachHoKhauCu.addRow(row);
        }
    }
    private void loadThanhVienHoKhauCu(int idHoKhau) {
        if (danhSachThanhVienHoKhauCu.getRowCount()>0) danhSachThanhVienHoKhauCu.setRowCount(0);
        for (int i = 0;i<hoKhauBeanList.size(); i++) {
            if (hoKhauBeanList.get(i).getHoKhau().getId() == idHoKhau) {
                for (int j = 0; j<hoKhauBeanList.get(i).getThanhVienCuaHo().size();j++) {
                    int idNhanKhau = hoKhauBeanList.get(i).getThanhVienCuaHo().get(j).getNhanKhau().getId();
                    String hoTen = hoKhauBeanList.get(i).getThanhVienCuaHo().get(j).getNhanKhau().getHoTen();
                    String quanHe = hoKhauBeanList.get(i).getThanhVienCuaHo().get(j).getHoKhauNhanKhau().getQuanHeVoiChuHo();

                    Object[] row = {idNhanKhau, hoTen, quanHe};
                    danhSachThanhVienHoKhauCu.addRow(row);
                }
                return;
            }
        }
    }
    private void loadThanhVienHoKhauMoi() {
        if (danhSachThanhVienhoKhauMoi.getRowCount()>0) danhSachThanhVienhoKhauMoi.setRowCount(0);
        for (int i = 0; i<nhanKhauSelectedList.size(); i++) {
            int id = nhanKhauSelectedList.get(i).getId();
            String hoTen = nhanKhauSelectedList.get(i).getHoTen();

            Object[] row = {id, hoTen};
            danhSachThanhVienhoKhauMoi.addRow(row);
        }
    }
    private void jTableHoKhauCuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHoKhauCuMouseClicked
        // TODO add your handling code here:
        int row = jTableHoKhauCu.getSelectedRow();
        if (row < 0) return;
        int idHoKhau = (int) danhSachHoKhauCu.getValueAt(row, 0);
        loadThanhVienHoKhauCu(idHoKhau);
        if (isDaCoChuHoMoi) return;
        if (evt.getClickCount()==2) {
            HoKhau hoKhau = null;
            NhanKhau chuHo = null;
            for (int i = 0; i<hoKhauBeanList.size(); i++) {
                if (hoKhauBeanList.get(i).getHoKhau().getId() == idHoKhau) {
                    hoKhau = hoKhauBeanList.get(i).getHoKhau();
                    chuHo = hoKhauBeanList.get(i).getChuHo();
                    break;
                }
            }

            jTextMaHoKhau.setText(hoKhau.getMaHoKhau());
            jTextIdChuHoMoi.setText(String.valueOf(chuHo.getId()));
            jTextTenChuHoMoi.setText(chuHo.getHoTen());
            jTextMaKhuVuc.setText(hoKhau.getMaKhuVuc());
            jTextDiaChi.setText(hoKhau.getDiaChi());

        }
    }//GEN-LAST:event_jTableHoKhauCuMouseClicked

    private void jTableThanhVienHoKhauCuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableThanhVienHoKhauCuMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableThanhVienHoKhauCuMouseClicked

    private void jButtonChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChuyenActionPerformed
        // TODO add your handling code here:
        int row = jTableThanhVienHoKhauCu.getSelectedRow();
        if (row<0) return;
        int idNhanKhau = (int) danhSachThanhVienHoKhauCu.getValueAt(row, 0);
        String[] options = {  "Hủy", "Chủ hộ", "Thành viên của hộ" };
        int choice = JOptionPane.showOptionDialog(null, "Chuyển thành:", "Hộp thoại lựa chọn",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 0) return;
        for (int i = 0; i<hoKhauBeanList.size(); i++) {
            for (int j = 0; j<hoKhauBeanList.get(i).getThanhVienCuaHo().size(); j++) {
                if (hoKhauBeanList.get(i).getThanhVienCuaHo().get(j).getNhanKhau().getId() == idNhanKhau) {
                    if (choice == 1) {
                        if (isDaCoChuHoMoi) {
                            JOptionPane.showMessageDialog(null, "Đã có chủ hộ mới. Hãy chuyển thành thành viên của hộ");
                            return;
                        }
                        isDaCoChuHoMoi = true;
                        jTextMaHoKhau.setText("");
                        jTextIdChuHoMoi.setText(String.valueOf(hoKhauBeanList.get(i).getThanhVienCuaHo().get(j).getNhanKhau().getId()));
                        jTextTenChuHoMoi.setText(hoKhauBeanList.get(i).getThanhVienCuaHo().get(j).getNhanKhau().getHoTen());
                        jTextMaKhuVuc.setText("");
                        jTextDiaChi.setText("");
                        hoKhauBeanList.get(i).getThanhVienCuaHo().remove(hoKhauBeanList.get(i).getThanhVienCuaHo().get(j));
                        loadThanhVienHoKhauCu(hoKhauBeanList.get(i).getHoKhau().getId());
                        return;
                    } else if (choice == 2) {
                        NhanKhau nhanKhau = new NhanKhau();
                        nhanKhau.setId(idNhanKhau);
                        nhanKhau.setHoTen(hoKhauBeanList.get(i).getThanhVienCuaHo().get(j).getNhanKhau().getHoTen());
                        nhanKhauSelectedList.add(nhanKhau);
                        hoKhauBeanList.get(i).getThanhVienCuaHo().remove(hoKhauBeanList.get(i).getThanhVienCuaHo().get(j));
                        loadThanhVienHoKhauCu(hoKhauBeanList.get(i).getHoKhau().getId());
                        loadThanhVienHoKhauMoi();
                        return;
                    }
                    return;
                }
            }
        }
    }//GEN-LAST:event_jButtonChuyenActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jTableThanhVienMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableThanhVienMoiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableThanhVienMoiMouseClicked

    private void jButtonThem1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonThem1ActionPerformed
        // TODO add your handling code here:
        if (!checkInput()) return;
        HoKhauBean hoKhauBean = new HoKhauBean();
        HoKhau hoKhau = new HoKhau();
        NhanKhau chuHo = new NhanKhau();

        hoKhau.setMaHoKhau(jTextMaHoKhau.getText());
        hoKhau.setIdChuHo(Integer.parseInt(jTextIdChuHoMoi.getText()));
        hoKhau.setMaKhuVuc(jTextMaKhuVuc.getText());
        hoKhau.setDiaChi(jTextDiaChi.getText());

        hoKhauBean.setHoKhau(hoKhau);

        chuHo.setId(Integer.parseInt(jTextIdChuHoMoi.getText()));
        chuHo.setHoTen(jTextTenChuHoMoi.getText());

        hoKhauBean.setChuHo(chuHo);

        List<ThanhVienCuaHoBean> thanhVienCuaHoBeanList = new ArrayList<>();
        System.out.println(jTableThanhVienMoi.getRowCount());
        for (int i = 0; i<jTableThanhVienMoi.getRowCount(); i++) {
            System.out.println("dong:"+i);
            ThanhVienCuaHoBean thanhVienCuaHoBean = new ThanhVienCuaHoBean();
            NhanKhau nhanKhau = new NhanKhau();
            HoKhauNhanKhau hoKhauNhanKhau = new HoKhauNhanKhau();

            nhanKhau.setId((Integer) danhSachThanhVienhoKhauMoi.getValueAt(i, 0));
            hoKhauNhanKhau.setQuanHeVoiChuHo((String) danhSachThanhVienhoKhauMoi.getValueAt(i, 2));

            thanhVienCuaHoBean.setNhanKhau(nhanKhau);
            thanhVienCuaHoBean.setHoKhauNhanKhau(hoKhauNhanKhau);

            thanhVienCuaHoBeanList.add(thanhVienCuaHoBean);

        }
//
        hoKhauBean.setThanhVienCuaHo(thanhVienCuaHoBeanList);

        TachHoKhauCtrl tachHoKhauCtrl = new TachHoKhauCtrl();
        if (tachHoKhauCtrl.tachHoKhau(hoKhauBean, isDaCoChuHoMoi)) {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            dispose();
        }
    }//GEN-LAST:event_jButtonThem1ActionPerformed

    private void jButtonThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThem2ActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(null, "Xác nhận Thoát?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButtonThem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TachHoKhauView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TachHoKhauView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TachHoKhauView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TachHoKhauView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TachHoKhauView().setVisible(true);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChuyen;
    private javax.swing.JButton jButtonThem1;
    private javax.swing.JButton jButtonThem2;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableHoKhauCu;
    private javax.swing.JTable jTableThanhVienHoKhauCu;
    private javax.swing.JTable jTableThanhVienMoi;
    private javax.swing.JTextField jTextDiaChi;
    private javax.swing.JTextField jTextIdChuHoMoi;
    private javax.swing.JTextField jTextMaHoKhau;
    private javax.swing.JTextField jTextMaKhuVuc;
    private javax.swing.JTextField jTextTenChuHoMoi;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel danhSachHoKhauCu;
    private DefaultTableModel danhSachThanhVienHoKhauCu;
    private DefaultTableModel danhSachThanhVienhoKhauMoi;
    private List<HoKhauBean> hoKhauBeanList;
    private NhanKhau chuHo;
    private List<NhanKhau> nhanKhauSelectedList;
    private List<ThanhVienCuaHoBean> thanhVienCuaHoBeanList;
    private boolean isDaCoChuHoMoi;

}
