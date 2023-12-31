/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom71_quanlyhokhau.UI.HoKhauView;

import com.nhom71_quanlyhokhau.Bean.QuanLyHoKhauBean.HoKhauBean;
import com.nhom71_quanlyhokhau.Bean.QuanLyHoKhauBean.ThanhVienCuaHoBean;
import com.nhom71_quanlyhokhau.controllers.QuanLyNkHkCtrl.QuanLyHoKhauCtrl.HoKhauCtrl;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author nguyenduc
 */
public class ThongTinChiTietHoKhau extends javax.swing.JFrame {

    /**
     * Creates new form ThongTinChiTietHoKhau
     */
    public ThongTinChiTietHoKhau() {
        initComponents();
    }
    public ThongTinChiTietHoKhau(int idHoKhau) throws SQLException, ClassNotFoundException {
        this.idHoKhau = idHoKhau;
        initComponents();
        setLocationRelativeTo(null);
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
        jLabelMaHoKhau = new javax.swing.JLabel();
        jLabelMaKhuVuc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelDiaChi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelIdChuHo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelTenChuHo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelNgaySinh = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelGioiTinh = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableThanhVienCuaHo = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelMaHoKhau.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabelMaKhuVuc.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Mã khu vực:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabelDiaChi.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setText("ID Chủ hộ:");

        jLabelIdChuHo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setText("Tên chủ hộ:");

        jLabelTenChuHo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel11.setText("Ngày sinh:");

        jLabelNgaySinh.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel13.setText("Giới tính:");

        jLabelGioiTinh.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel29.setText("Thành viên của hộ:");

        jTableThanhVienCuaHo.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTableThanhVienCuaHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Giới tính", "Ngày sinh", "Quan hệ với chủ hộ"
            }
        ));
        danhSachThanhVienCuaHo = (DefaultTableModel) jTableThanhVienCuaHo.getModel();
        jTableThanhVienCuaHo.setEnabled(false);
        jTableThanhVienCuaHo.setGridColor(new java.awt.Color(255, 255, 255));
        jTableThanhVienCuaHo.setRowHeight(30);
        jTableThanhVienCuaHo.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTableThanhVienCuaHo);

        jLabel30.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel30.setText("Mã Hộ khẩu:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelMaHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelTenChuHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIdChuHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(43, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabelGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMaHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabelIdChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabelTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabelNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addGap(64, 64, 64)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData() throws SQLException, ClassNotFoundException {
        HoKhauCtrl hoKhauCtrl = new HoKhauCtrl();

        hoKhauBean = hoKhauCtrl.getChiTietHoKhau(idHoKhau);

        jLabelMaHoKhau.setText(hoKhauBean.getHoKhau().getMaHoKhau());
        jLabelMaKhuVuc.setText(hoKhauBean.getHoKhau().getMaKhuVuc());
        jLabelDiaChi.setText(hoKhauBean.getHoKhau().getDiaChi());
        jLabelIdChuHo.setText(String.valueOf(hoKhauBean.getHoKhau().getIdChuHo()));
        jLabelTenChuHo.setText(hoKhauBean.getChuHo().getHoTen());
        jLabelNgaySinh.setText(hoKhauBean.getChuHo().getNgaySinh());
        jLabelGioiTinh.setText(hoKhauBean.getChuHo().getGioiTinh());

        List<ThanhVienCuaHoBean> thanhVienCuaHoBeanList = hoKhauBean.getThanhVienCuaHo();
        for (int i = 0; i<thanhVienCuaHoBeanList.size(); i++) {
            String hoTen = thanhVienCuaHoBeanList.get(i).getNhanKhau().getHoTen();
            String gioiTinh = thanhVienCuaHoBeanList.get(i).getNhanKhau().getGioiTinh();
            String ngaySinh = thanhVienCuaHoBeanList.get(i).getNhanKhau().getNgaySinh();
            String quanHeChuHo = thanhVienCuaHoBeanList.get(i).getHoKhauNhanKhau().getQuanHeVoiChuHo();

            Object[] row = {hoTen, gioiTinh, ngaySinh, quanHeChuHo};
            danhSachThanhVienCuaHo.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDiaChi;
    private javax.swing.JLabel jLabelGioiTinh;
    private javax.swing.JLabel jLabelIdChuHo;
    private javax.swing.JLabel jLabelMaHoKhau;
    private javax.swing.JLabel jLabelMaKhuVuc;
    private javax.swing.JLabel jLabelNgaySinh;
    private javax.swing.JLabel jLabelTenChuHo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableThanhVienCuaHo;
    // End of variables declaration//GEN-END:variables
    private HoKhauBean hoKhauBean;
    private DefaultTableModel danhSachThanhVienCuaHo;
    private int idHoKhau;

}
