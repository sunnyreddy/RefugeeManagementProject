/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author vennelareddy
 */
public class InventoryWorkRequest extends WorkRequest{
     private String InventoryResult;
     private AmenitiesWorkRequest awr = null;

    public AmenitiesWorkRequest getAwr() {
        return awr;
    }

    public void setAwr(AmenitiesWorkRequest awr) {
        this.awr = awr;
    }

    public String getTestResult() {
        return InventoryResult;
    }

    public void setTestResult(String InventoryResult) {
        this.InventoryResult = InventoryResult;
    }
    
}
