/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CaretakerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class CareTakerOrganization  extends Organization{

    public CareTakerOrganization() {
        super(Organization.Type.Caretaker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       
      ArrayList<Role> roles = new ArrayList();
        roles.add(new CaretakerRole());
        return roles;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
