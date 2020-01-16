/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author vennelareddy
 */
public class InventoryOrganization extends Organization {

    public InventoryOrganization() {
         super(Organization.Type.Inventory.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InventoryManagerRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
