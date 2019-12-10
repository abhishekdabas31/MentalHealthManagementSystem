/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BillGeneratorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MailNew;
import Business.Organization.BillingsOrganization;
import Business.Organization.ClaimsOrganization;
import Business.Organization.GrantingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BillingWorkRequest;
import Business.WorkQueue.ClaimsWorkRequest;
import Business.WorkQueue.GranterWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.PatientInfoJPanel;
import userinterface.DoctorRole.DoctorWorkAreaMainJPanel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel11 extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PatientWorkRequest request;
    Enterprise enterprise;
    private UserAccount userAccount;
    Organization organization;
    EcoSystem business;
    String patientname;
    String status;
    String amount;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel11(JPanel userProcessContainer, PatientWorkRequest request, UserAccount userAccount, Organization organization, Enterprise enterprise , EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = (BillingsOrganization) organization;
        this.business=business;
        PatientName.setText(request.getPatient());
        patientname = request.getPatient();
        populatetextboxes();
        submitJButton.setEnabled(true);
        updateRequestJBTN.setEnabled(false);
        populateTable3();
    }

    private void populatetextboxes() {
        PatientName.setText(request.getPatientName());
        cardHolderName1.setText(request.getCardHolder());
        if (request.getCardnumber() == null) {
            Cardnumber.setText("no card!!");
        } else {
            Cardnumber.setText(request.getCardnumber().toString());
        }
        //Cardnumber.setText(request.getCardnumber().toString()== null ? " " : request.getCardnumber().toString());

        amountRequested.setText(request.getBillamount());
        statetext.setText(request.getPatientState());
        Emailtxt.setText(request.getEmail());

    }

    public void populateTable3() {
        DefaultTableModel model = (DefaultTableModel) updatedRequestJTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            //System.out.println(request.getReceiver()+" " +request.getType()+ " user");
            if (request.getType() != null) {
                if (request.getType().equals("Patient") && request.getForwardrequest() != null && request.getPatient().equals(this.patientname) ) { ///AND EMAILID CONSTRAINT
                    Object[] row = new Object[7];
                    row[0] = request;
                    row[1] = request.getSender();
                    row[2] = request.getPatient();
                    row[3] = ((BillingWorkRequest) request).getClaimstatus();
                    row[4] = ((BillingWorkRequest) request).getAmountApproved();
                    row[5] = request.getForwardrequest();
                    row[6] = request.getBill();

                    model.addRow(row);
                    submitJButton.setEnabled(false);
                    updateRequestJBTN.setEnabled(true);
                }
            }
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

        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        PatientName = new java.awt.Label();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        Cardnumber = new java.awt.TextField();
        amountRequested = new java.awt.TextField();
        label5 = new java.awt.Label();
        cardHolderName1 = new java.awt.TextField();
        label6 = new java.awt.Label();
        messagetxt = new javax.swing.JTextField();
        statetext = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        Emailtxt = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        updatedRequestJTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updateRequestJBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        submitJButton.setText("FORWARD TO CLAIMS");
        submitJButton.setToolTipText("");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.setToolTipText("");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        PatientName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        PatientName.setName(""); // NOI18N
        add(PatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 129, -1));

        label1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        label1.setText("Insurance Information :");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        label2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        label2.setText("Patient Name :");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        label3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        label3.setText("Card Number");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 114, 20));

        label4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        label4.setText("Amount Requested");
        add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 190, -1));

        Cardnumber.setEditable(false);
        Cardnumber.setEnabled(false);
        Cardnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardnumberActionPerformed(evt);
            }
        });
        add(Cardnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 190, -1));

        amountRequested.setEditable(false);
        amountRequested.setEnabled(false);
        add(amountRequested, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 190, -1));

        label5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        label5.setText("Card Holder Name");
        add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 200, -1));

        cardHolderName1.setEditable(false);
        cardHolderName1.setEnabled(false);
        add(cardHolderName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 190, -1));

        label6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        label6.setText("Message*");
        add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 114, -1));
        add(messagetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 190, -1));

        statetext.setEditable(false);
        statetext.setEnabled(false);
        add(statetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 190, -1));

        label8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        label8.setText("State");
        add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 140, 20));

        Emailtxt.setEditable(false);
        add(Emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 190, -1));

        label9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        label9.setText("Email");
        add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 114, 20));

        updatedRequestJTable1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 13)); // NOI18N
        updatedRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Pt Name", "Status", "Amount Approved", "Forward to govt", "UpdatedBill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(updatedRequestJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 880, 80));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel1.setText("Response from Claims :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 30));

        updateRequestJBTN.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        updateRequestJBTN.setText("Update Request");
        updateRequestJBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRequestJBTNActionPerformed(evt);
            }
        });
        add(updateRequestJBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BillGeneratorWorkAreaJPanel dwjp = (BillGeneratorWorkAreaJPanel) component;
        dwjp.populateTable();
       dwjp. populateTable2();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (messagetxt.getText().equals("") || messagetxt.getText().length() > 25) {
            JOptionPane.showMessageDialog(null, "Please input a correct Message!!");
            return;
        } else {

            ClaimsWorkRequest request1 = new ClaimsWorkRequest();

            request1.setMessage(messagetxt.getText());
            //request1.setSender(userAccount);
            request1.setClaimstatus("pending in claims");
            request1.setType("Patient");
            request1.setPatient(request.getPatientName());
            request1.setInsuranceCard(request.getCardnumber());
            request1.setBill(request.getBillamount());
            request1.setEmailid(request.getEmail());
            request1.setSender(userAccount);
            request.setBillstatus("pending in claims");

            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof ClaimsOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request1);
                //userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            JOptionPane.showMessageDialog(null, "Forwarded to Claims Successfully!!!!");
        }


    }//GEN-LAST:event_submitJButtonActionPerformed

    private void CardnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardnumberActionPerformed

    private void updateRequestJBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRequestJBTNActionPerformed
        int selectedRow = updatedRequestJTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        BillingWorkRequest request = (BillingWorkRequest) updatedRequestJTable1.getValueAt(selectedRow, 0);

        if (request.getClaimstatus().equals("Claim Rejected") ) {

            GranterWorkRequest grantrequest = new GranterWorkRequest();

            //grantrequest.setMessage(message);
            grantrequest.setSender(userAccount);
            grantrequest.setGrantingstatus("pending");
            grantrequest.setGrantreceiver(null);
            grantrequest.setType("patient");
            grantrequest.setPatient(request.getPatient());
            grantrequest.setGrantingAmount(request.getBill());
            grantrequest.setEmail(request.getEmail());
            grantrequest.setMessage(request.getPatient());
            
            //converting bill amount
           
            if(request.getBill().equals("0")){
                grantrequest.setBill("500");
            }else{
                grantrequest.setBill(request.getBill());
            }
            
            
            
            System.out.println(business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList());

            Organization org = null;
            for (Organization organization : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(4).getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof GrantingOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(grantrequest);
                //userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            
            //foremail
            this.status = request.getClaimstatus();
            this.amount = request.getBill();
              try {
                   MailNew m=new MailNew("steveaeddemo@gmail.com","Updated Claim Status: "+ userAccount,"Your request is forwarded to govt for funds");
               } catch (MessagingException ex) {
                   Logger.getLogger(BillGeneratorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
               }
            
            
            JOptionPane.showMessageDialog(null, "Request sent to Govt for funds ");
            
        } else {
            /////
            this.request.setBill(request.getBill());
            this.status = request.getClaimstatus();
            this.amount = request.getBill();
            this.request.setBillstatus(request.getClaimstatus());
         

             try {
                   MailNew m=new MailNew("steveaeddemo@gmail.com","Updated claim Status: "+ userAccount,"Your bill amount has been updated"+request.getBill());
               } catch (MessagingException ex) {
                   Logger.getLogger(BillGeneratorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
        JOptionPane.showMessageDialog(null, "Request is updated successfully!!");

        // TODO add your handling code here:
    }//GEN-LAST:event_updateRequestJBTNActionPerformed

    public void sendemailto() throws Exception {
        //MailClass mailclass=new MailClass(txtemail.getText(),"You are registered to Brigham Hospital","Registeration-Brigham");
        // mailclass.sendmail();
        PatientInfoJPanel p = null;
        String text = request.getEmail();
        String name = request.getPatient();
        MailNew m = new MailNew(text, name + " , Your bill has been processed", "Your claim has been " + status + ". The remaing amount is now " + amount);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField Cardnumber;
    private javax.swing.JTextField Emailtxt;
    private java.awt.Label PatientName;
    private java.awt.TextField amountRequested;
    private javax.swing.JButton backJButton;
    private java.awt.TextField cardHolderName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField messagetxt;
    private javax.swing.JTextField statetext;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton updateRequestJBTN;
    private javax.swing.JTable updatedRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
