/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmenitiesProviderRole;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author vennelareddy
 */
public class AmenitiesOrganization extends Organization{
     public AmenitiesOrganization() {
        super(Organization.Type.Amenities.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AmenitiesProviderRole());
        return roles;
    }
    
}
