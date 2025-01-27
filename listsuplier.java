
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
public class listsuplier extends javax.swing.JPanel {

    /**
     * Creates new form listbarang
     */
    public listsuplier() {
        initComponents();
        tampil_tabel_supplier();
        reset();
     
    }
    void tampil_tabel_supplier (){
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn("id supplier");
        model.addColumn("nama supplier");
        model.addColumn("telepon");
        
        model.addColumn("alamat");
        try{
            String sql="SELECT * FROM supplier";
            java.sql.Connection conn=koneksi.ConfigDB();
            java.sql.Statement statement=conn.createStatement();
            java.sql.ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                model.addRow(new Object[]{resultSet.getString("id_supplier"),
                    resultSet.getString("nama_supplier"),resultSet.getString("telepon")
                   ,resultSet.getString("alamat")});
            }
           ttabelsupplier.setModel(model);
        }catch (Exception e){
            e.printStackTrace();
            }
        }
    
void reset(){
    tids.setText("");
    tnamas.setText("");
    tteleon.setText("");
    
    talamat.setText("");
    
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tids = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tnamas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tteleon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        talamat = new javax.swing.JTextArea();
        panel1 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttabelsupplier = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ID SUPPLIER");

        jLabel2.setText("NAMA SUPLIER");

        jLabel4.setText("NO. TLP");

        jLabel5.setText("ALAMAT");

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        talamat.setColumns(20);
        talamat.setRows(5);
        jScrollPane2.setViewportView(talamat);

        panel1.setBackground(new java.awt.Color(231, 41, 41));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Supplier > Dashboard");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ttabelsupplier.setModel(new javax.swing.table.DefaultTableModel(
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
        ttabelsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttabelsupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttabelsupplier);

        jLabel6.setBackground(new java.awt.Color(17, 51, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Supplier");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bubah))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(bhapus)
                                .addGap(18, 18, 18)
                                .addComponent(breset))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(tids)
                                    .addComponent(tnamas)
                                    .addComponent(tteleon))))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tnamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tteleon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bhapus)
                    .addComponent(breset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bubah)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        String id_supplier=tids.getText();
        String nama_supplier=tnamas.getText();
        
        String alamat=talamat.getText();
        String telepon=tteleon.getText();
        try{
            String sql="INSERT INTO supplier(id_supplier,nama_supplier,alamat,telepon)values('"+id_supplier+"','"+nama_supplier+"','"+alamat+"','"+telepon+"')";
            java.sql.Connection conn =koneksi.ConfigDB();
            java.sql .Statement statement=conn.createStatement();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "data berhasil di simpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_tabel_supplier();
        reset();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
        String id_supplier=tids.getText();
        String nama_supplier=tnamas.getText();
       
        String alamat=talamat.getText();
        String telepon=tteleon.getText();
        try{
            String sql = "UPDATE supplier SET nama_supplier='" + nama_supplier + "', alamat='" + alamat + "', telepon='" + telepon + "' WHERE id_supplier='" + id_supplier+ "'";

            java.sql.Connection conn =koneksi.ConfigDB();
            java.sql .Statement statement=conn.createStatement();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "data berhasil di ubah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_tabel_supplier();
        reset();
        
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        String kode_supplier=tids.getText();

        try{
            String sql="DELETE FROM supplier WHERE id_supplier='"+kode_supplier+"'";
            java.sql.Connection conn =koneksi.ConfigDB();
            java.sql .Statement statement=conn.createStatement();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "data berhasil di hapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_tabel_supplier();
        reset();
    }//GEN-LAST:event_bhapusActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bresetActionPerformed

    private void ttabelsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttabelsupplierMouseClicked
        // TODO add your handling code here:
        int baris=ttabelsupplier.rowAtPoint(evt.getPoint());
        String id_supplier =ttabelsupplier.getValueAt(baris, 0).toString();
        String nama_supplier=ttabelsupplier.getValueAt(baris, 1).toString();
        String telepon=ttabelsupplier.getValueAt(baris, 2).toString();
        String alamat=ttabelsupplier.getValueAt(baris, 3).toString();
         tids.setText(id_supplier);
         tnamas.setText(nama_supplier);
         tteleon.setText(telepon);
         talamat.setText(alamat);
         tids.setEditable(false);
    }//GEN-LAST:event_ttabelsupplierMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhapus;
    private javax.swing.JButton breset;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private javax.swing.JTextArea talamat;
    private javax.swing.JTextField tids;
    private javax.swing.JTextField tnamas;
    private javax.swing.JTable ttabelsupplier;
    private javax.swing.JTextField tteleon;
    // End of variables declaration//GEN-END:variables
}
