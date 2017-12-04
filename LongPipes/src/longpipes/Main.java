package longpipes;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pipes.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author up826133
 */
public class Main extends javax.swing.JFrame {

    private ArrayList<Pipe> pipeArray = new ArrayList<Pipe>();
    private int counter = 0;
    private double totalPrice = 0;
    private boolean lengthBoxError = false;
    private boolean diameterBoxError = false;
    private boolean quantityBoxError = false;
    private DefaultTableModel df;
    private NumberFormat twoDP = NumberFormat.getCurrencyInstance();

    /**
     * Creates new form Frame
     */
    public Main() {
        initComponents();
        df = (DefaultTableModel) resultTable.getModel();
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
        jLabel11 = new javax.swing.JLabel();
        pipePrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        errorLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Pipe Ordering System");

        jLabel2.setText("Pipe Length (Metres):");

        jLabel3.setText("Pipe Diameter (Inches):");

        jLabel4.setText("Pipe Grade:");

        jLabel5.setText("Pipe Colour(s):");

        jLabel7.setText("Pipe Insulation?");

        jLabel8.setText("Outer Reinforcement?");

        jLabel9.setText("Chemical Resistance?");

        jLabel10.setText("Order Quantity:");

        pipeSubmit.setText("Submit Order");
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
        lengthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthBoxActionPerformed(evt);
            }
        });

        diameterBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                diameterBoxFocusLost(evt);
            }
        });

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        gradeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeBoxActionPerformed(evt);
            }
        });

        colourBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
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

        jLabel11.setText("Price for pipe order:");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade", "Colour(s)", "Inner Insulation", "Outer Reinforcement", "Chemical Resistance", "Price", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setMinWidth(3);
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            resultTable.getColumnModel().getColumn(1).setMinWidth(5);
            resultTable.getColumnModel().getColumn(1).setPreferredWidth(5);
            resultTable.getColumnModel().getColumn(2).setPreferredWidth(29);
            resultTable.getColumnModel().getColumn(5).setPreferredWidth(35);
        }

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        jButton1.setText("Remove Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lengthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(diameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(insulationBox)
                                            .addComponent(reinforceBox)
                                            .addComponent(chemicalBox)
                                            .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pipePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(pipeSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)
                                        .addGap(35, 35, 35)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(625, 625, 625)
                                .addComponent(jButton2)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lengthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(diameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insulationBox)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reinforceBox)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(chemicalBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pipePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pipeSubmit)
                            .addComponent(jButton1))
                        .addGap(38, 38, 38)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityBoxFocusLost
        int input;
        errorLabel.setText("");

        try {
            input = parseInt(quantityBox.getText());
            if (input > 0 && input <= 50) {
                quantityBoxError = false;
            } else {
                quantityBoxError = true;
                quantityBox.setText("");
                errorLabel.setText("The maximum order quantity is 50");
            }
        } catch (Exception e) {
            quantityBoxError = true;
            errorLabel.setText("Quantity must be a number");
        }
    }//GEN-LAST:event_quantityBoxFocusLost

    private void chemicalBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemicalBoxActionPerformed

    }//GEN-LAST:event_chemicalBoxActionPerformed

    private void reinforceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinforceBoxActionPerformed

    }//GEN-LAST:event_reinforceBoxActionPerformed

    private void insulationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insulationBoxActionPerformed

    }//GEN-LAST:event_insulationBoxActionPerformed

    private void colourBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colourBoxActionPerformed

    }//GEN-LAST:event_colourBoxActionPerformed

    private void gradeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeBoxActionPerformed

    }//GEN-LAST:event_gradeBoxActionPerformed

    private void diameterBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diameterBoxFocusLost
        double input;
        errorLabel.setText("");
        try {
            input = Double.parseDouble(diameterBox.getText());
            if (input >= 0.1 && input <= 15) {
                diameterBoxError = false;
            } else {
                diameterBoxError = true;
                diameterBox.setText("");
                errorLabel.setText("Enter 0 and 15");
            }
        } catch (Exception e) {
            diameterBoxError = true;
            diameterBox.setText("");
            errorLabel.setText("Please enter a number");
        }
    }//GEN-LAST:event_diameterBoxFocusLost

    private void lengthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthBoxActionPerformed

    private void lengthBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lengthBoxFocusLost
        double input;

        errorLabel.setText("");
        try {
            input = Double.parseDouble(lengthBox.getText());
            if (input >= 0.1 && input <= 6) {
                lengthBoxError = false;
            } else {
                lengthBox.setText("");
                errorLabel.setText("The pipe length must be between 0 and 6");
                lengthBoxError = true;
            }
        } catch (Exception e) {
            lengthBoxError = true;
            lengthBox.setText("");
            errorLabel.setText("Please enter a number");

        }
        int counter = 0;
    }//GEN-LAST:event_lengthBoxFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pipeSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeSubmitActionPerformed
        try {

            if (pipeDimensionIsValid()) {

                double pipeLength = Double.parseDouble(lengthBox.getText());
                double pipeDiameter = Double.parseDouble(diameterBox.getText());
                int pipeQuantity = Integer.parseInt(quantityBox.getText());
                int pipeGrade = Integer.parseInt(gradeBox.getSelectedItem().toString());
                int pipeColour = colourBox.getSelectedIndex();
                boolean innerInsulation = insulationBox.isSelected();
                boolean outerReinforcement = reinforceBox.isSelected();
                boolean chemicalResistance = chemicalBox.isSelected();

                if (pipeIsCreated(pipeLength, pipeDiameter, pipeGrade, pipeColour, innerInsulation, outerReinforcement, chemicalResistance, pipeQuantity)) {
                    df.addRow(new Object[]{pipeGrade, pipeColour, String.valueOf(innerInsulation), String.valueOf(outerReinforcement), String.valueOf(chemicalResistance), twoDP.format(pipeArray.get(pipeArray.size() - 1).getPrice()), counter + ""});
                    counter++;
                    totalPrice += pipeArray.get(pipeArray.size() - 1).getPrice();
                    updatePrice();
                    errorLabel.setText("");
                } else {
                    errorLabel.setText("Invalid Pipe specification");
                }
            }

        } catch (Exception e) {
            errorLabel.setText("Invalid Order.");
        }
    }//GEN-LAST:event_pipeSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (resultTable.getSelectedRowCount() > 0) {

            int rows[] = resultTable.getSelectedRows();
            for (int j : rows) {
                System.out.println("j" + j);
            }
            long tempPrice = 0;
            ArrayList<Pipe> pipesToRemove = new ArrayList<Pipe>();
            for (int i : rows) {
                System.out.println("i: " + i);
                tempPrice += pipeArray.get(i).getPrice();
                pipesToRemove.add(pipeArray.get(i));

            }

            for (int n = rows.length - 1; n >= 0; n--) {
                df.removeRow(rows[n]);
            }

            for (Pipe p : pipesToRemove) {
                pipeArray.remove(p);
            }
            totalPrice -= tempPrice;
            updatePrice();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean pipeIsCreated(double pipeLength, double pipeDiameter, int pipeGrade, int pipeColour, boolean innerInsulation, boolean outerReinforcement, boolean chemicalResistance, int pipeQuantity) {
        boolean check = false;
        if (!innerInsulation && !outerReinforcement) {
            //Pipe1
            if (pipeColour == 0) {
                if (pipeGrade >= 1 && pipeGrade <= 3) {
                    pipeArray.add(new Pipe1(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
                    check = true;
                }
            }
            //Pipe2
            if (pipeColour == 1) {
                if (pipeGrade >= 2 && pipeGrade <= 4) {
                    pipeArray.add(new Pipe2(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
                    check = true;
                }
            }
            //Pipe3
            if (pipeColour == 2) {
                if (pipeGrade >= 2 && pipeGrade <= 5) {
                    pipeArray.add(new Pipe3(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
                    check = true;
                }
            }
        } //Pipe4
        else if (pipeColour == 2 && pipeGrade >= 2 && pipeGrade <= 5 && innerInsulation && !outerReinforcement) {
            pipeArray.add(new Pipe4(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
            check = true;
        } //Pipe5
        else if (pipeColour == 2 && pipeGrade >= 3 && pipeGrade <= 5 && innerInsulation && outerReinforcement) {
            pipeArray.add(new Pipe5(pipeLength, pipeDiameter, pipeGrade, chemicalResistance, pipeQuantity));
            check = true;
        }
        return check;
    }

    public boolean pipeDimensionIsValid() {
        return !lengthBoxError && !diameterBoxError && !quantityBoxError;
    }

    public void updatePrice() {
        totalPrice = 0;
        for (Pipe p : pipeArray) {
            totalPrice += (double) Math.round(p.getPrice() * 100.0) / 100.0;
        }
        pipePrice.setText(twoDP.format(totalPrice));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chemicalBox;
    private javax.swing.JComboBox<String> colourBox;
    private javax.swing.JTextField diameterBox;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JComboBox<String> gradeBox;
    private javax.swing.JCheckBox insulationBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lengthBox;
    private javax.swing.JLabel pipePrice;
    private javax.swing.JButton pipeSubmit;
    private javax.swing.JTextField quantityBox;
    private javax.swing.JCheckBox reinforceBox;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
