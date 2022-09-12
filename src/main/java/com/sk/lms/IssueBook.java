/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sk.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shubh
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        studentsDisplay();
        booksDisplay();
    }

    String sid;
    String bid;
    String issuedate;
    String available;
    Boolean availablestatus;
    Connection con;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSid = new javax.swing.JComboBox<>();
        jBid = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setUndecorated(true);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel2.setText("Library Management  System");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Student Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Enter Book ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Select Issue Date");

        jButton3.setText("Submit");
        jButton3.setActionCommand("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSidActionPerformed(evt);
            }
        });

        jBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBidActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter Student ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Book Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSid, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBid, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Submit button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        //sid
        sid = jSid.getSelectedItem().toString();

        //bid
        bid = jBid.getSelectedItem().toString();

        //date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        issuedate = sdf.format(jDateChooser1.getDate());
        System.out.println(issuedate);

        try {
            availablestatus = checkStatus();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("availablestatus: " + availablestatus);

        if (availablestatus) {
            String insertQuery = "insert into issuebook" + "(sid,bid,issuedate)" + "values(?,?,?)";
            String updateAvailable = "update issuebook set available = 0 where bid = (?)"; // set available false ( true = 1 and false = 0)
            try {
                runQuery(insertQuery);
                runUpdate(updateAvailable);
                System.out.println("Available set to false");
            } catch (SQLException ex) {
                Logger.getLogger(NewBook.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Book is already issued!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    //close button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            con.close();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //Books Combobox
    private void jBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBidActionPerformed
        // TODO add your handling code here:
        String b = jBid.getSelectedItem().toString();
        System.out.println("s for selected items" + b);
        setBookName(b);
    }//GEN-LAST:event_jBidActionPerformed

    //Students Combobox
    private void jSidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSidActionPerformed
        // TODO add your handling code here:
        String s = jSid.getSelectedItem().toString();
        System.out.println("s for selected items" + s);
        setStudentName(s);
    }//GEN-LAST:event_jSidActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IssueBook().setVisible(true);
        });
    }

    //studentsDisplay
    private void studentsDisplay() {
        try {
            con = ConnectionProvider.getDBcon();
            String q = "select sid from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                int sid = rs.getInt(1);
                jSid.addItem(String.valueOf(sid));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setStudentName(String s) {
        try {
            con = ConnectionProvider.getDBcon();
            String q = "select sname from student where sid=" + s;
            System.out.println("q:" + q);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println("name" + name);
                jLabel4.setText(name);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //booksDisplay
    private void booksDisplay() {

        try {
            con = ConnectionProvider.getDBcon();
            String q = "select bid from book";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                int bid = rs.getInt(1);
                jBid.addItem(String.valueOf(bid));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setBookName(String b) {
        try {
            con = ConnectionProvider.getDBcon();
            String q = "select bname from book where bid=" + b;
            System.out.println("q:" + q);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println("name" + name);
                jLabel8.setText(name);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //checkStatus
    public Boolean checkStatus() throws SQLException, ClassNotFoundException {
        con = ConnectionProvider.getDBcon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select available from issuebook where bid=" + bid);
        Boolean s;
        if (rs.next()) {
            s = rs.getBoolean("available");
            System.out.println("Boolean: " + s);
            return s;
        }
        return true;
    }

    //runUpdate to change boolean value
    public void runUpdate(String q) throws SQLException, ClassNotFoundException {
        // continue from here
        con = ConnectionProvider.getDBcon();
        PreparedStatement pst = con.prepareStatement(q);
        pst.setString(1, bid);
        int i = pst.executeUpdate();
        System.out.println(i + " available value change");
    }

    //function for issuebook
    public void runQuery(String query) throws SQLException, ClassNotFoundException {

        con = ConnectionProvider.getDBcon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student where sid=" + sid);
        if (rs.next()) {
            ResultSet rrs = st.executeQuery("select * from book where bid =" + bid);
            {
                if (rrs.next()) {
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setString(1, sid);
                        pst.setString(2, bid);
                        pst.setString(3, issuedate);

                        int i = pst.executeUpdate();
                        this.setVisible(false);
                        new IssueBook().setVisible(true);
                        System.out.println(i + " records inserted");
                        JOptionPane.showMessageDialog(null, "Book Issued!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "invalid book id");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "invalid student id");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jSid;
    // End of variables declaration//GEN-END:variables

}
