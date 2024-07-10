
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author zainu
 */
public class transaksi extends javax.swing.JPanel {

    /**
     * Creates new form transaksi
     */
    public transaksi() {
        initComponents();
        data_barang();
         //history();
         tanggal();
         cari();
    }
    
    void tanggal(){
        Date thisdate = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        ttanggal.setText(date.format(thisdate));
    }

    void data_barang(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID BARANG");
        model.addColumn("NAMA BARANG");
        model.addColumn("HARGA");
        ttabeltransaksi1.setModel(model);
        try{
            String sql = "SELECT * FROM barang";
            java.sql.Connection conn=koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(sql);
            ttabeltransaksi1.setModel(model);
            while(rs.next()){
                String idbarang = rs.getString("id_barang");
                String nama = rs.getString("nama_barang");
                String harga = rs.getString("harga_jual");
                Object[]rowdata = {idbarang,nama,harga};
                model.addRow(rowdata);
                
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void history(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("QTY");
         model.addColumn("SUBTOTAL");
        
        try{
            String sql = "SELECT * FROM transaksi";
            java.sql.Connection conn=koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                String id = rs.getString("id_transaksi");
                String tgl = rs.getString("tgl_transaksi");
                String total = rs.getString("sub_total");
                Object[]rowdata = {id, tgl, total, subtotal};
                model.addRow(rowdata);
                
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
   
    }
   
    
    
void reset() {
    try {
        String sql = "DELETE FROM transaksisementara";
        java.sql.Connection conn = koneksi.ConfigDB();
        java.sql.Statement statement = conn.createStatement();

        int rowsDeleted = statement.executeUpdate(sql);

        if (rowsDeleted > 0) {
            System.out.println("Data in transaksisementara deleted successfully.");
            subtotal.setText("Rp.0");            
           Ambildata();
        } else {
            System.out.println("No data found in transaksisementara to delete.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ttabeltransaksi1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ttabeltransaksi2 = new javax.swing.JTable();
        breset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        ttanggal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 255));

        ttabeltransaksi1.setModel(new javax.swing.table.DefaultTableModel(
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
        ttabeltransaksi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttabeltransaksi1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttabeltransaksi1);

        ttabeltransaksi2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(ttabeltransaksi2);

        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL");

        subtotal.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        subtotal.setText("Rp.0");

        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Transaksi > Dashboard");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ttanggal.setText("Tgl");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ttanggal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(bsimpan)
                                    .addGap(10, 10, 10)
                                    .addComponent(breset))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bsimpan)
                                .addComponent(breset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtotal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
                    reset();
    }//GEN-LAST:event_bresetActionPerformed

    private void ttabeltransaksi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttabeltransaksi1MouseClicked
                transaksi();
    }//GEN-LAST:event_ttabeltransaksi1MouseClicked

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
       
        String tgl = ttanggal.getText();
        String total = subtotal.getText();
        
                 
        try{
            String sql = "INSERT INTO transaksi(id_transaksi, tgl_trasaksi, total) VALUES(?,?,?)";
            java.sql.Connection conn=koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            
            
            statement.setString(1, tgl);
            statement.setString(2, total);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil di simpan");
        }catch(Exception e){
            e.printStackTrace();
        }
        //history();
        reset();
   
    }//GEN-LAST:event_bsimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton breset;
    private javax.swing.JButton bsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable ttabeltransaksi1;
    private javax.swing.JTable ttabeltransaksi2;
    private javax.swing.JLabel ttanggal;
    // End of variables declaration//GEN-END:variables
private void transaksi(){
     int baris = ttabeltransaksi1.getSelectedRow();
     String idbarang = ttabeltransaksi1.getValueAt(baris, 0).toString();
     String nama = ttabeltransaksi1.getValueAt(baris, 1).toString();
     String harga = ttabeltransaksi1.getValueAt(baris, 2).toString();
     
     String qty = JOptionPane.showInputDialog("Masukkan Jumlah");
     int jml = Integer.parseInt(qty);
     int hrg = Integer.parseInt(harga);
     int sub_total = hrg*jml;
     
     try{
            String sql = "INSERT INTO transaksisementara(nama, harga, qty, sub_total, id_barang) VALUES(?,?,?,?,?)";
            java.sql.Connection conn=koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, nama);
            statement.setString(2, harga);
            statement.setString(3, qty);
            statement.setInt(4, sub_total);
            statement.setString(5, idbarang);
            
             int rowinserted = statement.executeUpdate();
             if (rowinserted > 0){
                 Ambildata();
                 TotalHarga();
             }
        }catch (Exception e){
            e.printStackTrace();
        }
}

    private void Ambildata(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("QTY");
        ;
        ttabeltransaksi2.setModel(model);
        try{
            String sql = "SELECT * FROM transaksisementara";
            java.sql.Connection conn=koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                String nama = rs.getString("nama");
                String harga = rs.getString("harga");
                String qty = rs.getString("qty");
                Object[]rowdata = {nama,harga,qty};
                model.addRow(rowdata);
                
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void TotalHarga(){
        int hitung = 0;
        
        for (int i = 0; i < ttabeltransaksi2.getRowCount(); i++){
            hitung = hitung + Integer.parseInt(ttabeltransaksi2.getValueAt(i, 1).toString());
        }
        String total = Integer.toString(hitung);
        subtotal.setText(total);
    }

    private void cari() {
       
    }
}
