/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DoctorSchedule;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaMainJPanel;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{
 public DoctorSchedule sched=new DoctorSchedule();
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaMainJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise,business,sched);
    }
    
    
}
