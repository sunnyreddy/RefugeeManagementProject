/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalCampOrganizerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shashank
 */
public class MedicalCampOrganization extends Organization {
    public MedicalCampOrganization() {
        super(Organization.Type.MedicalCampOrganizer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalCampOrganizerRole());
        return roles;
    }
}
