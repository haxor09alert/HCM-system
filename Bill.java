/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FeesController;
import java.util.Date;
import javax.swing.JOptionPane;
import models.Fees;

/**
 *
 * @author Maharjan
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
        billHeader();
    }
    
    private void billHeader(){
        BillPage.setText("-------------------------------------------------------------------------------------------------"+"\n"+"\t"+"HMS BILLS"+"                Contact Email: hms@gmail.com"+"\n" + "-------------------------------------------------------------------------------------------------");
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
        Appointment = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        PanelData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PatientNameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BedNoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DoctorNameText = new javax.swing.JTextField();
        TotalLabel = new javax.swing.JLabel();
        TotalText = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillPage = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

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

        Appointment.setBackground(new java.awt.Color(123, 100, 148));
        Appointment.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Appointment.setText("APPOINTMENTS");
        Appointment.setToolTipText("");
        Appointment.setActionCommand("");
        Appointment.setBorder(null);
        Appointment.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Appointment.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentActionPerformed(evt);
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
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(UpdatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(AboutUs)
                .addGap(63, 63, 63)
                .addComponent(Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Appointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AboutUs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(UpdatesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(MenuPanel);
        MenuPanel.setBounds(700, 60, 879, 60);

        PanelData.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Patient Name:");

        PatientNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Bed No:");

        BedNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedNoTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Doctor Name:");

        TotalLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        TotalLabel.setText("Total :");

        javax.swing.GroupLayout PanelDataLayout = new javax.swing.GroupLayout(PanelData);
        PanelData.setLayout(PanelDataLayout);
        PanelDataLayout.setHorizontalGroup(
            PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataLayout.createSequentialGroup()
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDataLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientNameText)
                    .addComponent(BedNoText)
                    .addComponent(DoctorNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(TotalText))
                .addContainerGap())
        );
        PanelDataLayout.setVerticalGroup(
            PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(BedNoText))
                .addGap(18, 18, 18)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(DoctorNameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(PanelData);
        PanelData.setBounds(490, 270, 464, 284);

        ADD.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        getContentPane().add(ADD);
        ADD.setBounds(500, 570, 140, 39);

        CLEAR.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR);
        CLEAR.setBounds(800, 570, 140, 39);

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButton4.setText("PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(650, 620, 140, 40);

        BillPage.setColumns(20);
        BillPage.setRows(5);
        jScrollPane1.setViewportView(BillPage);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(970, 270, 390, 390);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BG_frame.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1940, 1120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatesButtonActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutUsActionPerformed

    private void AppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppointmentActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
        
        Profile pro=new Profile();
        dispose();
        pro.show();
    }//GEN-LAST:event_ProfileActionPerformed

    private void PatientNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientNameTextActionPerformed

    private void BedNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BedNoTextActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        String PatientName=PatientNameText.getText();
        String StringBedNo=BedNoText.getText();
        String DoctorName=DoctorNameText.getText();
        String StringTotal=TotalText.getText();
        
        
        
        if (PatientName.equals("")){
            JOptionPane.showMessageDialog(null,"Patient Name cannot be empty");
        }
        
        else if (StringBedNo.equals("")){
            JOptionPane.showMessageDialog(null,"Bed Number cannot be empty");
        }
        
        else if (DoctorName.equals("")){
            JOptionPane.showMessageDialog(null,"Doctor Name cannot be empty");
        }
        
        else if (StringTotal.equals("")){
            JOptionPane.showMessageDialog(null,"Total Amount cannot be empty");
        }
        
        else{

            int BedNo=Integer.parseInt(StringBedNo);
            double Total=Double.parseDouble(StringTotal);

            Fees s1= new Fees(PatientName,BedNo,DoctorName,Total);
            FeesController sc= new FeesController();
            int insertedStudent=sc.insertDetails(s1);

            if (insertedStudent > 0){
                System.out.println("Inserted");
                JOptionPane.showMessageDialog(null,"Inserted Sucessfully");
            }

            else{
                System.out.println("Failed");
            }

            

            
            
            Date obj=new Date();
            String date=obj.toString();
            
            BillPage.setText(BillPage.getText()+"\n"+date+"\n\n");
            BillPage.setText(BillPage.getText()+"Patient Name:"+"\t"+PatientNameText.getText()+"\n");
            BillPage.setText(BillPage.getText()+"Bed No:"+"\t"+BedNoText.getText()+"\n");
            BillPage.setText(BillPage.getText()+"Doctor Name:"+"\t"+DoctorNameText.getText()+"\n");
            BillPage.setText(BillPage.getText()+"Total:"+"\t"+TotalText.getText()+"\n");
            
            PatientNameText.setText("");
            BedNoText.setText("");
            DoctorNameText.setText("");
            TotalText.setText("");
        }
        
    }//GEN-LAST:event_ADDActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        // TODO add your handling code here:
        PatientNameText.setText("");
            BedNoText.setText("");
            DoctorNameText.setText("");
            TotalText.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            BillPage.print();
        } catch (Exception e){
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton AboutUs;
    private javax.swing.JButton Appointment;
    private javax.swing.JTextField BedNoText;
    private javax.swing.JTextArea BillPage;
    private javax.swing.JButton CLEAR;
    private javax.swing.JTextField DoctorNameText;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PanelData;
    private javax.swing.JTextField PatientNameText;
    private javax.swing.JButton Profile;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JTextField TotalText;
    private javax.swing.JButton UpdatesButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
