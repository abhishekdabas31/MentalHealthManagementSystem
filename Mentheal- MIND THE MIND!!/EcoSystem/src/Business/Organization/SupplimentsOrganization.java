/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplimentProviderRole;
import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class SupplimentsOrganization  extends Organization{

    public SupplimentsOrganization() {
        super(Organization.Type.Suppliments.getValue()); 
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
           ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplimentProviderRole());
        return roles;
    }
    
}
