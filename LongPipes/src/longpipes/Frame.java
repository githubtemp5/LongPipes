/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pipes.*;

/**
 *
 * @author up826133
 */
public class Frame extends javax.swing.JFrame {

    private double pipeLength;
    private double pipeDiameter;
    private int pipeGrade;
    private int pipeColour;
    private boolean innerInsulation;
    private boolean outerReinforcement;
    private boolean chemicalResistance;
    private int pipeQuantity;
    private ArrayList<Pipe>pipeArray = new ArrayList<Pipe>();
    /**
     * Creates new form Frame
     */
    
    public Frame() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pipeSubmit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lengthBox = new javax.swing.JTextField();
        diameterBox = new javax.swing.JTextField();
        gradeBox = new javax.swing.JComboBox<>();
        colourBox = new javax.swing.JComboBox<>();
        insulationBox = new javax.swing.JCheckBox();
        reinforceBox = new javax.swing.JCheckBox();
        chemicalBox = new javax.swing.JCheckBox();
        quantityBox = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lengthLabel = new javax.swing.JLabel();
        diameterLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        colourLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Pipe Ordering System");

        jLabel2.setText("Pipe Length (Metres):");

        jLabel3.setText("Pipe Diameter (Inches):");

        jLabel4.setText("Pipe Grade:");

        jLabel5.setText("Pipe Colours:");

        jLabel7.setText("Pipe Insulation?");

        jLabel8.setText("Outer Reinforcement?");

        jLabel9.setText("Chemical Resistance?");

        jLabel10.setText("Order Quantity:");

        pipeSubmit.setText("Submit");
        pipeSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeSubmitActionPerformed(evt);
            }
        });

        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lengthBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lengthBoxFocusLost(evt);
            }
        });

        diameterBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                diameterBoxFocusLost(evt);
            }
        });

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5" }));
        gradeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeBoxActionPerformed(evt);
            }
        });

        colourBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "0", "1", "2" }));
        colourBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colourBoxActionPerformed(evt);
            }
        });

        insulationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insulationBoxActionPerformed(evt);
            }
        });

        reinforceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinforceBoxActionPerformed(evt);
            }
        });

        chemicalBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemicalBoxActionPerformed(evt);
            }
        });

        quantityBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityBoxFocusLost(evt);
            }
        });
        quantityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pipeSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insulationBox)
                                    .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lengthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lengthLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chemicalBox)
                                    .addComponent(reinforceBox))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradeLabel)
                                    .addComponent(diameterLabel)
                                    .addComponent(colourLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalLabel)
                                    .addComponent(quantityLabel))
                                .addGap(65, 65, 65))))))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lengthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diameterBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(diameterLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colourLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(insulationBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(reinforceBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(chemicalBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel)
                    .addComponent(totalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pipeSubmit)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pipeSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeSubmitActionPerformed
        checkPipe();
        pipeArray.get(0).getPrice();
    }//GEN-LAST:event_pipeSubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quantityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityBoxActionPerformed

    private void gradeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeBoxActionPerformed
        int input;

        input = gradeBox.getSelectedIndex();
        if (input == 0) {
            gradeLabel.setText("Select a grade.");
        } else {
            pipeGrade = input;
        }
    }//GEN-LAST:event_gradeBoxActionPerformed

    private void lengthBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lengthBoxFocusLost
        double input;
        lengthLabel.setText("");
        try {
            input = Double.parseDouble(lengthBox.getText());
            if (input > 0 && input <= 6) {
                pipeLength = input;
            } else {
                lengthBox.setText("");
                lengthLabel.setText("Enter number between 0 and 6");
            }
        } catch (Exception e) {
            lengthBox.setText("");
            lengthLabel.setText("Failed");
        }
    }//GEN-LAST:event_lengthBoxFocusLost

    private void diameterBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diameterBoxFocusLost
        double input;
        diameterLabel.setText("");
        try {
            input = Double.parseDouble(diameterBox.getText());
            if (input > 0 && input <= 50) {
                pipeDiameter = input;
            } 
            else {
                diameterBox.setText("");
                diameterLabel.setText("Enter number between 0 and 50");
            }
        } catch (Exception e) {
            diameterBox.setText("");
            diameterLabel.setText("Failed");
        }
    }//GEN-LAST:event_diameterBoxFocusLost

    private void colourBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colourBoxActionPerformed
        int input;

        input = colourBox.getSelectedIndex();
        if (input == 0) {
            colourLabel.setText("invalid.");
        } else {
            pipeColour = input-1;
        }
    }//GEN-LAST:event_colourBoxActionPerformed

    private void insulationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insulationBoxActionPerformed
        if (insulationBox.isSelected()) {
            innerInsulation = true;
        } else {
            innerInsulation = false;
        }
    }//GEN-LAST:event_insulationBoxActionPerformed

    private void reinforceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinforceBoxActionPerformed
        if (reinforceBox.isSelected()) {
            outerReinforcement = true;
        } else {
            outerReinforcement = false;
        }
    }//GEN-LAST:event_reinforceBoxActionPerformed

    private void chemicalBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemicalBoxActionPerformed
        if (chemicalBox.isSelected()) {
            chemicalResistance = true;
        } else {
            chemicalResistance = false;
        }
    }//GEN-LAST:event_chemicalBoxActionPerformed

    private void quantityBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityBoxFocusLost
        int input;
        quantityLabel.setText("");
        try {
            input = parseInt(quantityBox.getText());
            if (input > 0 && input <= 50) {

            } 
            else {
                quantityBox.setText("");
                quantityLabel.setText("Enter a quantity between 1 and 50");
            }
        } catch (Exception e) {
            quantityLabel.setText("Failed");
        }
    }//GEN-LAST:event_quantityBoxFocusLost

    public boolean checkPipe(){
        boolean check = false;
        if (!innerInsulation && !outerReinforcement) {
            //Pipe1
            if (pipeColour == 0) {
                if (pipeGrade >= 1 && pipeGrade <= 3) {
                    pipeArray.add(new Pipe1(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
                }
            }
            //Pipe2
            if (pipeColour == 1) {
                if (pipeGrade >= 2 && pipeGrade <= 4) {
                    pipeArray.add(new Pipe2(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
                }
            }
            //Pipe3
            if (pipeColour == 2) {
                if (pipeGrade >= 2 && pipeGrade <= 5) {
                    pipeArray.add(new Pipe3(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
                }
            }
        } //Pipe4
        else if (pipeColour == 2 && pipeGrade >= 2 && pipeGrade <= 5 && innerInsulation && !outerReinforcement) {
            pipeArray.add(new Pipe4(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
        } //Pipe5
        else if (pipeColour == 2 && pipeGrade >= 3 && pipeGrade <= 5 && innerInsulation && outerReinforcement) {
            pipeArray.add(new Pipe5(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
        } else {
        }
        return check;
    }
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chemicalBox;
    private javax.swing.JComboBox<String> colourBox;
    private javax.swing.JLabel colourLabel;
    private javax.swing.JTextField diameterBox;
    private javax.swing.JLabel diameterLabel;
    private javax.swing.JComboBox<String> gradeBox;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JCheckBox insulationBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lengthBox;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JButton pipeSubmit;
    private javax.swing.JTextField quantityBox;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JCheckBox reinforceBox;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
