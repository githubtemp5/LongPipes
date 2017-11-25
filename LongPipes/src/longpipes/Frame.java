/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

import static java.lang.Integer.parseInt;

/**
 *
 * @author up826133
 */
public class Frame extends javax.swing.JFrame {

    private String checkPlasticGrade, checkColour, checkInnerInsulation, checkOuterRienforcement;
    private boolean colour0, colour1, colour2, innerInsulation, outerRienforcement;
    private int plasticGrade;

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
        combo_pipe_grade = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        combo_colours = new javax.swing.JComboBox<>();
        combo_insulation = new javax.swing.JComboBox<>();
        combo_outer_rienforcement = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pipe order"));

        jLabel1.setText("Pipe Length (Metres):");

        jLabel2.setText("Pipe Diameter (Inches):");

        jLabel3.setText("Pipe Grade:");

        jLabel4.setText("Colours?");

        jLabel5.setText("Insulation?");

        jLabel7.setText("Outer Reinforcement?");

        jLabel8.setText("Chemical Resistance?");

        jLabel9.setText("Quantity of pipe:");

        combo_pipe_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5" }));
        combo_pipe_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pipe_gradeActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        combo_colours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_coloursActionPerformed(evt);
            }
        });

        combo_insulation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "YES", "NO" }));
        combo_insulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_insulationActionPerformed(evt);
            }
        });

        combo_outer_rienforcement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "YES", "NO" }));
        combo_outer_rienforcement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_outer_rienforcementActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "YES", "NO" }));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(combo_pipe_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(combo_insulation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(combo_colours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(combo_outer_rienforcement, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField3)))))))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo_pipe_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_colours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_insulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo_outer_rienforcement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        int input;
        boolean error;
        try {
            input = parseInt(jTextField1.getText());
            jLabel10.setText("");

        } catch (Exception e) {
            jLabel10.setText("Please enter a number.");
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        int input;
        try {
            input = parseInt(jTextField2.getText());
            jLabel11.setText("");

        } catch (Exception e) {
            jLabel11.setText("Please enter a number.");
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void combo_insulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_insulationActionPerformed
        // TODO add your handling code here:
        checkInnerInsulation = combo_pipe_grade.getSelectedItem().toString();
        switch (checkInnerInsulation) {
            case "Select":
                combo_outer_rienforcement.setEnabled(false);
                break;
            case "YES":
                innerInsulation = true;
                break;
            case "NO":
                innerInsulation = false;
                break;
        }
        productSelection(1);
    }//GEN-LAST:event_combo_insulationActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        int input;
        try {
            input = parseInt(jTextField3.getText());
            jLabel12.setText("");

        } catch (Exception e) {
            jLabel12.setText("Please enter a number.");
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void combo_pipe_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pipe_gradeActionPerformed
        // TODO add your handling code here:
        checkPlasticGrade = combo_pipe_grade.getSelectedItem().toString();
        switch (checkPlasticGrade) {
            case "Select":
                disableCombos();
                break;
            default:
                plasticGrade = parseInt(combo_pipe_grade.getSelectedItem().toString());
                productSelection(1);
                break;
        }
    }//GEN-LAST:event_combo_pipe_gradeActionPerformed

    private void combo_coloursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_coloursActionPerformed
        // TODO add your handling code here:
        checkColour = combo_colours.getSelectedItem().toString();
        switch (checkColour) {
            case "Select":
                combo_insulation.setEnabled(false);
                break;
            case "0":
                colour0 = true;
                colour1 = false;
                colour2 = false;
                productSelection(1);
                break;
            case "1":
                colour0 = false;
                colour1 = true;
                colour2 = false;
                productSelection(1);
                break;
            case "2":
                colour0 = false;
                colour1 = false;
                colour2 = true;
                productSelection(1);
                break;
        }
    }//GEN-LAST:event_combo_coloursActionPerformed

    private void combo_outer_rienforcementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_outer_rienforcementActionPerformed
        // TODO add your handling code here:
        checkOuterRienforcement = combo_outer_rienforcement.getSelectedItem().toString();
        switch (checkOuterRienforcement) {
            case "Yes":
                outerRienforcement = true;
                break;
            case "No":
                outerRienforcement = false;
                break;
        }
        productSelection(1);
    }//GEN-LAST:event_combo_outer_rienforcementActionPerformed

    public void disableCombos(){
        combo_colours.setEnabled(false);
        combo_insulation.setEnabled(false);
        combo_outer_rienforcement.setEnabled(false);
    }
    
    public void fillCombos() {

        combo_colours.removeAllItems();
        if (plasticGrade == 2 || plasticGrade == 3) {
            combo_colours.addItem("Select");
            combo_colours.addItem("0");
            combo_colours.addItem("1");
            combo_colours.addItem("2");
        }
        if (plasticGrade == 4) {
            combo_colours.addItem("Select");
            combo_colours.addItem("1");
            combo_colours.addItem("2");
        }
        if (plasticGrade == 5) {
            combo_colours.addItem("Select");
            combo_colours.addItem("2");
        }
    }

    public void productSelection(int from) {
        //called from plastic grade
        if (plasticGrade == 1) {
            // btn_colours.setEnabled(false);
            //TYPE 1
            //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
        }
        if (plasticGrade == 2) {
            combo_colours.setEnabled(true);
            
            if (colour0 == true) {
                //TYPE 1
                //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
            }

            if (colour1 == true) {
                //TYPE 2
                //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
            }
            if (colour2 == true) {
                combo_insulation.setEnabled(true);
                if (innerInsulation == false) {
                    //TYPE 3 
                    //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
                } else {
                    //TYPE 4
                    //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
                }
            }
        }
        if (plasticGrade == 3) {
            combo_colours.setEnabled(true);
            if (colour0 == true) {
                //TYPE 1
                //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
            }
            if (colour1 == true) {
                //TYPE 2
                //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
            }
            if (colour2 == true) {
                combo_insulation.setEnabled(true);
                if (innerInsulation == false) {
                    //TYPE 3 
                    //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
                } else {
                    combo_outer_rienforcement.setEnabled(true);
                    if (outerRienforcement == false) {
                        //TYPE 3
                        //SET ALL OTHER CONTROL TO ONLY OPTIONS AND GREY
                    } else {
                        //TYPE 5
                    }
                }
            }
        }

        if (plasticGrade == 4) {
            combo_colours.setEnabled(true);
            if (colour1 == true) {
                //TYPE 2
                //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
            }
            if (colour2 == true) {
                combo_insulation.setEnabled(true);
                if (innerInsulation == false) {
                    //TYPE 3 
                    //SET ALL OTHER CONTROLS TO ONLY OPTIONS AND GREY
                } else {
                    combo_outer_rienforcement.setEnabled(true);
                    if (outerRienforcement == false) {
                        //TYPE 4
                        //SET ALL OTHER CONTROL TO ONLY OPTIONS AND GREY
                    } else {
                        //TYPE 5
                    }
                }
            }
        }
        if (plasticGrade == 5) {
            //SET COLOUR TO C2 AUTOMATICALLY AS ITS THE ONLY OPTION
            combo_insulation.setEnabled(true);
            if (innerInsulation == false) {
                //TYPE 3
            } else {
                combo_outer_rienforcement.setEnabled(true);
                if (outerRienforcement == false) {
                    //TYPE 4
                } else {
                    //TYPE 5
                }
            }
        }
        fillCombos();
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
    private javax.swing.JComboBox<String> combo_colours;
    private javax.swing.JComboBox<String> combo_insulation;
    private javax.swing.JComboBox<String> combo_outer_rienforcement;
    private javax.swing.JComboBox<String> combo_pipe_grade;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
