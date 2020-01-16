/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FundsProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author medas
 */
public class FundsProviderOrganization extends Organization{
    public FundsProviderOrganization() {
        super(Organization.Type.FundsProvider.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundsProviderRole());
        return roles;
    }
}
