/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClaimHandlerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class ClaimsOrganization extends Organization {

    public ClaimsOrganization() {
        super(Organization.Type.Claims.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      ArrayList<Role> roles = new ArrayList();
        roles.add(new ClaimHandlerRole());
        return roles;
    }
    
}
