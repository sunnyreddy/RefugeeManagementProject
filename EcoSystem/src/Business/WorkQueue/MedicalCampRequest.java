/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author shashank
 */
public class MedicalCampRequest extends WorkRequest {
    private String campResult;
    private HosMedCampWorkRequest hmcwr = null;

    public HosMedCampWorkRequest getHmcwr() {
        return hmcwr;
    }

    public void setHmcwr(HosMedCampWorkRequest hmcwr) {
        this.hmcwr = hmcwr;
    }

    public String getTestResult() {
        return campResult;
    }

    public void setTestResult(String campResult) {
        this.campResult = campResult;
    }
}
