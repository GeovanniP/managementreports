package com.cs673.practicemanagementreports.clinicalalertsservice.beans;

public class ClinicalAlertsBean {

    private String patientName;
    private String patientID;
    private String alertTitle;
    private String alertDescription;

    public ClinicalAlertsBean() {
    }

    public ClinicalAlertsBean(String patientName, String patientID, String alertTitle, String alertDescription) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.alertTitle = alertTitle;
        this.alertDescription = alertDescription;
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

    public String getAlertTitle() {
        return alertTitle;
    }

    public void setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
    }

    public String getAlertDescription() {
        return alertDescription;
    }

    public void setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
    }
}
