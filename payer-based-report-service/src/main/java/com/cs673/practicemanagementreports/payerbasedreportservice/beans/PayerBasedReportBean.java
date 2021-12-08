
package com.cs673.practicemanagementreports.payerbasedreportservice.beans;

public class PayerBasedReportBean {
    public PayerBasedReportBean() {
    }

    public PayerBasedReportBean(String patientName, String patientID, String amountCollected, String amountOwed, String insurance) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.amountCollected = amountCollected;
        this.amountOwed = amountOwed;
        this.insurance = insurance;
    }

    private String patientName;
    private String patientID;
    private String amountCollected;
    private String amountOwed;
    private String insurance;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(String amountCollected) {
        this.amountCollected = amountCollected;
    }

    public String getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(String amountOwed) {
        this.amountOwed = amountOwed;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
}
