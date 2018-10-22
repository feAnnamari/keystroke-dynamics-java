/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Controller;
import Data.Global;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Annamari
 */
public class Panel extends javax.swing.JPanel implements KeyListener{

    //private long pressTime1, pressTime2, releaseTime1, releaseTime2;
    //private double flightTimeT1, flightTimeT2, flightTimeT3, flightTimeT4, dwellTime;
    private Controller controller;
    //private int i;
    private ArrayList<JTextField> txtInputs = new ArrayList<JTextField>();
    private ArrayList<Long> pressTimes = new ArrayList<>();
    private ArrayList<Long> releaseTimes = new ArrayList<>();
    /**
     * Creates new form Panel
     */
    public Panel(){
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
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jToggleButton1 = new javax.swing.JToggleButton();
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

        jButton1.setText("Adatok mentése");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Írd be 15-ször a következő szót:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("jLabel4");

        jButton2.setText("Kiértékelés");
        jButton2.setEnabled(false);

        txtInput1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput1.setMinimumSize(new java.awt.Dimension(6, 30));

        txtInput2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput2.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput2.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput3.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput3.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput4.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput4.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput5.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput5.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput6.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput6.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput7.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput7.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput8.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput8.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput9.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput9.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput10.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput10.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput11.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput11.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput12.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput12.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput13.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput13.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput14.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput14.setPreferredSize(new java.awt.Dimension(59, 30));

        txtInput15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtInput15.setMinimumSize(new java.awt.Dimension(6, 30));
        txtInput15.setPreferredSize(new java.awt.Dimension(59, 30));

        jToggleButton1.setText("Új user");

        jLabel2.setText("1.");

        jLabel3.setText("1.");

        jLabel4.setText("1.");

        jLabel5.setText("1.");

        jLabel6.setText("1.");

        jLabel7.setText("1.");

        jLabel8.setText("1.");

        jLabel9.setText("1.");

        jLabel10.setText("1.");

        jLabel11.setText("1.");

        jLabel12.setText("1.");

        jLabel13.setText("1.");

        jLabel14.setText("1.");

        jLabel15.setText("1.");

        jLabel16.setText("1.");

        jLabel17.setText("Név:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtInput4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jToggleButton1))
                .addGap(23, 23, 23))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblBeginning");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.saveToDataBase(txtName.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblPassword;
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
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        pressTimes.add(e.getWhen());
        
        
        /*if(e.getKeyCode()!= KeyEvent.VK_BACK_SPACE)
        {
            if(i%2==0){
                pressTime1 = e.getWhen();
                if(i!=2)
                {
                    flightTimeT1 = ((double)(pressTime1-releaseTime2))/1000;
                    //flightTimeT3 = ((double)(pressTime1-pressTime2))/1000;
                    controller.addFlightTimeT1(flightTimeT1);
                   // controller.addFlightTimeT3(flightTimeT3);
                }

            }
            else{
                pressTime2 = e.getWhen();
                flightTimeT1 = ((double)(pressTime2-releaseTime1))/1000;
                //flightTimeT3 = ((double)(pressTime2-pressTime1))/1000;
                controller.addFlightTimeT1(flightTimeT1);
                //controller.addFlightTimeT3(flightTimeT3);
            }     
        }
        else
        {
             controller.removeFlightTimeT1();
             i--;
        }*/
    }

    @Override
    public void keyReleased(KeyEvent e) {
        releaseTimes.add(e.getWhen());
        checkPassLength();
        /*if(e.getKeyCode()!= KeyEvent.VK_BACK_SPACE)
        {
            if(i%2==0){
                releaseTime1 = e.getWhen();
                dwellTime = ((double)(releaseTime1-pressTime1))/1000;
                /*if(i!=2)
                {
                    flightTimeT2 = ((double)(releaseTime1-releaseTime2))/1000;
                    flightTimeT4 = ((double)(releaseTime1-pressTime2))/1000;
                    controller.addFlightTimeT2(flightTimeT2);
                    controller.addFlightTimeT4(flightTimeT4);
                }

                controller.addDwellTime(dwellTime);
            }
            else if((i%2)!=0){ 
                releaseTime2 = e.getWhen();
                dwellTime = ((double)(releaseTime2-pressTime2))/1000;
               // flightTimeT2 = ((double)(releaseTime2-releaseTime1))/1000;
                //flightTimeT4 = ((double)(releaseTime2-pressTime1))/1000;
                //controller.addFlightTimeT2(flightTimeT2);
                //controller.addFlightTimeT3(flightTimeT3);
                controller.addDwellTime(dwellTime);
            }
            i++;
            checkPassLength();
        }
        else
        {
             controller.removeDwellTime();
             i--;
        } */
    }

    private void setting() {
        txtInputsListIN();
        addKeyListeners();
        lblPassword.setText(Global.PASSWORD);
        
    }

    private void checkPassLength() {
        for (JTextField txtInput : txtInputs) {
            if(txtInput.getText().equals(Global.PASSWORD)&& txtInput.isEnabled())
            {
                txtInput.setEnabled(false);
                controller.calculate(pressTimes,releaseTimes);
                pressTimes.clear();
                releaseTimes.clear();
            }
            
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
