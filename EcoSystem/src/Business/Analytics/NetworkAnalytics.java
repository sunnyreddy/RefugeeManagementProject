/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Network.Network;
import Business.Organization.FundsProviderOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.FundsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.HashMap;

/**
 *
 * @author medas
 */
public class NetworkAnalytics {
    
        private EcoSystem system;
        
        public NetworkAnalytics(EcoSystem system){
            this.system = system;
        }
    
        public HashMap<String,HashMap<String,Integer>> getUsersInNetWorkByOrganization(String networkSel){
            String temp;
            HashMap<String,HashMap<String,Integer>> ent = null;
            for(Network network:system.getNetworkList()){
                ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSel==null)
                    temp=system.getNetworkList().get(0).getName();
                else
                    temp=networkSel;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    HashMap<String,Integer> org =new HashMap<String,Integer>();
                    org.put("Admins",enterprise.getEmployeeDirectory().getEmployeeList().size());
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                       org.put(organization.getName(),organization.getUserAccountDirectory().getUserAccountList().size()) ;
                    }
                    ent.put(enterprise.getEnterpriseType().getValue(),org);
                }

                if(temp==network.getName())
                    return ent;
                }
                return ent;
        }
        
        public HashMap<String,Integer> getFundsRaised(String networkSel){
            String temp;
            HashMap<String,Integer> ent = null;
            for(Network network:system.getNetworkList()){
                ent = new HashMap<String,Integer>();
                if(networkSel==null)
                    temp = system.getNetworkList().get(0).getName();
                else
                    temp = networkSel;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    if(enterprise instanceof NGOEnterprise){
                        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                            if(org instanceof FundsProviderOrganization){
                                int amountreq = 0;
                                int amountfunded = 0;
                                for(WorkRequest wr: org.getWorkQueue().getWorkRequestList()){
                                    FundsWorkRequest fwr = (FundsWorkRequest) wr;
                                    amountreq += fwr.getAmount();
                                    amountfunded += fwr.getAmountFunded();
                                }
                                ent.put("Amount Req", amountreq);
                                ent.put("Amount Funded", amountfunded);
                            }
                        }
                    }
                }

                if(temp==network.getName())
                    return ent;
                }
                return ent;
        }

}
