/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e_commerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahil
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    Connection con;
    PreparedStatement ps;
    int quantityofproduct;
    int productid;
    int originalquantity;
    String gotusername;

    public Invoice(String qty, int pid, String ogquantity) {
        super("Invoice Screen");
        initComponents();
        quantityofproduct = Integer.parseInt(qty);
        originalquantity = Integer.parseInt(ogquantity);

        productid = pid;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=nihal123");
            ps = con.prepareStatement("select p.pname,p.price,s.sname from shop s,product p where s.username = p.shopinfo and p.pid = ?");
            ps.setInt(1, pid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pname.setText(rs.getString("pname"));
                mname.setText(rs.getString("sname"));
                price.setText(rs.getString("price"));
                quantity.setText(qty);
                total.setText(String.valueOf(Integer.parseInt(qty) * rs.getInt("price")));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_placeorder = new javax.swing.JButton();
        pname = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PRODUCT NAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 220, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PRICE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("MANUFACTURER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("QUANTITY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, -1));

        btn_placeorder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_placeorder.setText("PLACE ORDER");
        btn_placeorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_placeorderActionPerformed(evt);
            }
        });
        jPanel1.add(btn_placeorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        pname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pname.setText("......");
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 170, 20));

        mname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mname.setText("jLabel7");
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, 20));

        price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        price.setText("jLabel8");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 120, -1));

        quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantity.setText("jLabel9");
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 120, -1));

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setText("jLabel10");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 120, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getUserName(String username) {
        gotusername = username;
    }
    private void btn_placeorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_placeorderActionPerformed
        // TODO add your handling code here:
        try {
            // Construct data
            String apiKey = "apikey=" + "NTk3MjRmNjE2MjRlNmU2NTZlNjU2OTc3MzY0Mjc0NTk=";
            String message = "&message=" + "Hi there, thank you for sending your first test message from Textlocal. See how you can send effective SMS campaigns here: https://tx.gl/r/2nGVj/";
            String sender = "&sender=" + "600010";
            String numbers = "&numbers=" + "918291638536";

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line);
            }
            rd.close();

            System.out.println(stringBuffer.toString());

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=nihal123");
            ps = con.prepareStatement("insert into invoice(pname,mname,price,quantity,total,cname) values(?,?,?,?,?,?)");
            System.out.println(pname.getText().toString() + " " + mname.getText().toString());
            ps.setString(1, pname.getText().toString());
            ps.setString(2, mname.getText().toString());
            ps.setString(3, price.getText().toString());
            ps.setInt(4, Integer.parseInt(quantity.getText().toString()));
            ps.setString(5, total.getText().toString());
            ps.setString(6, gotusername);
            ps.executeUpdate();
            con.close();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=nihal123");
            ps = con.prepareStatement("update product set quantity = ? where pid = ?");
            ps.setInt(1, originalquantity - quantityofproduct);
            ps.setInt(2, productid);
            ps.executeUpdate();
            con.close();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=nihal123");
            ps = con.prepareStatement("delete from product where quantity = 0");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error SMS " + e);
        }
        JOptionPane.showMessageDialog(this, "Your Order is Placed!!", "Thank You!!", JOptionPane.INFORMATION_MESSAGE);
        MainScreen main = new MainScreen();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_placeorderActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        BuyScreen main = new BuyScreen(productid);
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice("", 1, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton btn_placeorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel price;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}