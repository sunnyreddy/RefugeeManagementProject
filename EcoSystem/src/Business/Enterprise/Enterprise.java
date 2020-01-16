 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        NGO("NGO"),
        Refugee("Refugee");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
}
