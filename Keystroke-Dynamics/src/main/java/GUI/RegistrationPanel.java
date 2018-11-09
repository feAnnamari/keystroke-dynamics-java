/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Controller;
import Data.Global;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Annamari
 */
public class RegistrationPanel extends javax.swing.JPanel implements KeyListener{

    private Controller controller;
    private ArrayList<JTextField> txtInputs = new ArrayList<JTextField>();
    private ArrayList<Long> pressTimes = new ArrayList<>();
    private ArrayList<Long> releaseTimes = new ArrayList<>();
    /**
     * Creates new form Panel
     */
    public RegistrationPanel(){
        initComponents();
        setting();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnSave = new javax.swing.JButton();
        lblWrite = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        txtInput3 = new javax.swing.JTextField();
        txtInput4 = new javax.swing.JTextField();
        txtInput5 = new javax.swing.JTextField();
        txtInput6 = new javax.swing.JTextField();
        txtInput7 = new javax.swing.JTextField();
        txtInput8 = new javax.swing.JTextField();
        txtInput9 = new javax.swing.JTextField();
        txtInput10 = new javax.swing.JTextField();
        txtInput11 = new javax.swing.JTextField();
        txtInput12 = new javax.swing.JTextField();
        txtInput13 = new javax.swing.JTextField();
        txtInput14 = new javax.swing.JTextField();
        txtInput15 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();

        setBackground(new java.awt.Color(133, 150, 166));
        setForeground(new java.awt.Color(255, 255, 255));

        btnSave.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnSave.setText("Adatok mentése");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveActionPerformed(evt);
            }
        });

        lblWrite.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblWrite.setForeground(new java.awt.Color(255, 255, 255));
        lblWrite.setText("Írd be 15-ször a következő szót:");

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("jLabel4");

        jButton2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jButton2.setText("Bejelentkezés");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        txtInput1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput1.setMinimumSize(new java.awt.Dimension(6, 30));

        txtInput2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput2.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput2.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput3.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput3.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput4.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput4.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput5.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput5.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput6.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput6.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput7.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput7.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput8.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput8.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput9.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput9.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput10.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput10.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput11.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput11.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput12.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput12.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput13.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput13.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput14.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput14.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtInput15.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput15.setPreferredSize(new java.awt.Dimension(59, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1.");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2.");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3.");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("4.");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("5.");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("6.");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("7.");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("8.");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("9.");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("10.");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("11.");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("12.");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("13.");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("14.");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("15.");

        txtName.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        txtName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Név / E-mail:");

        txtPass.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        txtPass.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Jelszó:");

        btnReg.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnReg.setText("Regisztráció");
        btnReg.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnReg.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWrite)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInput4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(btnSave))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        lblWrite.getAccessibleContext().setAccessibleName("lblBeginning");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        controller.saveToDataBase();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controller.loginFrameStart();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegActionPerformed
    {//GEN-HEADEREND:event_btnRegActionPerformed
        if(txtName.getText().equals("") || txtPass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Adja meg a nevét / e-mail címét és jelszavát is!", "Hiba", JOptionPane.ERROR_MESSAGE); 
        }
        else{
        txtName.setEnabled(false);
        txtPass.setEnabled(false);
        Global.PASSWORD = txtPass.getText();
        lblPassword.setText(Global.PASSWORD);
        lblPassword.setVisible(true);
        txtSetEnable(true);
        lblWrite.setVisible(true);
        
        }
    }//GEN-LAST:event_btnRegActionPerformed

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblWrite;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput10;
    private javax.swing.JTextField txtInput11;
    private javax.swing.JTextField txtInput12;
    private javax.swing.JTextField txtInput13;
    private javax.swing.JTextField txtInput14;
    private javax.swing.JTextField txtInput15;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtInput3;
    private javax.swing.JTextField txtInput4;
    private javax.swing.JTextField txtInput5;
    private javax.swing.JTextField txtInput6;
    private javax.swing.JTextField txtInput7;
    private javax.swing.JTextField txtInput8;
    private javax.swing.JTextField txtInput9;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()!= KeyEvent.VK_BACK_SPACE){
            pressTimes.add(e.getWhen());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()!= KeyEvent.VK_BACK_SPACE){
            releaseTimes.add(e.getWhen());
            checkPassLength();
        }
    }

    private void setting() {
        txtInputsListIN();
        addKeyListeners();
        lblPassword.setVisible(false);
        txtSetEnable(false);
        lblWrite.setVisible(false);
    }

    private void checkPassLength() {
        for (JTextField txtInput : txtInputs) {
            if(txtInput.getText().equals(Global.PASSWORD)&& txtInput.isEnabled())
            {
                txtInput.setEnabled(false);
                if(pressTimes.size() == releaseTimes.size())
                {
                    controller.calculate(pressTimes,releaseTimes);
                    controller.addTyping();
                    controller.calculateNeural(txtName.getText(), true);
                }
                pressTimes.clear();
                releaseTimes.clear();
            }
        }
        if(!txtInputs.get(txtInputs.size()-1).isEnabled())
        {
            btnSave.setEnabled(true);
        }
    }

    private void txtInputsListIN() {
        txtInputs.add(txtInput1);
        txtInputs.add(txtInput2);
        txtInputs.add(txtInput3);
        txtInputs.add(txtInput4);
        txtInputs.add(txtInput5);
        txtInputs.add(txtInput6);
        txtInputs.add(txtInput7);
        txtInputs.add(txtInput8);
        txtInputs.add(txtInput9);
        txtInputs.add(txtInput10);
        txtInputs.add(txtInput11);
        txtInputs.add(txtInput12);
        txtInputs.add(txtInput13);
        txtInputs.add(txtInput14);
        txtInputs.add(txtInput15);
        
    }

    private void addKeyListeners() {
        for (JTextField txtInput : txtInputs) {
            txtInput.addKeyListener(this);
        }
    }

    public void txtSetEnable(boolean b) {
        for (JTextField txtInput : txtInputs) {
            txtInput.setText("");
            txtInput.setEnabled(b);  
        }
    }
    
}
