/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author medas
 */
public class NgoMedCampWorkRequest extends WorkRequest {
    private String NgoMedCampResult;
    private HosMedCampWorkRequest hmcwr = null;

    public HosMedCampWorkRequest getHmcwr() {
        return hmcwr;
    }

    public void setHmcwr(HosMedCampWorkRequest hmcwr) {
        this.hmcwr = hmcwr;
    }

    public String getTestResult() {
        return NgoMedCampResult;
    }

    public void setTestResult(String NgoMedCampResult) {
        this.NgoMedCampResult = NgoMedCampResult;
    }
}
