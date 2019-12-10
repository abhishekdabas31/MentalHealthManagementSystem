/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class MedicalWellnessEnterprise extends Enterprise {
    
    public MedicalWellnessEnterprise(String name){
        super(name,EnterpriseType.MedicalWellness);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
