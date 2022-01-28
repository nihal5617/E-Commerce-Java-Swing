package e_commerce;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Sahil
 */
public class BuyScreen extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    int stars;
    int q;
    int Productid;
    String gotusername;

    public BuyScreen(int pid) {
        super("Buy Screen Screen");
        initComponents();
        Productid = pid;
        jSpinner1.setEditor(new JSpinner.DefaultEditor(jSpinner1));
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=nihal123");
            ps = con.prepareStatement("select i.largeimage,p.pname,p.price,p.quantity,p.rating,p.info from image i,product p where i.category = p.category and p.pid =" + pid + "");
            ResultSet rs = ps.executeQuery();
            byte[] image = null;
            if (rs.next()) {
                image = rs.getBytes("largeimage");
                ImageIcon icone = new ImageIcon(image);
                Image_file.setIcon(icone);

                price1.setText(String.valueOf(rs.getInt("price")));
                product_name.setText(rs.getString("pname"));
                q = rs.getInt("quantity");
                Quantity.setText(String.valueOf(q));
                jSpinner1.setModel(new javax.swing.SpinnerNumberModel(2, 1, q, 1));
                jSpinner1.setValue(1);
                productinfo.setText(rs.getString("info"));
                stars = rs.getInt("rating");
                String star = "";
                while (stars != 0) {
                    stars--;
                    star += "✰";
                }

                rating.setText(star);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
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
        Image_file = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productinfo = new javax.swing.JTextArea();
        product_name = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        Buybutton = new javax.swing.JButton();
        quantitylabel = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Image_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/electronics_large.jpg"))); // NOI18N
        Image_file.setText("IMAGE");
        jPanel1.add(Image_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 500, 330));

        BackButton.setBackground(new java.awt.Color(73, 138, 217));
        BackButton.setText("⬅");
        BackButton.setAlignmentX(-0.5F);
        BackButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        productinfo.setEditable(false);
        productinfo.setBackground(new java.awt.Color(240, 240, 240));
        productinfo.setColumns(20);
        productinfo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        productinfo.setLineWrap(true);
        productinfo.setRows(5);
        productinfo.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        jScrollPane1.setViewportView(productinfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 500, 140));

        product_name.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        product_name.setForeground(new java.awt.Color(11, 44, 83));
        product_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_name.setText("PRODUCT");
        jPanel1.add(product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 230, 30));

        pricelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pricelabel.setForeground(new java.awt.Color(11, 44, 83));
        pricelabel.setText("PRICE");
        jPanel1.add(pricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 80, 30));

        Buybutton.setBackground(new java.awt.Color(28, 109, 208));
        Buybutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Buybutton.setForeground(new java.awt.Color(255, 248, 243));
        Buybutton.setText("BUY");
        Buybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuybuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Buybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 80, 40));

        quantitylabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantitylabel.setForeground(new java.awt.Color(11, 44, 83));
        quantitylabel.setText("IN STOCK");
        jPanel1.add(quantitylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 90, 30));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(11, 44, 83));
        jLabel5.setText("QUANTITY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 90, 30));

        rating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rating.setText("✰");
        jPanel1.add(rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 190, 30));

        Quantity.setEditable(false);
        Quantity.setBackground(new java.awt.Color(255, 255, 255));
        Quantity.setText("jTextField1");
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        jPanel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, 30));

        price1.setText("jTextField1");
        price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price1ActionPerformed(evt);
            }
        });
        jPanel1.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getUserName(String username) {
        gotusername = username;
    }
    private void BuybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuybuttonActionPerformed
        // TODO add your handling code here
        if (Integer.parseInt(jSpinner1.getValue().toString()) == 0) {
            JOptionPane.showMessageDialog(this, "Quantity Cannot be 0", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            Invoice invoice = new Invoice(jSpinner1.getValue().toString(), Productid, Quantity.getText().toString());
            invoice.setVisible(true);
            invoice.getUserName(gotusername);
            invoice.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_BuybuttonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        MainScreen main = new MainScreen();
        main.getCusername(gotusername);
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyScreen(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Buybutton;
    private javax.swing.JLabel Image_file;
    private javax.swing.JTextField Quantity;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField price1;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JLabel product_name;
    private javax.swing.JTextArea productinfo;
    private javax.swing.JLabel quantitylabel;
    private javax.swing.JLabel rating;
    // End of variables declaration//GEN-END:variables
}
