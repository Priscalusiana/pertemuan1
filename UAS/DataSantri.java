
package UAS;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class DataSantri extends javax.swing.JFrame {

    public DataSantri() {
        initComponents();
        this.setTitle("APLIKASI PENDAFTARAN SANTRI LIBURAN");
        this.setLocationRelativeTo(this);
 
        koneksi konek = new koneksi();
        konek.koneksi();
        this.statuskoneksi.setText(konek.statuskoneksi);

        ButtonGroup bG = new ButtonGroup();
        bG.add(cowo);
        bG.add(cewe);
        ButtonGroup BG = new ButtonGroup();
        BG.add(mts);
        BG.add(ma);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        namaAyah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        mts = new javax.swing.JRadioButton();
        ma = new javax.swing.JRadioButton();
        cowo = new javax.swing.JRadioButton();
        cewe = new javax.swing.JRadioButton();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        statuskoneksi = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jRadioButton2.setText("jRadioButton2");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("TINGKAT");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("NAMA");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ALAMAT");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("JENIS KELAMIN");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("NAMA AYAH");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        mts.setForeground(new java.awt.Color(255, 255, 255));
        mts.setText("MTs");

        ma.setForeground(new java.awt.Color(255, 255, 255));
        ma.setText("MA");

        cowo.setForeground(new java.awt.Color(255, 255, 255));
        cowo.setText("Laki - laki");

        cewe.setForeground(new java.awt.Color(255, 255, 255));
        cewe.setText("Perempuan");
        cewe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceweActionPerformed(evt);
            }
        });

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Pictures\\pngtree-ayo-mondok-png-image_8724568-removebg-preview.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID SANTRI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel13)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel10)
                            .addComponent(simpan))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namaAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(cowo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(116, 116, 116))))
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(mts, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cewe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mts)
                    .addComponent(ma)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cowo)
                    .addComponent(cewe)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50)
                    .addComponent(namaAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpan)
                            .addComponent(edit)
                            .addComponent(reset)))
                    .addComponent(jLabel13))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Pendaftaran", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "iID SANTRI", "NAMA", "KELAS", "JENIS KELAMIN", "NAMA AYAH", "ALAMAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabeldata);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KONEKSI");

        hapus.setText("HAPUS");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data  Santri Liburan");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("PP MAFTAHUL ULUUM JATINOM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(statuskoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hapus)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(jButton1)
                    .addComponent(statuskoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Data Santri", jPanel2);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\logo pndok.jpg")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("Sekretariat: Jl. K Imam Bukhori No. 31 Desa Jatinom kec. Kanigoro Kab. Blitar 66171");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("E-mail: ppmu.media@gmail.com/ No HP :085738265479");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("PONDOK PESANTREN SALAFIYYAH AN-NAHDLIYYAH ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("MAFTAHUL 'ULUUM JATINOM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Statement pst ;
ResultSet rs;

 public void table()
    {
      koneksi konek = new koneksi();
      konek.koneksi();
        
     try {
   String sql = "select ID, NAMA, TINGKAT, JENIS_KELAMIN, NAMA_AYAH, ALAMAT from datasantri";
            pst = (Statement) konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabeldata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }}
    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked

        int baris = tabeldata.getSelectedRow();
        id.setText(tabeldata.getValueAt(baris,0).toString());
        nama.setText(tabeldata.getValueAt(baris, 1).toString());
        String tingkat = tabeldata.getValueAt(baris,  2).toString();
        if(tingkat.equals("MTS")){
            mts.setSelected(true);
        }else if (tingkat.equals("MA")){
            ma.setSelected(true);
        }
        String JK = tabeldata.getValueAt(baris,  3).toString();
        if(JK.equals("perempuan")){
            cewe.setSelected(true);
        }else if (JK.equals("Laki-Laki")){
            cowo.setSelected(true);
        }
        namaAyah.setText(tabeldata.getValueAt(baris, 4).toString());
        alamat.setText(tabeldata.getValueAt(baris, 5).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tabeldataMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_hapusMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
  
        koneksi konek = new koneksi();
        konek.koneksi();
        delete del = new delete();
        del.delete(Integer.parseInt(id.getText()));

        table();

        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed

        String TINGKAT = "";
        if (mts.isSelected()) {
            TINGKAT = "MTS";
        } else if (ma.isSelected()) {
            TINGKAT = "MA";
        }

        String JENISKELAMIN = "";
        if (cowo.isSelected()) {
            JENISKELAMIN = "Laki-Laki";
        } else if (cewe.isSelected()) {
            JENISKELAMIN = "Perempuan";
        }

        insert in = new insert();
        int ID = Integer.parseInt(id.getText());
        String NAMA = nama.getText();
        String NAMAAYAH = namaAyah.getText();
        String ALAMAT = alamat.getText();

        in.insert(ID, NAMA, TINGKAT, JENISKELAMIN, NAMAAYAH, ALAMAT);
        table();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        
        koneksi konek = new koneksi();
        konek.koneksi();
        update ubah = new update();
        int ID = Integer.parseInt(id.getText());
        String NAMA = nama.getText();
        String TINGKAT = "";
        if(mts.isSelected()){
            TINGKAT = "MTS";
        }else if(ma.isSelected()){
            TINGKAT = "MA";
        }  
        String JENISKELAMIN = "";
        if(cowo.isSelected()){
            JENISKELAMIN = "Laki-Laki";
        }else if(cewe.isSelected()){
            JENISKELAMIN = "Perempuan";
        }  
        String NAMAAYAH = namaAyah.getText();
        String ALAMAT = alamat.getText();
        ubah.ubah(ID, NAMA, TINGKAT, JENISKELAMIN, NAMAAYAH, ALAMAT);
        table();
     
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        id.setText("");
        nama.setText("");
        ButtonGroup bG = new ButtonGroup();
        bG.add(cowo);
        bG.add(cewe);
        bG.clearSelection();
        ButtonGroup BG = new ButtonGroup();
        BG.add(mts);
        BG.add(ma);
        BG.clearSelection();

        
        namaAyah.setText("");
        alamat.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void ceweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceweActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceweActionPerformed

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
            java.util.logging.Logger.getLogger(DataSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSantri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JRadioButton cewe;
    private javax.swing.JRadioButton cowo;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton ma;
    private javax.swing.JRadioButton mts;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField namaAyah;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField statuskoneksi;
    private javax.swing.JTable tabeldata;
    // End of variables declaration//GEN-END:variables
}
