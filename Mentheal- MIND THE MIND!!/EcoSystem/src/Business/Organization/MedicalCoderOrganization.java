/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalCoderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MedicalCoderOrganization extends Organization{

    public MedicalCoderOrganization() {
        super(Organization.Type.MedicalCoder.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalCoderRole());
        return roles;
    }
     
   
    
    
}
