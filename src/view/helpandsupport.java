package view;

import java.math.BigInteger;

import javax.swing.JOptionPane;
import controller.HnSController;
import models.helpnsupportm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AVISHEK SHAH
 */
public class helpandsupport extends javax.swing.JFrame {

    /**
     * Creates new form helpandsupport
     */
    public helpandsupport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        feedback = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jButton4.setText("PROFILE");
        jPanel1.add(jButton4);
        jButton4.setBounds(414, 25, 89, 23);

        jButton2.setText("ABOUT US");
        jPanel1.add(jButton2);
        jButton2.setBounds(6, 25, 95, 23);

        jButton3.setText("APPOINTMENTS");
        jPanel1.add(jButton3);
        jButton3.setBounds(119, 25, 147, 23);

        jButton1.setText("UPDATES");
        jPanel1.add(jButton1);
        jButton1.setBounds(296, 25, 100, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(310, 60, 520, 70);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(null);

        jLabel6.setText("Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(27, 21, 60, 16);

        jLabel4.setText("Contact ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(27, 63, 60, 16);

        jLabel3.setText("Address");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(27, 103, 60, 16);

        jLabel5.setText("E mail");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(27, 143, 60, 20);

        jButton12.setText("Submit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(86, 182, 103, 33);
        jPanel2.add(name);
        name.setBounds(105, 18, 130, 30);
        jPanel2.add(contact);
        contact.setBounds(105, 60, 130, 30);
        jPanel2.add(address);
        address.setBounds(105, 100, 130, 30);
        jPanel2.add(email);
        email.setBounds(105, 142, 130, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(490, 310, 270, 240);

        feedback.setBackground(new java.awt.Color(153, 153, 255));
        feedback.setText("How can we help you?");
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });
        getContentPane().add(feedback);
        feedback.setBounds(270, 310, 207, 190);

        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setText("info.hcms@gmail.com");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 510, 210, 30);

        // jLabel8.setIcon(new
        // javax.swing.ImageIcon(getClass().getResource("/view/Capture.PNG"))); //
        // NOI18N
        // jLabel8.setText("jLabel8");
        // getContentPane().add(jLabel8);
        // jLabel8.setBounds(10, 10, 200, 180);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BG_frame.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-40, -30, 940, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String Name = name.getText();
        String SContact = contact.getText();
        String Address = address.getText();
        String Email = email.getText();
        String Feedback = feedback.getText();

        int a = 0;
        if (Name.equals("")) {
            JOptionPane.showMessageDialog(null, "NAME IS MISSING.");
            a = 1;
        }
        if (SContact.equals("")) {
            JOptionPane.showMessageDialog(null, "Contact IS MISSING.");
            a = 1;
        }
        if (Address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address IS MISSING.");
            a = 1;
        }
        if (Email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email IS MISSING.");
            a = 1;
        }

        if (Feedback.equals("")) {
            JOptionPane.showMessageDialog(null, "Feedback IS MISSING.");
            a = 1;
        }

        if (a == 0) {

            helpnsupportm s1 = new helpnsupportm(Name, SContact, Address, Email, Feedback);
            HnSController sc = new HnSController();
            int inserteddata = sc.insertDetails(s1);

            if (inserteddata > 0) {
                JOptionPane.showMessageDialog(null, "verified successfull.");
            }

            else {
                JOptionPane.showMessageDialog(null, "Failed.");
            }
        }

    }// GEN-LAST:event_jButton12ActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_feedbackActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_feedbackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(helpandsupport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(helpandsupport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(helpandsupport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(helpandsupport.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new helpandsupport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField feedback;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}