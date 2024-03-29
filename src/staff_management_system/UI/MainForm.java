/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package staff_management_system.UI;

import java.util.ArrayList;

/**
 *
 * @author Utech
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setTitle("QUẢN LÝ NHÂN SỰ");
        
        ChangeController controller = new ChangeController(pnView);
        controller.setView(pnNhanVien, lbNhanVien);
        
        ArrayList<DanhMuc> listItem = new ArrayList<>();
        listItem.add(new DanhMuc("nhanvien", pnNhanVien, lbNhanVien));
        listItem.add(new DanhMuc("phongban", pnPhongBan, lbPhongBan));
        listItem.add(new DanhMuc("congviec", pnCongViec, lbCongViec));
        listItem.add(new DanhMuc("nguoithan", pnNguoiThan, lbNguoiThan));
        listItem.add(new DanhMuc("bangchamcong", pnChamCong, lbChamCong));
        listItem.add(new DanhMuc("tongketchamcong", pnTKChamCong, lbTKChamCong));
        listItem.add(new DanhMuc("tangca", pnTangCa, lbTangCa));
        listItem.add(new DanhMuc("tongkettangca", pnTKTangCa, lbTKTangCa));
        listItem.add(new DanhMuc("tienthuong", pnTienThuong, lbTienThuong));
        listItem.add(new DanhMuc("phucap", pnPhuCap, lbPhuCap));
        listItem.add(new DanhMuc("bangluongthang", pnBangLuong, lbBangLuong));
        listItem.add(new DanhMuc("theodoitangluong", pnTheoDoTangLuong, lbTheoDoiTangLuong));
        
        controller.setEvent(listItem);
        
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnPhongBan = new javax.swing.JPanel();
        lbPhongBan = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        lbNhanVien = new javax.swing.JLabel();
        pnCongViec = new javax.swing.JPanel();
        lbCongViec = new javax.swing.JLabel();
        pnTKChamCong = new javax.swing.JPanel();
        lbTKChamCong = new javax.swing.JLabel();
        pnTKTangCa = new javax.swing.JPanel();
        lbTKTangCa = new javax.swing.JLabel();
        pnTangCa = new javax.swing.JPanel();
        lbTangCa = new javax.swing.JLabel();
        pnTienThuong = new javax.swing.JPanel();
        lbTienThuong = new javax.swing.JLabel();
        pnPhuCap = new javax.swing.JPanel();
        lbPhuCap = new javax.swing.JLabel();
        pnBangLuong = new javax.swing.JPanel();
        lbBangLuong = new javax.swing.JLabel();
        pnTheoDoTangLuong = new javax.swing.JPanel();
        lbTheoDoiTangLuong = new javax.swing.JLabel();
        pnNguoiThan = new javax.swing.JPanel();
        lbNguoiThan = new javax.swing.JLabel();
        pnChamCong = new javax.swing.JPanel();
        lbChamCong = new javax.swing.JLabel();
        pnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMenu.setBackground(new java.awt.Color(240, 254, 240));

        jPanel3.setBackground(new java.awt.Color(171, 237, 155));

        jLabel1.setBackground(new java.awt.Color(102, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 75, 62));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN SỰ");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnPhongBan.setBackground(new java.awt.Color(171, 235, 198));

        lbPhongBan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbPhongBan.setForeground(new java.awt.Color(101, 122, 47));
        lbPhongBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPhongBan.setText("PHÒNG BAN");

        javax.swing.GroupLayout pnPhongBanLayout = new javax.swing.GroupLayout(pnPhongBan);
        pnPhongBan.setLayout(pnPhongBanLayout);
        pnPhongBanLayout.setHorizontalGroup(
            pnPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhongBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPhongBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnPhongBanLayout.setVerticalGroup(
            pnPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhongBanLayout.createSequentialGroup()
                .addComponent(lbPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnNhanVien.setBackground(new java.awt.Color(171, 235, 198));

        lbNhanVien.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbNhanVien.setForeground(new java.awt.Color(101, 122, 47));
        lbNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNhanVien.setText("NHÂN VIÊN");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addComponent(lbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnCongViec.setBackground(new java.awt.Color(171, 235, 198));

        lbCongViec.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbCongViec.setForeground(new java.awt.Color(101, 122, 47));
        lbCongViec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCongViec.setText("CÔNG VIỆC");

        javax.swing.GroupLayout pnCongViecLayout = new javax.swing.GroupLayout(pnCongViec);
        pnCongViec.setLayout(pnCongViecLayout);
        pnCongViecLayout.setHorizontalGroup(
            pnCongViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCongViecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCongViec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnCongViecLayout.setVerticalGroup(
            pnCongViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCongViecLayout.createSequentialGroup()
                .addComponent(lbCongViec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnTKChamCong.setBackground(new java.awt.Color(171, 235, 198));

        lbTKChamCong.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbTKChamCong.setForeground(new java.awt.Color(101, 122, 47));
        lbTKChamCong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTKChamCong.setText("TỔNG KẾT CHẤM CÔNG");

        javax.swing.GroupLayout pnTKChamCongLayout = new javax.swing.GroupLayout(pnTKChamCong);
        pnTKChamCong.setLayout(pnTKChamCongLayout);
        pnTKChamCongLayout.setHorizontalGroup(
            pnTKChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTKChamCongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTKChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTKChamCongLayout.setVerticalGroup(
            pnTKChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTKChamCongLayout.createSequentialGroup()
                .addComponent(lbTKChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnTKTangCa.setBackground(new java.awt.Color(171, 235, 198));

        lbTKTangCa.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbTKTangCa.setForeground(new java.awt.Color(101, 122, 47));
        lbTKTangCa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTKTangCa.setText("TỔNG KẾT TĂNG CA");

        javax.swing.GroupLayout pnTKTangCaLayout = new javax.swing.GroupLayout(pnTKTangCa);
        pnTKTangCa.setLayout(pnTKTangCaLayout);
        pnTKTangCaLayout.setHorizontalGroup(
            pnTKTangCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTKTangCaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTKTangCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTKTangCaLayout.setVerticalGroup(
            pnTKTangCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTKTangCaLayout.createSequentialGroup()
                .addComponent(lbTKTangCa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnTangCa.setBackground(new java.awt.Color(171, 235, 198));

        lbTangCa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbTangCa.setForeground(new java.awt.Color(101, 122, 47));
        lbTangCa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTangCa.setText("TĂNG CA");

        javax.swing.GroupLayout pnTangCaLayout = new javax.swing.GroupLayout(pnTangCa);
        pnTangCa.setLayout(pnTangCaLayout);
        pnTangCaLayout.setHorizontalGroup(
            pnTangCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTangCaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTangCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTangCaLayout.setVerticalGroup(
            pnTangCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTangCaLayout.createSequentialGroup()
                .addComponent(lbTangCa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnTienThuong.setBackground(new java.awt.Color(171, 235, 198));

        lbTienThuong.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbTienThuong.setForeground(new java.awt.Color(101, 122, 47));
        lbTienThuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTienThuong.setText("TIỀN THƯỞNG");

        javax.swing.GroupLayout pnTienThuongLayout = new javax.swing.GroupLayout(pnTienThuong);
        pnTienThuong.setLayout(pnTienThuongLayout);
        pnTienThuongLayout.setHorizontalGroup(
            pnTienThuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTienThuongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTienThuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTienThuongLayout.setVerticalGroup(
            pnTienThuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTienThuongLayout.createSequentialGroup()
                .addComponent(lbTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnPhuCap.setBackground(new java.awt.Color(171, 235, 198));

        lbPhuCap.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbPhuCap.setForeground(new java.awt.Color(101, 122, 47));
        lbPhuCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPhuCap.setText("PHỤ CẤP");

        javax.swing.GroupLayout pnPhuCapLayout = new javax.swing.GroupLayout(pnPhuCap);
        pnPhuCap.setLayout(pnPhuCapLayout);
        pnPhuCapLayout.setHorizontalGroup(
            pnPhuCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhuCapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPhuCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnPhuCapLayout.setVerticalGroup(
            pnPhuCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhuCapLayout.createSequentialGroup()
                .addComponent(lbPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBangLuong.setBackground(new java.awt.Color(171, 235, 198));

        lbBangLuong.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBangLuong.setForeground(new java.awt.Color(101, 122, 47));
        lbBangLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBangLuong.setText("BẢNG LƯƠNG THÁNG");

        javax.swing.GroupLayout pnBangLuongLayout = new javax.swing.GroupLayout(pnBangLuong);
        pnBangLuong.setLayout(pnBangLuongLayout);
        pnBangLuongLayout.setHorizontalGroup(
            pnBangLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBangLuongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBangLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnBangLuongLayout.setVerticalGroup(
            pnBangLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBangLuongLayout.createSequentialGroup()
                .addComponent(lbBangLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnTheoDoTangLuong.setBackground(new java.awt.Color(171, 235, 198));

        lbTheoDoiTangLuong.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbTheoDoiTangLuong.setForeground(new java.awt.Color(101, 122, 47));
        lbTheoDoiTangLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTheoDoiTangLuong.setText("THEO DÕI LƯƠNG");

        javax.swing.GroupLayout pnTheoDoTangLuongLayout = new javax.swing.GroupLayout(pnTheoDoTangLuong);
        pnTheoDoTangLuong.setLayout(pnTheoDoTangLuongLayout);
        pnTheoDoTangLuongLayout.setHorizontalGroup(
            pnTheoDoTangLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTheoDoTangLuongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTheoDoiTangLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTheoDoTangLuongLayout.setVerticalGroup(
            pnTheoDoTangLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTheoDoTangLuongLayout.createSequentialGroup()
                .addComponent(lbTheoDoiTangLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnNguoiThan.setBackground(new java.awt.Color(171, 235, 198));

        lbNguoiThan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbNguoiThan.setForeground(new java.awt.Color(101, 122, 47));
        lbNguoiThan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNguoiThan.setText("NGƯỜI THÂN");

        javax.swing.GroupLayout pnNguoiThanLayout = new javax.swing.GroupLayout(pnNguoiThan);
        pnNguoiThan.setLayout(pnNguoiThanLayout);
        pnNguoiThanLayout.setHorizontalGroup(
            pnNguoiThanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNguoiThanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNguoiThan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnNguoiThanLayout.setVerticalGroup(
            pnNguoiThanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNguoiThanLayout.createSequentialGroup()
                .addComponent(lbNguoiThan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnChamCong.setBackground(new java.awt.Color(171, 235, 198));

        lbChamCong.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbChamCong.setForeground(new java.awt.Color(101, 122, 47));
        lbChamCong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChamCong.setText("BẢNG CHẤM CÔNG");

        javax.swing.GroupLayout pnChamCongLayout = new javax.swing.GroupLayout(pnChamCong);
        pnChamCong.setLayout(pnChamCongLayout);
        pnChamCongLayout.setHorizontalGroup(
            pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChamCongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnChamCongLayout.setVerticalGroup(
            pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChamCongLayout.createSequentialGroup()
                .addComponent(lbChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnPhongBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnCongViec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTKChamCong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTKTangCa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTangCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTienThuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnPhuCap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBangLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTheoDoTangLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnNguoiThan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnCongViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnNguoiThan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnTKChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnTangCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnTKTangCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnBangLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnTheoDoTangLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnViewLayout = new javax.swing.GroupLayout(pnView);
        pnView.setLayout(pnViewLayout);
        pnViewLayout.setHorizontalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        pnViewLayout.setVerticalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbBangLuong;
    private javax.swing.JLabel lbChamCong;
    private javax.swing.JLabel lbCongViec;
    private javax.swing.JLabel lbNguoiThan;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JLabel lbPhongBan;
    private javax.swing.JLabel lbPhuCap;
    private javax.swing.JLabel lbTKChamCong;
    private javax.swing.JLabel lbTKTangCa;
    private javax.swing.JLabel lbTangCa;
    private javax.swing.JLabel lbTheoDoiTangLuong;
    private javax.swing.JLabel lbTienThuong;
    private javax.swing.JPanel pnBangLuong;
    private javax.swing.JPanel pnChamCong;
    private javax.swing.JPanel pnCongViec;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnNguoiThan;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnPhongBan;
    private javax.swing.JPanel pnPhuCap;
    private javax.swing.JPanel pnTKChamCong;
    private javax.swing.JPanel pnTKTangCa;
    private javax.swing.JPanel pnTangCa;
    private javax.swing.JPanel pnTheoDoTangLuong;
    private javax.swing.JPanel pnTienThuong;
    private javax.swing.JPanel pnView;
    // End of variables declaration//GEN-END:variables
}
