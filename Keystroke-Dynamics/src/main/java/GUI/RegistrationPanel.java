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

/**
 *
 * @author Annamari
 */
public class RegistrationPanel extends javax.swing.JPanel implements KeyListener{

    private Controller controller;
    private ArrayList<Long> pressTimes = new ArrayList<>();
    private ArrayList<Long> releaseTimes = new ArrayList<>();
    
    /**
     * Showing the information if the verification was successful or not 
     * @param success 
     */
    public void setInformation(boolean success) {
        if(success)
        {
            lblLogin.setForeground(new Color(184, 233, 148));
            lblLogin.setText("Sikeres bejelentkezés!");
        }
        else
        {
            lblLogin.setForeground(new Color(231, 76, 60));
            lblLogin.setText("Sikertelen bejelentkezés!");
        }
        
    }   

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
    /**
     * Creates new form ReigstrationPanel
     */
    public RegistrationPanel() {
        initComponents();
        settings();
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

        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnLogin.setText("Bejelentkezés");
        btnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jelszó:");

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Név:");

        lblLogin.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 204, 102));
        lblLogin.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         controller.calculate(pressTimes, releaseTimes);
         controller.calculateNeural(txtEmail.getText(), pressTimes, releaseTimes, false);
         back();
    }//GEN-LAST:event_btnLoginActionPerformed

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()!= KeyEvent.VK_BACK_SPACE){
        pressTimes.add(e.getWhen());
        }
        else
        {
            pressTimes.remove(pressTimes.size()-1);
            releaseTimes.remove(releaseTimes.size()-1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()!= KeyEvent.VK_BACK_SPACE){
            releaseTimes.add(e.getWhen());
            checkPassLength();
        }
        
    }

     private void checkPassLength() {
          if(txtPassword.getText().equals(Global.PASSWORD)&& txtPassword.isEnabled())
            {
                txtPassword.setEnabled(false);
                /*pressTimes.clear();
                releaseTimes.clear();*/
          }
    }
    
    private void settings() {
        
        txtPassword.addKeyListener(this);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void back() {
        txtEmail.setText("");
        txtPassword.setEnabled(true);
        txtPassword.setText("");
        pressTimes.clear();
        releaseTimes.clear();
    }
}
