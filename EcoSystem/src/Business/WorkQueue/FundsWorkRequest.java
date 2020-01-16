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
public class FundsWorkRequest extends WorkRequest{
    private String fundResult;
    private int amount;
    private int amountFunded;

    public int getAmountFunded() {
        return amountFunded;
    }

    public void setAmountFunded(int amountFunded) {
        this.amountFunded = amountFunded;
    }

    public String getFundResult() {
        return fundResult;
    }

    public void setFundResult(String fundResult) {
        this.fundResult = fundResult;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTestResult() {
        return fundResult;
    }

    public void setTestResult(String fundResult) {
        this.fundResult = fundResult;
    }
}
