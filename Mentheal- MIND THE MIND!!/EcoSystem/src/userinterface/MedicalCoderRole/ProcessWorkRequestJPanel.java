/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalCoderRole;

import userinterface.LabAssistantRole.*;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        PatientName.setText(request.getPatient());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PatientName = new java.awt.Label();
        label2 = new java.awt.Label();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 170, 30));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("MEDICAL CODER REQUEST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        PatientName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        PatientName.setName(""); // NOI18N
        add(PatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 129, -1));

        label2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        label2.setText("Patient Name :");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MedicalCoderWorkAreaJPanel dwjp = (MedicalCoderWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
                if(resultJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Do not enter a empty  message!!");
            return;
            
        }
        else if(resultJTextField.getText().length()>25)
        {
            JOptionPane.showMessageDialog(null,"DO not exceed 25 characters limit !!");
            return;
            
        } else {JOptionPane.showMessageDialog(null,"Completed");
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Completed");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label PatientName;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label2;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
