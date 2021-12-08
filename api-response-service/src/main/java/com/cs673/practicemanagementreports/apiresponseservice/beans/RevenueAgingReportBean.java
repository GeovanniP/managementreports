package com.cs673.practicemanagementreports.apiresponseservice.beans;

import java.sql.Date;

public class RevenueAgingReportBean {

    private String patientName;
    private String patientID;
    private String amountOwed;
    private Date amountDueDate;

    public RevenueAgingReportBean() {
    }

    public RevenueAgingReportBean(String patientName, String patientID, String amountOwed, Date amountDueDate) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.amountOwed = amountOwed;
        this.amountDueDate = amountDueDate;
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

    public Date getAmountDueDate() {
        return amountDueDate;
    }

    public void setAmountDueDate(Date amountDueDate) {
        this.amountDueDate = amountDueDate;
    }

}
