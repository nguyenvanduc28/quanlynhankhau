/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom71_quanlyhokhau.UI.HoKhauView;

import com.nhom71_quanlyhokhau.Bean.QuanLyHoKhauBean.HoKhauBean;
import com.nhom71_quanlyhokhau.Bean.QuanLyHoKhauBean.ThanhVienCuaHoBean;
import com.nhom71_quanlyhokhau.controllers.QuanLyNkHkCtrl.QuanLyHoKhauCtrl.ThemHoKhauCtrl;
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
public class ThemHoKhauView extends javax.swing.JFrame {

    /**
     * Creates new form ThemHoKhauView
     */
    public ThemHoKhauView() {
        nhanKhauSelectedList = new ArrayList<>();
        chuHo = new NhanKhau();
        hoKhauBean = new HoKhauBean();
        initComponents();
        setLocationRelativeTo(null);
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
        jTextMaHoKhau = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextIdChuHo = new javax.swing.JTextField();
        jButtonChon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextTenChuHo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextMaKhuVuc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDiaChi = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonThem = new javax.swing.JButton();
        jButtonThem1 = new javax.swing.JButton();
        jButtonThem2 = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Mã Hộ Khẩu:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("ID Chủ hộ:");

        jTextIdChuHo.setEditable(false);
        jTextIdChuHo.setBackground(new java.awt.Color(255, 255, 255));

        jButtonChon.setBackground(new java.awt.Color(255, 255, 153));
        jButtonChon.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonChon.setText("Chọn...");
        jButtonChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonChonActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Tên chủ hộ:");

        jTextTenChuHo.setEditable(false);
        jTextTenChuHo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Mã Khu Vực:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("Thành viên của hộ:");

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh", "Quan hệ với chủ hộ"
            }
        ));
        danhSachThanhVienCuaHo = (DefaultTableModel) jTable1.getModel();
        TableCellEditor nonEditableCellEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachThanhVienCuaHo.getColumnCount()-1; column++) {
            TableColumn tableColumn = jTable1.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor);
        }
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonThem.setBackground(new java.awt.Color(255, 255, 153));
        jButtonThem.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonThem.setText("Thêm");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonThemActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButtonThem1.setBackground(new java.awt.Color(255, 255, 153));
        jButtonThem1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonThem1.setText("Lưu");
        jButtonThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonLuuActionPerformed(evt);
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
                jButtonHuyActionPerformed(evt);
            }
        });

        jButtonXoa.setBackground(new java.awt.Color(255, 255, 153));
        jButtonXoa.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonThem2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonThem1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonChon)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextIdChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextMaHoKhau)
                                .addComponent(jTextTenChuHo)
                                .addComponent(jTextMaKhuVuc)
                                .addComponent(jTextDiaChi)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonThem)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonXoa))
                        .addComponent(jScrollPane1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMaHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static NhanKhau getChuHo() {
        return chuHo;
    }
    public static void setChuHo(NhanKhau nhanKhau) {
        chuHo = nhanKhau;
    }
    public static void changeChuHo(NhanKhau nhanKhau) {
        setChuHo(nhanKhau);
        jTextIdChuHo.setText(String.valueOf(chuHo.getId()));
        jTextTenChuHo.setText(chuHo.getHoTen());
        
    }
    public static void addNhanKhau(NhanKhau nhanKhau) {
        for (int i = 0; i<nhanKhauSelectedList.size(); i++) {
            if (nhanKhauSelectedList.get(i).getId() == nhanKhau.getId()) return;
        }
        nhanKhauSelectedList.add(nhanKhau);
    }
    public static void loadTable() {
        if (danhSachThanhVienCuaHo.getRowCount()>0) danhSachThanhVienCuaHo.setRowCount(0);
        for (int i = 0; i<nhanKhauSelectedList.size(); i++) {
            int ID = nhanKhauSelectedList.get(i).getId();
            String hoTen = nhanKhauSelectedList.get(i).getHoTen();
            String gioiTinh = nhanKhauSelectedList.get(i).getGioiTinh();
            String ngaySinh = nhanKhauSelectedList.get(i).getNgaySinh();

            Object[] row = {ID, hoTen, gioiTinh, ngaySinh};
            danhSachThanhVienCuaHo.addRow(row);
        }
    }
    private void jButtonChonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonChonActionPerformed
        // TODO add your handling code here:

        DanhSachThanhVienTable danhSachThanhVienTable = new DanhSachThanhVienTable("Chọn");
        danhSachThanhVienTable.setVisible(true);
    }//GEN-LAST:event_jButtonChonActionPerformed

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonThemActionPerformed
        // TODO add your handling code here:
        if (jTextIdChuHo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hãy chọn chủ hộ");
            return;
        }
        DanhSachThanhVienTable danhSachThanhVienTable = new DanhSachThanhVienTable("Thêm");
        danhSachThanhVienTable.setVisible(true);
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonLuuActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonLuuActionPerformed
        // TODO add your handling code here:
        if (!checkInput()) return;
        HoKhau hoKhau = new HoKhau();

        hoKhau.setMaHoKhau(jTextMaHoKhau.getText());
        hoKhau.setIdChuHo(chuHo.getId());
        hoKhau.setMaKhuVuc(jTextMaKhuVuc.getText());
        hoKhau.setDiaChi(jTextDiaChi.getText());

        hoKhauBean.setHoKhau(hoKhau);
        hoKhauBean.setChuHo(chuHo);

        List<ThanhVienCuaHoBean> thanhVienCuaHoBeanList = new ArrayList<>();
        for (int i = 0; i<jTable1.getRowCount(); i++) {
            ThanhVienCuaHoBean thanhVienCuaHoBean = new ThanhVienCuaHoBean();
            NhanKhau nhanKhau = new NhanKhau();
            HoKhauNhanKhau hoKhauNhanKhau = new HoKhauNhanKhau();

            nhanKhau.setId((Integer) danhSachThanhVienCuaHo.getValueAt(i, 0));
            hoKhauNhanKhau.setQuanHeVoiChuHo((String) danhSachThanhVienCuaHo.getValueAt(i, 4));

            thanhVienCuaHoBean.setNhanKhau(nhanKhau);
            thanhVienCuaHoBean.setHoKhauNhanKhau(hoKhauNhanKhau);

            thanhVienCuaHoBeanList.add(thanhVienCuaHoBean);
        }

        hoKhauBean.setThanhVienCuaHo(thanhVienCuaHoBeanList);
        ThemHoKhauCtrl themHoKhauCtrl = new ThemHoKhauCtrl();
        if (themHoKhauCtrl.addNewHoKhau(hoKhauBean)) {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            dispose();
        }
    }//GEN-LAST:event_jButtonLuuActionPerformed
    private boolean checkInput() {
        if (    jTextMaHoKhau.getText().isEmpty()
            ||  jTextIdChuHo.getText().isEmpty()
            ||  jTextTenChuHo.getText().isEmpty()
            ||  jTextMaKhuVuc.getText().isEmpty()
            ||  jTextDiaChi.getText().isEmpty()
        ) {
            JOptionPane.showMessageDialog(null, "Hãy nhập đủ thông tin");
            return false;
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String quanhe = (String) danhSachThanhVienCuaHo.getValueAt(i, 4);
            if (quanhe == null) {
                JOptionPane.showMessageDialog(null, "Hãy nhập Quan hệ với chủ hộ");
                return false;
            }
        }
        return true;
    }
    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(null, "Xác nhận Thoát?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButtonHuyActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0) return;

        int idNhanKhauSelected = (int) danhSachThanhVienCuaHo.getValueAt(row, 0);
        for (int i = 0; i< nhanKhauSelectedList.size(); i++) {
            if (nhanKhauSelectedList.get(i).getId() == idNhanKhauSelected) {
                nhanKhauSelectedList.remove(nhanKhauSelectedList.get(i));
            }
        }

        loadTable();
    }//GEN-LAST:event_jButtonXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChon;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonThem1;
    private javax.swing.JButton jButtonThem2;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextMaHoKhau;
    private static javax.swing.JTextField jTextIdChuHo;
    private static javax.swing.JTextField jTextTenChuHo;
    private javax.swing.JTextField jTextMaKhuVuc;
    private javax.swing.JTextField jTextDiaChi;
    // End of variables declaration//GEN-END:variables
    private static List<NhanKhau> nhanKhauSelectedList;
    private static DefaultTableModel danhSachThanhVienCuaHo;
    private static NhanKhau chuHo;
    private HoKhauBean hoKhauBean;

}
