package com.cs673.practicemanagementreports.reconciliationsheetservice.beans;

public class BillingBean {

    private String patientID;
    private String coPay;
    private String paymentAmount;
    private String amountCollected;

    public BillingBean() {
    }

    public BillingBean(String patientID, String coPay, String paymentAmount, String amountCollected) {
        this.patientID = patientID;
        this.coPay = coPay;
        this.paymentAmount = paymentAmount;
        this.amountCollected = amountCollected;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getCoPay() {
        return coPay;
    }

    public void setCoPay(String coPay) {
        this.coPay = coPay;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(String amountCollected) {
        this.amountCollected = amountCollected;
    }
}
