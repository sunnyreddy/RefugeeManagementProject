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
        // creating organization class according to type value selected
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FundsProvider.getValue())){
            organization = new FundsProviderOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.RefugeeCamp.getValue())){
            organization = new RefugeeCampOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Amenities.getValue())){
            organization = new AmenitiesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MedicalCampOrganizer.getValue())){
            organization = new MedicalCampOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}