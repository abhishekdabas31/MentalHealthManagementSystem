/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.DrugManufacturer.getValue())){
            organization = new DrugManufacturerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharmacistOrganization.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.MedicalCoder.getValue())){
            organization = new MedicalCoderOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Acommittee.getValue())){
            organization = new AllocatingOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Billing.getValue())){
            organization = new BillingsOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Caretaker.getValue())){
            organization = new CareTakerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Claims.getValue())){
            organization = new ClaimsOrganization();
            organizationList.add(organization);
            
        }
        else if (type.getValue().equals(Type.Gcomittee.getValue())){
            organization = new GrantingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Suppliments.getValue())){
            organization = new SupplimentsOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}