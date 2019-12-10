/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.BillgeneratorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author steve
 */


public class BillingsOrganization extends Organization {
    
    public BillingsOrganization(){
        super(Organization.Type.Billing.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BillgeneratorRole());
        return roles;
    }
    
}
