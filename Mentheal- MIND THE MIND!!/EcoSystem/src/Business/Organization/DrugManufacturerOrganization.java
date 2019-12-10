/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DrugManufacturerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DrugManufacturerOrganization extends Organization{

    public DrugManufacturerOrganization() {
        super(Organization.Type.DrugManufacturer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugManufacturerRole());
        return roles;
    }
     
   
    
    
}
