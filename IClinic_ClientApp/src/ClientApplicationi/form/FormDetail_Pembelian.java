/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormDetail_Pembelian.java
 *
 * Created on Jun 25, 2010, 9:59:09 PM
 */

package ClientApplicationi.form;

import com.mysql.jdbc.Statement;
import ClientApplication.FormClient;
import ClientApplication.model.TableModelDetail_Pembelian;
import Database.Entity.Detail_Pembelian;
import Database.Service.Detail_PembelianService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class FormDetail_Pembelian extends javax.swing.JFrame {

    private TableModelDetail_Pembelian tableModelDetail_Pembelian = new TableModelDetail_Pembelian();
    private Detail_PembelianService detail_PembelianService;
    /** Creates new form FormDetail_Pembelian */
    public FormDetail_Pembelian(Detail_PembelianService detail_PembelianService) {
        this.detail_PembelianService = detail_PembelianService;
        try{
            tableModelDetail_Pembelian.setData(this.detail_PembelianService.getDetail_Pembelian());
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();

        tableDetail_Pembelian.setModel(tableModelDetail_Pembelian);
        tableDetail_Pembelian.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = tableDetail_Pembelian.getSelectedRow();
                if(row != -1){
                    Detail_Pembelian detail_Pembelian = tableModelDetail_Pembelian.get(row);
                    Id_Pembelian.setSelectedItem(detail_Pembelian.getId_Pembelian().toString());
                    Id_Barang.setSelectedItem(detail_Pembelian.getId_Barang().toString());
                    Jml.setText(""+detail_Pembelian.getJml());
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
        tableDetail_Pembelian = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jml = new javax.swing.JTextField();
        Id_Pembelian = new javax.swing.JComboBox();
        Id_Barang = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDetail_Pembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableDetail_Pembelian);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DETAIL_PEMBELIAN"));

        jLabel1.setText("Id_Pembelian");

        jLabel2.setText("Id_Barang");

        jLabel3.setText("Jumlah");

        Jml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmlActionPerformed(evt);
            }
        });

        Id_Pembelian.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[Pilih]" }));
        Id_Pembelian.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Id_PembelianPopupMenuWillBecomeVisible(evt);
            }
        });

        Id_Barang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[Pilih]" }));
        Id_Barang.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Id_BarangPopupMenuWillBecomeVisible(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id_Pembelian, 0, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id_Barang, 0, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jml, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_Pembelian)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_Barang)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jml)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
  if(Id_Pembelian.getSelectedItem().equals("[Pilih]")||Id_Barang.getSelectedItem().equals("[Pilih]")||Jml.getText().equalsIgnoreCase("")){
       JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");

   }
   else{

        String x = (String) Id_Pembelian.getSelectedItem();
        long y = Long.parseLong(x);
        String a = (String) Id_Barang.getSelectedItem();
        long b = Long.parseLong(a);
        String c = Jml.getText();
        int d = Integer.parseInt(c);
        

        try{

           Detail_Pembelian detail_Pembelian = new Detail_Pembelian();
           detail_Pembelian.setId_Pembelian(y);
           detail_Pembelian.setId_Barang(b);
           detail_Pembelian.setJml(d);

           Detail_Pembelian detail_Pembelian1 = detail_PembelianService.insertDetail_Pembelian(detail_Pembelian);
           tableModelDetail_Pembelian.insert(detail_Pembelian1);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
   }
    }//GEN-LAST:event_InsertActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        if(Id_Pembelian.getSelectedItem().equals("[Pilih]")||Id_Barang.getSelectedItem().equals("[Pilih]")||Jml.getText().equalsIgnoreCase("")){
       JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");

   }
   else{
        try{

            int row = tableDetail_Pembelian.getSelectedRow();
            if(row == -1){
                return;
            }
          String x = (String) Id_Pembelian.getSelectedItem();
        long y = Long.parseLong(x);
        String a = (String) Id_Barang.getSelectedItem();
        long b = Long.parseLong(a);
        String c = Jml.getText();
        int d = Integer.parseInt(c);
           Detail_Pembelian detail_Pembelian = tableModelDetail_Pembelian.get(row);
           detail_Pembelian.setId_Pembelian(y);
           detail_Pembelian.setId_Barang(b);
           detail_Pembelian.setJml(d);

           detail_PembelianService.updateDetail_Pembelian(detail_Pembelian);
           tableModelDetail_Pembelian.update(row, detail_Pembelian);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
   }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try{

            int row = tableDetail_Pembelian.getSelectedRow();
            if(row == -1){
                return;
            }
        Long Id_Pembelian = tableModelDetail_Pembelian.get(row).getId_Pembelian();
        Long Id_Barang = tableModelDetail_Pembelian.get(row).getId_Barang();

           detail_PembelianService.deleteDetail_Pembelian(Id_Barang, Id_Pembelian);
           tableModelDetail_Pembelian.delete(row);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        try{
           List<Detail_Pembelian> list = detail_PembelianService.getDetail_Pembelian();
           tableModelDetail_Pembelian.setData(list);
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void Id_PembelianPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Id_PembelianPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        // hapus seluruh data combobox
	Id_Pembelian.removeAllItems();

	// load data dari database ke combobox
	Statement statement = null;
	ResultSet resultSet = null;
	try {
	    statement = (Statement) databasehelper.getConnection().createStatement();
	    resultSet = statement.executeQuery("select Id_Pembelian from Pembelian");
	    while (resultSet.next()) {
		String kategori = resultSet.getString("Id_Pembelian");
		Id_Pembelian.addItem(kategori);
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
    }//GEN-LAST:event_Id_PembelianPopupMenuWillBecomeVisible

    private void Id_BarangPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Id_BarangPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        // hapus seluruh data combobox
	Id_Barang.removeAllItems();

	// load data dari database ke combobox
	Statement statement = null;
	ResultSet resultSet = null;
	try {
	    statement = (Statement) databasehelper.getConnection().createStatement();
	    resultSet = statement.executeQuery("select Id_Barang from Barang");
	    while (resultSet.next()) {
		String kategori = resultSet.getString("Id_Barang");
		Id_Barang.addItem(kategori);
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
    }//GEN-LAST:event_Id_BarangPopupMenuWillBecomeVisible

    private void JmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmlActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
          FormClient formClient = new FormClient();
            formClient.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(FormDetail_Pembelian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(FormDetail_Pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExitActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox Id_Barang;
    private javax.swing.JComboBox Id_Pembelian;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField Jml;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDetail_Pembelian;
    // End of variables declaration//GEN-END:variables

}
