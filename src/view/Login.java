package view;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import java.sql.ResultSet;

import javax.swing.JOptionPane;

import controller.UserController;
import models.User;

/**
 *
 * @author Maharjan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        LoginLabel = new javax.swing.JLabel();
        EmailPasswordPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        SignupButton = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        UpdatesButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(2000, 2000));
        getContentPane().setLayout(null);

        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        LoginLabel.setBackground(new java.awt.Color(75, 9, 75));
        LoginLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 40)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("LOGIN");
        LoginLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LoginLabel.setOpaque(true);
        jPanel1.add(LoginLabel);
        LoginLabel.setBounds(690, 140, 150, 60);

        EmailPasswordPanel.setBackground(new java.awt.Color(75, 9, 75));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emailLabel.setText("E-mail");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PasswordLabel.setText("Password");

        LoginButton.setBackground(new java.awt.Color(204, 204, 204));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(75, 9, 75));
        LoginButton.setText("LOGIN");
        LoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 3, true));
        LoginButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LoginButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmailPasswordPanelLayout = new javax.swing.GroupLayout(EmailPasswordPanel);
        EmailPasswordPanel.setLayout(EmailPasswordPanelLayout);
        EmailPasswordPanelLayout.setHorizontalGroup(
            EmailPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailPasswordPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(EmailPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmailPasswordPanelLayout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmailPasswordPanelLayout.createSequentialGroup()
                        .addGroup(EmailPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordText)
                            .addComponent(PasswordLabel)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel))
                        .addGap(49, 49, 49))))
        );
        EmailPasswordPanelLayout.setVerticalGroup(
            EmailPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailPasswordPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel1.add(EmailPasswordPanel);
        EmailPasswordPanel.setBounds(510, 210, 490, 320);

        SignupButton.setBackground(new java.awt.Color(75, 9, 75));
        SignupButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(255, 255, 255));
        SignupButton.setText("Sign Up");
        SignupButton.setBorder(null);
        SignupButton.setOpaque(true);
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignupButton);
        SignupButton.setBounds(700, 570, 120, 25);

        MenuPanel.setBackground(new java.awt.Color(123, 100, 148));

        UpdatesButton.setBackground(new java.awt.Color(123, 100, 148));
        UpdatesButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        UpdatesButton.setText("UPDATES");
        UpdatesButton.setBorder(null);
        UpdatesButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UpdatesButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        UpdatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatesButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(123, 100, 148));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButton1.setText("ABOUT US");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(123, 100, 148));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButton2.setText("APPOINTMENTS");
        jButton2.setToolTipText("");
        jButton2.setActionCommand("");
        jButton2.setBorder(null);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(123, 100, 148));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButton3.setText("LOGIN");
        jButton3.setBorder(null);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(UpdatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addGap(63, 63, 63)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(UpdatesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(MenuPanel);
        MenuPanel.setBounds(720, 30, 840, 60);

        jLabel1.setBackground(new java.awt.Color(102, 0, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BG_frame.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, -10, 1680, 960);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 1660, 950);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatesButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            
            User u1 = new User(null, emailText.getText(), new String(passwordText.getPassword()),null);
            UserController uc = new UserController();
            ResultSet loginresult = uc.selectDetails(u1);

            if(loginresult.next()){

                JOptionPane.showMessageDialog(this,"Login Success");
                uc.changestatus(u1);
                uc.Updatestatus(u1);

                dispose();
                Dashboard dash=new Dashboard();
                dash.show();
            }
            else{
                JOptionPane.showMessageDialog(this,"Either Email or Password is not correct");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
            
            
            
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        signup acc=new signup();
        acc.show();
    }//GEN-LAST:event_SignupButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmailPasswordPanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton SignupButton;
    private javax.swing.JButton UpdatesButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordText;
    // End of variables declaration//GEN-END:variables
}
