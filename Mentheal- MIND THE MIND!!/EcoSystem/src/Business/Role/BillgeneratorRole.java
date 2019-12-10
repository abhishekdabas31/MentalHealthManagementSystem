/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BillingsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BillGeneratorRole.BillGeneratorWorkAreaJPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author steve
 */
public class BillgeneratorRole extends Role{
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BillGeneratorWorkAreaJPanel(userProcessContainer,account, organization,enterprise, business);
    }
    
}
