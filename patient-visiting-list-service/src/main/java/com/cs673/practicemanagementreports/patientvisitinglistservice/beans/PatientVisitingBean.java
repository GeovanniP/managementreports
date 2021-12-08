package com.cs673.practicemanagementreports.patientvisitinglistservice.beans;

import java.sql.Date;
import java.sql.Time;

public class PatientVisitingBean {

    private String patientName;
    private String patientID;
    private Date dateOfAppointment;
    private Time timeOfAppointment;
    private String notes;
    private String medications;

    public PatientVisitingBean() {
    }

    public PatientVisitingBean(String patientName, String patientID, Date dateOfAppointment, Time timeOfAppointment, String notes, String medications) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
        this.notes = notes;
        this.medications = medications;
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

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public Time getTimeOfAppointment() {
        return timeOfAppointment;
    }

    public void setTimeOfAppointment(Time timeOfAppointment) {
        this.timeOfAppointment = timeOfAppointment;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }
}
