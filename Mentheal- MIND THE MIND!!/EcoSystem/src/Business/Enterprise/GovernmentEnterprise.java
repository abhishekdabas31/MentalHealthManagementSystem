/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class GovernmentEnterprise extends Enterprise
{
    
    public GovernmentEnterprise(String name){
        super(name,EnterpriseType.Govt);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
