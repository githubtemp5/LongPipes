package longpipes;

import java.awt.Color;
import java.awt.event.KeyEvent;
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

    private ArrayList<Pipe> pipeArray = new ArrayList<Pipe>();      //stores current pipe orders
    private double totalPrice = 0;                                  //total price of all pipes
    private boolean lengthBoxError = false;                         //if the value in the lengthBox is invalid this is set to true
    private boolean diameterBoxError = false;                       //invalid value in diameterBox makes this true
    private boolean quantityBoxError = false;                       //invalid quantity value makes this true
    private DefaultTableModel df;
    private NumberFormat twoDP = NumberFormat.getCurrencyInstance();    //used to change a number to a 2 d.p price String

    /**
     * Constructor for the main class
     * 
     * Creates new form Frame initialises the GUI
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
        quit = new javax.swing.JButton();
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
        pipeRemoval = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

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

        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        lengthBox.setPreferredSize(new java.awt.Dimension(6, 22));
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

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        colourBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        quantityBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityBoxFocusLost(evt);
            }
        });

        jLabel11.setText("Total Price:");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade", "Colour(s)", "Inner Insulation", "Outer Reinforcement", "Chemical Resistance", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.getTableHeader().setReorderingAllowed(false);
        resultTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setMinWidth(3);
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            resultTable.getColumnModel().getColumn(1).setMinWidth(5);
            resultTable.getColumnModel().getColumn(1).setPreferredWidth(3);
            resultTable.getColumnModel().getColumn(2).setPreferredWidth(27);
            resultTable.getColumnModel().getColumn(3).setPreferredWidth(40);
            resultTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            resultTable.getColumnModel().getColumn(5).setPreferredWidth(28);
            resultTable.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        pipeRemoval.setText("Remove Order");
        pipeRemoval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeRemovalActionPerformed(evt);
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pipeRemoval)
                        .addGap(520, 520, 520)
                        .addComponent(quit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(quantityBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(diameterBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lengthBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                    .addComponent(chemicalBox)
                                                    .addComponent(reinforceBox)
                                                    .addComponent(insulationBox)
                                                    .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(38, 38, 38))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(pipeSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(268, 268, 268)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pipePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pipePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lengthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(diameterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(28, 28, 28)
                        .addComponent(pipeSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quit)
                            .addComponent(pipeRemoval))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void pipeRemovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeRemovalActionPerformed
        if (resultTable.getSelectedRowCount() > 0) {

            int rows[] = resultTable.getSelectedRows();
            for (int j : rows) {
            }

            ArrayList<Pipe> pipesToRemove = new ArrayList<Pipe>();
            for (int i : rows) {
                pipesToRemove.add(pipeArray.get(i));
            }
            //deleting the pipes to be removed from the resultTable
            for (int n = rows.length - 1; n >= 0; n--) {
                df.removeRow(rows[n]);
            }
            //removing the pipe from the array
            for (Pipe p : pipesToRemove) {
                pipeArray.remove(p);
            }

            updatePrice();

        }
    }//GEN-LAST:event_pipeRemovalActionPerformed

    private void resultTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {       //delete rows from resultTable when delete key is pressed
            if (resultTable.getSelectedRowCount() > 0) {

                int rows[] = resultTable.getSelectedRows();
                for (int j : rows) {
                }

                ArrayList<Pipe> pipesToRemove = new ArrayList<Pipe>();
                for (int i : rows) {
                    pipesToRemove.add(pipeArray.get(i));
                }
                //deleting the pipes to be removed from the resultTable
                for (int n = rows.length - 1; n >= 0; n--) {
                    df.removeRow(rows[n]);
                }
                //removing the pipe from the array
                for (Pipe p : pipesToRemove) {
                    pipeArray.remove(p);
                }

                updatePrice();

            }
        }
    }//GEN-LAST:event_resultTableKeyPressed

    private void quantityBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityBoxFocusLost
        int input;
        errorLabel.setText("");     //initialises the error label to be empty

        try {
            input = parseInt(quantityBox.getText());
            if (input > 0 && input <= 50) {     //50 is the maximum quantity
                quantityBoxError = false;
            } else {
                quantityBoxError = true;
                quantityBox.setText("");
                errorLabel.setText("The maximum order quantity is 50");
            }
        } catch (Exception e) {             //string or invalid type errors handled here
            quantityBoxError = true;
            errorLabel.setText("Quantity must be a non-decimal number");
        }
    }//GEN-LAST:event_quantityBoxFocusLost

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
                errorLabel.setText("Diameter must be between 0.1 and 15 inches");
            }
        } catch (Exception e) {
            diameterBoxError = true;
            diameterBox.setText("");
            errorLabel.setText("Diameter must be a number");
        }
    }//GEN-LAST:event_diameterBoxFocusLost

    private void lengthBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lengthBoxFocusLost
        double input;

        errorLabel.setText("");
        try {
            input = Double.parseDouble(lengthBox.getText());
            if (input >= 0.1 && input <= 6) {
                lengthBoxError = false;
            } else {
                lengthBox.setText("");
                errorLabel.setText("The pipe length must be between 0.1 and 6 metres");
                lengthBoxError = true;
            }
        } catch (Exception e) {
            lengthBoxError = true;
            lengthBox.setText("");
            errorLabel.setText("Pipe Length must be a number");

        }
    }//GEN-LAST:event_lengthBoxFocusLost

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void pipeSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeSubmitActionPerformed
        try {

            if (pipeDimensionIsValid()) {       //if pipe length, diameter and quantity are valid then only assignment of value is possible.
                //assigning values to the variables only after the values are valid
                double pipeLength = Double.parseDouble(lengthBox.getText());
                double pipeDiameter = Double.parseDouble(diameterBox.getText());
                int pipeQuantity = Integer.parseInt(quantityBox.getText());
                int pipeGrade = Integer.parseInt(gradeBox.getSelectedItem().toString());
                int pipeColour = colourBox.getSelectedIndex();
                boolean innerInsulation = insulationBox.isSelected();
                boolean outerReinforcement = reinforceBox.isSelected();
                boolean chemicalResistance = chemicalBox.isSelected();

                if (pipeIsCreated(pipeLength, pipeDiameter, pipeGrade, pipeColour, innerInsulation, outerReinforcement, chemicalResistance, pipeQuantity)) { //if the pipe is created the method returns true otherwise false
                    df.addRow(new Object[]{pipeGrade, pipeColour, booleanToYN(innerInsulation), booleanToYN(outerReinforcement), booleanToYN(chemicalResistance), pipeQuantity, twoDP.format(pipeArray.get(pipeArray.size() - 1).getPrice())});  //adds the pipe as a row in resultTable
                    updatePrice();     //adds in the price of current pipe to total price and updates the price
                    errorLabel.setText("");
                } else {
                    errorLabel.setText("Invalid Pipe specification");
                }
            }

        } catch (Exception e) {
            errorLabel.setText("Invalid Order.");
        }
    }//GEN-LAST:event_pipeSubmitActionPerformed

    /**
     *  this method checks whether the specification provided by the user matches to a valid pipe type or not
     * @param pipeLength    length of the pipe to be created
     * @param pipeDiameter  diameter of the pipe
     * @param pipeGrade     grade of the pipe   
     * @param pipeColour    colour of the pipe 
     * @param innerInsulation   true or false on whether inner insulation is present or not
     * @param outerReinforcement    whether outer reinforcement is present
     * @param chemicalResistance    whether chemical resistance is present
     * @param pipeQuantity          the quantity of the pipe
     * @return if the user specification matches one of the valid pipe types then returns true otherwise false
     * 
     * check boolean is set to false at the beginning, if it matches one of the pipes' criteria then it changes to true
     * if pipe is valid, it is added to pipeArray ArrayList.
     */
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

    /**
     *
     * @return returns whether the length, diameter and quantity of the pipe is
     * valid
     */
    public boolean pipeDimensionIsValid() {
        return !lengthBoxError && !diameterBoxError && !quantityBoxError;
    }

    /**
     * adds up the price for all the pipes currently in the arraylist and sets it to totalPrice
     * also sets the pipePrice label to the current total price 
     */
    public void updatePrice() {
        totalPrice = 0;
        for (Pipe p : pipeArray) {
            totalPrice += (double) Math.round(p.getPrice() * 100.0) / 100.0;
        }
        pipePrice.setText(twoDP.format(totalPrice));    //updates the pipePrice label
    }
    
    /**
     * 
     * @param input the boolean parameter
     * @return if input is true 'Y' is returned otherwise 'N'
     */
    private String booleanToYN(boolean input) {
        String output = "";
        if (input) {
            output = "Y";
        } else {
            output = "N";
        }
        return output;
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
    private javax.swing.JButton pipeRemoval;
    private javax.swing.JButton pipeSubmit;
    private javax.swing.JTextField quantityBox;
    private javax.swing.JButton quit;
    private javax.swing.JCheckBox reinforceBox;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
