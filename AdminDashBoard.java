package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Maharjan
 */
public class AdminDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashBoard
     */
    public AdminDashBoard() {
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

        MenuPanel = new javax.swing.JPanel();
        UpdatesButton = new javax.swing.JButton();
        AboutUs = new javax.swing.JButton();
        Appointments = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DoctorListBtn = new javax.swing.JButton();
        BillingBtn = new javax.swing.JButton();
        PrescriptionBtn = new javax.swing.JButton();
        DonerListBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        AboutUs.setBackground(new java.awt.Color(123, 100, 148));
        AboutUs.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        AboutUs.setText("ABOUT US");
        AboutUs.setActionCommand("");
        AboutUs.setBorder(null);
        AboutUs.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AboutUs.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });

        Appointments.setBackground(new java.awt.Color(123, 100, 148));
        Appointments.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Appointments.setText("APPOINTMENTS");
        Appointments.setToolTipText("");
        Appointments.setActionCommand("");
        Appointments.setBorder(null);
        Appointments.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Appointments.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Appointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsActionPerformed(evt);
            }
        });

        Profile.setBackground(new java.awt.Color(123, 100, 148));
        Profile.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Profile.setText("PROFILE");
        Profile.setBorder(null);
        Profile.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Profile.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
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
                .addComponent(AboutUs)
                .addGap(63, 63, 63)
                .addComponent(Appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Appointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AboutUs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(UpdatesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(MenuPanel);
        MenuPanel.setBounds(710, 140, 840, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maharjan\\Downloads\\Health Track logo smaller.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 70, 200, 200);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);

        DoctorListBtn.setBackground(new java.awt.Color(102, 0, 102));
        DoctorListBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        DoctorListBtn.setText("Doctor List");
        DoctorListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorListBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorListBtn);
        DoctorListBtn.setBounds(10, 10, 243, 100);

        BillingBtn.setBackground(new java.awt.Color(102, 0, 102));
        BillingBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        BillingBtn.setText("Billings");
        jPanel1.add(BillingBtn);
        BillingBtn.setBounds(260, 10, 227, 100);

        PrescriptionBtn.setBackground(new java.awt.Color(102, 0, 102));
        PrescriptionBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        PrescriptionBtn.setText("Prescription");
        jPanel1.add(PrescriptionBtn);
        PrescriptionBtn.setBounds(10, 120, 243, 100);

        DonerListBtn.setBackground(new java.awt.Color(102, 0, 102));
        DonerListBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        DonerListBtn.setText("Doner List");
        DonerListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonerListBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DonerListBtn);
        DonerListBtn.setBounds(260, 120, 227, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 380, 500, 240);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BG_frame.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1550, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatesButtonActionPerformed
        // TODO add your handling code here:
        Disease_Info pi =  new Disease_Info();
        pi.setVisible(true);
    }//GEN-LAST:event_UpdatesButtonActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUsActionPerformed

    private void AppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppointmentsActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:

        Profile pi =  new Profile();
        pi.setVisible(true);
    }//GEN-LAST:event_ProfileActionPerformed

    private void DoctorListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorListBtnActionPerformed
        doctorlistupdate pi =  new doctorlistupdate();
        pi.setVisible(true);
    }//GEN-LAST:event_DoctorListBtnActionPerformed

    private void PrescriptionbtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        DONERLISTFORM pi =  new DONERLISTFORM();
        pi.setVisible(true);
    } 
    
    private void DonerListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonerListBtnActionPerformed
        prescription pi =  new prescription();
        pi.setVisible(true);
    }//GEN-LAST:event_DonerListBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JButton Appointments;
    private javax.swing.JButton BillingBtn;
    private javax.swing.JButton DoctorListBtn;
    private javax.swing.JButton DonerListBtn;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton PrescriptionBtn;
    private javax.swing.JButton Profile;
    private javax.swing.JButton UpdatesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
