package com.cs673.practicemanagementreports.overduerecordsservice.beans;

public class OverdueRecordsBean {

    private String patientName;
    private String patientID;
    private String amountOwed;

    public OverdueRecordsBean() {
    }

    public OverdueRecordsBean(String patientName, String patientID, String amountOwed) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.amountOwed = amountOwed;
    }

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

    public String getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(String amountOwed) {
        this.amountOwed = amountOwed;
    }
}
