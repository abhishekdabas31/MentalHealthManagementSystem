/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MedicalCoderOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MedicalCoderRole.MedicalCoderWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class MedicalCoderRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MedicalCoderWorkAreaJPanel(userProcessContainer, account, (MedicalCoderOrganization)organization,enterprise);
    }
    
}
