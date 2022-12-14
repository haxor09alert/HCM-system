package view;
import javax.swing.JOptionPane;

import controller.UserController;
// import javax.swing.JOptionPane;
import models.User;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        cpassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        LOGIN = new javax.swing.JButton();
        APPOIINTMENT = new javax.swing.JButton();
        ABOUTUS = new javax.swing.JButton();
        UPDATES = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        signUpButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setLayout(null);

        jLabel5.setText("CONFIRM PASSWORD");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 220, 200, 16);

        jLabel6.setText("PASSWORD");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 160, 140, 16);

        jLabel7.setText("NAME");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 40, 37, 16);

        jLabel8.setText("EMAIL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 100, 37, 16);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(40, 120, 220, 30);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(40, 60, 220, 30);
        jPanel1.add(cpassword);
        cpassword.setBounds(40, 240, 220, 30);
        jPanel1.add(password);
        password.setBounds(40, 180, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 210, 310, 290);

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));
        jPanel2.setLayout(null);

        LOGIN.setText("LOGIN");
        jPanel2.add(LOGIN);
        LOGIN.setBounds(370, 10, 72, 23);

        APPOIINTMENT.setText("APPOIINTMENT");
        jPanel2.add(APPOIINTMENT);
        APPOIINTMENT.setBounds(240, 10, 114, 23);

        ABOUTUS.setText("ABOUT US");
        ABOUTUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABOUTUSActionPerformed(evt);
            }
        });
        jPanel2.add(ABOUTUS);
        ABOUTUS.setBounds(120, 10, 100, 23);

        UPDATES.setText("UPDATES");
        jPanel2.add(UPDATES);
        UPDATES.setBounds(10, 10, 90, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(710, 60, 450, 40);

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("SIGN UP");
        jLabel1.setAlignmentX(1.0F);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(530, 160, 100, 30);

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Already have an account..");
        getContentPane().add(login);
        login.setBounds(440, 570, 290, 23);

        signUpButton1.setBackground(new java.awt.Color(153, 105, 255));
        signUpButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUpButton1.setText("Sign up ");
        signUpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(signUpButton1);
        signUpButton1.setBounds(550, 530, 110, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Health Track logo smaller.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 140, 237, 196);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG frame.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1160, 675);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ABOUTUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABOUTUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ABOUTUSActionPerformed

    private void signUpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButton1ActionPerformed
        // TODO add your handling code here:
        String Name = name.getText();
        String Email = email.getText();

        String Password = new String(password.getPassword());
        String Cpassword = cpassword.getText();

        int a = 0;
        if (Name.equals("")) {
            JOptionPane.showMessageDialog(null, "NAME IS MISSING.");
            a = 1;
        }
        if (Email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email IS MISSING.");
            a = 1;
        }
        if (!Email.endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(null, "Email SYNTAX IS WRONG.");
            a = 1;
        }
        if (Password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password IS MISSING.");
            a = 1;
        }
        if (Cpassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Confirm Password IS MISSING.");
        }
        // if (Password.equals(Cpassword)){
        // JOptionPane.showMessageDialog(null,"VALIDATION SUCCESSFUL");
        // }
        if (!Password.equals(Cpassword)) {
            JOptionPane.showMessageDialog(null, "Password dosenot match");
            a = 1;
        }
        if (a == 0) {

            try {
                User s1 = new User(Name, Email, Password);
                UserController sc = new UserController();
                int insertedStudent = sc.insertDetails(s1);

                if (insertedStudent > 0) {
                    System.out.println("data inserted");
                } else {
                    System.out.println("Failed to insert data");
                }
                JOptionPane.showMessageDialog(null, "VALIDATION SUCCESSFUL");
            } catch (Exception e) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, e);
                System.out.printf(null,e);
            }
        }


    }//GEN-LAST:event_signUpButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABOUTUS;
    private javax.swing.JButton APPOIINTMENT;
    private javax.swing.JButton LOGIN;
    private javax.swing.JButton UPDATES;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signUpButton1;
    // End of variables declaration//GEN-END:variables
}
