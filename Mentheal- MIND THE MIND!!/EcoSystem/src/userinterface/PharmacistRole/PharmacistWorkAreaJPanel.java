/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PharmacistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicineWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class PharmacistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PharmacistOrganization pharmacistOrganization;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PharmacistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.pharmacistOrganization = (PharmacistOrganization)organization;
        this.enterprise=enterprise;
        valueLabel.setText(enterprise.getName());
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : pharmacistOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
             row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4]=request.getPatient();
            //row[5]="";
//            if(request.getType()!=null && request.getType().equals("DrugManufacturer"))
//            {
//                
//                DrugMAnufacturerWorkRequest d=(DrugMAnufacturerWorkRequest)request;
                //row[5]=;
                
            //}
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        drugmanufacJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "PatientName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 530, 96));

        assignJButton.setBackground(new java.awt.Color(255, 255, 255));
        assignJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        processJButton.setBackground(new java.awt.Color(255, 255, 255));
        processJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setText("PHARMACIST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        drugmanufacJButton.setBackground(new java.awt.Color(255, 255, 255));
        drugmanufacJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        drugmanufacJButton.setText("Drug Manufacturer Request");
        drugmanufacJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugmanufacJButtonActionPerformed(evt);
            }
        });
        add(drugmanufacJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        valueLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }else{
            JOptionPane.showMessageDialog(null,"Assigning!!");
         WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        }
        
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
         int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            return;
        }else {
        
        MedicineWorkRequest request = (MedicineWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        JOptionPane.showMessageDialog(null,"Processing");
        
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        } 
      
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void drugmanufacJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugmanufacJButtonActionPerformed
         
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row first!");
            //return;
        }
else
        {
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Sent to Drug Manufacturer");
        JOptionPane.showMessageDialog(null, "Sent to drug Manufacturer!!");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestDrugJPanel", new RequestDrugJPanel(userProcessContainer, userAccount,enterprise ,request.getPatient()));
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_drugmanufacJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton drugmanufacJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
