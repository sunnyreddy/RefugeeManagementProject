/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.LabAssistantRole;
import Business.Role.RefugeeCampManagerRole;
import Business.Role.Role;


/**
 *
 * @author vennelareddy
 */
public class RefugeeCampOrganization extends Organization {
      public RefugeeCampOrganization() {
        super(Organization.Type.RefugeeCamp.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RefugeeCampManagerRole());
        return roles;
    }
    
}
