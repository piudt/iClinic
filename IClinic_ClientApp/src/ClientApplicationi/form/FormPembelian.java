/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormPembelian.java
 *
 * Created on Jun 25, 2010, 9:45:09 PM
 */

package ClientApplicationi.form;

import com.mysql.jdbc.Statement;
import ClientApplication.FormClient;
import ClientApplication.model.TableModelPembelian;
import Database.Entity.Pembelian;
import Database.Service.PembelianService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Madridista
 */
public class FormPembelian extends javax.swing.JFrame {

    private TableModelPembelian tableModelPembelian = new TableModelPembelian();
    private PembelianService pembelianService;
    /** Creates new form FormPembelian */
    public FormPembelian(PembelianService pembelianService) {
        this.pembelianService = pembelianService;
        try{
            tableModelPembelian.setData(this.pembelianService.getPembelian());
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();

        tablePembelian.setModel(tableModelPembelian);
        tablePembelian.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = tablePembelian.getSelectedRow();
                if(row != -1){
                    Pembelian pembelian = tableModelPembelian.get(row);
                    Id_Pembelian.setValue(pembelian.getId_Pembelian());
                    Id_Suplier.setSelectedItem(pembelian.getId_Suplier().toString());
                    Tgl.setValue(pembelian.getTgl());   
                }
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePembelian = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tgl = new javax.swing.JFormattedTextField();
        Id_Pembelian = new javax.swing.JFormattedTextField();
        Id_Suplier = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablePembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePembelian);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PEMBELIAN"));

        jLabel1.setText("Id_Pembelian");

        jLabel2.setText("Id_Suplier");

        jLabel3.setText("Tanggal");

        Tgl.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd MMMM yyyy"))));
        Tgl.setValue(new java.util.Date());

        Id_Pembelian.setEditable(false);
        Id_Pembelian.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        Id_Pembelian.setValue(new Long(0L));

        Id_Suplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[Pilih]" }));
        Id_Suplier.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Id_SuplierPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id_Pembelian, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id_Suplier, 0, 160, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tgl, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_Pembelian)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_Suplier)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tgl)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        Insert.setText("INSERT");
        Insert.setPreferredSize(new java.awt.Dimension(90, 30));
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel2.add(Insert);

        Update.setText("UPDATE");
        Update.setPreferredSize(new java.awt.Dimension(90, 30));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update);

        Delete.setText("DELETE");
        Delete.setPreferredSize(new java.awt.Dimension(90, 30));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);

        Refresh.setText("REFRESH");
        Refresh.setPreferredSize(new java.awt.Dimension(90, 30));
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh);

        Exit.setText("EXIT");
        Exit.setPreferredSize(new java.awt.Dimension(90, 30));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
 if(Tgl.getText().equalsIgnoreCase("")||Id_Suplier.getSelectedItem().equals("[Pilih]")){
       JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");

   }
   else{
        String x = (String) Id_Suplier.getSelectedItem();
        long y = Long.parseLong(x);

        try{
           Pembelian pembelian = new Pembelian();
           pembelian.setId_Suplier(y);
           pembelian.setTgl((Date) Tgl.getValue());

           Pembelian pembelian1= pembelianService.insertPembelian(pembelian);
           tableModelPembelian.insert(pembelian1);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
   }
    }//GEN-LAST:event_InsertActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
  if(Tgl.getText().equalsIgnoreCase("")||Id_Suplier.getSelectedItem().equals("[Pilih]")){
       JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");

   }
   else{
         try{

            int row = tablePembelian.getSelectedRow();
            if(row == -1){
                return;
            }
          String x = (String) Id_Suplier.getSelectedItem();
         long y = Long.parseLong(x);
           Pembelian pembelian =tableModelPembelian.get(row);
           pembelian.setId_Suplier(y);
           pembelian.setTgl((Date) Tgl.getValue());

           pembelianService.updatePembelian(pembelian);
           tableModelPembelian.update(row, pembelian);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
   }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try{

            int row = tablePembelian.getSelectedRow();
            if(row == -1){
                return;
            }
        Long Id_Pembelian = tableModelPembelian.get(row).getId_Pembelian();

           pembelianService.deletePembelian(Id_Pembelian);
           tableModelPembelian.delete(row);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        try{
           List<Pembelian> list = pembelianService.getPembelian();
           tableModelPembelian.setData(list);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void Id_SuplierPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Id_SuplierPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        // hapus seluruh data combobox
	Id_Suplier.removeAllItems();

	// load data dari database ke combobox
	Statement statement = null;
	ResultSet resultSet = null;
	try {
	    statement = (Statement) databasehelper.getConnection().createStatement();
	    resultSet = statement.executeQuery("select Id_Suplier from Suplier");
	    while (resultSet.next()) {
		String kategori = resultSet.getString("Id_Suplier");
		Id_Suplier.addItem(kategori);
	    }
	} catch (SQLException ex) {
	} finally {
	    try {
		if (resultSet != null) {
		    resultSet.close();
		}
	    } catch (SQLException ex) {
	    }
	    try {
		if (statement != null) {
		    statement.close();
		}
	    } catch (SQLException ex) {
	    }
	}
    }//GEN-LAST:event_Id_SuplierPopupMenuWillBecomeVisible

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
          FormClient formClient = new FormClient();
            formClient.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(FormPembelian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(FormPembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExitActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JFormattedTextField Id_Pembelian;
    private javax.swing.JComboBox Id_Suplier;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Refresh;
    private javax.swing.JFormattedTextField Tgl;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePembelian;
    // End of variables declaration//GEN-END:variables

}
