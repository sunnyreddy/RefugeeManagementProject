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
public class HosMedCampWorkRequest extends WorkRequest{
    private String hosMedCampResult;
    private NgoMedCampWorkRequest nmcwr = null;

    public NgoMedCampWorkRequest getNmcwr() {
        return nmcwr;
    }

    public void setNmcwr(NgoMedCampWorkRequest nmcwr) {
        this.nmcwr = nmcwr;
    }

    public String getTestResult() {
        return hosMedCampResult;
    }

    public void setTestResult(String hosMedCampResult) {
        this.hosMedCampResult = hosMedCampResult;
    }
}
