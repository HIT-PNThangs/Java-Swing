package com.nhom7.quanlyluong.View.BaoTriThongTinChamCong;

import javax.swing.*;
import java.util.ArrayList;

public class BaoTriThongTinChamCongUI extends JFrame {
    public BaoTriThongTinChamCongUI() {
        initComponents();
        setLocationRelativeTo(null);
        generateComboBoxData();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        txtMaCong = new JTextField();
        cboThang = new JComboBox<>();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        cboNam = new JComboBox<>();
        jLabel6 = new JLabel();
        txtMaNhanVien = new JTextField();
        jLabel7 = new JLabel();
        txtSoNgayLamViec = new JSpinner();
        jLabel8 = new JLabel();
        txtTienUngTruoc = new JTextField();
        jLabel9 = new JLabel();
        txtSoGioLamThem = new JTextField();
        jScrollPane1 = new JScrollPane();
        listThuong = new JList<>();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jScrollPane2 = new JScrollPane();
        listPhuCap = new JList<>();
        jLabel12 = new JLabel();
        jScrollPane3 = new JScrollPane();
        listHocPhan = new JList<>();
        jScrollPane4 = new JScrollPane();
        jTable1 = new JTable();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bảo trì thông tin chấm công");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize() + 11));
        jLabel1.setText("Bảo trì thông tin chấm công");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize() + 3f));
        jLabel2.setText("Mã Công");

        txtMaCong.setFont(txtMaCong.getFont().deriveFont(txtMaCong.getFont().getSize() + 3f));

        cboThang.setFont(cboThang.getFont().deriveFont(cboThang.getFont().getSize() + 3f));
        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3"}));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize() + 3f));
        jLabel3.setText("Tháng: ");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize() + 3f));
        jLabel4.setText("Năm: ");

        cboNam.setFont(cboNam.getFont().deriveFont(cboNam.getFont().getSize() + 3f));

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getSize() + 3f));
        jLabel6.setText("Mã Nhân Viên");

        txtMaNhanVien.setFont(txtMaNhanVien.getFont().deriveFont(txtMaNhanVien.getFont().getSize() + 3f));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getSize() + 3f));
        jLabel7.setText("Số ngày làm việc");

        txtSoNgayLamViec.setFont(txtSoNgayLamViec.getFont().deriveFont(txtSoNgayLamViec.getFont().getSize() + 3f));

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getSize() + 3f));
        jLabel8.setText("Tiền ứng trước");

        txtTienUngTruoc.setFont(txtTienUngTruoc.getFont().deriveFont(txtTienUngTruoc.getFont().getSize() + 3f));

        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getSize() + 3f));
        jLabel9.setText("Số giờ làm thêm");

        txtSoGioLamThem.setFont(txtSoGioLamThem.getFont().deriveFont(txtSoGioLamThem.getFont().getSize() + 3f));

        jScrollPane1.setViewportView(listThuong);

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getSize() + 3f));
        jLabel10.setText("Danh sách thưởng");

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getSize() + 3f));
        jLabel11.setText("Danh sách phụ cấp");

        jScrollPane2.setViewportView(listPhuCap);

        jLabel12.setFont(jLabel12.getFont().deriveFont(jLabel12.getFont().getSize() + 3f));
        jLabel12.setText("Danh sách học phần");

        jScrollPane3.setViewportView(listHocPhan);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String[]{
                        "Mã Công", "Tháng", "Năm", "Mã Nhân Viên", "Số ngày làm việc", "Số giờ làm thêm", "Tiền ứng trước"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize() + 3f));
        jButton1.setText("Xóa Thông Tin");

        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getSize() + 3f));
        jButton2.setText("Thêm Chấm Công");

        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getSize() + 3f));
        jButton3.setText("Sửa Chấm Công");

        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getSize() + 3f));
        jButton4.setText("Xóa Chấm Công");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addGap(46, 46, 46)
                                                                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(jLabel2))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(81, 81, 81)
                                                                                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(txtMaCong, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addComponent(cboThang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(42, 42, 42)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtSoNgayLamViec)
                                                                        .addComponent(txtSoGioLamThem)
                                                                        .addComponent(txtTienUngTruoc, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jScrollPane1))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(17, 17, 17)
                                                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(15, 15, 15)
                                                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(465, 465, 465)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(368, 368, 368)
                                                                .addComponent(jButton2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton1)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtMaCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtSoNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(115, 115, 115)
                                                                .addComponent(jLabel12)
                                                                .addGap(90, 90, 90))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(txtSoGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(txtTienUngTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel10))
                                                                        .addComponent(jScrollPane1)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4)
                                        .addComponent(jButton1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    public void onStartGUI() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (
                ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (
                InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (
                IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (
                UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoTriThongTinChamCongUI().setVisible(true);
            }
        });
    }

    private void generateComboBoxData() {
        ArrayList<String> thang = new ArrayList();

        for (int i = 1; i <= 12; i++) {
            thang.add(String.valueOf(i));
        }

        ArrayList<String> nam = new ArrayList<>();

        for (int i = 1970; i <= 2022; i++) {
            nam.add(String.valueOf(i));
        }

        cboThang.setModel(new DefaultComboBoxModel<>(thang.toArray(new String[thang.size()])));
        cboNam.setModel(new DefaultComboBoxModel<>(nam.toArray(new String[nam.size()])));
    }

    private JComboBox<String> cboNam;
    private JComboBox<String> cboThang;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JTable jTable1;
    private JList<String> listHocPhan;
    private JList<String> listPhuCap;
    private JList<String> listThuong;
    private JTextField txtMaCong;
    private JTextField txtMaNhanVien;
    private JTextField txtSoGioLamThem;
    private JSpinner txtSoNgayLamViec;
    private JTextField txtTienUngTruoc;
    // End of variables declaration//GEN-END:variables
}
