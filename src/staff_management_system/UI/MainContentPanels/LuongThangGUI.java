/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package staff_management_system.UI.MainContentPanels;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import staff_management_system.BUS.LuongThangBUS;
import static staff_management_system.BUS.LuongThangBUS.dslt;
import staff_management_system.BUS.NguoiThanBUS;
import static staff_management_system.BUS.NguoiThanBUS.dsnt;
import staff_management_system.BUS.NhanVienBUS;
import static staff_management_system.BUS.NhanVienBUS.dsnv;
import staff_management_system.BUS.PhuCapBUS;
import static staff_management_system.BUS.PhuCapBUS.dspc;
import staff_management_system.BUS.TienThuongBUS;
import static staff_management_system.BUS.TienThuongBUS.dstt;
import staff_management_system.DTO.LuongThang;
import staff_management_system.DTO.NguoiThan;
import staff_management_system.DTO.NhanVien;
import staff_management_system.DTO.TienThuongDTO;
import staff_management_system.DTO.TimKiemLuong;

/**
 *
 * @author ngahz
 */
public class LuongThangGUI extends javax.swing.JPanel {
    LuongThangBUS bus = new LuongThangBUS();
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form LuongThangGUI
     */
    public LuongThangGUI() {
        initComponents();
        jPanel4.setVisible(false);
        jPanel7.setVisible(false);
        jPanel9.setVisible(false);
        jPanel8.setVisible(false);
        jPanel12.setVisible(false);
        jPanel13.setVisible(false);
        if (dslt == null) {
            bus.docDSLT();
        }
        if(dspc == null){
            PhuCapBUS buspc = new PhuCapBUS();
            buspc.getBangChamCongs(0, "");
        }
        System.out.println(dslt.size());
        ganDS(dslt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btTimKiem = new javax.swing.JButton();
        txMaNV = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        txTienTC = new javax.swing.JTextField();
        txTienTru = new javax.swing.JTextField();
        txLuongHH = new javax.swing.JTextField();
        txTongLuong = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        txMaTL = new javax.swing.JTextField();
        txThangNam = new javax.swing.JTextField();
        txTienThuong = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btMoi = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbTimKiem = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jLabel3.setText("mã phụ cấp");

        btTimKiem.setText("...");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        txMaNV.setEditable(false);
        txMaNV.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Mã NV ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jCheckBox1.setText("PC01");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("PC02");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("PC03");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        txTienTC.setEditable(false);
        txTienTC.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tiền tăng ca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txTienTru.setEditable(false);
        txTienTru.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Lương trừ ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txLuongHH.setEditable(false);
        txLuongHH.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Lương hiện hành ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txTongLuong.setEditable(false);
        txTongLuong.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tổng lương ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jCheckBox4.setText("PC04");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        txMaTL.setEditable(false);
        txMaTL.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Mã thưởng lễ ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txThangNam.setEditable(false);
        txThangNam.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tháng năm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txTienThuong.setEditable(false);
        txTienThuong.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tiền thưởng lễ ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txTongLuong)
                    .addComponent(txTienTC, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txMaTL, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txThangNam, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txMaNV, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txTienTru, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(txLuongHH)
                                    .addComponent(txTienThuong))
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txMaTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txThangNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txLuongHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTienTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTienTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btMoi.setText("Mới");
        btMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoiActionPerformed(evt);
            }
        });

        jButton7.setText("Thống Kê");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tìm kiếm theo");

        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lựa chọn", "mã nhân viên", "tháng năm", "tổng lương" }));
        cbTimKiem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTimKiemItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton2)
                .addGap(222, 222, 222))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("hoặc");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Từ");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("đến ");

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("ok");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(100, 100, 100))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2020", "2021", "2022" }));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2020", "2021", "2022" }));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("ok");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Từ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("đến ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(100, 100, 100))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2020", "2021", "2022" }));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("ok");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ganDS(ArrayList<LuongThang> ds) {
        Vector header = new Vector();
        header.add("Mã nhân viên");
        header.add("Tháng năm");
        header.add("Mã phụ cấp");
        header.add("Mã thưởng");
        header.add("Tiền tăng ca");
        header.add("Lương bị trừ");
        header.add("Lương hiện hành");
        header.add("Tổng lương");
        model = new DefaultTableModel(header, 0);
        Vector row;
        for (LuongThang lt : ds) {
            row = new Vector();
            row.add(lt.getMaNV());
            row.add(lt.getThangNam());
            row.add(lt.getMaPC());
            row.add(lt.getMaThuong());
            row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTienTangCa())));
            row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongBiTru())));
            row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongHienHanh())));
            row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTongLuong())));
            model.addRow(row);
        }
        jTable3.setModel(model);
    }
    
    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        TimKiemLuongGUI a = new TimKiemLuongGUI(this);
        a.setVisible(true);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        txTongLuong.setText("");
        txMaTL.setText("");
        txTienThuong.setText("");
        txTienTC.setText("");
        txTienTru.setText("");
        a.setVisible(true);
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void TinhLuong(){
        int luong = 0;
        if("".equals(txLuongHH.getText()))
            return;
        luong += Integer.parseInt(txLuongHH.getText().replaceAll("\\.", ""));
        luong += Integer.parseInt(txTienTC.getText().replaceAll("\\.", ""));
        luong -= Integer.parseInt(txTienTru.getText().replaceAll("\\.", ""));
        luong += Integer.parseInt(txTienThuong.getText().replaceAll("\\.", ""));
        if(jCheckBox1.isSelected())
            luong += Integer.parseInt(dspc.get(0).getSoTien());
        if(jCheckBox2.isSelected())
            luong += Integer.parseInt(dspc.get(1).getSoTien());
        if(jCheckBox3.isSelected())
            luong += Integer.parseInt(dspc.get(2).getSoTien());
        if(jCheckBox4.isSelected())
            luong += Integer.parseInt(dspc.get(3).getSoTien());
        txTongLuong.setText(String.format(Locale.GERMAN, "%,d", luong));
    }
    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        TinhLuong();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        TinhLuong();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        TinhLuong();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        TinhLuong();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        LuongThang lt = new LuongThang();

        if (!bus.checkPK(txMaNV.getText(), txThangNam.getText())) {
            JOptionPane.showMessageDialog(null, "Thông tin bị trùng");
            return;
        }

        String mapc="";
        if(jCheckBox1.isSelected())
            mapc+=jCheckBox1.getText()+" ";
        if(jCheckBox2.isSelected())
            mapc+=jCheckBox2.getText()+" ";
        if(jCheckBox3.isSelected())
            mapc+=jCheckBox3.getText()+" ";
        if(jCheckBox4.isSelected())
            mapc+=jCheckBox4.getText()+" ";
        lt.setMaNV(txMaNV.getText());
        lt.setThangNam(txThangNam.getText());

        if(txMaTL.getText().equals("0"))
            lt.setMaThuong("");
        else
            lt.setMaThuong(txMaTL.getText());

        if(txTienTru.getText().equals("0"))
            lt.setLuongBiTru("");
        else
            lt.setLuongBiTru(txTienTru.getText().replaceAll("\\.", ""));

        lt.setLuongHienHanh(txLuongHH.getText().replaceAll("\\.", ""));

        if(txTienTC.getText().equals("0"))
            lt.setTienTangCa("");
        else
            lt.setTienTangCa(txTienTC.getText().replaceAll("\\.", ""));

        lt.setTongLuong(txTongLuong.getText().replaceAll("\\.", ""));

        if(mapc.equals(""))
            lt.setMaPC("");
        else
            lt.setMaPC(mapc.trim().replaceAll(" ", ", "));
        bus.themLT(lt);

        Vector row = new Vector();
        row.add(lt.getMaNV());
        row.add(lt.getThangNam());
        row.add(lt.getMaPC());
        row.add(lt.getMaThuong());
        row.add(lt.getTienTangCa());
        row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongBiTru())));
        row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongHienHanh())));
        row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTongLuong())));
        model.addRow(row);
        jTable3.setModel(model);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Xác nhận sửa ", "", JOptionPane.YES_NO_OPTION);
        if (i == 1) {
            return;
        }
        i = jTable3.getSelectedRow();

        if (i >= 0) {
            LuongThang lt = new LuongThang();
            String mapc="";
            if(jCheckBox1.isSelected())
                mapc+=jCheckBox1.getText()+" ";
            if(jCheckBox2.isSelected())
                mapc+=jCheckBox2.getText()+" ";
            if(jCheckBox3.isSelected())
                mapc+=jCheckBox3.getText()+" ";
            if(jCheckBox4.isSelected())
                mapc+=jCheckBox4.getText()+" ";
            lt.setMaNV(txMaNV.getText());
            lt.setThangNam(txThangNam.getText());

            if(txMaTL.getText().equals("0"))
                lt.setMaThuong("");
            else
                lt.setMaThuong(txMaTL.getText());

            if(txTienTru.getText().equals("0"))
                lt.setLuongBiTru("");
            else
                lt.setLuongBiTru(txTienTru.getText().replaceAll("\\.", ""));

            lt.setLuongHienHanh(txLuongHH.getText().replaceAll("\\.", ""));
            if(txTienTC.getText().equals("0"))
                lt.setTienTangCa("");
            else
                lt.setTienTangCa(txTienTC.getText().replaceAll("\\.", ""));

            lt.setTongLuong(txTongLuong.getText().replaceAll("\\.", ""));

            if(mapc.equals(""))
                lt.setMaPC("");
            else
                lt.setMaPC(mapc.trim().replaceAll(" ", ", "));
            bus.suaLT(lt);

            model.setValueAt(lt.getMaNV(), i, 0);
            model.setValueAt(lt.getThangNam(), i, 1);
            model.setValueAt(lt.getMaPC(), i, 2);
            model.setValueAt(lt.getMaThuong(), i, 3);
            model.setValueAt(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTienTangCa())), i, 4);
            model.setValueAt(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongBiTru())), i, 5);
            model.setValueAt(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongHienHanh())), i, 6);
            model.setValueAt(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTongLuong())), i, 7);
            jTable3.setModel(model);
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Xác nhận xóa ", "", JOptionPane.YES_NO_OPTION);
        if (i == 1) {
            return;
        }
        i = jTable3.getSelectedRow();
        if (i >= 0) {
            bus.xoaLT(i);
            model.removeRow(i);
            jTable3.setModel(model);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoiActionPerformed
        jTable3.clearSelection();
        txMaNV.setText("");
        txLuongHH.setText("");
        txMaTL.setText("");
        txThangNam.setText("");
        txTienTC.setText("");
        txTienThuong.setText("");
        txTienTru.setText("");
        txTongLuong.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        cbTimKiem.setSelectedIndex(0);
        jPanel4.setVisible(false);
        jPanel9.setVisible(false);
        jPanel7.setVisible(false);
        jPanel12.setVisible(false);
        jPanel8.setVisible(false);
        jPanel11.setVisible(true);
        jPanel13.setVisible(false);
        ganDS(dslt);
    }//GEN-LAST:event_btMoiActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jPanel11.setVisible(false);
        jPanel13.setVisible(true);
        if(dsnv == null){
            NhanVienBUS busnv = new NhanVienBUS();
            try {
                busnv.getNhanViens();
            } catch (Exception ex) {
                Logger.getLogger(LuongThangGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Vector header = new Vector();
        header.add("");
        header.add("1");
        header.add("2");
        header.add("3");
        header.add("4");
        header.add("5");
        header.add("6");
        header.add("7");
        header.add("8");
        header.add("9");
        header.add("10");
        header.add("11");
        header.add("12");
        header.add("Tổng cộng");
        model = new DefaultTableModel(header, 0);
        Vector row = null;
        int rowLuong[]={0,0,0,0,0,0,0,0,0,0,0,0};
        String s[];
        int luong = 0;
        for(NhanVien nv:dsnv){
            row = new Vector();
            row.add(nv.getMaNV());
            luong = 0;
            for(int i=1;i<13;i++){
                for (LuongThang lt : dslt) {
                    s=lt.getThangNam().split("-");
                    if(lt.getMaNV().equals(nv.getMaNV())&&s[0].equals(i+"")&&s[1].equals("2020")){
                        row.add(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTongLuong())));
                        luong+=Integer.parseInt(lt.getTongLuong());
                        rowLuong[i-1]+=Integer.parseInt(lt.getTongLuong());
                        break;
                    }
                }
            }
            row.add(String.format(Locale.GERMAN, "%,d", luong));
            model.addRow(row);
        }
        row = new Vector();
        row.add("Tổng cộng");
        for(int a:rowLuong){
            luong+=a;
            row.add(String.format(Locale.GERMAN, "%,d", a));
        }
        row.add(String.format(Locale.GERMAN, "%,d", luong));
        model.addRow(row);
        jTable2.setModel(model);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cbTimKiemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTimKiemItemStateChanged
        int n = cbTimKiem.getSelectedIndex();
        switch (n){
            case 1 :
                jPanel4.setVisible(true);
                jPanel9.setVisible(false);
                jPanel7.setVisible(false);
                jPanel12.setVisible(false);
                jPanel8.setVisible(false);
                jTextField1.setText("");
                break;

            case 2 :
                jPanel4.setVisible(false);
                jPanel9.setVisible(true);
                jPanel7.setVisible(true);
                jPanel12.setVisible(true);
                jPanel8.setVisible(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField8.setText("");
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jComboBox3.setSelectedIndex(0);
                jComboBox4.setSelectedIndex(0);
                jComboBox5.setSelectedIndex(0);
                jComboBox6.setSelectedIndex(0);
                break;

            case 3 :
                jPanel4.setVisible(true);
                jPanel9.setVisible(false);
                jPanel7.setVisible(true);
                jPanel12.setVisible(false);
                jPanel8.setVisible(true);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField8.setText("");
                break;

            default :
                break;
        }
    }//GEN-LAST:event_cbTimKiemItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n=cbTimKiem.getSelectedIndex();
        ArrayList<LuongThang> kq;
        switch (n){
            case 1 :
            String temp = jTextField1.getText();
            kq=bus.timKiem1(1,temp);
            if(kq.isEmpty())
                JOptionPane.showMessageDialog(null, "Không có mã nhân viên như vậy");
            ganDS(kq);
            break;

            case 3 :
            temp = jTextField1.getText();
            kq=bus.timKiem1(3,temp);
            if(kq.isEmpty())
                JOptionPane.showMessageDialog(null, "Không có tổng lương như vậy");
            ganDS(kq);
            break;

            default :
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            ArrayList<LuongThang> kq;
            String temp1 = jTextField2.getText();
            String temp2 = jTextField8.getText();
            kq=bus.timKiem2(2,temp1,temp2);
            if(kq.isEmpty())
                JOptionPane.showMessageDialog(null, "Không có người có tổng lương trong khoảng đó");
            ganDS(kq);
        } catch (ParseException ex) {
            Logger.getLogger(TongKetTangCaThangGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jComboBox3.getSelectedIndex()==0||jComboBox4.getSelectedIndex()==0||jComboBox5.getSelectedIndex()==0||jComboBox6.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "chưa điền đủ thông tin");
            return;
        }
        try {
            ArrayList<LuongThang> kq;
            String temp1 = jComboBox3.getSelectedItem()+"-"+jComboBox4.getSelectedItem();
            String temp2 = jComboBox5.getSelectedItem()+"-"+jComboBox6.getSelectedItem();
            kq=bus.timKiem2(1,temp1,temp2);
            if(kq.isEmpty())
                JOptionPane.showMessageDialog(null, "Không có người tăng ca trong khoảng đó");
            ganDS(kq);
        } catch (ParseException ex) {
            Logger.getLogger(LuongThangGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jComboBox1.getSelectedIndex()==0||jComboBox2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "chưa điền đủ thông tin");
            return;
        }
        ArrayList<LuongThang> kq;
        String temp = jComboBox1.getSelectedItem()+"-"+jComboBox2.getSelectedItem();
        kq=bus.timKiem1(2,temp);
        if(kq.isEmpty())
            JOptionPane.showMessageDialog(null, "Không có ai tăng ca trong ngày đó");
        ganDS(kq);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int i = jTable3.getSelectedRow();
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        String mapc[];
        LuongThang lt;
        if (i >= 0) {
            lt = dslt.get(i);
            mapc=lt.getMaPC().split(", ");
            txMaNV.setText(lt.getMaNV());
            txThangNam.setText(lt.getThangNam());
            if("".equals(lt.getMaThuong()))
                txMaTL.setText("0");
            else
                txMaTL.setText(lt.getMaThuong());
            if(mapc != null)
                for(String pc : mapc){
                    if(pc.equals(jCheckBox1.getText()))
                        jCheckBox1.setSelected(true);
                    else if(pc.equals(jCheckBox2.getText()))
                        jCheckBox2.setSelected(true);
                    else if(pc.equals(jCheckBox3.getText()))
                        jCheckBox3.setSelected(true);
                    else if(pc.equals(jCheckBox4.getText()))
                        jCheckBox4.setSelected(true);
                }
            if("".equals(lt.getTienTangCa()))
                txTienTC.setText("0");
            else
                txTienTC.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTienTangCa())));
            if("".equals(lt.getLuongBiTru()))
                txTienTru.setText("0");
            else
                txTienTru.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongBiTru())));
            txLuongHH.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getLuongHienHanh())));
            txTongLuong.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(lt.getTongLuong())));
            String s[]=lt.getThangNam().split("-");
            if(txMaTL.getText().equals("0")){
                txTienThuong.setText("0");
            }
            else{
                if (dstt == null) {
                    try {
                        TienThuongBUS bustt = new TienThuongBUS();
                        bustt.getTienThuongs();
                    } catch (Exception ex) {
                        Logger.getLogger(LuongThangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (dsnt == null) {
                    NguoiThanBUS busnt = new NguoiThanBUS();
                    busnt.docDSNT();
                }
                for(TienThuongDTO tl:dstt)
                if((tl.getThang()+"").equals(s[0])){
                    txMaTL.setText(tl.getMaTienThuong());
                    int sum =0;
                    if("6".equals(s[0])){
                        for(NguoiThan nt: dsnt)
                            if(nt.getMaNV().equals(lt.getMaNV())&&Integer.parseInt(nt.getNamSinh())>2004&&nt.getMoiQuanHe().equals("Con"))
                                sum++;
                            txTienThuong.setText(String.format(Locale.GERMAN, "%,d", sum*tl.getTienThuong()));
                    }
                    else
                        txTienThuong.setText(String.format(Locale.GERMAN, "%,d", tl.getTienThuong()));
                    break;
                }
            }
        }
    }//GEN-LAST:event_jTable3MouseClicked

public void updateThongTin(TimKiemLuong temp) throws Exception {
        txMaNV.setText(temp.getMaNV());
        if("".equals(temp.getSoTienDuocHuong()))
                txTienTC.setText("0");
            else
                txTienTC.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(temp.getSoTienDuocHuong())));
            if("".equals(temp.getLuongBiTru()))
                txTienTru.setText("0");
            else
                txTienTru.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(temp.getLuongBiTru())));
        txLuongHH.setText(String.format(Locale.GERMAN, "%,d", Integer.parseInt(temp.getLuongHienHanh())));
        txThangNam.setText(temp.getThangNam());
        String s[]=temp.getThangNam().split("-");
        if (dstt == null) {
            TienThuongBUS bustl = new TienThuongBUS();
            bustl.getTienThuongs();
        }
        if (dsnt == null) {
            NguoiThanBUS busnt = new NguoiThanBUS();
            busnt.docDSNT();
        }
        for(TienThuongDTO tl:dstt)
            if((tl.getThang()+"").equals(s[0])){
                txMaTL.setText(tl.getMaTienThuong());
                int sum =0;
                if("6".equals(s[0])){
                        for(NguoiThan nt: dsnt)
                            if(nt.getMaNV().equals(temp.getMaNV())&&Integer.parseInt(nt.getNamSinh())>2004&&nt.getMoiQuanHe().equals("Con"))
                                sum++;
                        txTienThuong.setText(String.format(Locale.GERMAN, "%,d", sum*tl.getTienThuong()));
                }
                else
                    txTienThuong.setText(String.format(Locale.GERMAN, "%,d", tl.getTienThuong()));
                break;
            }
        if(txMaTL.getText().equals("")){
            txTienThuong.setText("0");
            txMaTL.setText("0");
        }
        TinhLuong();
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMoi;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txLuongHH;
    private javax.swing.JTextField txMaNV;
    private javax.swing.JTextField txMaTL;
    private javax.swing.JTextField txThangNam;
    private javax.swing.JTextField txTienTC;
    private javax.swing.JTextField txTienThuong;
    private javax.swing.JTextField txTienTru;
    private javax.swing.JTextField txTongLuong;
    // End of variables declaration//GEN-END:variables
}

        
