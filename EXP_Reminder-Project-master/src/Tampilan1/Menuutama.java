//terbr

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tampilan1;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import jaco.mp3.player.MP3Player;
import java.time.Instant;
import java.util.Calendar;

/**
 *
 * @author trish
 */
public class Menuutama extends javax.swing.JFrame {

    File database1 = new File("c:\\database\\useraccount");
    public static final String path = "src\\Tampilan1\\audio\\1.mp3";
    MP3Player mp3 = new MP3Player(new File(path));
    int ln2;

    /**
     * Creates new form Menuutama
     */
    public Menuutama() {
        initComponents();

    }

    public Menuutama(String username1) {
        initComponents();
        jLabel6.setText(username1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabel1 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        barang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kategori = new javax.swing.JTextField();
        tanggal = new com.toedter.calendar.JDateChooser();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        HapusSemua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        mute = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        edit = new javax.swing.JButton();

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kategori", "Barang", "Tanggal Expired"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXP Reminder");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangActionPerformed(evt);
            }
        });

        jLabel2.setText("Category");

        kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriActionPerformed(evt);
            }
        });

        tanggal.setDateFormatString("dd-MM-yyyy");
        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });

        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        HapusSemua.setText("Delete All");
        HapusSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusSemuaActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Item", "Expired Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan1/1024px-Circle-icons-profile.svg.png"))); // NOI18N
        jLabel6.setText("username");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        mute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan1/2579552.png"))); // NOI18N
        mute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteActionPerformed(evt);
            }
        });

        jLabel1.setText("Item");

        Kembali.setText("Log Out");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        jLabel3.setText("Expired Date");

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan1/qw.jpg"))); // NOI18N

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Kembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mute, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HapusSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(HapusSemua)
                    .addComponent(edit))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mute, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kembali))
                .addGap(40, 40, 40))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barangActionPerformed

    private void kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriActionPerformed

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange

        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalPropertyChange

    void countLines1() {
        String name = String.format("\\" + jLabel6.getText() + ".txt");
        //buat looping data signup lebih dari 1 data  
        try {
            ln2 = 1;
            RandomAccessFile raf = new RandomAccessFile(database1 + name, "rw");
            for (int i = 0; raf.readLine() != null; i++) {
                ln2++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void importmenu() {
        String filepath = database1 + "\\" + jLabel6.getText() + ".txt";
        File file = new File(filepath);

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");

                model.addRow(row);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void exportmenu1() {
        String filepath = database1 + "\\" + jLabel6.getText() + ".txt";
        File file = new File(filepath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < tabel.getRowCount(); i++) {
                for (int j = 0; j < tabel.getColumnCount(); j++) {
                    bw.write(tabel.getValueAt(i, j) + ",");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void addData1(JTextField kategori, JTextField barang, JDateChooser tanggal) {
        SimpleDateFormat formatdt = new SimpleDateFormat("dd-MM-yyyy");
        String dt = formatdt.format(tanggal.getDate());

        try {
            RandomAccessFile raf = new RandomAccessFile(database1 + "\\" + jLabel6.getText() + ".txt", "rw");
            for (int i = 0; i < ln2; i++) {
                raf.readLine();
            }
            if (tanggal.getDate() != null) {

                raf.writeBytes(kategori.getText() + "," + barang.getText() + "," + dt + "," + "\r\n");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public class CustomTableCellRenderer1 extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable tabel, Object obj, boolean isSelected, boolean hasFocus, int baris, int kolom) {
            long datenow = System.currentTimeMillis();
            Date date1 = new Date(datenow);
            SimpleDateFormat formatdt = new SimpleDateFormat("dd-MM-yyyy");

            Component comp = super.getTableCellRendererComponent(tabel, obj, isSelected, hasFocus, baris, kolom);

            if (isSelected) {
                comp.setBackground(Color.blue);
            } else {

                String t = (String) tabel.getModel().getValueAt(baris, 2);
                Date dait;
                try {
                    dait = formatdt.parse(t);
                    if (dait.before(date1)) {

                        comp.setBackground(Color.RED);                     
                        mp3.play();
                    } else {
                        comp.setBackground(Color.CYAN);

                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Tidak ada opsi yang dipilih");
                }

            }

            return comp;
        }
    }
    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            exportmenu1();
            countLines1();

            addData1(kategori, barang, tanggal);

            // TODO add your handling code here:
            SimpleDateFormat formatdt = new SimpleDateFormat("dd-MM-yyyy");
            String date = formatdt.format(tanggal.getDate());
            //Date ttt = tanggal.getDate();
            long datenow = System.currentTimeMillis();
            Date date1 = new Date(datenow);

            //System.out.println(date1);
            if (tanggal.getDate().before(date1)) {
                JOptionPane.showMessageDialog(null, barang.getText() + " Kadaluarsa");
            }

            tabel.setModel(tbl);
            kategori.setText("");
            barang.setText("");
            tanggal.setDate(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input Expired Date");
        }
        DefaultTableModel tMOdel = (DefaultTableModel) tabel.getModel(); //untuk clear table
        tMOdel.setRowCount(0);
//untuk import
        importmenu();
        TableColumn kolomTabel;
        kolomTabel = tabel.getColumnModel().getColumn(0);
        kolomTabel.setCellRenderer(new CustomTableCellRenderer1());
        kolomTabel = tabel.getColumnModel().getColumn(1);
        kolomTabel.setCellRenderer(new CustomTableCellRenderer1());
        kolomTabel = tabel.getColumnModel().getColumn(2);
        kolomTabel.setCellRenderer(new CustomTableCellRenderer1());

//exportmenu1();
        //  } 

    }//GEN-LAST:event_simpanActionPerformed
void daysleft(){
     for (int i = 0; i < tabel.getRowCount(); i++) {
     SimpleDateFormat formatdt = new SimpleDateFormat("dd-MM-yyyy");

            //Date ttt = tanggal.getDate();
            long datenow = System.currentTimeMillis();
            Date date1 = new Date(datenow);
       String datenw = formatdt.format(date1);
     
           
            String t = (String) tabel.getModel().getValueAt(i, 2);
            Date dait;           
            try {
                dait = formatdt.parse(t);
                  Date dtnow=formatdt.parse(datenw);
                 Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 7);
            Date seminggu = cal.getTime();
            String sm = formatdt.format(seminggu);              
                 Date semingguexp = formatdt.parse(sm); 
                 Calendar cal2 = Calendar.getInstance();
            cal2.add(Calendar.DATE, 1);
            Date sehari = cal2.getTime();
            String sm1 = formatdt.format(sehari);              
                 Date sehariexp = formatdt.parse(sm1);
                  Calendar cal3 = Calendar.getInstance();
            cal3.add(Calendar.MONTH, 1);
            Date sebulan = cal3.getTime();
            String sm2 = formatdt.format(sebulan);              
                 Date sebulanexp = formatdt.parse(sm2);           
            if (semingguexp.equals(dait)){             
               JOptionPane.showMessageDialog(null, tabel.getValueAt(i, 1)+ ": 1 Week left");        
            }else if (sehariexp.equals(dait)){            
                     JOptionPane.showMessageDialog(null, tabel.getValueAt(i, 1)+ ": 1 Day left");
            } else if (sebulanexp.equals(dait)){              
               JOptionPane.showMessageDialog(null, tabel.getValueAt(i, 1)+ ": 1 Month left");    
            }
            else if (dtnow.equals(dait)) {
                 JOptionPane.showMessageDialog(null, tabel.getValueAt(i, 1)+ " Expired");  
            }
            } catch (ParseException ex) {
                Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
}
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        importmenu();
        TableColumn kolomTabel;
        kolomTabel = tabel.getColumnModel().getColumn(0);
        kolomTabel.setCellRenderer(new CustomTableCellRenderer1());
        kolomTabel = tabel.getColumnModel().getColumn(1);
        kolomTabel.setCellRenderer(new CustomTableCellRenderer1());
        kolomTabel = tabel.getColumnModel().getColumn(2);
        kolomTabel.setCellRenderer(new CustomTableCellRenderer1());
if (tabel.getRowCount()!= 0){
    daysleft();
}
    

        

        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try {

            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
// get baris yang di pilih 
            int rowpilih = tabel.getSelectedRow();
            model.removeRow(rowpilih);
        } catch (Exception Ex) {
            JOptionPane.showMessageDialog(null, "Tidak ada opsi yang dipilih");
        }
        exportmenu1();
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void HapusSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusSemuaActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus semua data?", "Delete All", dialogButton);
        if (dialogResult == 0) {
            DefaultTableModel tMOdel = (DefaultTableModel) tabel.getModel();
            tMOdel.setRowCount(0);
            exportmenu1();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_HapusSemuaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void muteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteActionPerformed
        mp3.stop();
    }//GEN-LAST:event_muteActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        kategori.setText("");
        barang.setText("");
        tanggal.setDate(null); // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            int rowpilih = tabel.getSelectedRow();
            kategori.setText((String) model.getValueAt(rowpilih, 0));
            barang.setText((String) model.getValueAt(rowpilih, 0));
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse((String) model.getValueAt(rowpilih, 2));
            tanggal.setDate(date);
            model.removeRow(rowpilih);
        } catch (ParseException ex) {
            Logger.getLogger(Menuutama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception Ex) {
            JOptionPane.showMessageDialog(null, "Tidak ada opsi yang dipilih");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

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
            java.util.logging.Logger.getLogger(Menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuutama().setVisible(true);
            }
        });
    }
    int baris = 0;
    static Object kolom[] = {"Category", "Item", "Expired Date"};
    DefaultTableModel tbl = new DefaultTableModel(kolom, baris);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HapusSemua;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField barang;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kategori;
    private javax.swing.JButton mute;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JTable tabel1;
    private com.toedter.calendar.JDateChooser tanggal;
    // End of variables declaration//GEN-END:variables
}
