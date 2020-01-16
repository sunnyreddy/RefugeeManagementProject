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
public class AmenitiesWorkRequest extends WorkRequest{
    private String amenitiesResult;
    private InventoryWorkRequest iwr = null;

    public InventoryWorkRequest getIwr() {
        return iwr;
    }

    public void setIwr(InventoryWorkRequest iwr) {
        this.iwr = iwr;
    }

    public String getTestResult() {
        return amenitiesResult;
    }

    public void setTestResult(String amenitiesResult) {
        this.amenitiesResult = amenitiesResult;
    }
    
}
